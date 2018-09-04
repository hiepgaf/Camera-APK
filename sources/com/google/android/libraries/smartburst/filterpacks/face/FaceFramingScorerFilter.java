package com.google.android.libraries.smartburst.filterpacks.face;

import android.graphics.RectF;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.FrameValues;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;

/* compiled from: PG */
public class FaceFramingScorerFilter extends Filter {
    public static final String INPUT_PORT_FACES = "faceQuads";
    public static final String OUTPUT_PORT_SCORES = "scores";

    public FaceFramingScorerFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    private float calcFramingScore(Quad quad) {
        if (quad == null) {
            return 0.0f;
        }
        RectF enclosingRectF = quad.getEnclosingRectF();
        return -(calcPenalty(((enclosingRectF.right - 0.0040893555f) / enclosingRectF.width()) * 100.0f) + ((calcPenalty((((-(1000.0f - ((enclosingRectF.bottom - enclosingRectF.top) * 0.4f))) - enclosingRectF.top) / enclosingRectF.height()) * 100.0f) + calcPenalty(((enclosingRectF.bottom - 0.004852295f) / enclosingRectF.height()) * 100.0f)) + calcPenalty(((-1000.0f - enclosingRectF.left) / enclosingRectF.width()) * 100.0f)));
    }

    private float calcPenalty(float f) {
        return ((float) (1.0d / (Math.exp((((double) Math.max(Math.min(f, 30.0f), -30.0f)) - 0.4375d) * -0.1d) + 1.0d))) - ((float) (1.0d / (Math.exp(1.0d) + 1.0d)));
    }

    public Signature getSignature() {
        return new Signature().addInputPort(INPUT_PORT_FACES, 2, FrameType.array(Quad.class)).addOutputPort(OUTPUT_PORT_SCORES, 2, FrameType.array(Float.TYPE)).disallowOtherPorts();
    }

    protected void onProcess() {
        FrameValues asFrameValues = getConnectedInputPort(INPUT_PORT_FACES).pullFrame().asFrameValues();
        int count = asFrameValues.getCount();
        if (count > 0) {
            Object obj = new float[count];
            for (int i = 0; i < count; i++) {
                obj[i] = calcFramingScore((Quad) asFrameValues.getValueAtIndex(i));
            }
            OutputPort connectedOutputPort = getConnectedOutputPort(OUTPUT_PORT_SCORES);
            Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
            asFrameValue.setValue(obj);
            connectedOutputPort.pushFrame(asFrameValue);
        }
    }
}
