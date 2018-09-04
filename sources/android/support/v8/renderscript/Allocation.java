package android.support.v8.renderscript;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.support.v8.renderscript.Element.DataKind;
import android.support.v8.renderscript.Element.DataType;
import android.support.v8.renderscript.Type.Builder;
import android.support.v8.renderscript.Type.CubemapFace;
import android.util.Log;
import android.view.Surface;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

/* compiled from: PG */
public class Allocation extends BaseObj {
    public static final int USAGE_GRAPHICS_TEXTURE = 2;
    public static final int USAGE_IO_INPUT = 32;
    public static final int USAGE_IO_OUTPUT = 64;
    public static final int USAGE_SCRIPT = 1;
    public static final int USAGE_SHARED = 128;
    public static Options mBitmapOptions;
    public Allocation mAdaptedAllocation;
    public boolean mAutoPadding = false;
    public Bitmap mBitmap;
    public ByteBuffer mByteBuffer = null;
    public long mByteBufferStride = 0;
    public boolean mConstrainedFace;
    public boolean mConstrainedLOD;
    public boolean mConstrainedY;
    public boolean mConstrainedZ;
    public int mCurrentCount;
    public int mCurrentDimX;
    public int mCurrentDimY;
    public int mCurrentDimZ;
    public boolean mIncAllocDestroyed;
    public long mIncCompatAllocation;
    public boolean mReadAllowed = true;
    public CubemapFace mSelectedFace = CubemapFace.POSITIVE_X;
    public int mSelectedLOD;
    public int mSelectedY;
    public int mSelectedZ;
    public int mSize;
    public Type mType;
    public int mUsage;
    public boolean mWriteAllowed = true;

    /* compiled from: PG */
    /* renamed from: android.support.v8.renderscript.Allocation$1 */
    /* synthetic */ class C00291 {
        public static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config = new int[Config.values().length];

        static {
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Config.ARGB_8888.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Config.RGB_565.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Config.ARGB_4444.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* compiled from: PG */
    public enum MipmapControl {
        MIPMAP_NONE(0),
        MIPMAP_FULL(1),
        MIPMAP_ON_SYNC_TO_TEXTURE(2);
        
        public int mID;

        private MipmapControl(int i) {
            this.mID = i;
        }
    }

    static {
        Options options = new Options();
        mBitmapOptions = options;
        options.inScaled = false;
    }

    Allocation(long j, RenderScript renderScript, Type type, int i) {
        super(j, renderScript);
        if ((i & -228) != 0) {
            throw new RSIllegalArgumentException("Unknown usage specified.");
        }
        if ((i & 32) != 0) {
            this.mWriteAllowed = false;
            if ((i & -36) != 0) {
                throw new RSIllegalArgumentException("Invalid usage combination.");
            }
        }
        this.mType = type;
        this.mUsage = i;
        this.mIncCompatAllocation = 0;
        this.mIncAllocDestroyed = false;
        if (type != null) {
            this.mSize = this.mType.getCount() * this.mType.getElement().getBytesSize();
            updateCacheInfo(type);
        }
        if (RenderScript.sUseGCHooks) {
            try {
                RenderScript.registerNativeAllocation.invoke(RenderScript.sRuntime, new Object[]{Integer.valueOf(this.mSize)});
            } catch (Exception e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Couldn't invoke registerNativeAllocation:");
                stringBuilder.append(e);
                Log.e(RenderScript.LOG_TAG, stringBuilder.toString());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Couldn't invoke registerNativeAllocation:");
                stringBuilder2.append(e);
                throw new RSRuntimeException(stringBuilder2.toString());
            }
        }
    }

    public void copy1DRangeFrom(int i, int i2, Allocation allocation, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        this.mRS.nAllocationData2D(getIDSafe(), i4, 0, this.mSelectedLOD, this.mSelectedFace.mID, i5, 1, allocation.getID(this.mRS), i6, 0, allocation.mSelectedLOD, allocation.mSelectedFace.mID);
    }

    public void copy1DRangeFrom(int i, int i2, Object obj) {
        copy1DRangeFromUnchecked(i, i2, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy1DRangeFrom(int i, int i2, byte[] bArr) {
        validateIsInt8();
        copy1DRangeFromUnchecked(i, i2, bArr, DataType.SIGNED_8, bArr.length);
    }

    public void copy1DRangeFrom(int i, int i2, float[] fArr) {
        validateIsFloat32();
        copy1DRangeFromUnchecked(i, i2, fArr, DataType.FLOAT_32, fArr.length);
    }

    public void copy1DRangeFrom(int i, int i2, int[] iArr) {
        validateIsInt32();
        copy1DRangeFromUnchecked(i, i2, iArr, DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeFrom(int i, int i2, short[] sArr) {
        validateIsInt16();
        copy1DRangeFromUnchecked(i, i2, sArr, DataType.SIGNED_16, sArr.length);
    }

    public void copy1DRangeFromUnchecked(int i, int i2, Object obj) {
        copy1DRangeFromUnchecked(i, i2, obj, validateObjectIsPrimitiveArray(obj, false), Array.getLength(obj));
    }

    private void copy1DRangeFromUnchecked(int i, int i2, Object obj, DataType dataType, int i3) {
        int bytesSize = this.mType.mElement.getBytesSize() * i2;
        boolean z = this.mAutoPadding ? this.mType.getElement().getVectorSize() == 3 : false;
        data1DChecks(i, i2, i3 * dataType.mSize, bytesSize, z);
        this.mRS.nAllocationData1D(getIDSafe(), i, this.mSelectedLOD, i2, obj, bytesSize, dataType, this.mType.mElement.mType.mSize, z);
    }

    public void copy1DRangeFromUnchecked(int i, int i2, byte[] bArr) {
        copy1DRangeFromUnchecked(i, i2, bArr, DataType.SIGNED_8, bArr.length);
    }

    public void copy1DRangeFromUnchecked(int i, int i2, float[] fArr) {
        copy1DRangeFromUnchecked(i, i2, fArr, DataType.FLOAT_32, fArr.length);
    }

    public void copy1DRangeFromUnchecked(int i, int i2, int[] iArr) {
        copy1DRangeFromUnchecked(i, i2, iArr, DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeFromUnchecked(int i, int i2, short[] sArr) {
        copy1DRangeFromUnchecked(i, i2, sArr, DataType.SIGNED_16, sArr.length);
    }

    public void copy1DRangeTo(int i, int i2, Object obj) {
        copy1DRangeToUnchecked(i, i2, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy1DRangeTo(int i, int i2, byte[] bArr) {
        validateIsInt8();
        copy1DRangeToUnchecked(i, i2, bArr, DataType.SIGNED_8, bArr.length);
    }

    public void copy1DRangeTo(int i, int i2, float[] fArr) {
        validateIsFloat32();
        copy1DRangeToUnchecked(i, i2, fArr, DataType.FLOAT_32, fArr.length);
    }

    public void copy1DRangeTo(int i, int i2, int[] iArr) {
        validateIsInt32();
        copy1DRangeToUnchecked(i, i2, iArr, DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeTo(int i, int i2, short[] sArr) {
        validateIsInt16();
        copy1DRangeToUnchecked(i, i2, sArr, DataType.SIGNED_16, sArr.length);
    }

    public void copy1DRangeToUnchecked(int i, int i2, Object obj) {
        copy1DRangeToUnchecked(i, i2, obj, validateObjectIsPrimitiveArray(obj, false), Array.getLength(obj));
    }

    private void copy1DRangeToUnchecked(int i, int i2, Object obj, DataType dataType, int i3) {
        int bytesSize = this.mType.mElement.getBytesSize() * i2;
        boolean z = this.mAutoPadding ? this.mType.getElement().getVectorSize() == 3 : false;
        data1DChecks(i, i2, i3 * dataType.mSize, bytesSize, z);
        this.mRS.nAllocationRead1D(getIDSafe(), i, this.mSelectedLOD, i2, obj, bytesSize, dataType, this.mType.mElement.mType.mSize, z);
    }

    public void copy1DRangeToUnchecked(int i, int i2, byte[] bArr) {
        copy1DRangeToUnchecked(i, i2, bArr, DataType.SIGNED_8, bArr.length);
    }

    public void copy1DRangeToUnchecked(int i, int i2, float[] fArr) {
        copy1DRangeToUnchecked(i, i2, fArr, DataType.FLOAT_32, fArr.length);
    }

    public void copy1DRangeToUnchecked(int i, int i2, int[] iArr) {
        copy1DRangeToUnchecked(i, i2, iArr, DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeToUnchecked(int i, int i2, short[] sArr) {
        copy1DRangeToUnchecked(i, i2, sArr, DataType.SIGNED_16, sArr.length);
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, Allocation allocation, int i5, int i6) {
        this.mRS.validate();
        validate2DRange(i, i2, i3, i4);
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        int i11 = i5;
        int i12 = i6;
        this.mRS.nAllocationData2D(getIDSafe(), i7, i8, this.mSelectedLOD, this.mSelectedFace.mID, i9, i10, allocation.getID(this.mRS), i11, i12, allocation.mSelectedLOD, allocation.mSelectedFace.mID);
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, Object obj) {
        copy2DRangeFromUnchecked(i, i2, i3, i4, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, byte[] bArr) {
        validateIsInt8();
        copy2DRangeFromUnchecked(i, i2, i3, i4, bArr, DataType.SIGNED_8, bArr.length);
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, float[] fArr) {
        validateIsFloat32();
        copy2DRangeFromUnchecked(i, i2, i3, i4, fArr, DataType.FLOAT_32, fArr.length);
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, int[] iArr) {
        validateIsInt32();
        copy2DRangeFromUnchecked(i, i2, i3, i4, iArr, DataType.SIGNED_32, iArr.length);
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, short[] sArr) {
        validateIsInt16();
        copy2DRangeFromUnchecked(i, i2, i3, i4, sArr, DataType.SIGNED_16, sArr.length);
    }

    public void copy2DRangeFrom(int i, int i2, Bitmap bitmap) {
        this.mRS.validate();
        if (bitmap.getConfig() == null) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, null);
            copy2DRangeFrom(i, i2, createBitmap);
            return;
        }
        validateBitmapFormat(bitmap);
        validate2DRange(i, i2, bitmap.getWidth(), bitmap.getHeight());
        this.mRS.nAllocationData2D(getIDSafe(), i, i2, this.mSelectedLOD, this.mSelectedFace.mID, bitmap);
    }

    void copy2DRangeFromUnchecked(int i, int i2, int i3, int i4, Object obj, DataType dataType, int i5) {
        boolean z;
        this.mRS.validate();
        validate2DRange(i, i2, i3, i4);
        int bytesSize = (this.mType.mElement.getBytesSize() * i3) * i4;
        int i6 = dataType.mSize * i5;
        if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
            if ((bytesSize / 4) * 3 <= i6) {
                z = true;
            } else {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
        } else if (bytesSize <= i6) {
            z = false;
            bytesSize = i6;
        } else {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
        this.mRS.nAllocationData2D(getIDSafe(), i, i2, this.mSelectedLOD, this.mSelectedFace.mID, i3, i4, obj, bytesSize, dataType, this.mType.mElement.mType.mSize, z);
    }

    public void copy2DRangeTo(int i, int i2, int i3, int i4, Object obj) {
        copy2DRangeToUnchecked(i, i2, i3, i4, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy2DRangeTo(int i, int i2, int i3, int i4, byte[] bArr) {
        validateIsInt8();
        copy2DRangeToUnchecked(i, i2, i3, i4, bArr, DataType.SIGNED_8, bArr.length);
    }

    public void copy2DRangeTo(int i, int i2, int i3, int i4, float[] fArr) {
        validateIsFloat32();
        copy2DRangeToUnchecked(i, i2, i3, i4, fArr, DataType.FLOAT_32, fArr.length);
    }

    public void copy2DRangeTo(int i, int i2, int i3, int i4, int[] iArr) {
        validateIsInt32();
        copy2DRangeToUnchecked(i, i2, i3, i4, iArr, DataType.SIGNED_32, iArr.length);
    }

    public void copy2DRangeTo(int i, int i2, int i3, int i4, short[] sArr) {
        validateIsInt16();
        copy2DRangeToUnchecked(i, i2, i3, i4, sArr, DataType.SIGNED_16, sArr.length);
    }

    void copy2DRangeToUnchecked(int i, int i2, int i3, int i4, Object obj, DataType dataType, int i5) {
        boolean z;
        this.mRS.validate();
        validate2DRange(i, i2, i3, i4);
        int bytesSize = (this.mType.mElement.getBytesSize() * i3) * i4;
        int i6 = dataType.mSize * i5;
        if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
            if ((bytesSize / 4) * 3 <= i6) {
                z = true;
            } else {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
        } else if (bytesSize <= i6) {
            z = false;
            bytesSize = i6;
        } else {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
        this.mRS.nAllocationRead2D(getIDSafe(), i, i2, this.mSelectedLOD, this.mSelectedFace.mID, i3, i4, obj, bytesSize, dataType, this.mType.mElement.mType.mSize, z);
    }

    public void copy3DRangeFrom(int i, int i2, int i3, int i4, int i5, int i6, Allocation allocation, int i7, int i8, int i9) {
        this.mRS.validate();
        validate3DRange(i, i2, i3, i4, i5, i6);
        int i10 = i;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        int i15 = i6;
        int i16 = i7;
        int i17 = i8;
        int i18 = i9;
        this.mRS.nAllocationData3D(getIDSafe(), i10, i11, i12, this.mSelectedLOD, i13, i14, i15, allocation.getID(this.mRS), i16, i17, i18, allocation.mSelectedLOD);
    }

    public void copy3DRangeFrom(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        copy3DRangeFromUnchecked(i, i2, i3, i4, i5, i6, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    private void copy3DRangeFromUnchecked(int i, int i2, int i3, int i4, int i5, int i6, Object obj, DataType dataType, int i7) {
        boolean z;
        this.mRS.validate();
        validate3DRange(i, i2, i3, i4, i5, i6);
        int bytesSize = ((this.mType.mElement.getBytesSize() * i4) * i5) * i6;
        int i8 = dataType.mSize * i7;
        if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
            if ((bytesSize / 4) * 3 <= i8) {
                z = true;
            } else {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
        } else if (bytesSize <= i8) {
            z = false;
            bytesSize = i8;
        } else {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
        this.mRS.nAllocationData3D(getIDSafe(), i, i2, i3, this.mSelectedLOD, i4, i5, i6, obj, bytesSize, dataType, this.mType.mElement.mType.mSize, z);
    }

    public void copyFrom(Bitmap bitmap) {
        this.mRS.validate();
        if (bitmap.getConfig() == null) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, null);
            copyFrom(createBitmap);
            return;
        }
        validateBitmapSize(bitmap);
        validateBitmapFormat(bitmap);
        this.mRS.nAllocationCopyFromBitmap(getID(this.mRS), bitmap);
    }

    public void copyFrom(Allocation allocation) {
        this.mRS.validate();
        if (this.mType.equals(allocation.getType())) {
            copy2DRangeFrom(0, 0, this.mCurrentDimX, this.mCurrentDimY, allocation, 0, 0);
            return;
        }
        throw new RSIllegalArgumentException("Types of allocations must match.");
    }

    public void copyFrom(Object obj) {
        copyFromUnchecked(obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copyFrom(byte[] bArr) {
        validateIsInt8();
        copyFromUnchecked(bArr, DataType.SIGNED_8, bArr.length);
    }

    public void copyFrom(float[] fArr) {
        validateIsFloat32();
        copyFromUnchecked(fArr, DataType.FLOAT_32, fArr.length);
    }

    public void copyFrom(int[] iArr) {
        validateIsInt32();
        copyFromUnchecked(iArr, DataType.SIGNED_32, iArr.length);
    }

    public void copyFrom(BaseObj[] baseObjArr) {
        this.mRS.validate();
        validateIsObject();
        int length = baseObjArr.length;
        if (length != this.mCurrentCount) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Array size mismatch, allocation sizeX = ");
            stringBuilder.append(this.mCurrentCount);
            stringBuilder.append(", array length = ");
            stringBuilder.append(length);
            throw new RSIllegalArgumentException(stringBuilder.toString());
        } else if (RenderScript.sPointerSize == 8) {
            Object obj = new long[(length << 2)];
            for (length = 0; length < baseObjArr.length; length++) {
                obj[length << 2] = baseObjArr[length].getID(this.mRS);
            }
            copy1DRangeFromUnchecked(0, this.mCurrentCount, obj);
        } else {
            int[] iArr = new int[length];
            for (length = 0; length < baseObjArr.length; length++) {
                iArr[length] = (int) baseObjArr[length].getID(this.mRS);
            }
            copy1DRangeFromUnchecked(0, this.mCurrentCount, iArr);
        }
    }

    public void copyFrom(short[] sArr) {
        validateIsInt16();
        copyFromUnchecked(sArr, DataType.SIGNED_16, sArr.length);
    }

    public void copyFromUnchecked(Object obj) {
        copyFromUnchecked(obj, validateObjectIsPrimitiveArray(obj, false), Array.getLength(obj));
    }

    private void copyFromUnchecked(Object obj, DataType dataType, int i) {
        this.mRS.validate();
        int i2 = this.mCurrentDimZ;
        if (i2 > 0) {
            copy3DRangeFromUnchecked(0, 0, 0, this.mCurrentDimX, this.mCurrentDimY, i2, obj, dataType, i);
            return;
        }
        int i3 = this.mCurrentDimY;
        if (i3 > 0) {
            copy2DRangeFromUnchecked(0, 0, this.mCurrentDimX, i3, obj, dataType, i);
            return;
        }
        copy1DRangeFromUnchecked(0, this.mCurrentCount, obj, dataType, i);
    }

    public void copyFromUnchecked(byte[] bArr) {
        copyFromUnchecked(bArr, DataType.SIGNED_8, bArr.length);
    }

    public void copyFromUnchecked(float[] fArr) {
        copyFromUnchecked(fArr, DataType.FLOAT_32, fArr.length);
    }

    public void copyFromUnchecked(int[] iArr) {
        copyFromUnchecked(iArr, DataType.SIGNED_32, iArr.length);
    }

    public void copyFromUnchecked(short[] sArr) {
        copyFromUnchecked(sArr, DataType.SIGNED_16, sArr.length);
    }

    public void copyTo(Bitmap bitmap) {
        this.mRS.validate();
        validateBitmapFormat(bitmap);
        validateBitmapSize(bitmap);
        this.mRS.nAllocationCopyToBitmap(getID(this.mRS), bitmap);
    }

    public void copyTo(Object obj) {
        copyTo(obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    private void copyTo(Object obj, DataType dataType, int i) {
        boolean z = false;
        this.mRS.validate();
        if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
            z = true;
        }
        if (z) {
            if (dataType.mSize * i < (this.mSize / 4) * 3) {
                throw new RSIllegalArgumentException("Size of output array cannot be smaller than size of allocation.");
            }
        } else if (dataType.mSize * i < this.mSize) {
            throw new RSIllegalArgumentException("Size of output array cannot be smaller than size of allocation.");
        }
        this.mRS.nAllocationRead(getID(this.mRS), obj, dataType, this.mType.mElement.mType.mSize, z);
    }

    public void copyTo(byte[] bArr) {
        validateIsInt8();
        copyTo(bArr, DataType.SIGNED_8, bArr.length);
    }

    public void copyTo(float[] fArr) {
        validateIsFloat32();
        copyTo(fArr, DataType.FLOAT_32, fArr.length);
    }

    public void copyTo(int[] iArr) {
        validateIsInt32();
        copyTo(iArr, DataType.SIGNED_32, iArr.length);
    }

    public void copyTo(short[] sArr) {
        validateIsInt16();
        copyTo(sArr, DataType.SIGNED_16, sArr.length);
    }

    public static Allocation createCubemapFromBitmap(RenderScript renderScript, Bitmap bitmap) {
        return createCubemapFromBitmap(renderScript, bitmap, MipmapControl.MIPMAP_NONE, 2);
    }

    public static Allocation createCubemapFromBitmap(RenderScript renderScript, Bitmap bitmap, MipmapControl mipmapControl, int i) {
        boolean z = true;
        renderScript.validate();
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        if (width % 6 != 0) {
            throw new RSIllegalArgumentException("Cubemap height must be multiple of 6");
        } else if (width / 6 != height) {
            throw new RSIllegalArgumentException("Only square cube map faces supported");
        } else if (((height - 1) & height) != 0) {
            throw new RSIllegalArgumentException("Only power of 2 cube faces supported");
        } else {
            Element elementFromBitmap = elementFromBitmap(renderScript, bitmap);
            Builder builder = new Builder(renderScript, elementFromBitmap);
            builder.setX(height);
            builder.setY(height);
            builder.setFaces(true);
            if (mipmapControl != MipmapControl.MIPMAP_FULL) {
                z = false;
            }
            builder.setMipmaps(z);
            Type create = builder.create();
            long nAllocationCubeCreateFromBitmap = renderScript.nAllocationCubeCreateFromBitmap(create.getID(renderScript), mipmapControl.mID, bitmap, i);
            if (nAllocationCubeCreateFromBitmap != 0) {
                return new Allocation(nAllocationCubeCreateFromBitmap, renderScript, create, i);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Load failed for bitmap ");
            stringBuilder.append(bitmap);
            stringBuilder.append(" element ");
            stringBuilder.append(elementFromBitmap);
            throw new RSRuntimeException(stringBuilder.toString());
        }
    }

    public static Allocation createCubemapFromCubeFaces(RenderScript renderScript, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6) {
        return createCubemapFromCubeFaces(renderScript, bitmap, bitmap2, bitmap3, bitmap4, bitmap5, bitmap6, MipmapControl.MIPMAP_NONE, 2);
    }

    public static Allocation createCubemapFromCubeFaces(RenderScript renderScript, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6, MipmapControl mipmapControl, int i) {
        return null;
    }

    public static Allocation createFromBitmap(RenderScript renderScript, Bitmap bitmap) {
        return createFromBitmap(renderScript, bitmap, MipmapControl.MIPMAP_NONE, 131);
    }

    public static Allocation createFromBitmap(RenderScript renderScript, Bitmap bitmap, MipmapControl mipmapControl, int i) {
        Bitmap bitmap2 = bitmap;
        while (true) {
            renderScript.validate();
            if (bitmap2.getConfig() != null) {
                break;
            } else if ((i & 128) != 0) {
                throw new RSIllegalArgumentException("USAGE_SHARED cannot be used with a Bitmap that has a null config.");
            } else {
                bitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Config.ARGB_8888);
                new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, null);
                bitmap2 = bitmap;
            }
        }
        Type typeFromBitmap = typeFromBitmap(renderScript, bitmap2, mipmapControl);
        long nAllocationCreateBitmapBackedAllocation;
        if (mipmapControl == MipmapControl.MIPMAP_NONE && typeFromBitmap.getElement().isCompatible(Element.RGBA_8888(renderScript)) && i == 131) {
            nAllocationCreateBitmapBackedAllocation = renderScript.nAllocationCreateBitmapBackedAllocation(typeFromBitmap.getID(renderScript), mipmapControl.mID, bitmap2, i);
            if (nAllocationCreateBitmapBackedAllocation == 0) {
                throw new RSRuntimeException("Load failed.");
            }
            Allocation allocation = new Allocation(nAllocationCreateBitmapBackedAllocation, renderScript, typeFromBitmap, i);
            allocation.setBitmap(bitmap2);
            return allocation;
        }
        nAllocationCreateBitmapBackedAllocation = renderScript.nAllocationCreateFromBitmap(typeFromBitmap.getID(renderScript), mipmapControl.mID, bitmap2, i);
        if (nAllocationCreateBitmapBackedAllocation != 0) {
            return new Allocation(nAllocationCreateBitmapBackedAllocation, renderScript, typeFromBitmap, i);
        }
        throw new RSRuntimeException("Load failed.");
    }

    public static Allocation createFromBitmapResource(RenderScript renderScript, Resources resources, int i) {
        return createFromBitmapResource(renderScript, resources, i, MipmapControl.MIPMAP_NONE, 3);
    }

    public static Allocation createFromBitmapResource(RenderScript renderScript, Resources resources, int i, MipmapControl mipmapControl, int i2) {
        renderScript.validate();
        if ((i2 & 224) != 0) {
            throw new RSIllegalArgumentException("Unsupported usage specified.");
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
        Allocation createFromBitmap = createFromBitmap(renderScript, decodeResource, mipmapControl, i2);
        decodeResource.recycle();
        return createFromBitmap;
    }

    public static Allocation createFromString(RenderScript renderScript, String str, int i) {
        renderScript.validate();
        try {
            byte[] bytes = str.getBytes("UTF-8");
            Allocation createSized = createSized(renderScript, Element.U8(renderScript), bytes.length, i);
            createSized.copyFrom(bytes);
            return createSized;
        } catch (Exception e) {
            throw new RSRuntimeException("Could not convert string to utf-8.");
        }
    }

    public static Allocation createSized(RenderScript renderScript, Element element, int i) {
        return createSized(renderScript, element, i, 1);
    }

    public static Allocation createSized(RenderScript renderScript, Element element, int i, int i2) {
        renderScript.validate();
        Builder builder = new Builder(renderScript, element);
        builder.setX(i);
        Type create = builder.create();
        long nAllocationCreateTyped = renderScript.nAllocationCreateTyped(create.getID(renderScript), MipmapControl.MIPMAP_NONE.mID, i2, 0);
        if (nAllocationCreateTyped != 0) {
            return new Allocation(nAllocationCreateTyped, renderScript, create, i2);
        }
        throw new RSRuntimeException("Allocation creation failed.");
    }

    public static Allocation createTyped(RenderScript renderScript, Type type) {
        return createTyped(renderScript, type, MipmapControl.MIPMAP_NONE, 1);
    }

    public static Allocation createTyped(RenderScript renderScript, Type type, int i) {
        return createTyped(renderScript, type, MipmapControl.MIPMAP_NONE, i);
    }

    public static Allocation createTyped(RenderScript renderScript, Type type, MipmapControl mipmapControl, int i) {
        renderScript.validate();
        if (type.getID(renderScript) == 0) {
            throw new RSInvalidStateException("Bad Type");
        } else if (renderScript.usingIO() || (i & 32) == 0) {
            long nAllocationCreateTyped = renderScript.nAllocationCreateTyped(type.getID(renderScript), mipmapControl.mID, i, 0);
            if (nAllocationCreateTyped != 0) {
                return new Allocation(nAllocationCreateTyped, renderScript, type, i);
            }
            throw new RSRuntimeException("Allocation creation failed.");
        } else {
            throw new RSRuntimeException("USAGE_IO not supported, Allocation creation failed.");
        }
    }

    private void data1DChecks(int i, int i2, int i3, int i4, boolean z) {
        this.mRS.validate();
        if (i < 0) {
            throw new RSIllegalArgumentException("Offset must be >= 0.");
        } else if (i2 <= 0) {
            throw new RSIllegalArgumentException("Count must be >= 1.");
        } else if (i + i2 > this.mCurrentCount) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Overflow, Available count ");
            stringBuilder.append(this.mCurrentCount);
            stringBuilder.append(", got ");
            stringBuilder.append(i2);
            stringBuilder.append(" at offset ");
            stringBuilder.append(i);
            stringBuilder.append(".");
            throw new RSIllegalArgumentException(stringBuilder.toString());
        } else if (z) {
            if (i3 < (i4 / 4) * 3) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
        } else if (i3 < i4) {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
    }

    public void destroy() {
        Object obj = 1;
        if (this.mIncCompatAllocation != 0) {
            synchronized (this) {
                if (this.mIncAllocDestroyed) {
                    obj = null;
                } else {
                    this.mIncAllocDestroyed = true;
                }
            }
            if (obj != null) {
                ReadLock readLock = this.mRS.mRWLock.readLock();
                readLock.lock();
                if (this.mRS.isAlive()) {
                    this.mRS.nIncObjDestroy(this.mIncCompatAllocation);
                }
                readLock.unlock();
                this.mIncCompatAllocation = 0;
            }
        }
        if ((this.mUsage & 96) != 0) {
            setSurface(null);
        }
        super.destroy();
    }

    static Element elementFromBitmap(RenderScript renderScript, Bitmap bitmap) {
        Config config = bitmap.getConfig();
        if (config == Config.ALPHA_8) {
            return Element.A_8(renderScript);
        }
        if (config == Config.ARGB_4444) {
            return Element.RGBA_4444(renderScript);
        }
        if (config == Config.ARGB_8888) {
            return Element.RGBA_8888(renderScript);
        }
        if (config == Config.RGB_565) {
            return Element.RGB_565(renderScript);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad bitmap type: ");
        stringBuilder.append(config);
        throw new RSInvalidStateException(stringBuilder.toString());
    }

    protected void finalize() {
        if (RenderScript.sUseGCHooks) {
            RenderScript.registerNativeFree.invoke(RenderScript.sRuntime, new Object[]{Integer.valueOf(this.mSize)});
        }
        super.finalize();
    }

    public void generateMipmaps() {
        this.mRS.nAllocationGenerateMipmaps(getID(this.mRS));
    }

    public ByteBuffer getByteBuffer() {
        int x = this.mType.getX() * this.mType.getElement().getBytesSize();
        if (this.mRS.getDispatchAPILevel() >= 21) {
            if (this.mByteBuffer == null || (this.mUsage & 32) != 0) {
                this.mByteBuffer = this.mRS.nAllocationGetByteBuffer(getID(this.mRS), x, this.mType.getY(), this.mType.getZ());
            }
            return this.mByteBuffer;
        } else if (this.mType.getZ() > 0) {
            return null;
        } else {
            byte[] bArr;
            if (this.mType.getY() > 0) {
                bArr = new byte[(this.mType.getY() * x)];
                copy2DRangeToUnchecked(0, 0, this.mType.getX(), this.mType.getY(), bArr, DataType.SIGNED_8, x * this.mType.getY());
            } else {
                bArr = new byte[x];
                copy1DRangeToUnchecked(0, this.mType.getX(), bArr);
            }
            ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr).asReadOnlyBuffer();
            this.mByteBufferStride = (long) x;
            return asReadOnlyBuffer;
        }
    }

    public int getBytesSize() {
        Type type = this.mType;
        if (type.mDimYuv != 0) {
            return (int) Math.ceil(((double) (type.getCount() * this.mType.getElement().getBytesSize())) * 1.5d);
        }
        return type.getCount() * this.mType.getElement().getBytesSize();
    }

    public Element getElement() {
        return this.mType.getElement();
    }

    private long getIDSafe() {
        Allocation allocation = this.mAdaptedAllocation;
        if (allocation != null) {
            return allocation.getID(this.mRS);
        }
        return getID(this.mRS);
    }

    public long getIncAllocID() {
        return this.mIncCompatAllocation;
    }

    public long getStride() {
        if (this.mByteBufferStride == 0) {
            if (this.mRS.getDispatchAPILevel() > 21) {
                this.mByteBufferStride = this.mRS.nAllocationGetStride(getID(this.mRS));
            } else {
                this.mByteBufferStride = (long) (this.mType.getX() * this.mType.getElement().getBytesSize());
            }
        }
        return this.mByteBufferStride;
    }

    public Type getType() {
        return this.mType;
    }

    public int getUsage() {
        return this.mUsage;
    }

    public void ioReceive() {
        if ((this.mUsage & 32) == 0) {
            throw new RSIllegalArgumentException("Can only receive if IO_INPUT usage specified.");
        }
        this.mRS.validate();
        this.mRS.nAllocationIoReceive(getID(this.mRS));
    }

    public void ioSend() {
        if ((this.mUsage & 64) == 0) {
            throw new RSIllegalArgumentException("Can only send buffer if IO_OUTPUT usage specified.");
        }
        this.mRS.validate();
        this.mRS.nAllocationIoSend(getID(this.mRS));
    }

    public void ioSendOutput() {
        ioSend();
    }

    public void setAutoPadding(boolean z) {
        this.mAutoPadding = z;
    }

    private void setBitmap(Bitmap bitmap) {
        this.mBitmap = bitmap;
    }

    public void setFromFieldPacker(int i, int i2, FieldPacker fieldPacker) {
        this.mRS.validate();
        if (i2 >= this.mType.mElement.mElements.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Component_number ");
            stringBuilder.append(i2);
            stringBuilder.append(" out of range.");
            throw new RSIllegalArgumentException(stringBuilder.toString());
        } else if (i < 0) {
            throw new RSIllegalArgumentException("Offset must be >= 0.");
        } else {
            byte[] data = fieldPacker.getData();
            int pos = fieldPacker.getPos();
            int bytesSize = this.mType.mElement.mElements[i2].getBytesSize() * this.mType.mElement.mArraySizes[i2];
            if (pos != bytesSize) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Field packer sizelength ");
                stringBuilder2.append(pos);
                stringBuilder2.append(" does not match component size ");
                stringBuilder2.append(bytesSize);
                stringBuilder2.append(".");
                throw new RSIllegalArgumentException(stringBuilder2.toString());
            }
            this.mRS.nAllocationElementData1D(getIDSafe(), i, this.mSelectedLOD, i2, data, pos);
        }
    }

    public void setFromFieldPacker(int i, FieldPacker fieldPacker) {
        this.mRS.validate();
        int bytesSize = this.mType.mElement.getBytesSize();
        byte[] data = fieldPacker.getData();
        int pos = fieldPacker.getPos();
        int i2 = pos / bytesSize;
        if (bytesSize * i2 != pos) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Field packer length ");
            stringBuilder.append(pos);
            stringBuilder.append(" not divisible by element size ");
            stringBuilder.append(bytesSize);
            stringBuilder.append(".");
            throw new RSIllegalArgumentException(stringBuilder.toString());
        }
        copy1DRangeFromUnchecked(i, i2, data);
    }

    public void setIncAllocID(long j) {
        this.mIncCompatAllocation = j;
    }

    public void setSurface(Surface surface) {
        this.mRS.validate();
        if ((this.mUsage & 64) == 0) {
            throw new RSInvalidStateException("Allocation is not USAGE_IO_OUTPUT.");
        }
        this.mRS.nAllocationSetSurface(getID(this.mRS), surface);
    }

    public void syncAll(int i) {
        switch (i) {
            case 1:
            case 2:
                this.mRS.validate();
                this.mRS.nAllocationSyncAll(getIDSafe(), i);
                return;
            default:
                throw new RSIllegalArgumentException("Source must be exactly one usage type.");
        }
    }

    static Type typeFromBitmap(RenderScript renderScript, Bitmap bitmap, MipmapControl mipmapControl) {
        boolean z;
        Builder builder = new Builder(renderScript, elementFromBitmap(renderScript, bitmap));
        builder.setX(bitmap.getWidth());
        builder.setY(bitmap.getHeight());
        if (mipmapControl == MipmapControl.MIPMAP_FULL) {
            z = true;
        } else {
            z = false;
        }
        builder.setMipmaps(z);
        return builder.create();
    }

    private void updateCacheInfo(Type type) {
        this.mCurrentDimX = type.getX();
        this.mCurrentDimY = type.getY();
        this.mCurrentDimZ = type.getZ();
        this.mCurrentCount = this.mCurrentDimX;
        int i = this.mCurrentDimY;
        if (i > 1) {
            this.mCurrentCount = i * this.mCurrentCount;
        }
        i = this.mCurrentDimZ;
        if (i > 1) {
            this.mCurrentCount = i * this.mCurrentCount;
        }
    }

    private void validate2DRange(int i, int i2, int i3, int i4) {
        if (this.mAdaptedAllocation != null) {
            return;
        }
        if (i < 0 || i2 < 0) {
            throw new RSIllegalArgumentException("Offset cannot be negative.");
        } else if (i4 < 0 || i3 < 0) {
            throw new RSIllegalArgumentException("Height or width cannot be negative.");
        } else if (i + i3 > this.mCurrentDimX || i2 + i4 > this.mCurrentDimY) {
            throw new RSIllegalArgumentException("Updated region larger than allocation.");
        }
    }

    private void validate3DRange(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.mAdaptedAllocation != null) {
            return;
        }
        if (i < 0 || i2 < 0 || i3 < 0) {
            throw new RSIllegalArgumentException("Offset cannot be negative.");
        } else if (i5 < 0 || i4 < 0 || i6 < 0) {
            throw new RSIllegalArgumentException("Height or width cannot be negative.");
        } else if (i + i4 > this.mCurrentDimX || i2 + i5 > this.mCurrentDimY || i3 + i6 > this.mCurrentDimZ) {
            throw new RSIllegalArgumentException("Updated region larger than allocation.");
        }
    }

    private void validateBitmapFormat(Bitmap bitmap) {
        Config config = bitmap.getConfig();
        if (config == null) {
            throw new RSIllegalArgumentException("Bitmap has an unsupported format for this operation");
        }
        StringBuilder stringBuilder;
        switch (C00291.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()]) {
            case 1:
                if (this.mType.getElement().mKind != DataKind.PIXEL_A) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Allocation kind is ");
                    stringBuilder.append(this.mType.getElement().mKind);
                    stringBuilder.append(", type ");
                    stringBuilder.append(this.mType.getElement().mType);
                    stringBuilder.append(" of ");
                    stringBuilder.append(this.mType.getElement().getBytesSize());
                    stringBuilder.append(" bytes, passed bitmap was ");
                    stringBuilder.append(config);
                    throw new RSIllegalArgumentException(stringBuilder.toString());
                }
                return;
            case 2:
                if (this.mType.getElement().mKind != DataKind.PIXEL_RGBA || this.mType.getElement().getBytesSize() != 4) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Allocation kind is ");
                    stringBuilder.append(this.mType.getElement().mKind);
                    stringBuilder.append(", type ");
                    stringBuilder.append(this.mType.getElement().mType);
                    stringBuilder.append(" of ");
                    stringBuilder.append(this.mType.getElement().getBytesSize());
                    stringBuilder.append(" bytes, passed bitmap was ");
                    stringBuilder.append(config);
                    throw new RSIllegalArgumentException(stringBuilder.toString());
                }
                return;
            case 3:
                if (this.mType.getElement().mKind != DataKind.PIXEL_RGB || this.mType.getElement().getBytesSize() != 2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Allocation kind is ");
                    stringBuilder.append(this.mType.getElement().mKind);
                    stringBuilder.append(", type ");
                    stringBuilder.append(this.mType.getElement().mType);
                    stringBuilder.append(" of ");
                    stringBuilder.append(this.mType.getElement().getBytesSize());
                    stringBuilder.append(" bytes, passed bitmap was ");
                    stringBuilder.append(config);
                    throw new RSIllegalArgumentException(stringBuilder.toString());
                }
                return;
            case 4:
                if (this.mType.getElement().mKind != DataKind.PIXEL_RGBA || this.mType.getElement().getBytesSize() != 2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Allocation kind is ");
                    stringBuilder.append(this.mType.getElement().mKind);
                    stringBuilder.append(", type ");
                    stringBuilder.append(this.mType.getElement().mType);
                    stringBuilder.append(" of ");
                    stringBuilder.append(this.mType.getElement().getBytesSize());
                    stringBuilder.append(" bytes, passed bitmap was ");
                    stringBuilder.append(config);
                    throw new RSIllegalArgumentException(stringBuilder.toString());
                }
                return;
            default:
                return;
        }
    }

    private void validateBitmapSize(Bitmap bitmap) {
        if (this.mCurrentDimX != bitmap.getWidth() || this.mCurrentDimY != bitmap.getHeight()) {
            throw new RSIllegalArgumentException("Cannot update allocation from bitmap, sizes mismatch");
        }
    }

    private void validateIsFloat32() {
        if (this.mType.mElement.mType != DataType.FLOAT_32) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("32 bit float source does not match allocation type ");
            stringBuilder.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(stringBuilder.toString());
        }
    }

    private void validateIsFloat64() {
        if (this.mType.mElement.mType != DataType.FLOAT_64) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("64 bit float source does not match allocation type ");
            stringBuilder.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(stringBuilder.toString());
        }
    }

    private void validateIsInt16() {
        if (this.mType.mElement.mType != DataType.SIGNED_16 && this.mType.mElement.mType != DataType.UNSIGNED_16) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("16 bit integer source does not match allocation type ");
            stringBuilder.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(stringBuilder.toString());
        }
    }

    private void validateIsInt32() {
        if (this.mType.mElement.mType != DataType.SIGNED_32 && this.mType.mElement.mType != DataType.UNSIGNED_32) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("32 bit integer source does not match allocation type ");
            stringBuilder.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(stringBuilder.toString());
        }
    }

    private void validateIsInt64() {
        if (this.mType.mElement.mType != DataType.SIGNED_64 && this.mType.mElement.mType != DataType.UNSIGNED_64) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("64 bit integer source does not match allocation type ");
            stringBuilder.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(stringBuilder.toString());
        }
    }

    private void validateIsInt8() {
        if (this.mType.mElement.mType != DataType.SIGNED_8 && this.mType.mElement.mType != DataType.UNSIGNED_8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("8 bit integer source does not match allocation type ");
            stringBuilder.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(stringBuilder.toString());
        }
    }

    private void validateIsObject() {
        if (this.mType.mElement.mType != DataType.RS_ELEMENT && this.mType.mElement.mType != DataType.RS_TYPE && this.mType.mElement.mType != DataType.RS_ALLOCATION && this.mType.mElement.mType != DataType.RS_SAMPLER && this.mType.mElement.mType != DataType.RS_SCRIPT) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Object source does not match allocation type ");
            stringBuilder.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(stringBuilder.toString());
        }
    }

    private DataType validateObjectIsPrimitiveArray(Object obj, boolean z) {
        Class cls = obj.getClass();
        if (cls.isArray()) {
            cls = cls.getComponentType();
            if (!cls.isPrimitive()) {
                throw new RSIllegalArgumentException("Object passed is not an Array of primitives.");
            } else if (cls == Long.TYPE) {
                if (!z) {
                    return DataType.SIGNED_64;
                }
                validateIsInt64();
                return this.mType.mElement.mType;
            } else if (cls == Integer.TYPE) {
                if (!z) {
                    return DataType.SIGNED_32;
                }
                validateIsInt32();
                return this.mType.mElement.mType;
            } else if (cls == Short.TYPE) {
                if (!z) {
                    return DataType.SIGNED_16;
                }
                validateIsInt16();
                return this.mType.mElement.mType;
            } else if (cls == Byte.TYPE) {
                if (!z) {
                    return DataType.SIGNED_8;
                }
                validateIsInt8();
                return this.mType.mElement.mType;
            } else if (cls == Float.TYPE) {
                if (z) {
                    validateIsFloat32();
                }
                return DataType.FLOAT_32;
            } else if (cls != Double.TYPE) {
                return null;
            } else {
                if (z) {
                    validateIsFloat64();
                }
                return DataType.FLOAT_64;
            }
        }
        throw new RSIllegalArgumentException("Object passed is not an array of primitives.");
    }
}
