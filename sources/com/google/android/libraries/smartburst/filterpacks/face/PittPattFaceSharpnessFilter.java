package com.google.android.libraries.smartburst.filterpacks.face;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.FrameValues;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.utils.Feature;
import com.google.android.vision.face.Face;
import p000.jza;

/* compiled from: PG */
public class PittPattFaceSharpnessFilter extends Filter {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String INPUT_PORT_FACES = "faces";
    public static final String INPUT_PORT_IMAGE = "image";
    public static final String INPUT_PORT_SCALE = "scale";
    public static final String OUTPUT_PORT_FACE_SHARPNESS = "faceSharpness";
    public FaceSharpnessCalculator mFaceSharpnessCalculator = null;
    public long mPreviousTimestamp = Long.MIN_VALUE;

    public PittPattFaceSharpnessFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2)).addInputPort("faces", 2, FrameType.array(Face.class)).addOutputPort(OUTPUT_PORT_FACE_SHARPNESS, 2, FrameType.single(Feature.class)).disallowOtherPorts();
    }

    protected void onClose() {
        FaceSharpnessCalculator faceSharpnessCalculator = this.mFaceSharpnessCalculator;
        if (faceSharpnessCalculator != null) {
            faceSharpnessCalculator.release();
            this.mFaceSharpnessCalculator = null;
        }
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("scale")) {
            inputPort.bindToFieldNamed("mScale");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onPrepare() {
        this.mFaceSharpnessCalculator = new FaceSharpnessCalculator(isOpenGLSupported());
    }

    protected void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort(OUTPUT_PORT_FACE_SHARPNESS);
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        long timestamp = asFrameImage2D.getTimestamp();
        if (timestamp > this.mPreviousTimestamp) {
            float f;
            this.mPreviousTimestamp = timestamp;
            FrameValues asFrameValues = getConnectedInputPort("faces").pullFrame().asFrameValues();
            int count = asFrameValues.getCount();
            if (count > 0) {
                Face[] faceArr = new Face[count];
                float f2 = 0.0f;
                for (int i = 0; i < count; i++) {
                    faceArr[i] = (Face) asFrameValues.getFrameValueAtIndex(i).getValue();
                    f2 += faceArr[i].getHeight() * faceArr[i].getWidth();
                }
                if (f2 > 1.0E-7f) {
                    f = 0.0f;
                    int i2 = 0;
                    while (i2 < count) {
                        Face face = faceArr[i2];
                        i2++;
                        f = (((face.getHeight() * face.getWidth()) * this.mFaceSharpnessCalculator.computeFaceSharpness(asFrameImage2D, face)) / f2) + f;
                    }
                } else {
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
            }
            Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
            asFrameValue.setValue(new Feature(jza.FACE_SHARPNESS_AGGREGATE_SCORE, f));
            connectedOutputPort.pushFrame(asFrameValue);
        }
    }
}
