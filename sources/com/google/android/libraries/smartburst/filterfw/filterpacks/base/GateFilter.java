package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public final class GateFilter extends Filter {
    public int mPassFrames;

    public GateFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("frame", 2, FrameType.any()).addOutputPort("frame", 2, FrameType.any()).disallowOtherPorts();
    }

    public final void onInputPortOpen(InputPort inputPort) {
        inputPort.attachToOutputPort(getConnectedOutputPort("frame"));
    }

    protected final void onOpen() {
        this.mPassFrames = 0;
    }

    protected final synchronized void onProcess() {
        Frame pullFrame = getConnectedInputPort("frame").pullFrame();
        if (this.mPassFrames > 0) {
            getConnectedOutputPort("frame").pushFrame(pullFrame);
            this.mPassFrames--;
        }
    }

    public final synchronized void passNextFrame() {
        this.mPassFrames = 1;
    }

    public final synchronized void passNextFrames(int i) {
        this.mPassFrames = i;
    }
}
