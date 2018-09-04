package com.google.android.libraries.smartburst.filterfw.filterpacks.miscellaneous;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public final class DimensionsFilter extends Filter {
    public DimensionsFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("frame", 2, FrameType.any()).addOutputPort("dimensions", 2, FrameType.array(Integer.TYPE)).disallowOtherPorts();
    }

    protected final void onProcess() {
        Frame pullFrame = getConnectedInputPort("frame").pullFrame();
        OutputPort connectedOutputPort = getConnectedOutputPort("dimensions");
        Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        asFrameValue.setValue(pullFrame.getDimensions());
        connectedOutputPort.pushFrame(asFrameValue);
    }
}
