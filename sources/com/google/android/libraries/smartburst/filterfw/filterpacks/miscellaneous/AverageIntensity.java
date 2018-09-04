package com.google.android.libraries.smartburst.filterfw.filterpacks.miscellaneous;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;
import com.google.android.libraries.smartburst.filterpacks.image.HSVHistogramAnalysisFilter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* compiled from: PG */
public final class AverageIntensity extends Filter {
    public static int mBinHeight = 2;
    public static int mBinWidth = 2;
    public static int mBins;
    public final String mFragShader = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n    gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n";
    public int[] mHistogram;
    public Quad mQuad = Quad.fromRect(0.0f, 0.0f, 1.0f, 1.0f);
    public ImageShader mShader;

    static {
        System.loadLibrary("filterframework_jni");
    }

    private final native void averageIntensity(ByteBuffer byteBuffer, IntBuffer intBuffer, int i, int i2, int i3, int i4);

    public AverageIntensity(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 1)).addInputPort("wnum", 1, FrameType.single(Integer.TYPE)).addInputPort("hnum", 1, FrameType.single(Integer.TYPE)).addInputPort("targetQuad", 1, FrameType.single(Quad.class)).addOutputPort(HSVHistogramAnalysisFilter.INPUT_PORT_HISTOGRAM_VALUES, 2, FrameType.array(Integer.TYPE)).disallowOtherPorts();
    }

    public final void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("wnum")) {
            inputPort.bindToFieldNamed("mBinWidth");
            inputPort.setAutoPullEnabled(true);
        }
        if (inputPort.getName().equals("hnum")) {
            inputPort.bindToFieldNamed("mBinHeight");
            inputPort.setAutoPullEnabled(true);
        }
        if (inputPort.getName().equals("targetQuad")) {
            inputPort.bindToFieldNamed("mQuad");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected final void onPrepare() {
        this.mShader = new ImageShader("precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n    gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n");
    }

    protected final void onProcess() {
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        int[] dimensions = asFrameImage2D.getDimensions();
        int i = dimensions[0];
        int i2 = dimensions[1];
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append("width ");
        stringBuilder.append(i);
        stringBuilder.append(" height ");
        stringBuilder.append(i2);
        Log.e("AverageIntensity", stringBuilder.toString());
        dimensions[0] = Math.round(((float) dimensions[0]) * this.mQuad.xEdge().length());
        dimensions[1] = Math.round(((float) dimensions[1]) * this.mQuad.yEdge().length());
        FrameImage2D asFrameImage2D2 = Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18), dimensions).asFrameImage2D();
        this.mShader.setSourceQuad(this.mQuad);
        this.mShader.process(asFrameImage2D, asFrameImage2D2);
        int i3 = dimensions[0];
        i = dimensions[1];
        StringBuilder stringBuilder2 = new StringBuilder(36);
        stringBuilder2.append("width ");
        stringBuilder2.append(i3);
        stringBuilder2.append(" height ");
        stringBuilder2.append(i);
        Log.e("AverageIntensity", stringBuilder2.toString());
        mBins = mBinWidth * mBinHeight;
        this.mHistogram = new int[mBins];
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mBins << 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        IntBuffer asIntBuffer = allocateDirect.asIntBuffer();
        ByteBuffer lockBytes = asFrameImage2D2.lockBytes(1);
        averageIntensity(lockBytes, asIntBuffer, dimensions[0], dimensions[1], mBinWidth, mBinHeight);
        lockBytes.rewind();
        asFrameImage2D2.unlock();
        asIntBuffer.rewind();
        for (i3 = 0; i3 < mBins; i3++) {
            this.mHistogram[i3] = asIntBuffer.get();
        }
        OutputPort connectedOutputPort = getConnectedOutputPort(HSVHistogramAnalysisFilter.INPUT_PORT_HISTOGRAM_VALUES);
        Frame asFrameValues = connectedOutputPort.fetchAvailableFrame(null).asFrameValues();
        asFrameValues.setValue(this.mHistogram);
        connectedOutputPort.pushFrame(asFrameValues);
        asFrameImage2D2.release();
    }
}
