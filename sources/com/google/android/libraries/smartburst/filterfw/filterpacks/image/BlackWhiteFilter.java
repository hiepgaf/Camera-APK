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
public class BlackWhiteFilter extends Filter {
    public float mBlack = 0.0f;
    public final String mBlackWhiteShader = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 seed;\nuniform float black;\nuniform float scale;\nuniform float stepsize;\nvarying vec2 v_texcoord;\nfloat rand(vec2 loc) {\n  return fract(sin(dot((loc + seed), vec2(12.9898, 78.233))) * 43758.5453);\n}\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float dither = rand(v_texcoord);\n  vec3 xform = clamp((color.rgb - black) * scale, 0.0, 1.0);\n  vec3 temp = clamp((color.rgb + stepsize - black) * scale, 0.0, 1.0);\n  vec3 new_color = clamp(xform + (temp - xform) * (dither - 0.5), 0.0, 1.0);\n  gl_FragColor = vec4(new_color, color.a);\n}\n";
    public Random mRandom = new Random();
    public ImageShader mShader;
    public float mWhite = 1.0f;

    public BlackWhiteFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("black", 1, FrameType.single(Float.TYPE)).addInputPort("white", 1, FrameType.single(Float.TYPE)).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("black")) {
            inputPort.bindToFieldNamed("mBlack");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("white")) {
            inputPort.bindToFieldNamed("mWhite");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onPrepare() {
        this.mShader = new ImageShader("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 seed;\nuniform float black;\nuniform float scale;\nuniform float stepsize;\nvarying vec2 v_texcoord;\nfloat rand(vec2 loc) {\n  return fract(sin(dot((loc + seed), vec2(12.9898, 78.233))) * 43758.5453);\n}\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float dither = rand(v_texcoord);\n  vec3 xform = clamp((color.rgb - black) * scale, 0.0, 1.0);\n  vec3 temp = clamp((color.rgb + stepsize - black) * scale, 0.0, 1.0);\n  vec3 new_color = clamp(xform + (temp - xform) * (dither - 0.5), 0.0, 1.0);\n  gl_FragColor = vec4(new_color, color.a);\n}\n");
    }

    protected void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(asFrameImage2D.getDimensions()).asFrameImage2D();
        updateParameters();
        this.mShader.process(asFrameImage2D, asFrameImage2D2);
        connectedOutputPort.pushFrame(asFrameImage2D2);
    }

    private void updateParameters() {
        float f = this.mBlack;
        float f2 = this.mWhite;
        if (f != f2) {
            f = 1.0f / (f2 - f);
        } else {
            f = 2000.0f;
        }
        float[] fArr = new float[]{this.mRandom.nextFloat(), this.mRandom.nextFloat()};
        this.mShader.setUniformValue("black", this.mBlack);
        this.mShader.setUniformValue("scale", f);
        this.mShader.setUniformValue("stepsize", 0.003921569f);
        this.mShader.setUniformValue("seed", fArr);
    }
}
