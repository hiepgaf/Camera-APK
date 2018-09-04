package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import android.text.TextUtils;
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
import java.util.Arrays;
import java.util.Vector;

/* compiled from: PG */
public final class ConvolutionFilter extends Filter {
    public static final String mConvolutionShader = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = __CONVOLUTION__;\n}\n";
    public float[] mMask = null;
    public int mMaskHeight = 0;
    public int mMaskWidth = 0;
    public int[] mOldDim = null;
    public float[] mOldMask = null;
    public ImageShader mShader;

    public ConvolutionFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    private final void createShader(int i, int i2) {
        String replace = mConvolutionShader.replace("__CONVOLUTION__", generateConvolutionCode(i, i2));
        String valueOf = String.valueOf(replace);
        String str = "ShaderCode: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        Log.i("ConvolutionFilter", valueOf);
        this.mShader = new ImageShader(replace);
    }

    private final String generateConvolutionCode(int i, int i2) {
        int i3 = (this.mMaskWidth - 1) / 2;
        int i4 = (this.mMaskHeight - 1) / 2;
        Iterable vector = new Vector();
        int i5 = 0;
        for (int i6 = -i4; i6 <= i4; i6++) {
            int i7 = -i3;
            while (i7 <= i3) {
                int i8 = i5 + 1;
                float f = this.mMask[i5];
                StringBuilder stringBuilder = new StringBuilder(112);
                stringBuilder.append(f);
                stringBuilder.append(" * texture2D(tex_sampler_0, vec2(v_texcoord.x + ");
                stringBuilder.append(((float) i7) / ((float) i));
                stringBuilder.append(", v_texcoord.y + ");
                stringBuilder.append(((float) i6) / ((float) i2));
                stringBuilder.append("))");
                vector.add(stringBuilder.toString());
                i7++;
                i5 = i8;
            }
        }
        return TextUtils.join(" + ", vector);
    }

    public final Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("mask", 1, FrameType.array(Float.TYPE)).addInputPort("maskWidth", 1, FrameType.single(Integer.TYPE)).addInputPort("maskHeight", 1, FrameType.single(Integer.TYPE)).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    private final boolean isPerfectSquare(int i) {
        double sqrt = Math.sqrt((double) i);
        return sqrt == ((double) ((int) sqrt));
    }

    public final void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("mask")) {
            inputPort.bindToFieldNamed("mMask");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("maskWidth")) {
            inputPort.bindToFieldNamed("mMaskWidth");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("maskHeight")) {
            inputPort.bindToFieldNamed("mMaskHeight");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected final void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        int[] dimensions = asFrameImage2D.getDimensions();
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(dimensions).asFrameImage2D();
        float[] fArr = this.mMask;
        if (fArr == null) {
            throw new NullPointerException("No mask specified!");
        }
        if (!(Arrays.equals(this.mOldMask, fArr) && Arrays.equals(dimensions, this.mOldDim))) {
            updateMaskSize();
            createShader(dimensions[0], dimensions[1]);
            this.mOldMask = this.mMask;
            this.mOldDim = dimensions;
        }
        this.mShader.process(asFrameImage2D, asFrameImage2D2);
        connectedOutputPort.pushFrame(asFrameImage2D2);
    }

    private final void updateMaskSize() {
        if (this.mMaskWidth != 0 && this.mMaskHeight != 0) {
            return;
        }
        if (isPerfectSquare(this.mMask.length)) {
            int sqrt = (int) Math.sqrt((double) this.mMask.length);
            if (sqrt % 2 != 1) {
                int length = this.mMask.length;
                StringBuilder stringBuilder = new StringBuilder(81);
                stringBuilder.append("Illegal mask size ");
                stringBuilder.append(length);
                stringBuilder.append("! Each dimension must contain odd number of entries!");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.mMaskWidth = sqrt;
            this.mMaskHeight = sqrt;
            return;
        }
        length = this.mMask.length;
        stringBuilder = new StringBuilder(55);
        stringBuilder.append("Illegal mask size ");
        stringBuilder.append(length);
        stringBuilder.append("! Must be power of 2 size!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
