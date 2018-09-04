package com.google.android.libraries.smartburst.filterpacks.analysis;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.FrameValue;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.utils.Feature;
import p000.jza;

/* compiled from: PG */
public class FloatArrayFeatureBuilder extends Filter {
    public static final String PORT_FEATURE = "feature";
    public static final String PORT_FEATURE_TYPE = "featureType";
    public static final String PORT_FEATURE_VALUES = "featureValues";
    public jza mFeatureId = null;

    public FloatArrayFeatureBuilder(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("featureValues", 2, FrameType.array(Float.TYPE)).addInputPort("featureType", 2, FrameType.single(String.class)).addOutputPort("feature", 2, FrameType.single(Feature.class)).disallowOtherPorts();
    }

    protected void onProcess() {
        jza jza;
        FrameValue asFrameValue = getConnectedInputPort("featureType").pullFrame().asFrameValue();
        jza jza2 = this.mFeatureId;
        if (jza2 == null) {
            jza2 = jza.m4707a((String) asFrameValue.getValue());
            this.mFeatureId = jza2;
            jza = jza2;
        } else {
            jza = jza2;
        }
        FrameValue asFrameValue2 = getConnectedInputPort("featureValues").pullFrame().asFrameValue();
        float[] fArr = (float[]) asFrameValue2.getValue();
        OutputPort connectedOutputPort = getConnectedOutputPort("feature");
        Frame asFrameValue3 = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        asFrameValue3.setTimestamp(asFrameValue2.getTimestamp());
        asFrameValue3.setValue(new Feature(jza, fArr));
        connectedOutputPort.pushFrame(asFrameValue3);
    }
}
