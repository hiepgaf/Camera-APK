package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public class GraphInputSource extends Filter {
    public Frame mFrame = null;

    public GraphInputSource(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    protected boolean canSchedule() {
        return super.canSchedule() && this.mFrame != null;
    }

    public Signature getSignature() {
        return new Signature().addOutputPort("frame", 2, FrameType.any()).disallowOtherInputs();
    }

    protected void onProcess() {
        if (this.mFrame != null) {
            getConnectedOutputPort("frame").pushFrame(this.mFrame);
            this.mFrame.release();
            this.mFrame = null;
        }
    }

    protected void onTearDown() {
        Frame frame = this.mFrame;
        if (frame != null) {
            frame.release();
            this.mFrame = null;
        }
    }

    public void pushFrame(Frame frame) {
        Frame frame2 = this.mFrame;
        if (frame2 != null) {
            frame2.release();
        }
        if (frame == null) {
            throw new RuntimeException("Attempting to assign null-frame!");
        }
        this.mFrame = frame.retain();
    }
}
