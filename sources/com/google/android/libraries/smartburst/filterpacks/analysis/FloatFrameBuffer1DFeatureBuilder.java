package com.google.android.libraries.smartburst.filterpacks.analysis;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameBuffer1D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.FrameValue;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.utils.Feature;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p000.jza;

/* compiled from: PG */
public class FloatFrameBuffer1DFeatureBuilder extends Filter {
    public static final String INPUT_PORT_FEATURE_FRAME = "frame";
    public static final String INPUT_PORT_FEATURE_TYPE = "featureType";
    public static final String OUTPUT_PORT_FEATURE = "feature";
    public jza mFeatureId = null;

    public FloatFrameBuffer1DFeatureBuilder(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    protected FrameType getInputType() {
        return FrameType.buffer1D(200);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("frame", 2, getInputType()).addInputPort("featureType", 2, FrameType.single(String.class)).addOutputPort("feature", 2, FrameType.single(Feature.class)).disallowOtherPorts();
    }

    protected void onProcess() {
        FrameValue asFrameValue = getConnectedInputPort("featureType").pullFrame().asFrameValue();
        jza jza = this.mFeatureId;
        if (jza == null) {
            jza = jza.m4707a((String) asFrameValue.getValue());
            this.mFeatureId = jza;
        }
        FrameBuffer1D asFrameBuffer1D = getConnectedInputPort("frame").pullFrame().asFrameBuffer1D();
        float[] fArr = new float[jza.f8127A];
        ByteBuffer lockBytes = asFrameBuffer1D.lockBytes(1);
        lockBytes.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = lockBytes.asFloatBuffer();
        asFloatBuffer.rewind();
        asFloatBuffer.get(fArr);
        asFrameBuffer1D.unlock();
        OutputPort connectedOutputPort = getConnectedOutputPort("feature");
        Frame asFrameValue2 = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        asFrameValue2.setValue(new Feature(jza, fArr));
        connectedOutputPort.pushFrame(asFrameValue2);
    }
}
