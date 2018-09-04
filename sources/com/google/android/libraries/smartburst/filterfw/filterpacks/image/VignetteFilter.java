package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

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
public class VignetteFilter extends Filter {
    public static final String mVignetteShaderCode = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float range;\nuniform float inv_max_dist;\nuniform float shade;\nuniform vec2 scale;\nvarying vec2 v_texcoord;\nvoid main() {\n  const float slope = 20.0;\n  vec2 coord = v_texcoord - vec2(0.5, 0.5);\n  float dist = length(coord * scale);\n  float lumen = shade / (1.0 + exp((dist * inv_max_dist - range) * slope)) + (1.0 - shade);\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  gl_FragColor = vec4(color.rgb * lumen, color.a);\n}\n";
    public int mHeight = 0;
    public float mScale = 1.0f;
    public final float mShade = 0.85f;
    public ImageShader mShader;
    public int mWidth = 0;

    public VignetteFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("scale", 1, FrameType.single(Float.TYPE)).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    private void initParameters() {
        if (this.mShader != null) {
            float[] fArr = new float[2];
            int i = this.mWidth;
            int i2 = this.mHeight;
            if (i > i2) {
                fArr[0] = 1.0f;
                fArr[1] = ((float) i2) / ((float) i);
            } else {
                fArr[0] = ((float) i) / ((float) i2);
                fArr[1] = 1.0f;
            }
            float f = fArr[0];
            float f2 = fArr[1];
            double sqrt = Math.sqrt((double) ((f * f) + (f2 * f2)));
            this.mShader.setUniformValue("scale", fArr);
            this.mShader.setUniformValue("inv_max_dist", 1.0f / (((float) sqrt) * 0.5f));
            this.mShader.setUniformValue("shade", 0.85f);
        }
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("scale")) {
            inputPort.bindToFieldNamed("mScale");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onPrepare() {
        this.mShader = new ImageShader(mVignetteShaderCode);
    }

    protected synchronized void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(asFrameImage2D.getDimensions()).asFrameImage2D();
        if (!(asFrameImage2D.getWidth() == this.mWidth && asFrameImage2D.getHeight() == this.mHeight)) {
            this.mWidth = asFrameImage2D.getWidth();
            this.mHeight = asFrameImage2D.getHeight();
            initParameters();
        }
        this.mShader.setUniformValue("range", 1.3f - (((float) Math.sqrt((double) this.mScale)) * 0.7f));
        this.mShader.process(asFrameImage2D, asFrameImage2D2);
        connectedOutputPort.pushFrame(asFrameImage2D2);
    }
}
