package com.google.android.libraries.smartburst.filterfw.filterpacks.text;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public class ToStringFilter extends Filter {
    public ToStringFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("object", 2, FrameType.single()).addOutputPort("string", 2, FrameType.single(String.class)).disallowOtherPorts();
    }

    protected void onProcess() {
        String obj = getConnectedInputPort("object").pullFrame().asFrameValue().getValue().toString();
        OutputPort connectedOutputPort = getConnectedOutputPort("string");
        Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        asFrameValue.setValue(obj);
        connectedOutputPort.pushFrame(asFrameValue);
    }
}
