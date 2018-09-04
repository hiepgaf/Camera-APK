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
public final class SequenceToArrayFilter extends Filter {
    public int mNumRemainingElements;
    public int mStage = 1;
    public Queue mValues = new LinkedList();

    public SequenceToArrayFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("inputSequence", 2, FrameType.single()).addInputPort("remainingElements", 2, FrameType.single(Integer.TYPE)).addOutputPort("outputArray", 2, FrameType.array()).disallowOtherPorts();
    }

    public final void onInputPortAttached(InputPort inputPort) {
        if (inputPort.getName().equals("remainingElements")) {
            inputPort.setWaitsForFrame(true);
        } else if (inputPort.getName().equals("inputSequence")) {
            inputPort.setWaitsForFrame(false);
        }
    }

    protected final void onProcess() {
        Object newInstance;
        boolean z = false;
        InputPort connectedInputPort = getConnectedInputPort("remainingElements");
        InputPort connectedInputPort2 = getConnectedInputPort("inputSequence");
        OutputPort connectedOutputPort = getConnectedOutputPort("outputArray");
        switch (this.mStage) {
            case 1:
                if (connectedInputPort.hasFrame()) {
                    this.mNumRemainingElements = ((Integer) connectedInputPort.pullFrame().asFrameValue().getValue()).intValue();
                    if (this.mNumRemainingElements <= 0) {
                        newInstance = Array.newInstance(retrieveClasstypeFromReceivingPort(connectedOutputPort), 0);
                        z = true;
                        break;
                    }
                    connectedInputPort.setWaitsForFrame(false);
                    connectedInputPort2.setWaitsForFrame(true);
                    this.mStage = 2;
                    newInstance = null;
                    break;
                }
                throw new RuntimeException("SequenceToArray expected frame on port remainingElements, but no frame is available!");
            case 2:
                if (connectedInputPort2.hasFrame()) {
                    this.mValues.add(connectedInputPort2.pullFrame().asFrameValue().getValue());
                    connectedInputPort.setWaitsForFrame(true);
                    connectedInputPort2.setWaitsForFrame(false);
                    this.mStage = 1;
                    if (this.mNumRemainingElements != 1) {
                        newInstance = null;
                        break;
                    }
                    Object newInstance2 = Array.newInstance(retrieveClasstypeFromReceivingPort(connectedOutputPort), this.mValues.size());
                    for (int i = 0; i < Array.getLength(newInstance2); i++) {
                        Array.set(newInstance2, i, this.mValues.remove());
                    }
                    newInstance = newInstance2;
                    z = true;
                    break;
                }
                throw new RuntimeException("SequenceToArray expected frame on port inputSequence, but no frame is available!");
            default:
                throw new RuntimeException("SequenceToArray: invalid state!");
        }
        if (z) {
            Frame asFrameValues = connectedOutputPort.fetchAvailableFrame(null).asFrameValues();
            asFrameValues.setValue(newInstance);
            connectedOutputPort.pushFrame(asFrameValues);
            this.mValues.clear();
        }
    }

    private final Class retrieveClasstypeFromReceivingPort(OutputPort outputPort) {
        return outputPort.getTarget().getType().getContentClass();
    }
}
