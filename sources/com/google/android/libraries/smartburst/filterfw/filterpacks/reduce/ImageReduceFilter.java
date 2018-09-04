package com.google.android.libraries.smartburst.filterfw.filterpacks.reduce;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.InputPort.FrameListener;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import java.util.Iterator;
import java.util.Vector;

/* compiled from: PG */
public class ImageReduceFilter extends Filter {
    public static final int CHANNEL_AVG = 4;
    public static final int CHANNEL_BLUE = 3;
    public static final int CHANNEL_GRAY = 8;
    public static final int CHANNEL_GREEN = 2;
    public static final int CHANNEL_MAX = 7;
    public static final int CHANNEL_MIN = 6;
    public static final int CHANNEL_RED = 1;
    public static final int CHANNEL_SUM = 5;
    public static final int OPERATION_AVG = 3;
    public static final int OPERATION_MAX = 1;
    public static final int OPERATION_MIN = 2;
    public static final int OPERATION_PRODUCT = 5;
    public static final int OPERATION_SUM = 4;
    public int mChannel = 8;
    public FrameListener mChannelListener = new C01512();
    public int mCurrentHeight = 0;
    public int mCurrentWidth = 0;
    public int mLevel = -1;
    public int mOperation = 3;
    public FrameListener mOperationListener = new C01501();
    public Vector mPyramid = new Vector();
    public ImageShader mShader = null;
    public boolean mShaderDirtyFlag = false;

    /* compiled from: PG */
    public class PyramidLevel {
        public int mHeight;
        public int mLevel;
        public int mWidth;

        private PyramidLevel(int i, int i2, int i3) {
            this.mLevel = i;
            this.mWidth = i2;
            this.mHeight = i3;
        }

        int[] getDimensions() {
            return new int[]{this.mWidth, this.mHeight};
        }

        int getHeight() {
            return this.mHeight;
        }

        int getLevel() {
            return this.mLevel;
        }

        int getWidth() {
            return this.mWidth;
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.filterpacks.reduce.ImageReduceFilter$1 */
    class C01501 implements FrameListener {
        C01501() {
        }

        public void onFrameReceived(InputPort inputPort, Frame frame) {
            int intValue = ((Integer) frame.asFrameValue().getValue()).intValue();
            if (intValue != ImageReduceFilter.this.mOperation) {
                ImageReduceFilter.this.mOperation = intValue;
                ImageReduceFilter.this.mShaderDirtyFlag = true;
            }
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.filterpacks.reduce.ImageReduceFilter$2 */
    class C01512 implements FrameListener {
        C01512() {
        }

        public void onFrameReceived(InputPort inputPort, Frame frame) {
            int intValue = ((Integer) frame.asFrameValue().getValue()).intValue();
            if (intValue != ImageReduceFilter.this.mChannel) {
                ImageReduceFilter.this.mChannel = intValue;
                ImageReduceFilter.this.mShaderDirtyFlag = true;
            }
        }
    }

    public ImageReduceFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    private String genColorToValueAlgorithm() {
        int i = this.mChannel;
        switch (i) {
            case 1:
                return "color.r";
            case 2:
                return "color.g";
            case 3:
                return "color.b";
            case 4:
                return "(color.r + color.g + color.b) / 3.0";
            case 5:
                return "(color.r + color.g + color.b)";
            case 6:
                return "min(color.r, min(color.g, color.b))";
            case 7:
                return "max(color.r, max(color.g, color.b))";
            case 8:
                return "dot(color, vec4(0.299, 0.587, 0.114, 0))";
            default:
                StringBuilder stringBuilder = new StringBuilder(29);
                stringBuilder.append("Unknown channel: ");
                stringBuilder.append(i);
                stringBuilder.append("!");
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private String genFragmentShader() {
        String genReduceAlgorithm = genReduceAlgorithm();
        String genColorToValueAlgorithm = genColorToValueAlgorithm();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(genReduceAlgorithm).length() + 648) + String.valueOf(genColorToValueAlgorithm).length());
        stringBuilder.append("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 pix;\nvarying vec2 v_texcoord;\n\nfloat reduce(float v0, float v1, float v2, float v3) {\n  return ");
        stringBuilder.append(genReduceAlgorithm);
        stringBuilder.append(";\n}\n\nfloat colorValue(vec4 color) {\n  return ");
        stringBuilder.append(genColorToValueAlgorithm);
        stringBuilder.append(";\n}\nvoid main() {\n  float c0 = colorValue(texture2D(tex_sampler_0, v_texcoord + vec2(-pix.x, -pix.y)));\n  float c1 = colorValue(texture2D(tex_sampler_0, v_texcoord + vec2(+pix.x, -pix.y)));\n  float c2 = colorValue(texture2D(tex_sampler_0, v_texcoord + vec2(-pix.x, +pix.y)));\n  float c3 = colorValue(texture2D(tex_sampler_0, v_texcoord + vec2(+pix.x, +pix.y)));\n  float r = reduce(c0, c1, c2, c3);\n  gl_FragColor = vec4(r, r, r, 1.0);\n}\n");
        return stringBuilder.toString();
    }

    private String genReduceAlgorithm() {
        int i = this.mOperation;
        switch (i) {
            case 1:
                return "max(max(v0, v1), max(v2, v3))";
            case 2:
                return "min(min(v0, v1), min(v2, v3))";
            case 3:
                return "(v0 + v1 + v2 + v3) / 4.0";
            case 4:
                return "(v0 + v1 + v2 + v3)";
            case 5:
                return "(v0 * v1 * v2 * v3)";
            default:
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("Unknown operation: ");
                stringBuilder.append(i);
                stringBuilder.append("!");
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public PyramidLevel[] getPyramidDims(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Illegal image dimensions: ");
            stringBuilder.append(i);
            stringBuilder.append("x");
            stringBuilder.append(i2);
            stringBuilder.append("!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Vector vector = new Vector();
        PyramidLevel pyramidLevel = new PyramidLevel(0, i, i2);
        int i3 = 1;
        while (true) {
            vector.add(pyramidLevel);
            if (pyramidLevel.getWidth() == 1 && pyramidLevel.getHeight() == 1) {
                return (PyramidLevel[]) vector.toArray(new PyramidLevel[vector.size()]);
            }
            PyramidLevel pyramidLevel2 = new PyramidLevel(i3, (pyramidLevel.getWidth() + 1) / 2, (pyramidLevel.getHeight() + 1) / 2);
            i3++;
            pyramidLevel = pyramidLevel2;
        }
    }

    private FrameImage2D getPyramidLevel(int i, FrameImage2D frameImage2D, FrameImage2D frameImage2D2) {
        if (i == 0) {
            return frameImage2D;
        }
        if (i >= this.mLevel) {
            return frameImage2D2;
        }
        return (FrameImage2D) this.mPyramid.get(i);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("operation", 1, FrameType.single(Integer.TYPE)).addInputPort("level", 1, FrameType.single(Integer.TYPE)).addInputPort("channel", 1, FrameType.single(Integer.TYPE)).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    protected void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("level")) {
            inputPort.bindToFieldNamed("mLevel");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("operation")) {
            inputPort.bindToListener(this.mOperationListener);
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("channel")) {
            inputPort.bindToListener(this.mChannelListener);
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onOpen() {
        this.mShaderDirtyFlag = true;
    }

    protected void onProcess() {
        FrameImage2D asFrameImage2D;
        int i;
        int i2;
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D2 = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        int[] dimensions = asFrameImage2D2.getDimensions();
        if (this.mShaderDirtyFlag) {
            regnerateShader();
            this.mShaderDirtyFlag = false;
        }
        int i3 = dimensions[0];
        if (!(i3 == this.mCurrentWidth && dimensions[1] == this.mCurrentHeight)) {
            this.mCurrentWidth = i3;
            this.mCurrentHeight = dimensions[1];
            regenerateImagePyramid();
        }
        if (this.mLevel < this.mPyramid.size()) {
            if (this.mLevel < 0) {
            }
            asFrameImage2D = connectedOutputPort.fetchAvailableFrame(((FrameImage2D) this.mPyramid.get(this.mLevel)).getDimensions()).asFrameImage2D();
            i = 0;
            while (true) {
                i2 = this.mLevel;
                if (i >= i2) {
                    runReduce(getPyramidLevel(i, asFrameImage2D2, asFrameImage2D), getPyramidLevel(i + 1, asFrameImage2D2, asFrameImage2D));
                    i++;
                } else {
                    connectedOutputPort.pushFrame(getPyramidLevel(i2, asFrameImage2D2, asFrameImage2D));
                    return;
                }
            }
        }
        this.mLevel = this.mPyramid.size() - 1;
        asFrameImage2D = connectedOutputPort.fetchAvailableFrame(((FrameImage2D) this.mPyramid.get(this.mLevel)).getDimensions()).asFrameImage2D();
        i = 0;
        while (true) {
            i2 = this.mLevel;
            if (i >= i2) {
                connectedOutputPort.pushFrame(getPyramidLevel(i2, asFrameImage2D2, asFrameImage2D));
                return;
            } else {
                runReduce(getPyramidLevel(i, asFrameImage2D2, asFrameImage2D), getPyramidLevel(i + 1, asFrameImage2D2, asFrameImage2D));
                i++;
            }
        }
    }

    private void regenerateImagePyramid() {
        Iterator it = this.mPyramid.iterator();
        while (it.hasNext()) {
            ((FrameImage2D) it.next()).release();
        }
        this.mPyramid.clear();
        PyramidLevel[] pyramidDims = getPyramidDims(this.mCurrentWidth, this.mCurrentHeight);
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18);
        for (PyramidLevel dimensions : pyramidDims) {
            this.mPyramid.add(Frame.create(image2D, dimensions.getDimensions()).asFrameImage2D());
        }
    }

    private void regnerateShader() {
        this.mShader = new ImageShader(genFragmentShader());
    }

    private void runReduce(FrameImage2D frameImage2D, FrameImage2D frameImage2D2) {
        float f;
        float f2 = 1.0f;
        int width = frameImage2D.getWidth();
        int height = frameImage2D.getHeight();
        int width2 = frameImage2D2.getWidth();
        int height2 = frameImage2D2.getHeight();
        if (width2 != width) {
            f = (float) width2;
            f = (f + f) / ((float) width);
        } else {
            f = 1.0f;
        }
        if (height2 != height) {
            f2 = (float) height2;
            f2 = (f2 + f2) / ((float) height);
        }
        this.mShader.setSourceRect(0.0f, 0.0f, f, f2);
        this.mShader.setUniformValue("pix", new float[]{0.5f / ((float) width), 0.5f / ((float) height)});
        this.mShader.process(frameImage2D, frameImage2D2);
    }
}
