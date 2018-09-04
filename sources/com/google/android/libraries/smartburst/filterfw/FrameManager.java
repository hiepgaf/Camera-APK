package com.google.android.libraries.smartburst.filterfw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/* compiled from: PG */
public class FrameManager {
    public static final int DEFAULT_MAX_CACHE_SIZE = 12582912;
    public static final int FRAME_CACHE_LFU = 2;
    public static final int FRAME_CACHE_LRU = 1;
    public static final int FRAME_CACHE_NONE = 0;
    public static final int SLOT_FLAGS_NONE = 0;
    public static final int SLOT_FLAG_STICKY = 1;
    public static final ThreadLocal mCurrentFrameManager = new ThreadLocal();
    public Set mBackings = new HashSet();
    public BackingCache mCache;
    public Map mFrameSlots = new HashMap();
    public GraphRunner mRunner;

    /* compiled from: PG */
    abstract class BackingCache {
        public int mCacheMaxSize;

        private BackingCache() {
            this.mCacheMaxSize = FrameManager.DEFAULT_MAX_CACHE_SIZE;
        }

        public abstract boolean cacheBacking(Backing backing);

        public abstract void clear();

        public abstract Backing fetchBacking(int i, int i2, int[] iArr, int i3);

        public abstract int getSizeLeft();

        public int getSize() {
            return this.mCacheMaxSize;
        }

        public void setSize(int i) {
            this.mCacheMaxSize = i;
        }
    }

    /* compiled from: PG */
    class FrameSlot {
        public int mFlags;
        public Frame mFrame = null;
        public FrameType mType;

        public FrameSlot(FrameType frameType, int i) {
            this.mType = frameType;
            this.mFlags = i;
        }

        public void assignFrame(Frame frame) {
            Frame frame2 = this.mFrame;
            this.mFrame = frame.retain();
            if (frame2 != null) {
                frame2.release();
            }
        }

        public Frame getFrame() {
            Frame retain = this.mFrame.retain();
            if ((this.mFlags & 1) == 0) {
                releaseFrame();
            }
            return retain;
        }

        public FrameType getType() {
            return this.mType;
        }

        public boolean hasFrame() {
            return this.mFrame != null;
        }

        public void markWritable() {
            Frame frame = this.mFrame;
            if (frame != null) {
                frame.setReadOnly(false);
            }
        }

        public void releaseFrame() {
            Frame frame = this.mFrame;
            if (frame != null) {
                frame.release();
                this.mFrame = null;
            }
        }
    }

    /* compiled from: PG */
    class BackingCacheNone extends BackingCache {
        private BackingCacheNone() {
            super();
        }

        public boolean cacheBacking(Backing backing) {
            return false;
        }

        public void clear() {
        }

        public Backing fetchBacking(int i, int i2, int[] iArr, int i3) {
            return null;
        }

        public int getSize() {
            return 0;
        }

        public int getSizeLeft() {
            return 0;
        }
    }

    /* compiled from: PG */
    abstract class PriorityBackingCache extends BackingCache {
        public PriorityQueue mQueue = new PriorityQueue(4, new C00641(this));
        public int mSize = 0;

        /* compiled from: PG */
        /* renamed from: com.google.android.libraries.smartburst.filterfw.FrameManager$PriorityBackingCache$1 */
        class C00641 implements Comparator {
            C00641(PriorityBackingCache priorityBackingCache) {
            }

            public int compare(Backing backing, Backing backing2) {
                return backing.cachePriority - backing2.cachePriority;
            }
        }

        public PriorityBackingCache() {
            super();
        }

        protected abstract void onCacheBacking(Backing backing);

        protected abstract void onFetchBacking(Backing backing);

        public boolean cacheBacking(Backing backing) {
            if (!reserve(backing.getSize())) {
                return false;
            }
            onCacheBacking(backing);
            this.mQueue.add(backing);
            return true;
        }

        public void clear() {
            this.mQueue.clear();
            this.mSize = 0;
        }

        public Backing fetchBacking(int i, int i2, int[] iArr, int i3) {
            Iterator it = this.mQueue.iterator();
            while (it.hasNext()) {
                int writeAccess;
                Backing backing = (Backing) it.next();
                if (i == 2) {
                    writeAccess = backing.writeAccess();
                } else {
                    writeAccess = backing.readAccess();
                }
                if ((writeAccess & i2) == i2 && FrameManager.dimensionsCompatible(backing.getDimensions(), iArr) && i3 == backing.getElementSize()) {
                    this.mQueue.remove(backing);
                    this.mSize -= backing.getSize();
                    onFetchBacking(backing);
                    return backing;
                }
            }
            return null;
        }

        public int getSizeLeft() {
            return this.mCacheMaxSize - this.mSize;
        }

        private boolean reserve(int i) {
            if (i > this.mCacheMaxSize) {
                return false;
            }
            this.mSize += i;
            while (this.mSize > this.mCacheMaxSize) {
                Backing backing = (Backing) this.mQueue.poll();
                this.mSize -= backing.getSize();
                backing.destroy();
            }
            return true;
        }
    }

    /* compiled from: PG */
    class BackingCacheLfu extends PriorityBackingCache {
        private BackingCacheLfu() {
        }

        protected void onCacheBacking(Backing backing) {
            backing.cachePriority = 0;
        }

        protected void onFetchBacking(Backing backing) {
            backing.cachePriority++;
        }
    }

    /* compiled from: PG */
    class BackingCacheLru extends PriorityBackingCache {
        public int mTimestamp;

        private BackingCacheLru() {
            this.mTimestamp = 0;
        }

        protected void onCacheBacking(Backing backing) {
            backing.cachePriority = 0;
        }

        protected void onFetchBacking(Backing backing) {
            this.mTimestamp++;
            backing.cachePriority = this.mTimestamp;
        }
    }

    FrameManager(GraphRunner graphRunner, int i) {
        this.mRunner = graphRunner;
        switch (i) {
            case 0:
                this.mCache = new BackingCacheNone();
                return;
            case 1:
                this.mCache = new BackingCacheLru();
                return;
            case 2:
                this.mCache = new BackingCacheLfu();
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("Unknown cache-type ");
                stringBuilder.append(i);
                stringBuilder.append("!");
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public void addFrameSlot(String str, FrameType frameType, int i) {
        assertNotRunning();
        if (((FrameSlot) this.mFrameSlots.get(str)) != null) {
            removeFrameSlot(str);
        }
        this.mFrameSlots.put(str, new FrameSlot(frameType, i));
    }

    private void assertInGraphRun() {
        GraphRunner graphRunner = this.mRunner;
        if (graphRunner == null || !graphRunner.isRunning() || GraphRunner.current() != this.mRunner) {
            throw new IllegalStateException("Attempting to access FrameManager Frame data outside of graph run-loop!");
        }
    }

    private void assertNotRunning() {
        GraphRunner graphRunner = this.mRunner;
        if (graphRunner != null && graphRunner.isRunning()) {
            throw new IllegalStateException("Attempting to modify FrameManager while graph is running!");
        }
    }

    void attachManagerToThread() {
        synchronized (mCurrentFrameManager) {
            if (current() != null) {
                throw new RuntimeException("FrameManager already attached to current thread!");
            }
            mCurrentFrameManager.set(this);
        }
    }

    public static void attachToThread() {
        new FrameManager(null, 1).attachManagerToThread();
    }

    public void clearCache() {
        this.mCache.clear();
    }

    public static FrameManager current() {
        return (FrameManager) mCurrentFrameManager.get();
    }

    void destroyBackings() {
        for (Backing destroy : this.mBackings) {
            destroy.destroy();
        }
        this.mBackings.clear();
        this.mCache.clear();
    }

    public static void detachFromThread() {
        synchronized (mCurrentFrameManager) {
            FrameManager current = current();
            if (current == null) {
                throw new RuntimeException("No FrameManager attached to current thread!");
            }
            current.destroyBackings();
            mCurrentFrameManager.set(null);
        }
    }

    private static boolean dimensionsCompatible(int[] iArr, int[] iArr2) {
        return iArr == null || iArr2 == null || Arrays.equals(iArr, iArr2);
    }

    Backing fetchBacking(int i, int i2, int[] iArr, int i3) {
        return this.mCache.fetchBacking(i, i2, iArr, i3);
    }

    public Frame fetchFrame(String str) {
        assertInGraphRun();
        return getSlot(str).getFrame();
    }

    public int getCacheSize() {
        return this.mCache.getSize();
    }

    public MffContext getContext() {
        return this.mRunner.getContext();
    }

    public GraphRunner getRunner() {
        return this.mRunner;
    }

    FrameSlot getSlot(String str) {
        FrameSlot frameSlot = (FrameSlot) this.mFrameSlots.get(str);
        if (frameSlot != null) {
            return frameSlot;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
        stringBuilder.append("Unknown frame slot '");
        stringBuilder.append(str);
        stringBuilder.append("'!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public Frame importFrame(Frame frame) {
        if (frame.isReadOnly()) {
            return frame.makeCpuCopy(this);
        }
        String valueOf = String.valueOf(frame);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 61);
        stringBuilder.append("Frame ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" must be read-only to import into another FrameManager!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    void onBackingAvailable(Backing backing) {
        if (!backing.shouldCache() || !this.mCache.cacheBacking(backing)) {
            backing.destroy();
            this.mBackings.remove(backing);
        }
    }

    void onBackingCreated(Backing backing) {
        if (backing != null) {
            this.mBackings.add(backing);
        }
    }

    void onBeginRun() {
        for (FrameSlot markWritable : this.mFrameSlots.values()) {
            markWritable.markWritable();
        }
    }

    public void removeFrameSlot(String str) {
        assertNotRunning();
        getSlot(str).releaseFrame();
        this.mFrameSlots.remove(str);
    }

    public void setCacheSize(int i) {
        this.mCache.setSize(i);
    }

    public void storeFrame(Frame frame, String str) {
        assertInGraphRun();
        getSlot(str).assignFrame(frame);
    }
}
