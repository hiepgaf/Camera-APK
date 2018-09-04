package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: PG */
public final class ArrayToSequenceFilter extends Filter {
    public Queue mValues = new LinkedList();

    public ArrayToSequenceFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("inputArray", 2, FrameType.array()).addOutputPort("outputSequence", 2, FrameType.single()).addOutputPort("remainingElements", 1, FrameType.single(Integer.TYPE)).disallowOtherPorts();
    }

    protected final void onProcess() {
        InputPort connectedInputPort = getConnectedInputPort("inputArray");
        if (this.mValues.size() == 0) {
            Object values = connectedInputPort.pullFrame().asFrameValues().getValues();
            for (int i = 0; i < Array.getLength(values); i++) {
                this.mValues.add(Array.get(values, i));
            }
        }
        OutputPort connectedOutputPort = getConnectedOutputPort("remainingElements");
        if (connectedOutputPort != null) {
            Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
            asFrameValue.setValue(Integer.valueOf(this.mValues.size()));
            connectedOutputPort.pushFrame(asFrameValue);
        }
        if (this.mValues.size() > 0) {
            connectedOutputPort = getConnectedOutputPort("outputSequence");
            asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
            asFrameValue.setValue(this.mValues.remove());
            connectedOutputPort.pushFrame(asFrameValue);
        }
        if (this.mValues.size() == 0) {
            connectedInputPort.setWaitsForFrame(true);
            setMinimumAvailableInputs(1);
            return;
        }
        connectedInputPort.setWaitsForFrame(false);
        setMinimumAvailableInputs(0);
    }
}
