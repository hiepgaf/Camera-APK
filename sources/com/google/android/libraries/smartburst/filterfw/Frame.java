package com.google.android.libraries.smartburst.filterfw;

import java.util.Arrays;

/* compiled from: PG */
public class Frame {
    public static final int MODE_READ = 1;
    public static final int MODE_WRITE = 2;
    public static final long TIMESTAMP_END_OF_STREAM = -2;
    public static final long TIMESTAMP_NOT_SET = -1;
    public BackingStore mBackingStore;
    public boolean mReadOnly = false;

    Frame(BackingStore backingStore) {
        this.mBackingStore = backingStore;
    }

    Frame(FrameType frameType, int[] iArr, FrameManager frameManager) {
        this.mBackingStore = new BackingStore(frameType, iArr, frameManager);
    }

    public final FrameBuffer1D asFrameBuffer1D() {
        return FrameBuffer1D.create(this.mBackingStore);
    }

    public final FrameBuffer2D asFrameBuffer2D() {
        return FrameBuffer2D.create(this.mBackingStore);
    }

    public final FrameImage2D asFrameImage2D() {
        return FrameImage2D.create(this.mBackingStore);
    }

    public final FrameValue asFrameValue() {
        return FrameValue.create(this.mBackingStore);
    }

    public final FrameValues asFrameValues() {
        return FrameValues.create(this.mBackingStore);
    }

    final void assertAccessible(int i) {
        if (this.mReadOnly && i == 2) {
            String valueOf = String.valueOf(this);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 40);
            stringBuilder.append("Attempting to write to read-only frame ");
            stringBuilder.append(valueOf);
            stringBuilder.append("!");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Frame create(FrameType frameType, int[] iArr) {
        FrameManager current = FrameManager.current();
        if (current != null) {
            return new Frame(frameType, iArr, current);
        }
        throw new IllegalStateException("Attempting to create new Frame outside of FrameManager context!");
    }

    public boolean equals(Object obj) {
        return (obj instanceof Frame) && ((Frame) obj).mBackingStore == this.mBackingStore;
    }

    public int[] getDimensions() {
        int[] dimensions = this.mBackingStore.getDimensions();
        return dimensions != null ? Arrays.copyOf(dimensions, dimensions.length) : null;
    }

    public final int getElementCount() {
        return this.mBackingStore.getElementCount();
    }

    public final long getTimestamp() {
        return this.mBackingStore.getTimestamp();
    }

    public final long getTimestampMillis() {
        return this.mBackingStore.getTimestamp() / 1000000;
    }

    public final FrameType getType() {
        return this.mBackingStore.getFrameType();
    }

    public final boolean isReadOnly() {
        return this.mReadOnly;
    }

    Frame makeCpuCopy(FrameManager frameManager) {
        Frame frame = new Frame(getType(), getDimensions(), frameManager);
        frame.mBackingStore.importStore(this.mBackingStore);
        return frame;
    }

    public final Frame release() {
        this.mBackingStore = this.mBackingStore.release();
        return this.mBackingStore != null ? this : null;
    }

    void resize(int[] iArr) {
        int length;
        int i = 0;
        int[] dimensions = this.mBackingStore.getDimensions();
        if (dimensions != null) {
            length = dimensions.length;
        } else {
            length = 0;
        }
        if (iArr != null) {
            i = iArr.length;
        }
        if (length != i) {
            StringBuilder stringBuilder = new StringBuilder(77);
            stringBuilder.append("Cannot resize ");
            stringBuilder.append(length);
            stringBuilder.append("-dimensional Frame to ");
            stringBuilder.append(i);
            stringBuilder.append("-dimensional Frame!");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (iArr != null && !Arrays.equals(dimensions, iArr)) {
            this.mBackingStore.resize(iArr);
        }
    }

    public final Frame retain() {
        this.mBackingStore = this.mBackingStore.retain();
        return this;
    }

    final void setReadOnly(boolean z) {
        this.mReadOnly = z;
    }

    public final void setTimestamp(long j) {
        this.mBackingStore.setTimestamp(j);
    }

    public String toString() {
        String frameType = getType().toString();
        String valueOf = String.valueOf(this.mBackingStore);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(frameType).length() + 9) + String.valueOf(valueOf).length());
        stringBuilder.append("Frame[");
        stringBuilder.append(frameType);
        stringBuilder.append("]: ");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }

    public void unlock() {
        if (!this.mBackingStore.unlock()) {
            throw new RuntimeException("Attempting to unlock frame that is not locked!");
        }
    }
}
