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
public class PosterizeFilter extends Filter {
    public static final String mPosterizeShaderCode = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float binSize;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  vec4 bc = mod(color, binSize);\n  float bs2 = binSize / 2.0;\n  vec3 result;\n  result.r = (bc.r >= bs2) ? color.r + binSize - bc.r : color.r - bc.r;\n  result.g = (bc.g >= bs2) ? color.g + binSize - bc.g : color.g - bc.g;\n  result.b = (bc.b >= bs2) ? color.b + binSize - bc.b : color.b - bc.b;\n  gl_FragColor = vec4(result, color.a);\n}\n";
    public int mLevels = 2;
    public ImageShader mShader;

    public PosterizeFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("levels", 1, FrameType.single(Integer.TYPE)).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("levels")) {
            inputPort.bindToFieldNamed("mLevels");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onPrepare() {
        this.mShader = new ImageShader(mPosterizeShaderCode);
    }

    protected void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(asFrameImage2D.getDimensions()).asFrameImage2D();
        int i = this.mLevels;
        if (i < 2) {
            StringBuilder stringBuilder = new StringBuilder(59);
            stringBuilder.append("Posterize filter obtained levels less than 2 (");
            stringBuilder.append(i);
            stringBuilder.append(")!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.mShader.setUniformValue("binSize", 1.0f / ((float) (i - 1)));
        this.mShader.process(asFrameImage2D, asFrameImage2D2);
        connectedOutputPort.pushFrame(asFrameImage2D2);
    }
}
