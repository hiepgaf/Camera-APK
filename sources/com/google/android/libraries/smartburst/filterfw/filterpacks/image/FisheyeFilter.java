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
public class FisheyeFilter extends Filter {
    public static final String mFisheyeShader = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 scale;\nuniform float alpha;\nuniform float radius2;\nuniform float factor;\nvarying vec2 v_texcoord;\nvoid main() {\n  const float m_pi_2 = 1.570963;\n  vec2 coord = v_texcoord - vec2(0.5, 0.5);\n  float dist = length(coord * scale);\n  float radian = m_pi_2 - atan(alpha * sqrt(radius2 - dist * dist), dist);\n  float scalar = radian * factor / dist;\n  vec2 new_coord = coord * scalar + vec2(0.5, 0.5);\n  gl_FragColor = texture2D(tex_sampler_0, new_coord);\n}\n";
    public int mHeight = 0;
    public float mScale = 0.5f;
    public ImageShader mShader;
    public int mWidth = 0;

    public FisheyeFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("scale", 1, FrameType.single(Float.TYPE)).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("scale")) {
            inputPort.bindToFieldNamed("mScale");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onPrepare() {
        this.mShader = new ImageShader(mFisheyeShader);
    }

    protected synchronized void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(asFrameImage2D.getDimensions()).asFrameImage2D();
        if (!(asFrameImage2D.getWidth() == this.mWidth && asFrameImage2D.getHeight() == this.mHeight)) {
            updateFrameSize(asFrameImage2D.getWidth(), asFrameImage2D.getHeight());
        }
        updateProgramParams();
        this.mShader.process(asFrameImage2D, asFrameImage2D2);
        connectedOutputPort.pushFrame(asFrameImage2D2);
    }

    private void updateFrameSize(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }

    private void updateProgramParams() {
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
        float f = this.mScale;
        f = (f + f) + 0.75f;
        float f2 = fArr[0];
        float f3 = fArr[1];
        f2 = ((f2 * f2) + (f3 * f3)) * 0.25f;
        f3 = (float) Math.sqrt((double) f2);
        float f4 = 1.15f * f3;
        f4 *= f4;
        double atan = Math.atan((double) ((f / f3) * ((float) Math.sqrt((double) (f4 - f2)))));
        this.mShader.setUniformValue("scale", fArr);
        this.mShader.setUniformValue("radius2", f4);
        this.mShader.setUniformValue("factor", f3 / (1.5707964f - ((float) atan)));
        this.mShader.setUniformValue("alpha", f);
    }
}
