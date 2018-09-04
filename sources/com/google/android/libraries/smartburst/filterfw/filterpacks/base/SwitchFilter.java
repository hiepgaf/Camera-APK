package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public final class SwitchFilter extends Filter {
    public String mTarget = null;

    public SwitchFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("input", 2, FrameType.any()).addInputPort("target", 1, FrameType.single(String.class)).disallowOtherInputs();
    }

    public final void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("input")) {
            for (OutputPort attachToOutputPort : getConnectedOutputPorts()) {
                inputPort.attachToOutputPort(attachToOutputPort);
            }
        } else if (inputPort.getName().equals("target")) {
            inputPort.bindToFieldNamed("mTarget");
            inputPort.setAutoPullEnabled(true);
        }
    }

    public final void onOutputPortAttached(OutputPort outputPort) {
        outputPort.setWaitsUntilAvailable(false);
    }

    protected final void onProcess() {
        String str = this.mTarget;
        if (str != null) {
            OutputPort connectedOutputPort = getConnectedOutputPort(str);
            if (connectedOutputPort == null) {
                String str2 = this.mTarget;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 23);
                stringBuilder.append("Unknown target port '");
                stringBuilder.append(str2);
                stringBuilder.append("'!");
                throw new RuntimeException(stringBuilder.toString());
            } else if (connectedOutputPort.isAvailable()) {
                connectedOutputPort.pushFrame(getConnectedInputPort("input").pullFrame());
            }
        }
    }
}
