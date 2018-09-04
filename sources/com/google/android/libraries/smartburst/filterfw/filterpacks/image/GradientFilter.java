package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class GradientFilter extends Filter {
    public static final String mDirectionSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 gy = 2.0 * texture2D(tex_sampler_1, v_texcoord) - 1.0;\n  vec4 gx = 2.0 * texture2D(tex_sampler_0, v_texcoord) - 1.0;\n  gl_FragColor = vec4((atan(gy.rgb, gx.rgb) + 3.14) / (2.0 * 3.14), 1.0);\n}\n";
    public static final String mGradientXSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 pix;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 cr = texture2D(tex_sampler_0, v_texcoord);\n  vec4 right = texture2D(tex_sampler_0, v_texcoord + vec2(pix.x, 0));\n  gl_FragColor = 0.5 + (right - cr) / 2.0;\n}\n";
    public static final String mGradientYSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 pix;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 cr = texture2D(tex_sampler_0, v_texcoord);\n  vec4 down = texture2D(tex_sampler_0, v_texcoord + vec2(0, pix.y));\n  gl_FragColor = 0.5 + (down - cr) / 2.0;\n}\n";
    public static final String mMagnitudeSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 gx = 2.0 * texture2D(tex_sampler_0, v_texcoord) - 1.0;\n  vec4 gy = 2.0 * texture2D(tex_sampler_1, v_texcoord) - 1.0;\n  gl_FragColor = vec4(sqrt(gx.rgb * gx.rgb + gy.rgb * gy.rgb), 1.0);\n}\n";
    public ImageShader mDirectionShader;
    public ImageShader mGradientXShader;
    public ImageShader mGradientYShader;
    public FrameType mImageType;
    public ImageShader mMagnitudeShader;

    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean gradientOperator(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5);

    public GradientFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        FrameType image2D2 = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16);
        return new Signature().addInputPort("image", 2, image2D).addOutputPort("gradientX", 1, image2D2).addOutputPort("gradientY", 1, image2D2).addOutputPort("direction", 1, image2D2).addOutputPort("magnitude", 1, image2D2).disallowOtherPorts();
    }

    protected void onOpen() {
        super.onOpen();
        if (getConnectedOutputPorts().length == 0) {
            throw new IllegalStateException("Gradient Filter has no output port!");
        }
    }

    protected void onPrepare() {
        if (isOpenGLSupported()) {
            this.mGradientXShader = new ImageShader(mGradientXSource);
            this.mGradientYShader = new ImageShader(mGradientYSource);
            this.mMagnitudeShader = new ImageShader("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 gx = 2.0 * texture2D(tex_sampler_0, v_texcoord) - 1.0;\n  vec4 gy = 2.0 * texture2D(tex_sampler_1, v_texcoord) - 1.0;\n  gl_FragColor = vec4(sqrt(gx.rgb * gx.rgb + gy.rgb * gy.rgb), 1.0);\n}\n");
            this.mDirectionShader = new ImageShader("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 gy = 2.0 * texture2D(tex_sampler_1, v_texcoord) - 1.0;\n  vec4 gx = 2.0 * texture2D(tex_sampler_0, v_texcoord) - 1.0;\n  gl_FragColor = vec4((atan(gy.rgb, gx.rgb) + 3.14) / (2.0 * 3.14), 1.0);\n}\n");
            this.mImageType = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18);
        }
    }

    protected void onProcess() {
        Frame asFrameImage2D;
        Frame asFrameImage2D2;
        Frame asFrameImage2D3;
        Frame asFrameImage2D4;
        Frame asFrameImage2D5;
        OutputPort connectedOutputPort = getConnectedOutputPort("gradientX");
        OutputPort connectedOutputPort2 = getConnectedOutputPort("gradientY");
        OutputPort connectedOutputPort3 = getConnectedOutputPort("magnitude");
        OutputPort connectedOutputPort4 = getConnectedOutputPort("direction");
        FrameImage2D asFrameImage2D6 = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        int[] dimensions = asFrameImage2D6.getDimensions();
        if (connectedOutputPort3 != null) {
            asFrameImage2D = connectedOutputPort3.fetchAvailableFrame(dimensions).asFrameImage2D();
        } else {
            asFrameImage2D = null;
        }
        if (connectedOutputPort4 != null) {
            asFrameImage2D2 = connectedOutputPort4.fetchAvailableFrame(dimensions).asFrameImage2D();
        } else {
            asFrameImage2D2 = null;
        }
        if (connectedOutputPort != null) {
            asFrameImage2D3 = connectedOutputPort.fetchAvailableFrame(dimensions).asFrameImage2D();
        } else {
            asFrameImage2D3 = null;
        }
        if (connectedOutputPort2 != null) {
            asFrameImage2D4 = connectedOutputPort2.fetchAvailableFrame(dimensions).asFrameImage2D();
        } else {
            asFrameImage2D4 = null;
        }
        if (isOpenGLSupported()) {
            this.mGradientXShader.setUniformValue("pix", new float[]{1.0f / ((float) dimensions[0]), 1.0f / ((float) dimensions[1])});
            this.mGradientYShader.setUniformValue("pix", new float[]{1.0f / ((float) dimensions[0]), 1.0f / ((float) dimensions[1])});
            if (connectedOutputPort == null) {
                asFrameImage2D5 = Frame.create(this.mImageType, dimensions).asFrameImage2D();
            } else {
                asFrameImage2D5 = asFrameImage2D3;
            }
            if (connectedOutputPort2 == null) {
                asFrameImage2D4 = Frame.create(this.mImageType, dimensions).asFrameImage2D();
            }
            this.mGradientXShader.process(asFrameImage2D6, asFrameImage2D5);
            this.mGradientYShader.process(asFrameImage2D6, asFrameImage2D4);
            FrameImage2D[] frameImage2DArr = new FrameImage2D[]{asFrameImage2D5, asFrameImage2D4};
            if (connectedOutputPort3 != null) {
                this.mMagnitudeShader.processMulti(frameImage2DArr, asFrameImage2D);
            }
            if (connectedOutputPort4 != null) {
                this.mDirectionShader.processMulti(frameImage2DArr, asFrameImage2D2);
            }
            if (connectedOutputPort == null) {
                asFrameImage2D5.release();
            }
            if (connectedOutputPort2 == null) {
                asFrameImage2D4.release();
            }
        } else {
            ByteBuffer lockBytes;
            ByteBuffer lockBytes2;
            ByteBuffer lockBytes3;
            ByteBuffer lockBytes4;
            ByteBuffer lockBytes5 = asFrameImage2D6.lockBytes(1);
            if (asFrameImage2D != null) {
                lockBytes = asFrameImage2D.lockBytes(2);
            } else {
                lockBytes = null;
            }
            if (asFrameImage2D2 != null) {
                lockBytes2 = asFrameImage2D2.lockBytes(2);
            } else {
                lockBytes2 = null;
            }
            if (asFrameImage2D3 != null) {
                lockBytes3 = asFrameImage2D3.lockBytes(2);
            } else {
                lockBytes3 = null;
            }
            if (asFrameImage2D4 != null) {
                lockBytes4 = asFrameImage2D4.lockBytes(2);
            } else {
                lockBytes4 = null;
            }
            gradientOperator(asFrameImage2D6.getWidth(), asFrameImage2D6.getHeight(), lockBytes5, lockBytes, lockBytes2, lockBytes3, lockBytes4);
            asFrameImage2D6.unlock();
            if (asFrameImage2D != null) {
                asFrameImage2D.unlock();
            }
            if (asFrameImage2D2 != null) {
                asFrameImage2D2.unlock();
            }
            if (asFrameImage2D3 != null) {
                asFrameImage2D3.unlock();
            }
            if (asFrameImage2D4 != null) {
                asFrameImage2D4.unlock();
                asFrameImage2D5 = asFrameImage2D3;
            } else {
                asFrameImage2D5 = asFrameImage2D3;
            }
        }
        if (asFrameImage2D != null) {
            connectedOutputPort3.pushFrame(asFrameImage2D);
        }
        if (asFrameImage2D2 != null) {
            connectedOutputPort4.pushFrame(asFrameImage2D2);
        }
        if (connectedOutputPort != null) {
            connectedOutputPort.pushFrame(asFrameImage2D5);
        }
        if (connectedOutputPort2 != null) {
            connectedOutputPort2.pushFrame(asFrameImage2D4);
        }
    }
}
