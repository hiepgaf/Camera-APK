package com.google.android.libraries.smartburst.filterpacks.analysis;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.FrameValue;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.utils.Feature;
import p000.jri;
import p000.jza;
import p000.jzr;
import p000.jzs;

/* compiled from: PG */
public class FloatArrayStatisticsFeatureBuilder extends Filter {
    public static final String PORT_FEATURE = "feature";
    public static final String PORT_FEATURE_TYPE = "featureType";
    public static final String PORT_FEATURE_VALUES = "featureValues";
    public jza mFeatureId = null;

    public FloatArrayStatisticsFeatureBuilder(MffContext mffContext, String str) {
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
        Object obj = (float[]) getConnectedInputPort("featureValues").pullFrame().asFrameValue().getValue();
        if (r4 == 0) {
            throw new RuntimeException("Empty distribution.");
        }
        jri.m13152b(obj);
        jzs jzs = new jzs();
        for (float f : obj) {
            jzs.m4716a((double) f);
        }
        jzr a = jzs.m4715a();
        OutputPort connectedOutputPort = getConnectedOutputPort("feature");
        Frame asFrameValue2 = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        asFrameValue2.setValue(new Feature(jza, new float[]{(float) a.f8152a, (float) a.f8153b, (float) a.f8154c, (float) a.f8155d}));
        connectedOutputPort.pushFrame(asFrameValue2);
    }
}
