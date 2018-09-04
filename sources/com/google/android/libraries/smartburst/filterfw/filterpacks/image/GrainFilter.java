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
import java.util.Random;

/* compiled from: PG */
public class GrainFilter extends Filter {
    public ImageShader mGrainShader;
    public final String mGrainSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nuniform float scale;\nuniform float stepX;\nuniform float stepY;\nvarying vec2 v_texcoord;\nvoid main() {\n  float noise = texture2D(tex_sampler_1, v_texcoord + vec2(-stepX, -stepY)).r * 0.224;\n  noise += texture2D(tex_sampler_1, v_texcoord + vec2(-stepX, stepY)).r * 0.224;\n  noise += texture2D(tex_sampler_1, v_texcoord + vec2(stepX, -stepY)).r * 0.224;\n  noise += texture2D(tex_sampler_1, v_texcoord + vec2(stepX, stepY)).r * 0.224;\n  noise += 0.4448;\n  noise *= scale;\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float energy = 0.33333 * color.r + 0.33333 * color.g + 0.33333 * color.b;\n  float mask = (1.0 - sqrt(energy));\n  float weight = 1.0 - 1.333 * mask * noise;\n  gl_FragColor = vec4(color.rgb * weight, color.a);\n}\n";
    public int mHeight = 0;
    public FrameImage2D mNoiseFrame = null;
    public ImageShader mNoiseShader;
    public final String mNoiseSource = "precision mediump float;\nuniform vec2 seed;\nvarying vec2 v_texcoord;\nfloat rand(vec2 loc) {\n  const float divide = 0.0003630780547;\n  const float factor = 2754.228703;\n  float value = sin(dot(loc, vec2(12.9898, 78.233)));\n  float residual = mod(dot(mod(loc, divide), vec2(0.9898, 0.233)), divide);\n  float part2 = mod(value, divide);\n  float part1 = value - part2;\n  return fract(0.5453 * part1 + factor * (part2 + residual));\n}\nvoid main() {\n  gl_FragColor = vec4(rand(v_texcoord + seed), 0.0, 0.0, 1.0);\n}\n";
    public Random mRandom = new Random();
    public float mScale = 1.0f;
    public int mWidth = 0;

    public GrainFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    private void createNoiseFrame(int i, int i2) {
        FrameImage2D frameImage2D = this.mNoiseFrame;
        if (frameImage2D != null) {
            frameImage2D.release();
        }
        this.mNoiseFrame = Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18), new int[]{i, i2}).asFrameImage2D();
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
        this.mNoiseShader = new ImageShader("precision mediump float;\nuniform vec2 seed;\nvarying vec2 v_texcoord;\nfloat rand(vec2 loc) {\n  const float divide = 0.0003630780547;\n  const float factor = 2754.228703;\n  float value = sin(dot(loc, vec2(12.9898, 78.233)));\n  float residual = mod(dot(mod(loc, divide), vec2(0.9898, 0.233)), divide);\n  float part2 = mod(value, divide);\n  float part1 = value - part2;\n  return fract(0.5453 * part1 + factor * (part2 + residual));\n}\nvoid main() {\n  gl_FragColor = vec4(rand(v_texcoord + seed), 0.0, 0.0, 1.0);\n}\n");
        this.mGrainShader = new ImageShader("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nuniform float scale;\nuniform float stepX;\nuniform float stepY;\nvarying vec2 v_texcoord;\nvoid main() {\n  float noise = texture2D(tex_sampler_1, v_texcoord + vec2(-stepX, -stepY)).r * 0.224;\n  noise += texture2D(tex_sampler_1, v_texcoord + vec2(-stepX, stepY)).r * 0.224;\n  noise += texture2D(tex_sampler_1, v_texcoord + vec2(stepX, -stepY)).r * 0.224;\n  noise += texture2D(tex_sampler_1, v_texcoord + vec2(stepX, stepY)).r * 0.224;\n  noise += 0.4448;\n  noise *= scale;\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float energy = 0.33333 * color.r + 0.33333 * color.g + 0.33333 * color.b;\n  float mask = (1.0 - sqrt(energy));\n  float weight = 1.0 - 1.333 * mask * noise;\n  gl_FragColor = vec4(color.rgb * weight, color.a);\n}\n");
    }

    protected synchronized void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        int[] dimensions = getConnectedInputPort("image").pullFrame().asFrameImage2D().getDimensions();
        Frame asFrameImage2D = connectedOutputPort.fetchAvailableFrame(dimensions).asFrameImage2D();
        int i = dimensions[0];
        if (!(i == this.mWidth && dimensions[1] == this.mHeight && this.mNoiseFrame != null)) {
            updateFrameSize(i, dimensions[1]);
            createNoiseFrame(dimensions[0] / 2, dimensions[1] / 2);
        }
        updateParameters();
        this.mNoiseShader.processMulti(new FrameImage2D[0], this.mNoiseFrame);
        this.mGrainShader.processMulti(new FrameImage2D[]{r1, this.mNoiseFrame}, asFrameImage2D);
        connectedOutputPort.pushFrame(asFrameImage2D);
    }

    public void onTearDown() {
        FrameImage2D frameImage2D = this.mNoiseFrame;
        if (frameImage2D != null) {
            frameImage2D.release();
            this.mNoiseFrame = null;
        }
    }

    private void updateFrameSize(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mGrainShader.setUniformValue("stepX", 0.5f / ((float) this.mWidth));
        this.mGrainShader.setUniformValue("stepY", 0.5f / ((float) this.mHeight));
    }

    private void updateParameters() {
        this.mGrainShader.setUniformValue("scale", this.mScale);
        this.mRandom.nextFloat();
        this.mRandom.nextFloat();
    }
}
