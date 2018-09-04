package com.google.android.libraries.smartburst.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.FrameValues;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public class ArrayLengthFilter extends Filter {
    public static final String INPUT_PORT_ARRAY = "array";
    public static final String OUTPUT_PORT_ARRAY_LENGTH = "arrayLength";

    public ArrayLengthFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort(INPUT_PORT_ARRAY, 2, FrameType.array()).addOutputPort(OUTPUT_PORT_ARRAY_LENGTH, 2, FrameType.single(Float.TYPE)).disallowOtherPorts();
    }

    protected void onProcess() {
        FrameValues asFrameValues = getConnectedInputPort(INPUT_PORT_ARRAY).pullFrame().asFrameValues();
        OutputPort connectedOutputPort = getConnectedOutputPort(OUTPUT_PORT_ARRAY_LENGTH);
        Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        asFrameValue.setValue(Float.valueOf((float) asFrameValues.getCount()));
        connectedOutputPort.pushFrame(asFrameValue);
    }
}
