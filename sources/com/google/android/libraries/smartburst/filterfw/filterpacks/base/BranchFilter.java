package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public final class BranchFilter extends Filter {
    public boolean mSynchronized = true;

    public BranchFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public BranchFilter(MffContext mffContext, String str, boolean z) {
        super(mffContext, str);
        this.mSynchronized = z;
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("input", 2, FrameType.any()).addInputPort("synchronized", 1, FrameType.single(Boolean.TYPE)).disallowOtherInputs();
    }

    public final void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("input")) {
            for (OutputPort attachToOutputPort : getConnectedOutputPorts()) {
                inputPort.attachToOutputPort(attachToOutputPort);
            }
        } else if (inputPort.getName().equals("synchronized")) {
            inputPort.bindToFieldNamed("mSynchronized");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected final void onOpen() {
        updateSynchronization();
    }

    protected final void onProcess() {
        Frame pullFrame = getConnectedInputPort("input").pullFrame();
        for (OutputPort outputPort : getConnectedOutputPorts()) {
            if (outputPort.isAvailable()) {
                outputPort.pushFrame(pullFrame);
            }
        }
    }

    private final void updateSynchronization() {
        int i = 0;
        if (this.mSynchronized) {
            OutputPort[] connectedOutputPorts = getConnectedOutputPorts();
            int length = connectedOutputPorts.length;
            while (i < length) {
                connectedOutputPorts[i].setWaitsUntilAvailable(true);
                i++;
            }
            return;
        }
        for (OutputPort waitsUntilAvailable : getConnectedOutputPorts()) {
            waitsUntilAvailable.setWaitsUntilAvailable(false);
        }
    }
}
