package com.google.android.libraries.smartburst.filterfw;

/* compiled from: PG */
public class FrameBuffer2D extends FrameBuffer1D {
    FrameBuffer2D(BackingStore backingStore) {
        super(backingStore);
    }

    static void assertCanCreate(BackingStore backingStore) {
        int length;
        FrameBuffer1D.assertCanCreate(backingStore);
        int[] dimensions = backingStore.getDimensions();
        if (dimensions != null) {
            length = dimensions.length;
        } else {
            length = 0;
        }
        if (length != 2) {
            StringBuilder stringBuilder = new StringBuilder(72);
            stringBuilder.append("Cannot access ");
            stringBuilder.append(length);
            stringBuilder.append("-dimensional Frame as a FrameBuffer2D instance!");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static FrameBuffer2D create(BackingStore backingStore) {
        assertCanCreate(backingStore);
        return new FrameBuffer2D(backingStore);
    }

    public int getHeight() {
        return this.mBackingStore.getDimensions()[1];
    }

    public int getWidth() {
        return this.mBackingStore.getDimensions()[0];
    }
}
