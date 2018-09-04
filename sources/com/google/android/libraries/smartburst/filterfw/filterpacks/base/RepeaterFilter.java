package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public final class RepeaterFilter extends Filter {
    public Frame mCachedFrame = null;
    public int mRepeat = 0;

    public RepeaterFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("input", 2, FrameType.any()).addInputPort("repeat", 2, FrameType.single(Integer.TYPE)).addOutputPort("output", 2, FrameType.any()).disallowOtherPorts();
    }

    public final void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("input")) {
            inputPort.attachToOutputPort(getConnectedOutputPort("output"));
        }
    }

    protected final void onProcess() {
        boolean z;
        InputPort connectedInputPort = getConnectedInputPort("repeat");
        InputPort connectedInputPort2 = getConnectedInputPort("input");
        if (this.mRepeat <= 1) {
            Frame frame = this.mCachedFrame;
            if (frame != null) {
                frame.release();
            }
            this.mCachedFrame = connectedInputPort2.pullFrame().retain();
        }
        this.mRepeat = ((Integer) connectedInputPort.pullFrame().asFrameValue().getValue()).intValue();
        if (this.mRepeat <= 1) {
            z = true;
        } else {
            z = false;
        }
        connectedInputPort2.setWaitsForFrame(z);
        if (this.mRepeat > 0) {
            getConnectedOutputPort("output").pushFrame(this.mCachedFrame);
        }
    }

    protected final void onTearDown() {
        Frame frame = this.mCachedFrame;
        if (frame != null) {
            frame.release();
        }
    }
}
