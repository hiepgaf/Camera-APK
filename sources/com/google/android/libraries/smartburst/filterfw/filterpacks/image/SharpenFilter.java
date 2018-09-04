package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

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

/* compiled from: PG */
public class SharpenFilter extends Filter {
    public static final String mSharpenShaderCode = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float scale;\nuniform float stepsizeX;\nuniform float stepsizeY;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec3 nbr_color = vec3(0.0, 0.0, 0.0);\n  vec2 coord;\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  coord.x = v_texcoord.x - 0.5 * stepsizeX;\n  coord.y = v_texcoord.y - stepsizeY;\n  nbr_color += texture2D(tex_sampler_0, coord).rgb - color.rgb;\n  coord.x = v_texcoord.x - stepsizeX;\n  coord.y = v_texcoord.y + 0.5 * stepsizeY;\n  nbr_color += texture2D(tex_sampler_0, coord).rgb - color.rgb;\n  coord.x = v_texcoord.x + stepsizeX;\n  coord.y = v_texcoord.y - 0.5 * stepsizeY;\n  nbr_color += texture2D(tex_sampler_0, coord).rgb - color.rgb;\n  coord.x = v_texcoord.x + stepsizeX;\n  coord.y = v_texcoord.y + 0.5 * stepsizeY;\n  nbr_color += texture2D(tex_sampler_0, coord).rgb - color.rgb;\n  gl_FragColor = vec4(color.rgb - 2.0 * scale * nbr_color, color.a);\n}\n";
    public float mScale = 0.0f;
    public ImageShader mShader;

    public SharpenFilter(MffContext mffContext, String str) {
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
        Log.i("SharpenFilter", "onPrepare BEGIN");
        this.mShader = new ImageShader(mSharpenShaderCode);
        Log.i("SharpenFilter", "onPrepare END");
    }

    protected synchronized void onProcess() {
        Log.i("SharpenFilter", "onProcess BEGIN");
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(asFrameImage2D.getDimensions()).asFrameImage2D();
        int width = asFrameImage2D.getWidth();
        int height = asFrameImage2D.getHeight();
        this.mShader.setUniformValue("stepsizeX", 1.0f / ((float) width));
        this.mShader.setUniformValue("stepsizeY", 1.0f / ((float) height));
        this.mShader.setUniformValue("scale", this.mScale);
        this.mShader.process(asFrameImage2D, asFrameImage2D2);
        connectedOutputPort.pushFrame(asFrameImage2D2);
        Log.i("SharpenFilter", "onProcess END");
    }
}
