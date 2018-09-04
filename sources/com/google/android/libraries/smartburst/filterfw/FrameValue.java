package com.google.android.libraries.smartburst.filterfw;

/* compiled from: PG */
public class FrameValue extends Frame {
    FrameValue(BackingStore backingStore) {
        super(backingStore);
    }

    static void assertObjectBased(FrameType frameType) {
        if (frameType.getElementId() != 1) {
            throw new RuntimeException("Cannot access non-object based Frame as FrameValue!");
        }
    }

    static FrameValue create(BackingStore backingStore) {
        assertObjectBased(backingStore.getFrameType());
        return new FrameValue(backingStore);
    }

    public Object getValue() {
        Object lockData = this.mBackingStore.lockData(1, 8);
        this.mBackingStore.unlock();
        return lockData;
    }

    public void setValue(Object obj) {
        this.mBackingStore.lockBacking(2, 8).setData(obj);
        this.mBackingStore.unlock();
    }
}
