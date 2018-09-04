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
public class HarrisCornerFilter extends Filter {
    public static final float CORNER_STRENGTH_THRESHOLD = 6.0E-4f;
    public static final String mCornerStrengthSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  float Ix2 = texture2D(tex_sampler_0, v_texcoord).r * 2.0 - 1.0;\n  float Iy2 = texture2D(tex_sampler_0, v_texcoord).g * 2.0 - 1.0;\n  float Ixy = texture2D(tex_sampler_0, v_texcoord).b * 2.0 - 1.0;\n  float response = (Ix2 * Iy2 - Ixy * Ixy) / (Ix2 + Iy2 + 0.0000001) ;\n  gl_FragColor = vec4(response, response, response, 1.0);\n}\n";
    public static final String mNonMaxSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float threshold;uniform vec2 pix;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 c = texture2D(tex_sampler_0, v_texcoord);\n  float a1 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(-pix.x, -pix.y)).r < c.r);\n  float a2 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(0.0,    -pix.y)).r < c.r);\n  float a3 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(+pix.x, -pix.y)).r < c.r);\n  float a4 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(-pix.x, 0.0)).r < c.r);\n  float a5 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(+pix.x, 0.0)).r < c.r);\n  float a6 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(-pix.x, +pix.y)).r < c.r);\n  float a7 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(0.0,    +pix.y)).r < c.r);\n  float a8 = float(texture2D(tex_sampler_0, \nv_texcoord + vec2(+pix.x, +pix.y)).r < c.r);\n  float localmax = float(threshold < c.r) * a1 * a2 * a3 * a4 * a5 * a6 * a7 * a8;\n  gl_FragColor = vec4(localmax, localmax, localmax, 1.0);\n}\n";
    public ImageShader mCornerStrengthShader;
    public FrameType mIntermediateImageType;
    public ImageShader mNonMaxShader;

    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean markCorners(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public HarrisCornerFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("structureTensor", 2, image2D).addOutputPort("cornerMap", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    protected void onPrepare() {
        if (isOpenGLSupported()) {
            this.mCornerStrengthShader = new ImageShader(mCornerStrengthSource);
            this.mNonMaxShader = new ImageShader(mNonMaxSource);
            this.mIntermediateImageType = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18);
        }
    }

    protected void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("cornerMap");
        FrameImage2D asFrameImage2D = getConnectedInputPort("structureTensor").pullFrame().asFrameImage2D();
        int[] dimensions = asFrameImage2D.getDimensions();
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(dimensions).asFrameImage2D();
        if (isOpenGLSupported()) {
            FrameImage2D asFrameImage2D3 = Frame.create(this.mIntermediateImageType, dimensions).asFrameImage2D();
            this.mCornerStrengthShader.process(asFrameImage2D, asFrameImage2D3);
            this.mNonMaxShader.setUniformValue("pix", new float[]{1.0f / ((float) dimensions[0]), 1.0f / ((float) dimensions[1])});
            this.mNonMaxShader.setUniformValue("threshold", 6.0E-4f);
            this.mNonMaxShader.process(asFrameImage2D3, asFrameImage2D2);
            asFrameImage2D3.release();
        } else {
            markCorners(asFrameImage2D.getWidth(), asFrameImage2D.getHeight(), asFrameImage2D.lockBytes(1), asFrameImage2D2.lockBytes(2));
            asFrameImage2D.unlock();
            asFrameImage2D2.unlock();
        }
        connectedOutputPort.pushFrame(asFrameImage2D2);
    }
}
