package com.google.android.libraries.smartburst.filterpacks.face;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.FrameValues;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public class FaceIlluminationScorerFilter extends Filter {
    public static final String INPUT_PORT_HISTOGRAM_DISTANCES = "histogramDistances";
    public static final String OUTPUT_PORT_ILLUMINATION = "illumination";

    public FaceIlluminationScorerFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType array = FrameType.array(Float.TYPE);
        return new Signature().addInputPort(INPUT_PORT_HISTOGRAM_DISTANCES, 2, array).addOutputPort(OUTPUT_PORT_ILLUMINATION, 2, array).disallowOtherPorts();
    }

    protected void onProcess() {
        FrameValues asFrameValues = getConnectedInputPort(INPUT_PORT_HISTOGRAM_DISTANCES).pullFrame().asFrameValues();
        int count = asFrameValues.getCount();
        Object obj = new float[count];
        for (int i = 0; i < count; i++) {
            obj[i] = 1.0f - ((Float) asFrameValues.getFrameValueAtIndex(i).getValue()).floatValue();
        }
        OutputPort connectedOutputPort = getConnectedOutputPort(OUTPUT_PORT_ILLUMINATION);
        Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        asFrameValue.setValue(obj);
        connectedOutputPort.pushFrame(asFrameValue);
    }
}
