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
public class GaussianFilter7x7 extends Filter {
    public static final String mGaussian1x7Source = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float pix;\nuniform float pix2;\nuniform float pix3;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 a1 = 0.0044 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix3, 0.0));\n  vec4 a2 = 0.0540 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix2, 0.0));\n  vec4 a3 = 0.2420 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix, 0.0));\n  vec4 a4 = 0.3992 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, 0.0));\n  vec4 a5 = 0.2420 * texture2D(tex_sampler_0, v_texcoord + vec2(pix, 0.0));\n  vec4 a6 = 0.0540 * texture2D(tex_sampler_0, v_texcoord + vec2(pix2, 0.0));\n  vec4 a7 = 0.0044 * texture2D(tex_sampler_0, v_texcoord + vec2(pix3, 0.0));\n  gl_FragColor = a1 + a2 + a3 + a4 + a5 + a6 + a7;\n}\n";
    public static final String mGaussian7x1Source = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float pix;\nuniform float pix2;\nuniform float pix3;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 a1 = 0.0044 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, -pix3));\n  vec4 a2 = 0.0540 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, -pix2));\n  vec4 a3 = 0.2420 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, -pix));\n  vec4 a4 = 0.3992 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, 0.0));\n  vec4 a5 = 0.2420 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, pix));\n  vec4 a6 = 0.0540 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, pix2));\n  vec4 a7 = 0.0044 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0, pix3));\n  gl_FragColor = a1 + a2 + a3 + a4 + a5 + a6 + a7;\n}\n";
    public ImageShader mGaussian1x7Shader;
    public ImageShader mGaussian7x1Shader;
    public FrameType mImageType;

    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean blur(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public GaussianFilter7x7(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addOutputPort("image", 1, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    protected void onPrepare() {
        if (isOpenGLSupported()) {
            this.mGaussian7x1Shader = new ImageShader(mGaussian7x1Source);
            this.mGaussian1x7Shader = new ImageShader(mGaussian1x7Source);
            this.mImageType = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18);
        }
    }

    protected void onProcess() {
        Frame asFrameImage2D;
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D2 = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        int[] dimensions = asFrameImage2D2.getDimensions();
        if (connectedOutputPort != null) {
            asFrameImage2D = connectedOutputPort.fetchAvailableFrame(dimensions).asFrameImage2D();
        } else {
            asFrameImage2D = null;
        }
        if (isOpenGLSupported()) {
            this.mGaussian7x1Shader.setUniformValue("pix", 1.0f / ((float) dimensions[1]));
            this.mGaussian7x1Shader.setUniformValue("pix2", 2.0f / ((float) dimensions[1]));
            this.mGaussian7x1Shader.setUniformValue("pix3", 3.0f / ((float) dimensions[1]));
            this.mGaussian1x7Shader.setUniformValue("pix", 1.0f / ((float) dimensions[0]));
            this.mGaussian1x7Shader.setUniformValue("pix2", 2.0f / ((float) dimensions[0]));
            this.mGaussian1x7Shader.setUniformValue("pix3", 3.0f / ((float) dimensions[0]));
            FrameImage2D asFrameImage2D3 = Frame.create(this.mImageType, dimensions).asFrameImage2D();
            if (connectedOutputPort != null) {
                this.mGaussian7x1Shader.process(asFrameImage2D2, asFrameImage2D3);
                this.mGaussian1x7Shader.process(asFrameImage2D3, asFrameImage2D);
            }
            asFrameImage2D3.release();
        } else {
            ByteBuffer lockBytes;
            ByteBuffer lockBytes2 = asFrameImage2D2.lockBytes(1);
            if (asFrameImage2D != null) {
                lockBytes = asFrameImage2D.lockBytes(2);
            } else {
                lockBytes = null;
            }
            blur(asFrameImage2D2.getWidth(), asFrameImage2D2.getHeight(), lockBytes2, lockBytes);
            asFrameImage2D2.unlock();
            if (asFrameImage2D != null) {
                asFrameImage2D.unlock();
            }
        }
        if (asFrameImage2D != null) {
            connectedOutputPort.pushFrame(asFrameImage2D);
        }
    }
}
