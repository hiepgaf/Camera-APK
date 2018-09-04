package com.google.android.libraries.smartburst.filterfw;

/* compiled from: PG */
public abstract class SlotFilter extends Filter {
    public final String mSlotName;

    public SlotFilter(MffContext mffContext, String str, String str2) {
        super(mffContext, str);
        this.mSlotName = str2;
    }

    protected final FrameType getSlotType() {
        return getFrameManager().getSlot(this.mSlotName).getType();
    }

    public final boolean slotHasFrame() {
        return getFrameManager().getSlot(this.mSlotName).hasFrame();
    }
}
