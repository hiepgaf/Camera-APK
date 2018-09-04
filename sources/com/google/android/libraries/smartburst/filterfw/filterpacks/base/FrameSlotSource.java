package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.SlotFilter;

/* compiled from: PG */
public final class FrameSlotSource extends SlotFilter {
    public FrameSlotSource(MffContext mffContext, String str, String str2) {
        super(mffContext, str, str2);
    }

    protected final boolean canSchedule() {
        return super.canSchedule() && slotHasFrame();
    }

    public final Signature getSignature() {
        return new Signature().addOutputPort("frame", 2, FrameType.any()).disallowOtherPorts();
    }

    protected final void onProcess() {
        Frame fetchFrame = getFrameManager().fetchFrame(this.mSlotName);
        getConnectedOutputPort("frame").pushFrame(fetchFrame);
        fetchFrame.release();
    }
}
