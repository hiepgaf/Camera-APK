package com.google.android.libraries.smartburst.filterpacks.analysis;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;
import p000.jwb;

/* compiled from: PG */
public class SelectionFilter extends Filter {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String INPUT_PORT_FRAME = "frame";
    public static final String OUTPUT_PORT_FRAME = "frame";
    public jwb mFrameFilter = null;

    public SelectionFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("frame", 2, FrameType.any()).addOutputPort("frame", 2, FrameType.any()).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("frame")) {
            inputPort.attachToOutputPort(getConnectedOutputPort("frame"));
        }
    }

    protected void onOpen() {
        if (this.mFrameFilter == null) {
            throw new NullPointerException("No FrameFilter set on SelectionFilter!");
        }
    }

    protected void onProcess() {
        Frame pullFrame = getConnectedInputPort("frame").pullFrame();
        if (pullFrame.getTimestamp() == -2 || this.mFrameFilter.mo2057a(pullFrame.getTimestamp())) {
            getConnectedOutputPort("frame").pushFrame(pullFrame);
        }
    }

    public void setFrameFilter(jwb jwb) {
        this.mFrameFilter = jwb;
    }
}
