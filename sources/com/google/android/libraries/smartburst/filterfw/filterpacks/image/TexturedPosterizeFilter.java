package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import android.text.TextUtils;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
public class TexturedPosterizeFilter extends Filter {
    public static final String mPosterizeShaderCode = "precision mediump float;\nuniform sampler2D tex_sampler_0;\n__TEX_SAMPLERS_DECL__\nuniform float binSize;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float gray = (color.r + color.g + color.b) / 3.0;\n  int level = int(floor((gray / binSize) + 0.5));\n  vec4 texColor;\n__LEVEL_SELECT__ {\n    texColor = vec4(0.0, 0.0, 0.0, 1.0);\n  }\n  gl_FragColor = texColor;\n}\n";
    public ImageShader mShader;
    public Map mTexturePorts = new TreeMap();

    public TexturedPosterizeFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    private void checkInputTextures() {
        int size = this.mTexturePorts.size();
        if (size >= 2) {
            for (int i = 0; i < size; i++) {
                if (((InputPort) this.mTexturePorts.get(Integer.valueOf(i))) == null) {
                    StringBuilder stringBuilder = new StringBuilder(38);
                    stringBuilder.append("Missing input port 'level");
                    stringBuilder.append(i);
                    stringBuilder.append("'!");
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
            return;
        }
        throw new RuntimeException("Must specify at least two input texture levels!");
    }

    private void createShader() {
        CharSequence generateSamplerDecl = generateSamplerDecl();
        this.mShader = new ImageShader(mPosterizeShaderCode.replace("__TEX_SAMPLERS_DECL__", generateSamplerDecl).replace("__LEVEL_SELECT__", generateLevelSelect()));
    }

    private String generateLevelSelect() {
        int size = this.mTexturePorts.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            StringBuilder stringBuilder = new StringBuilder(102);
            stringBuilder.append("  if (level == ");
            stringBuilder.append(i);
            stringBuilder.append(") {\n    texColor = texture2D(tex_sampler_");
            stringBuilder.append(i + 1);
            stringBuilder.append(", v_texcoord);\n  } else ");
            strArr[i] = stringBuilder.toString();
        }
        return TextUtils.join("\n", strArr);
    }

    private String generateSamplerDecl() {
        int size = this.mTexturePorts.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            StringBuilder stringBuilder = new StringBuilder(42);
            stringBuilder.append("uniform sampler2D tex_sampler_");
            stringBuilder.append(i + 1);
            stringBuilder.append(";");
            strArr[i] = stringBuilder.toString();
        }
        return TextUtils.join("\n", strArr);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherOutputs();
    }

    protected void onInputPortAttached(InputPort inputPort) {
        String name = inputPort.getName();
        if (name.startsWith("level")) {
            this.mTexturePorts.put(Integer.valueOf(Integer.parseInt(name.substring(5))), inputPort);
        } else if (!name.equals("image")) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 26);
            stringBuilder.append("Unsupported input port '");
            stringBuilder.append(name);
            stringBuilder.append("'!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    protected void onPrepare() {
        checkInputTextures();
        createShader();
    }

    protected void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D[] frameImage2DArr = new FrameImage2D[(this.mTexturePorts.size() + 1)];
        frameImage2DArr[0] = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        int[] dimensions = frameImage2DArr[0].getDimensions();
        int i = 1;
        for (InputPort pullFrame : this.mTexturePorts.values()) {
            int i2 = i + 1;
            frameImage2DArr[i] = pullFrame.pullFrame().asFrameImage2D();
            i = i2;
        }
        Frame asFrameImage2D = connectedOutputPort.fetchAvailableFrame(dimensions).asFrameImage2D();
        this.mShader.setUniformValue("binSize", 1.0f / ((float) (this.mTexturePorts.size() - 1)));
        this.mShader.processMulti(frameImage2DArr, asFrameImage2D);
        connectedOutputPort.pushFrame(asFrameImage2D);
    }
}
