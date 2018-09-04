package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import android.graphics.Color;
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
public class TintFilter extends Filter {
    public static final String mTintShaderCode = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec3 tint;\nuniform vec3 color_ratio;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float avg_color = dot(color_ratio, color.rgb);\n  vec3 new_color = min(0.8 * avg_color + 0.2 * tint, 1.0);\n  gl_FragColor = vec4(new_color.rgb, color.a);\n}\n";
    public ImageShader mShader;
    public int mTint = -16776961;

    public TintFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("tint", 1, FrameType.single(Integer.TYPE)).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("tint")) {
            inputPort.bindToFieldNamed("mTint");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onPrepare() {
        this.mShader = new ImageShader(mTintShaderCode);
        this.mShader.setUniformValue("color_ratio", new float[]{0.21f, 0.71f, 0.07f});
    }

    protected synchronized void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(asFrameImage2D.getDimensions()).asFrameImage2D();
        this.mShader.setUniformValue("tint", new float[]{((float) Color.red(this.mTint)) / 255.0f, ((float) Color.green(this.mTint)) / 255.0f, ((float) Color.blue(this.mTint)) / 255.0f});
        this.mShader.process(asFrameImage2D, asFrameImage2D2);
        connectedOutputPort.pushFrame(asFrameImage2D2);
    }
}
