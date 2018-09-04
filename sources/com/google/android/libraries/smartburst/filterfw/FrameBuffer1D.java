package com.google.android.libraries.smartburst.filterfw;

import android.annotation.TargetApi;
import android.renderscript.Allocation;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class FrameBuffer1D extends Frame {
    public int mLength = 0;

    FrameBuffer1D(BackingStore backingStore) {
        super(backingStore);
        updateLength(backingStore.getDimensions());
    }

    static void assertCanCreate(BackingStore backingStore) {
        FrameType frameType = backingStore.getFrameType();
        if (frameType.getElementSize() == 0) {
            String valueOf = String.valueOf(frameType);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 55);
            stringBuilder.append("Cannot access Frame of type ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" as a FrameBuffer instance!");
            throw new RuntimeException(stringBuilder.toString());
        }
        int[] dimensions = backingStore.getDimensions();
        if (dimensions == null || dimensions.length == 0) {
            throw new RuntimeException("Cannot access Frame with no dimensions as a FrameBuffer instance!");
        }
    }

    static FrameBuffer1D create(BackingStore backingStore) {
        assertCanCreate(backingStore);
        return new FrameBuffer1D(backingStore);
    }

    public int[] getDimensions() {
        return super.getDimensions();
    }

    public int getLength() {
        return this.mLength;
    }

    @TargetApi(11)
    public Allocation lockAllocation(int i) {
        assertAccessible(i);
        return (Allocation) this.mBackingStore.lockData(i, 32);
    }

    public ByteBuffer lockBytes(int i) {
        assertAccessible(i);
        return (ByteBuffer) this.mBackingStore.lockData(i, 1);
    }

    public void resize(int[] iArr) {
        super.resize(iArr);
    }

    void updateLength(int[] iArr) {
        this.mLength = 1;
        for (int i : iArr) {
            this.mLength = i * this.mLength;
        }
    }
}
