package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public class GraphOutputTarget extends Filter {
    public Frame mFrame = null;
    public FrameType mType = FrameType.any();

    public GraphOutputTarget(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    protected boolean canSchedule() {
        return super.canSchedule() && this.mFrame == null;
    }

    public Signature getSignature() {
        return new Signature().addInputPort("frame", 2, this.mType).disallowOtherInputs();
    }

    public FrameType getType() {
        return this.mType;
    }

    protected void onProcess() {
        Frame pullFrame = getConnectedInputPort("frame").pullFrame();
        Frame frame = this.mFrame;
        if (frame != null) {
            frame.release();
        }
        this.mFrame = pullFrame.retain();
    }

    public Frame pullFrame() {
        Frame frame = this.mFrame;
        if (frame == null) {
            return null;
        }
        this.mFrame = null;
        return frame;
    }

    public void setType(FrameType frameType) {
        this.mType = frameType;
    }
}
