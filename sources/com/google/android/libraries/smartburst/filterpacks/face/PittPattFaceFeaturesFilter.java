package com.google.android.libraries.smartburst.filterpacks.face;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.FrameValues;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.vision.face.Face;

/* compiled from: PG */
public class PittPattFaceFeaturesFilter extends Filter {
    public static final String INPUT_PORT_FACES = "faces";
    public static final String OUTPUT_PORT_LEFT_EYE_OPEN_SCORE = "leftEyeOpenAggregateScore";
    public static final String OUTPUT_PORT_RIGHT_EYE_OPEN_SCORE = "rightEyeOpenAggregateScore";
    public static final String OUTPUT_PORT_SMILING_SCORE = "smilingAggregateScore";

    public PittPattFaceFeaturesFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType single = FrameType.single(Float.TYPE);
        return new Signature().addInputPort("faces", 2, FrameType.array(Face.class)).addOutputPort(OUTPUT_PORT_SMILING_SCORE, 1, single).addOutputPort(OUTPUT_PORT_LEFT_EYE_OPEN_SCORE, 1, single).addOutputPort(OUTPUT_PORT_RIGHT_EYE_OPEN_SCORE, 1, single).disallowOtherPorts();
    }

    protected void onProcess() {
        double d;
        double d2;
        double d3;
        FrameValues asFrameValues = getConnectedInputPort("faces").pullFrame().asFrameValues();
        int count = asFrameValues.getCount();
        OutputPort connectedOutputPort = getConnectedOutputPort(OUTPUT_PORT_SMILING_SCORE);
        OutputPort connectedOutputPort2 = getConnectedOutputPort(OUTPUT_PORT_LEFT_EYE_OPEN_SCORE);
        OutputPort connectedOutputPort3 = getConnectedOutputPort(OUTPUT_PORT_RIGHT_EYE_OPEN_SCORE);
        Face[] faceArr = new Face[count];
        int i = 0;
        double d4 = 0.0d;
        while (i < count) {
            faceArr[i] = (Face) asFrameValues.getFrameValueAtIndex(i).getValue();
            i++;
            d4 = ((double) (faceArr[i].getHeight() * faceArr[i].getWidth())) + d4;
        }
        if (d4 > 1.0E-7d) {
            d = 0.0d;
            d2 = 0.0d;
            d3 = 0.0d;
            for (int i2 = 0; i2 < count; i2++) {
                double height = ((double) (faceArr[i2].getHeight() * faceArr[i2].getWidth())) / d4;
                float isSmilingScore = faceArr[i2].getIsSmilingScore();
                float isLeftEyeOpenScore = faceArr[i2].getIsLeftEyeOpenScore();
                float isRightEyeOpenScore = faceArr[i2].getIsRightEyeOpenScore();
                if (isSmilingScore > 0.0f) {
                    d += ((double) isSmilingScore) * height;
                }
                if (isLeftEyeOpenScore > 0.0f) {
                    d2 += ((double) isLeftEyeOpenScore) * height;
                }
                if (isRightEyeOpenScore > 0.0f) {
                    d3 += height * ((double) isRightEyeOpenScore);
                }
            }
        } else {
            d = 0.0d;
            d2 = 0.0d;
            d3 = 0.0d;
        }
        if (connectedOutputPort != null) {
            Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
            asFrameValue.setValue(Float.valueOf((float) d));
            connectedOutputPort.pushFrame(asFrameValue);
        }
        if (connectedOutputPort2 != null) {
            Frame asFrameValue2 = connectedOutputPort2.fetchAvailableFrame(null).asFrameValue();
            asFrameValue2.setValue(Float.valueOf((float) d2));
            connectedOutputPort2.pushFrame(asFrameValue2);
        }
        if (connectedOutputPort3 != null) {
            Frame asFrameValue3 = connectedOutputPort3.fetchAvailableFrame(null).asFrameValue();
            asFrameValue3.setValue(Float.valueOf((float) d3));
            connectedOutputPort3.pushFrame(asFrameValue3);
        }
    }
}
