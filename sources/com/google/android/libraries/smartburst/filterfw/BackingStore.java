package com.google.android.libraries.smartburst.filterfw;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.Type.Builder;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/* compiled from: PG */
final class BackingStore {
    public static final int ACCESS_ALLOCATION = 32;
    public static final int ACCESS_BITMAP = 16;
    public static final int ACCESS_BYTES = 1;
    public static final int ACCESS_NONE = 0;
    public static final int ACCESS_OBJECT = 8;
    public static final int ACCESS_RENDERTARGET = 4;
    public static final int ACCESS_TEXTURE = 2;
    public static final int BACKING_ALLOCATION = 5;
    public static final int BACKING_BITMAP = 4;
    public static final int BACKING_BYTEBUFFER = 1;
    public static final int BACKING_OBJECT = 3;
    public static final int BACKING_TEXTURE = 2;
    public Vector mBackings = new Vector();
    public Backing mCurrentBacking = null;
    public int[] mDimensions;
    public final FrameManager mFrameManager;
    public Backing mLockedBacking = null;
    public int mReadLocks = 0;
    public int mRefCount = 1;
    public long mTimestamp = -1;
    public final FrameType mType;
    public boolean mWriteLocked = false;

    /* compiled from: PG */
    abstract class Backing {
        public int cachePriority = 0;
        public int[] mDimensions = null;
        public int mElementID;
        public int mElementSize;
        public boolean mIsDirty = false;

        Backing() {
        }

        public abstract void allocate(FrameType frameType);

        public abstract void destroy();

        public abstract int getSize();

        public abstract int getType();

        public abstract Object lock(int i);

        public abstract int readAccess();

        public abstract boolean requiresGpu();

        public abstract boolean shouldCache();

        public abstract void syncTo(Backing backing);

        public abstract int writeAccess();

        protected void assertImageCompatible(FrameType frameType) {
            if (frameType.getElementId() != FrameType.ELEMENT_RGBA8888) {
                throw new RuntimeException("Cannot allocate texture with non-RGBA data type!");
            }
            int[] iArr = this.mDimensions;
            if (iArr == null || iArr.length != 2) {
                throw new RuntimeException("Cannot allocate non 2-dimensional texture!");
            }
        }

        public int[] getDimensions() {
            return this.mDimensions;
        }

        public int getElementId() {
            return this.mElementID;
        }

        public int getElementSize() {
            return this.mElementSize;
        }

        public boolean isDirty() {
            return this.mIsDirty;
        }

        public void markDirty() {
            this.mIsDirty = true;
        }

        public boolean resize(int[] iArr) {
            return false;
        }

        public void setData(Object obj) {
            String valueOf = String.valueOf(this);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 93);
            stringBuilder.append("Internal error: Setting data on frame backing ");
            stringBuilder.append(valueOf);
            stringBuilder.append(", which does not support setting data directly!");
            throw new RuntimeException(stringBuilder.toString());
        }

        public void setDimensions(int[] iArr) {
            this.mDimensions = iArr;
        }

        public void setElementId(int i) {
            this.mElementID = i;
        }

        public void setElementSize(int i) {
            this.mElementSize = i;
        }

        public void unlock() {
        }
    }

    @TargetApi(11)
    /* compiled from: PG */
    class AllocationBacking extends Backing {
        public Allocation mAllocation = null;
        public final RenderScript mRenderScript;

        public AllocationBacking(RenderScript renderScript) {
            this.mRenderScript = renderScript;
        }

        public void allocate(FrameType frameType) {
            Element F32;
            int i;
            int i2 = 1;
            assertCompatible(frameType);
            switch (frameType.getElementId()) {
                case 200:
                    F32 = Element.F32(this.mRenderScript);
                    break;
                case FrameType.ELEMENT_RGBA8888 /*301*/:
                    F32 = Element.RGBA_8888(this.mRenderScript);
                    break;
                default:
                    F32 = null;
                    break;
            }
            Builder builder = new Builder(this.mRenderScript, F32);
            if (this.mDimensions.length > 0) {
                i = this.mDimensions[0];
            } else {
                i = 1;
            }
            builder.setX(i);
            if (this.mDimensions.length == 2) {
                i2 = this.mDimensions[1];
            }
            builder.setY(i2);
            this.mAllocation = Allocation.createTyped(this.mRenderScript, builder.create());
        }

        private void assertCompatible(FrameType frameType) {
            if (frameType.getElementId() != FrameType.ELEMENT_RGBA8888 && frameType.getElementId() != 200) {
                throw new RuntimeException("Cannot allocate allocation with a non-RGBA or non-float data type!");
            } else if (this.mDimensions == null || this.mDimensions.length > 2) {
                throw new RuntimeException("Cannot create an allocation with more than 2 dimensions!");
            }
        }

        public void destroy() {
            Allocation allocation = this.mAllocation;
            if (allocation != null) {
                allocation.destroy();
                this.mAllocation = null;
            }
        }

        public int getSize() {
            int i = 1;
            for (int i2 : this.mDimensions) {
                i *= i2;
            }
            return getElementSize() * i;
        }

        public int getType() {
            return 5;
        }

        public static boolean isSupported() {
            return true;
        }

        public Object lock(int i) {
            return this.mAllocation;
        }

        public int readAccess() {
            return 32;
        }

        public boolean requiresGpu() {
            return false;
        }

        public boolean shouldCache() {
            return true;
        }

        public void syncTo(Backing backing) {
            int readAccess = backing.readAccess();
            if ((readAccess & 2) != 0) {
                RenderTarget renderTarget = (RenderTarget) backing.lock(4);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(getSize());
                GLToolbox.readTarget(renderTarget, allocateDirect, this.mDimensions[0], this.mDimensions[1]);
                this.mAllocation.copyFrom(allocateDirect.array());
            } else if ((readAccess & 16) != 0) {
                this.mAllocation.copyFrom((Bitmap) backing.lock(16));
            } else if ((readAccess & 1) != 0) {
                ByteBuffer byteBuffer = (ByteBuffer) backing.lock(1);
                if (byteBuffer.order() != ByteOrder.nativeOrder()) {
                    throw new RuntimeException("Trying to sync to the ByteBufferBacking with non-native byte order!");
                }
                byte[] array;
                if (byteBuffer.hasArray()) {
                    array = byteBuffer.array();
                } else {
                    byte[] bArr = new byte[getSize()];
                    byteBuffer.get(bArr);
                    byteBuffer.rewind();
                    array = bArr;
                }
                this.mAllocation.copyFromUnchecked(array);
            } else {
                throw new RuntimeException("Cannot sync allocation backing!");
            }
            backing.unlock();
            this.mIsDirty = false;
        }

        public void unlock() {
        }

        public int writeAccess() {
            return 32;
        }
    }

    /* compiled from: PG */
    class BitmapBacking extends Backing {
        public Bitmap mBitmap = null;

        BitmapBacking() {
        }

        public void allocate(FrameType frameType) {
            assertImageCompatible(frameType);
        }

        private void createBitmap() {
            this.mBitmap = Bitmap.createBitmap(this.mDimensions[0], this.mDimensions[1], Config.ARGB_8888);
        }

        public void destroy() {
            this.mBitmap = null;
        }

        public int getSize() {
            return (this.mDimensions[0] << 2) * this.mDimensions[1];
        }

        public int getType() {
            return 4;
        }

        public Object lock(int i) {
            return this.mBitmap;
        }

        public int readAccess() {
            return 16;
        }

        public boolean requiresGpu() {
            return false;
        }

        public void setData(Object obj) {
            this.mBitmap = (Bitmap) obj;
        }

        public boolean shouldCache() {
            return false;
        }

        public void syncTo(Backing backing) {
            int readAccess = backing.readAccess();
            if ((readAccess & 16) != 0) {
                this.mBitmap = (Bitmap) backing.lock(16);
            } else if ((readAccess & 1) != 0) {
                createBitmap();
                ByteBuffer byteBuffer = (ByteBuffer) backing.lock(1);
                this.mBitmap.copyPixelsFromBuffer(byteBuffer);
                byteBuffer.rewind();
            } else if ((readAccess & 2) != 0) {
                createBitmap();
                this.mBitmap.copyPixelsFromBuffer(((RenderTarget) backing.lock(4)).getPixelData(this.mDimensions[0], this.mDimensions[1]));
            } else if ((readAccess & 32) == 0 || !AllocationBacking.isSupported()) {
                throw new RuntimeException("Cannot sync bytebuffer backing!");
            } else {
                createBitmap();
                syncToAllocationBacking(backing);
            }
            backing.unlock();
            this.mIsDirty = false;
        }

        @TargetApi(11)
        private void syncToAllocationBacking(Backing backing) {
            ((Allocation) backing.lock(32)).copyTo(this.mBitmap);
        }

        public int writeAccess() {
            return 16;
        }
    }

    /* compiled from: PG */
    class ByteBufferBacking extends Backing {
        public ByteBuffer mBuffer = null;

        ByteBufferBacking() {
        }

        public void allocate(FrameType frameType) {
            int elementSize = frameType.getElementSize();
            for (int i : this.mDimensions) {
                elementSize *= i;
            }
            this.mBuffer = ByteBuffer.allocateDirect(elementSize);
        }

        public void destroy() {
            this.mBuffer = null;
        }

        public int getSize() {
            ByteBuffer byteBuffer = this.mBuffer;
            return byteBuffer != null ? byteBuffer.remaining() : 0;
        }

        public int getType() {
            return 1;
        }

        public Object lock(int i) {
            return this.mBuffer.rewind();
        }

        public int readAccess() {
            return 1;
        }

        public boolean requiresGpu() {
            return false;
        }

        public boolean shouldCache() {
            return true;
        }

        public void syncTo(Backing backing) {
            int readAccess = backing.readAccess();
            if ((readAccess & 2) != 0) {
                GLToolbox.readTarget((RenderTarget) backing.lock(4), this.mBuffer, this.mDimensions[0], this.mDimensions[1]);
            } else if ((readAccess & 16) != 0) {
                ((Bitmap) backing.lock(16)).copyPixelsToBuffer(this.mBuffer);
                this.mBuffer.rewind();
            } else if ((readAccess & 1) != 0) {
                ByteBuffer byteBuffer = (ByteBuffer) backing.lock(1);
                this.mBuffer.put(byteBuffer);
                byteBuffer.rewind();
            } else if ((readAccess & 32) == 0 || !AllocationBacking.isSupported()) {
                throw new RuntimeException("Cannot sync bytebuffer backing!");
            } else {
                syncToAllocationBacking(backing);
            }
            backing.unlock();
            this.mBuffer.rewind();
            this.mIsDirty = false;
        }

        @TargetApi(11)
        private void syncToAllocationBacking(Backing backing) {
            Allocation allocation = (Allocation) backing.lock(32);
            if (getElementId() == FrameType.ELEMENT_RGBA8888) {
                allocation.copyTo(this.mBuffer.array());
            } else if (getElementId() == 200) {
                float[] fArr = new float[(getSize() / 4)];
                allocation.copyTo(fArr);
                this.mBuffer.asFloatBuffer().put(fArr);
            } else {
                int elementId = getElementId();
                StringBuilder stringBuilder = new StringBuilder(75);
                stringBuilder.append("Trying to sync to an allocation with an unsupported element id: ");
                stringBuilder.append(elementId);
                throw new RuntimeException(stringBuilder.toString());
            }
        }

        public void unlock() {
            this.mBuffer.rewind();
        }

        public int writeAccess() {
            return 1;
        }
    }

    /* compiled from: PG */
    class ObjectBacking extends Backing {
        public Object mObject = null;

        ObjectBacking() {
        }

        public void allocate(FrameType frameType) {
            this.mObject = null;
        }

        public void destroy() {
            this.mObject = null;
        }

        public int getSize() {
            return 0;
        }

        public int getType() {
            return 3;
        }

        public Object lock(int i) {
            return this.mObject;
        }

        public int readAccess() {
            return 8;
        }

        public boolean requiresGpu() {
            return false;
        }

        public void setData(Object obj) {
            this.mObject = obj;
        }

        public boolean shouldCache() {
            return false;
        }

        public void syncTo(Backing backing) {
            switch (backing.getType()) {
                case 3:
                    this.mObject = backing.lock(8);
                    backing.unlock();
                    break;
                case 4:
                    this.mObject = backing.lock(16);
                    backing.unlock();
                    break;
                default:
                    this.mObject = null;
                    break;
            }
            this.mIsDirty = false;
        }

        public int writeAccess() {
            return 8;
        }
    }

    /* compiled from: PG */
    class TextureBacking extends Backing {
        public RenderTarget mRenderTarget = null;
        public TextureSource mTexture = null;

        TextureBacking() {
        }

        public void allocate(FrameType frameType) {
            assertImageCompatible(frameType);
            this.mTexture = TextureSource.newTexture();
        }

        public void destroy() {
            RenderTarget renderTarget = this.mRenderTarget;
            if (renderTarget != null) {
                renderTarget.release();
            }
            if (this.mTexture.isAllocated()) {
                this.mTexture.release();
            }
        }

        private RenderTarget getRenderTarget() {
            if (this.mRenderTarget == null) {
                this.mRenderTarget = RenderTarget.currentTarget().forTexture(getTexture(), this.mDimensions[0], this.mDimensions[1]);
            }
            return this.mRenderTarget;
        }

        public int getSize() {
            return (this.mDimensions[0] << 2) * this.mDimensions[1];
        }

        private TextureSource getTexture() {
            if (!this.mTexture.isAllocated()) {
                this.mTexture.allocate(this.mDimensions[0], this.mDimensions[1]);
            }
            return this.mTexture;
        }

        public int getType() {
            return 2;
        }

        public Object lock(int i) {
            switch (i) {
                case 2:
                    return getTexture();
                case 4:
                    return getRenderTarget();
                default:
                    throw new RuntimeException("Illegal access to texture!");
            }
        }

        public int readAccess() {
            return 2;
        }

        public boolean requiresGpu() {
            return true;
        }

        public boolean shouldCache() {
            return true;
        }

        public void syncTo(Backing backing) {
            int readAccess = backing.readAccess();
            if ((readAccess & 1) != 0) {
                this.mTexture.allocateWithPixels((ByteBuffer) backing.lock(1), this.mDimensions[0], this.mDimensions[1]);
            } else if ((readAccess & 16) != 0) {
                this.mTexture.allocateWithBitmapPixels((Bitmap) backing.lock(16));
            } else if ((readAccess & 2) != 0) {
                ImageShader.renderTextureToTarget((TextureSource) backing.lock(2), getRenderTarget(), this.mDimensions[0], this.mDimensions[1]);
            } else if ((readAccess & 32) == 0 || !AllocationBacking.isSupported()) {
                throw new RuntimeException("Cannot sync bytebuffer backing!");
            } else {
                syncToAllocationBacking(backing);
            }
            backing.unlock();
            this.mIsDirty = false;
        }

        @TargetApi(11)
        private void syncToAllocationBacking(Backing backing) {
            Allocation allocation = (Allocation) backing.lock(32);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(getSize());
            allocation.copyTo(allocateDirect.array());
            this.mTexture.allocateWithPixels(allocateDirect, this.mDimensions[0], this.mDimensions[1]);
        }

        public int writeAccess() {
            return 4;
        }
    }

    public BackingStore(FrameType frameType, int[] iArr, FrameManager frameManager) {
        int[] iArr2 = null;
        this.mType = frameType;
        if (iArr != null) {
            iArr2 = Arrays.copyOf(iArr, iArr.length);
        }
        this.mDimensions = iArr2;
        this.mFrameManager = frameManager;
    }

    private final Backing attachNewBacking(int i, int i2) {
        Backing createBacking = createBacking(i, i2);
        if (this.mBackings.size() > 0) {
            createBacking.markDirty();
        }
        this.mBackings.add(createBacking);
        return createBacking;
    }

    private final Backing createBacking(int i, int i2) {
        Backing fetchBacking;
        int elementSize = this.mType.getElementSize();
        if (shouldFetchCached(i2)) {
            fetchBacking = this.mFrameManager.fetchBacking(i, i2, this.mDimensions, elementSize);
        } else {
            fetchBacking = null;
        }
        if (fetchBacking == null) {
            switch (i2) {
                case 1:
                    fetchBacking = new ByteBufferBacking();
                    break;
                case 2:
                case 4:
                    fetchBacking = new TextureBacking();
                    break;
                case 8:
                    fetchBacking = new ObjectBacking();
                    break;
                case 16:
                    fetchBacking = new BitmapBacking();
                    break;
                case 32:
                    if (AllocationBacking.isSupported()) {
                        fetchBacking = new AllocationBacking(this.mFrameManager.getContext().getRenderScript());
                        break;
                    }
                    throw new RuntimeException("Attempted to create an AllocationBacking in context that does not support RenderScript!");
            }
            if (fetchBacking == null) {
                StringBuilder stringBuilder = new StringBuilder(53);
                stringBuilder.append("Could not create backing for access type ");
                stringBuilder.append(i2);
                stringBuilder.append("!");
                throw new RuntimeException(stringBuilder.toString());
            } else if (!fetchBacking.requiresGpu() || this.mFrameManager.getRunner() == null || this.mFrameManager.getRunner().isOpenGLSupported()) {
                fetchBacking.setDimensions(this.mDimensions);
                fetchBacking.setElementSize(elementSize);
                fetchBacking.setElementId(this.mType.getElementId());
                fetchBacking.allocate(this.mType);
                this.mFrameManager.onBackingCreated(fetchBacking);
            } else {
                throw new RuntimeException("Cannot create backing that requires GPU in a runner that does not support OpenGL!");
            }
        }
        return fetchBacking;
    }

    private final Backing fetchBacking(int i, int i2) {
        Backing backing = getBacking(i, i2);
        if (backing == null) {
            backing = attachNewBacking(i, i2);
        }
        syncBacking(backing);
        return backing;
    }

    private final Backing getBacking(int i, int i2) {
        for (int i3 = 0; i3 < this.mBackings.size(); i3++) {
            int readAccess;
            Backing backing = (Backing) this.mBackings.get(i3);
            if (i != 2) {
                readAccess = backing.readAccess();
            } else {
                readAccess = backing.writeAccess();
            }
            if ((readAccess & i2) == i2) {
                return backing;
            }
        }
        return null;
    }

    public final int[] getDimensions() {
        return this.mDimensions;
    }

    public final int getElementCount() {
        int i = 1;
        int[] iArr = this.mDimensions;
        if (iArr != null) {
            int i2 = 0;
            while (i2 < iArr.length) {
                int i3 = iArr[i2] * i;
                i2++;
                i = i3;
            }
        }
        return i;
    }

    public final FrameType getFrameType() {
        return this.mType;
    }

    public final long getTimestamp() {
        return this.mTimestamp;
    }

    private final void importBacking(Backing backing) {
        int i;
        if (backing.requiresGpu()) {
            i = 1;
        } else {
            i = backing.readAccess();
        }
        Backing createBacking = createBacking(1, i);
        createBacking.syncTo(backing);
        this.mBackings.add(createBacking);
        this.mCurrentBacking = createBacking;
    }

    public final void importStore(BackingStore backingStore) {
        if (backingStore.mBackings.size() > 0) {
            importBacking((Backing) backingStore.mBackings.firstElement());
        }
        this.mTimestamp = backingStore.mTimestamp;
    }

    private final void lock(Backing backing, int i) {
        String valueOf;
        StringBuilder stringBuilder;
        if (i == 2) {
            if (this.mReadLocks > 0) {
                valueOf = String.valueOf(this);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 48);
                stringBuilder.append("Attempting to write-lock the read-locked frame ");
                stringBuilder.append(valueOf);
                stringBuilder.append("!");
                throw new RuntimeException(stringBuilder.toString());
            } else if (this.mWriteLocked) {
                valueOf = String.valueOf(this);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 49);
                stringBuilder.append("Attempting to write-lock the write-locked frame ");
                stringBuilder.append(valueOf);
                stringBuilder.append("!");
                throw new RuntimeException(stringBuilder.toString());
            } else {
                for (int i2 = 0; i2 < this.mBackings.size(); i2++) {
                    Backing backing2 = (Backing) this.mBackings.get(i2);
                    if (backing2 != backing) {
                        backing2.markDirty();
                    }
                }
                this.mWriteLocked = true;
                this.mCurrentBacking = backing;
            }
        } else if (this.mWriteLocked) {
            valueOf = String.valueOf(this);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
            stringBuilder.append("Attempting to read-lock locked frame ");
            stringBuilder.append(valueOf);
            stringBuilder.append("!");
            throw new RuntimeException(stringBuilder.toString());
        } else {
            this.mReadLocks++;
        }
        this.mLockedBacking = backing;
    }

    public final Backing lockBacking(int i, int i2) {
        Backing fetchBacking = fetchBacking(i, i2);
        if (fetchBacking == null) {
            throw new RuntimeException("Could not fetch frame data!");
        }
        lock(fetchBacking, i);
        return fetchBacking;
    }

    public final Object lockData(int i, int i2) {
        return lockBacking(i, i2).lock(i2);
    }

    public final BackingStore release() {
        int i = this.mRefCount;
        if (i <= 0) {
            throw new RuntimeException("DOUBLE-RELEASE");
        }
        this.mRefCount = i - 1;
        if (this.mRefCount != 0) {
            return this;
        }
        releaseBackings();
        return null;
    }

    private final void releaseBacking(Backing backing) {
        this.mFrameManager.onBackingAvailable(backing);
    }

    private final void releaseBackings() {
        for (int i = 0; i < this.mBackings.size(); i++) {
            releaseBacking((Backing) this.mBackings.get(i));
        }
        this.mBackings.clear();
        this.mCurrentBacking = null;
    }

    public final void resize(int[] iArr) {
        Vector vector = new Vector();
        Iterator it = this.mBackings.iterator();
        while (it.hasNext()) {
            Backing backing = (Backing) it.next();
            if (backing.resize(iArr)) {
                vector.add(backing);
            } else {
                releaseBacking(backing);
            }
        }
        this.mBackings = vector;
        this.mDimensions = iArr;
    }

    public final BackingStore retain() {
        int i = this.mRefCount;
        if (i >= 10) {
            String valueOf = String.valueOf(this);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
            stringBuilder.append("High ref-count of ");
            stringBuilder.append(i);
            stringBuilder.append(" on ");
            stringBuilder.append(valueOf);
            stringBuilder.append("!");
            Log.w("BackingStore", stringBuilder.toString());
        }
        i = this.mRefCount;
        if (i <= 0) {
            throw new RuntimeException("RETAINING RELEASED");
        }
        this.mRefCount = i + 1;
        return this;
    }

    public final void setTimestamp(long j) {
        this.mTimestamp = j;
    }

    private static boolean shouldFetchCached(int i) {
        return i != 8;
    }

    private final void syncBacking(Backing backing) {
        if (backing != null && backing.isDirty()) {
            Backing backing2 = this.mCurrentBacking;
            if (backing2 != null) {
                backing.syncTo(backing2);
            }
        }
    }

    public final boolean unlock() {
        if (this.mWriteLocked) {
            this.mWriteLocked = false;
        } else {
            int i = this.mReadLocks;
            if (i <= 0) {
                return false;
            }
            this.mReadLocks = i - 1;
        }
        this.mLockedBacking.unlock();
        this.mLockedBacking = null;
        return true;
    }
}
