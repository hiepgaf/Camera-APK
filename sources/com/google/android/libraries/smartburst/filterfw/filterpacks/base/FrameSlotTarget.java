package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.SlotFilter;

/* compiled from: PG */
public final class FrameSlotTarget extends SlotFilter {
    public FrameSlotTarget(MffContext mffContext, String str, String str2) {
        super(mffContext, str, str2);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("frame", 2, FrameType.any()).disallowOtherPorts();
    }

    protected final void onProcess() {
        getFrameManager().storeFrame(getConnectedInputPort("frame").pullFrame(), this.mSlotName);
    }
}
