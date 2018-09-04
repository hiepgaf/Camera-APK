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
import com.google.android.libraries.smartburst.filterpacks.image.HSVHistogramAnalysisFilter;

/* compiled from: PG */
public final class DisplayHistogram extends Filter {
    public static final String mFragmentShader = "precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(1.0, 0.0, 0.0, 0.5);\n}\n";
    public static final String mVertexShader = "attribute vec4 a_position2;\nvoid main() {\n  gl_Position = a_position2;\n}\n";
    public ImageShader mGraphShader;
    public int[] mHistogram;
    public ImageShader mIdShader;
    public float[] mVertices;
    public float mYScale = 1.0f;

    public DisplayHistogram(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort(HSVHistogramAnalysisFilter.INPUT_PORT_HISTOGRAM_VALUES, 2, FrameType.array(Integer.TYPE)).addInputPort("YScale", 1, FrameType.single(Float.TYPE)).addOutputPort("composite", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    public final void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("YScale")) {
            inputPort.bindToFieldNamed("mYScale");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals(HSVHistogramAnalysisFilter.INPUT_PORT_HISTOGRAM_VALUES)) {
            inputPort.bindToFieldNamed("mHistogram");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected final void onPrepare() {
        this.mIdShader = ImageShader.createIdentity();
        this.mGraphShader = new ImageShader(mVertexShader, mFragmentShader);
    }

    protected final void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("composite");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        int[] dimensions = asFrameImage2D.getDimensions();
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(dimensions).asFrameImage2D();
        this.mIdShader.process(asFrameImage2D, asFrameImage2D2);
        int i = dimensions[0] * dimensions[1];
        int length = this.mHistogram.length;
        float f = 2.0f / (((float) length) + 2.0f);
        this.mVertices = new float[(length << 2)];
        float f2 = -1.0f + f;
        for (int i2 = 0; i2 < length; i2++) {
            float[] fArr = this.mVertices;
            int i3 = i2 << 2;
            fArr[i3] = f2;
            fArr[i3 + 1] = 1.0f;
            fArr[i3 + 2] = f2;
            float f3 = (float) this.mHistogram[i2];
            fArr[i3 + 3] = 1.0f - (((f3 + f3) * this.mYScale) / ((float) i));
            f2 += f;
        }
        this.mGraphShader.setAttributeValues("a_position2", this.mVertices, 2);
        GLES20.glLineWidth((0.6f * f) * ((float) dimensions[0]));
        this.mGraphShader.setDrawMode(1);
        this.mGraphShader.setVertexCount(length + length);
        this.mGraphShader.processNoInput(asFrameImage2D2);
        connectedOutputPort.pushFrame(asFrameImage2D2);
    }
}
