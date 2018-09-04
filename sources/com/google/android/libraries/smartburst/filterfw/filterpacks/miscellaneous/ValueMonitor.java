package com.google.android.libraries.smartburst.filterfw.filterpacks.miscellaneous;

import android.opengl.GLES20;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public final class ValueMonitor extends Filter {
    public static final int NUM_SAMPLES = 100;
    public final String mFragmentShader = "precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(1.0, 1.0, 0.0, 0.1);\n}\n";
    public ImageShader mGraphShader;
    public ImageShader mIdShader;
    public float mMaxVal = 1.0f;
    public float mMinVal = 0.0f;
    public float mValue = 0.0f;
    public float[] mValues;
    public final String mVertexShader = DisplayHistogram.mVertexShader;
    public float mYBottom = 1.0f;
    public float mYTop = 0.0f;

    public ValueMonitor(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("source", 2, image2D).addInputPort("value", 2, FrameType.single(Float.TYPE)).addInputPort("maxValue", 1, FrameType.single(Float.TYPE)).addInputPort("minValue", 1, FrameType.single(Float.TYPE)).addInputPort("YTop", 1, FrameType.single(Float.TYPE)).addInputPort("YBottom", 1, FrameType.single(Float.TYPE)).addOutputPort("composite", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    protected final float mapValue(float f) {
        float f2 = this.mMaxVal;
        float f3 = this.mMinVal;
        if (f2 > f3) {
            f2 = (f - f3) / (f2 - f3);
        } else {
            f2 = 0.0f;
        }
        f3 = this.mYTop;
        float f4 = this.mYBottom;
        return (f2 * (f3 - f4)) + f4;
    }

    public final void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("value")) {
            inputPort.bindToFieldNamed("mValue");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("maxValue")) {
            inputPort.bindToFieldNamed("mMaxVal");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("minValue")) {
            inputPort.bindToFieldNamed("mMinVal");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("YTop")) {
            inputPort.bindToFieldNamed("mYTop");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("YBottom")) {
            inputPort.bindToFieldNamed("mYBottom");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected final void onPrepare() {
        this.mIdShader = ImageShader.createIdentity();
        this.mGraphShader = new ImageShader(DisplayHistogram.mVertexShader, "precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(1.0, 1.0, 0.0, 0.1);\n}\n");
        this.mValues = new float[200];
        for (int i = 0; i < 100; i++) {
            float[] fArr = this.mValues;
            int i2 = i + i;
            float f = (float) i;
            fArr[i2] = ((f + f) / 100.0f) - 4.0f;
            fArr[i2 + 1] = this.mYBottom;
        }
    }

    protected final void onProcess() {
        for (int i = 0; i < 99; i++) {
            float[] fArr = this.mValues;
            int i2 = i + i;
            fArr[i2 + 1] = fArr[i2 + 3];
        }
        this.mValues[199] = mapValue(this.mValue);
        this.mGraphShader.setAttributeValues("a_position2", this.mValues, 2);
        OutputPort connectedOutputPort = getConnectedOutputPort("composite");
        FrameImage2D asFrameImage2D = getConnectedInputPort("source").pullFrame().asFrameImage2D();
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(asFrameImage2D.getDimensions()).asFrameImage2D();
        this.mIdShader.process(asFrameImage2D, asFrameImage2D2);
        GLES20.glLineWidth(3.0f);
        this.mGraphShader.setDrawMode(3);
        this.mGraphShader.setVertexCount(100);
        this.mGraphShader.processNoInput(asFrameImage2D2);
        connectedOutputPort.pushFrame(asFrameImage2D2);
    }
}
