package com.google.android.libraries.smartburst.filterfw.filterpacks.composite;

import com.google.android.apps.camera.metadata.refocus.XmpUtil;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;

/* compiled from: PG */
public final class OverlayFilter extends Filter {
    public static final int OVERLAY_ADD = 2;
    public static final int OVERLAY_BURN = 8;
    public static final int OVERLAY_DARKEN = 11;
    public static final int OVERLAY_DIFFERENCE = 5;
    public static final int OVERLAY_DIVIDE = 3;
    public static final int OVERLAY_DODGE = 7;
    public static final int OVERLAY_HARDLIGHT = 9;
    public static final int OVERLAY_LIGHTEN = 12;
    public static final int OVERLAY_MULTIPLY = 1;
    public static final int OVERLAY_NORMAL = 0;
    public static final int OVERLAY_OVERLAY = 13;
    public static final int OVERLAY_SCREEN = 6;
    public static final int OVERLAY_SOFTLIGHT = 10;
    public static final int OVERLAY_SQUARED_DIFFERENCE = 14;
    public static final int OVERLAY_SUBTRACT = 4;
    public static final Quad[] mDefaultQuads = new Quad[]{Quad.fromRect(0.0f, 0.0f, 1.0f, 1.0f)};
    public boolean mHasMask = false;
    public ImageShader mIdShader;
    public int mInputFrameCount = 1;
    public int mOldOverlayMode = -1;
    public float mOpacity = 1.0f;
    public int mOverlayMode = 0;
    public ImageShader mOverlayShader;
    public Quad[] mSourceQuads = null;
    public Quad[] mTargetQuads = null;

    public OverlayFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    private final void createShader(boolean z) {
        this.mOverlayShader = new ImageShader(genVertexShader(z, this.mHasMask), genFragmentShader(z, this.mHasMask));
        if (this.mHasMask) {
            this.mOverlayShader.setAttributeValues("a_texcoord_full", new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}, 2);
        }
        this.mOverlayShader.setBlendEnabled(true);
        this.mOverlayShader.setBlendFunc(770, 771);
    }

    private final String genFragmentShader(boolean z, boolean z2) {
        String str;
        String str2;
        String stringBuilder;
        String str3;
        String str4;
        String str5;
        String stringBuilder2;
        if (z) {
            str = "tex_sampler_2";
        } else {
            str = "tex_sampler_1";
        }
        if (z) {
            str2 = "uniform sampler2D tex_sampler_1;\n";
        } else {
            str2 = "";
        }
        if (z2) {
            StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(str).length() + 20);
            stringBuilder3.append("uniform sampler2D ");
            stringBuilder3.append(str);
            stringBuilder3.append(";\n");
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        if (z2) {
            str3 = "varying vec2 v_texcoord_mask;\n";
        } else {
            str3 = "";
        }
        if (z) {
            str4 = "varying vec2 v_texcoord_src;\n";
        } else {
            str4 = "";
        }
        if (z) {
            str5 = "  vec4 srcColor = texture2D(tex_sampler_1, v_texcoord_src);\n";
        } else {
            str5 = "";
        }
        if (z2) {
            StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(str).length() + 45);
            stringBuilder4.append("ovlColor.a = texture2D(");
            stringBuilder4.append(str);
            stringBuilder4.append(", v_texcoord_mask).a;\n");
            stringBuilder2 = stringBuilder4.toString();
        } else {
            stringBuilder2 = "";
        }
        str = getOutputColor();
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(stringBuilder).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        StringBuilder stringBuilder5 = new StringBuilder(((((((length + XmpUtil.M_APP1) + length2) + length3) + length4) + length5) + String.valueOf(stringBuilder2).length()) + String.valueOf(str).length());
        stringBuilder5.append("precision mediump float;\nuniform sampler2D tex_sampler_0;\n");
        stringBuilder5.append(str2);
        stringBuilder5.append(stringBuilder);
        stringBuilder5.append("uniform float opacity;\nvarying vec2 v_texcoord;\n");
        stringBuilder5.append(str3);
        stringBuilder5.append(str4);
        stringBuilder5.append("void main() {\n  vec4 ovlColor = texture2D(tex_sampler_0, v_texcoord);\n");
        stringBuilder5.append(str5);
        stringBuilder5.append(stringBuilder2);
        stringBuilder5.append("  gl_FragColor = vec4(");
        stringBuilder5.append(str);
        stringBuilder5.append(", ovlColor.a * opacity);\n}\n");
        return stringBuilder5.toString();
    }

    private final String genVertexShader(boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (z2) {
            str = "attribute vec2 a_texcoord_full;\n";
        } else {
            str = "";
        }
        if (z) {
            str2 = "attribute vec2 a_texcoord_src;\n";
        } else {
            str2 = "";
        }
        if (z2) {
            str3 = "varying vec2 v_texcoord_mask;\n";
        } else {
            str3 = "";
        }
        if (z) {
            str4 = "varying vec2 v_texcoord_src;\n";
        } else {
            str4 = "";
        }
        if (z2) {
            str5 = "v_texcoord_mask = a_texcoord_full;\n";
        } else {
            str5 = "";
        }
        if (z) {
            str6 = "v_texcoord_src = a_texcoord_src;\n";
        } else {
            str6 = "";
        }
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder stringBuilder = new StringBuilder((((((length + 150) + length2) + length3) + length4) + String.valueOf(str5).length()) + String.valueOf(str6).length());
        stringBuilder.append("attribute vec4 a_position;\nattribute vec2 a_texcoord;\n");
        stringBuilder.append(str);
        stringBuilder.append(str2);
        stringBuilder.append("varying vec2 v_texcoord;\n");
        stringBuilder.append(str3);
        stringBuilder.append(str4);
        stringBuilder.append("void main() {\n  gl_Position = a_position;\n  v_texcoord = a_texcoord;\n");
        stringBuilder.append(str5);
        stringBuilder.append(str6);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    private final String getOutputColor() {
        switch (this.mOverlayMode) {
            case 1:
                return "srcColor.rgb * ovlColor.rgb";
            case 2:
                return "srcColor.rgb + ovlColor.rgb";
            case 3:
                return "srcColor.rgb / ovlColor.rgb";
            case 4:
                return "srcColor.rgb - ovlColor.rgb";
            case 5:
                return "abs(srcColor.rgb - ovlColor.rgb)";
            case 6:
                return "1.0 - ((1.0 - ovlColor.rgb) * (1.0 - srcColor.rgb))";
            case 7:
                return "srcColor.rgb / (1.0 - ovlColor.rgb)";
            case 8:
                return "1.0 - ((1.0 - srcColor.rgb) / ovlColor.rgb)";
            case 9:
                return "vec3(ovlColor.r > 0.5 ? 1.0 - ((1.0 - 2.0 * (ovlColor.r - 0.5)) * (1.0 - srcColor.r)) : (2.0 * ovlColor.r * srcColor.r),     ovlColor.g > 0.5 ? 1.0 - ((1.0 - 2.0 * (ovlColor.g - 0.5)) * (1.0 - srcColor.g)) : (2.0 * ovlColor.g * srcColor.g),     ovlColor.b > 0.5 ? 1.0 - ((1.0 - 2.0 * (ovlColor.b - 0.5)) * (1.0 - srcColor.b)) : (2.0 * ovlColor.b * srcColor.b))";
            case 10:
                return "srcColor.rgb * ((1.0 - srcColor.rgb) * ovlColor.rgb + (1.0 - ((1.0 - ovlColor.rgb) * (1.0 - srcColor.rgb))))";
            case 11:
                return "min(srcColor.rgb, ovlColor.rgb)";
            case 12:
                return "max(srcColor.rgb, ovlColor.rgb)";
            case 13:
                return "srcColor.rgb * (srcColor.rgb + (2.0 * ovlColor.rgb) * (1.0 - srcColor.rgb))";
            case 14:
                return "(srcColor.rgb - ovlColor.rgb) * (srcColor.rgb - ovlColor.rgb)";
            default:
                return "ovlColor.rgb";
        }
    }

    public final Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("source", 2, image2D).addInputPort("overlay", 2, image2D).addInputPort("mask", 1, image2D).addInputPort("opacity", 1, FrameType.single(Float.TYPE)).addInputPort("mode", 1, FrameType.single(Integer.TYPE)).addInputPort("sourceQuads", 1, FrameType.array(Quad.class)).addInputPort("targetQuads", 1, FrameType.array(Quad.class)).addOutputPort("composite", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    private static boolean needSourceForMode(int i) {
        return i != 0;
    }

    public final void onInputPortAttached(InputPort inputPort) {
        if (inputPort.getName().equals("mask")) {
            this.mHasMask = true;
        }
    }

    public final void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("opacity")) {
            inputPort.bindToFieldNamed("mOpacity");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("sourceQuads")) {
            inputPort.bindToFieldNamed("mSourceQuads");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("targetQuads")) {
            inputPort.bindToFieldNamed("mTargetQuads");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("mode")) {
            inputPort.bindToFieldNamed("mOverlayMode");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected final void onPrepare() {
        this.mIdShader = ImageShader.createIdentity();
    }

    protected final void onProcess() {
        FrameImage2D asFrameImage2D;
        Quad[] quadArr;
        int length;
        Object obj;
        Object obj2;
        Quad[] quadArr2;
        OutputPort connectedOutputPort = getConnectedOutputPort("composite");
        boolean needSourceForMode = needSourceForMode(this.mOverlayMode);
        if (this.mOverlayMode != this.mOldOverlayMode) {
            createShader(needSourceForMode);
            updateInputCount(needSourceForMode);
            this.mOldOverlayMode = this.mOverlayMode;
        }
        FrameImage2D asFrameImage2D2 = getConnectedInputPort("source").pullFrame().asFrameImage2D();
        FrameImage2D asFrameImage2D3 = getConnectedInputPort("overlay").pullFrame().asFrameImage2D();
        if (this.mHasMask) {
            asFrameImage2D = getConnectedInputPort("mask").pullFrame().asFrameImage2D();
        } else {
            asFrameImage2D = null;
        }
        Frame asFrameImage2D4 = connectedOutputPort.fetchAvailableFrame(asFrameImage2D2.getDimensions()).asFrameImage2D();
        this.mIdShader.process(asFrameImage2D2, asFrameImage2D4);
        this.mOverlayShader.setUniformValue("opacity", this.mOpacity);
        Quad[] quadArr3 = this.mSourceQuads;
        if (quadArr3 != null) {
            quadArr = this.mTargetQuads;
            if (quadArr != null) {
                int length2 = quadArr3.length;
                length = quadArr.length;
                if (length2 != length) {
                    StringBuilder stringBuilder = new StringBuilder(91);
                    stringBuilder.append("Mismatch between input source quad count (");
                    stringBuilder.append(length2);
                    stringBuilder.append(") and target quad count (");
                    stringBuilder.append(length);
                    stringBuilder.append(")!");
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
        }
        quadArr3 = mDefaultQuads;
        Quad[] quadArr4 = mDefaultQuads;
        quadArr = this.mSourceQuads;
        if (quadArr != null) {
            obj = 1;
        } else {
            obj = null;
        }
        if (quadArr != null) {
            quadArr3 = quadArr;
        }
        Quad[] quadArr5 = this.mTargetQuads;
        if (quadArr5 != null) {
            obj2 = 1;
        } else {
            obj2 = obj;
        }
        if (quadArr5 != null) {
            quadArr2 = quadArr5;
        } else {
            quadArr2 = quadArr4;
        }
        if (obj2 != null) {
            length = passCountFor(quadArr, quadArr5);
        } else {
            length = 1;
        }
        for (int i = 0; i < length; i++) {
            int i2;
            if (i < quadArr3.length) {
                i2 = i;
            } else {
                i2 = 0;
            }
            Quad quad = quadArr3[i2];
            if (i < quadArr2.length) {
                i2 = i;
            } else {
                i2 = 0;
            }
            Quad quad2 = quadArr2[i2];
            this.mOverlayShader.setSourceQuad(quad);
            this.mOverlayShader.setTargetQuad(quad2);
            if (needSourceForMode) {
                this.mOverlayShader.setAttributeValues("a_texcoord_src", quad2.asCoords(), 2);
            }
            FrameImage2D[] frameImage2DArr = new FrameImage2D[this.mInputFrameCount];
            frameImage2DArr[0] = asFrameImage2D3;
            if (needSourceForMode) {
                frameImage2DArr[1] = asFrameImage2D2;
                i2 = 2;
            } else {
                i2 = 1;
            }
            if (this.mHasMask) {
                frameImage2DArr[i2] = asFrameImage2D;
            }
            this.mOverlayShader.processMulti(frameImage2DArr, asFrameImage2D4);
        }
        asFrameImage2D4.setTimestamp(asFrameImage2D2.getTimestamp());
        connectedOutputPort.pushFrame(asFrameImage2D4);
    }

    private final int passCountFor(Quad[] quadArr, Quad[] quadArr2) {
        if (quadArr == null) {
            return quadArr2.length;
        }
        if (quadArr2 == null) {
            return quadArr.length;
        }
        int length = quadArr.length;
        int length2 = quadArr2.length;
        if (length == length2) {
            return length;
        }
        StringBuilder stringBuilder = new StringBuilder(91);
        stringBuilder.append("Mismatch between input source quad count (");
        stringBuilder.append(length);
        stringBuilder.append(") and target quad count (");
        stringBuilder.append(length2);
        stringBuilder.append(")!");
        throw new RuntimeException(stringBuilder.toString());
    }

    private final void updateInputCount(boolean z) {
        this.mInputFrameCount = 1;
        if (z) {
            this.mInputFrameCount++;
        }
        if (this.mHasMask) {
            this.mInputFrameCount++;
        }
    }
}
