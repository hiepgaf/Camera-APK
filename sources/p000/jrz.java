package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameManager;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.geometry.MinDimensionScaler;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;
import com.google.android.libraries.smartburst.filterfw.imageutils.FastBoxBlur;
import com.google.android.libraries.smartburst.filterfw.imageutils.GridSharpness;
import com.google.android.libraries.smartburst.filterfw.imageutils.ImageCropper;
import com.google.android.libraries.smartburst.filterfw.imageutils.PerceptualSharpnessCalculator;

/* compiled from: PG */
/* renamed from: jrz */
public final class jrz implements jry {
    /* renamed from: a */
    private static final Scaler f18985a = new MinDimensionScaler(240);
    /* renamed from: b */
    private final ImageCropper f18986b;
    /* renamed from: c */
    private final int f18987c;
    /* renamed from: d */
    private final int f18988d;
    /* renamed from: e */
    private final int f18989e;
    /* renamed from: f */
    private final FastBoxBlur f18990f;
    /* renamed from: g */
    private final FastBoxBlur f18991g;

    public jrz() {
        this((byte) 0);
    }

    private jrz(byte b) {
        this.f18986b = new ImageCropper(false);
        this.f18987c = 7;
        this.f18988d = 5;
        this.f18989e = 5;
        this.f18990f = new FastBoxBlur(false, this.f18987c, 1);
        this.f18991g = new FastBoxBlur(false, 1, this.f18987c);
    }

    /* renamed from: a */
    public final jxa mo2043a(long j, Bitmap bitmap) {
        jri.m13152b((Object) bitmap);
        FrameManager.attachToThread();
        try {
            jri.m13152b((Object) bitmap);
            FrameImage2D a = jqk.m13076a(bitmap);
            int width = a.getWidth();
            int height = a.getHeight();
            if (width > 240 && height > 240) {
                FrameImage2D asFrameImage2D = Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18), f18985a.scale(width, height)).asFrameImage2D();
                this.f18986b.cropImage(a, Quad.unitQuad(), asFrameImage2D, false, false);
                a.release();
                a = asFrameImage2D;
            }
            FrameImage2D asFrameImage2D2 = Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18), a.getDimensions()).asFrameImage2D();
            FrameImage2D asFrameImage2D3 = Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18), a.getDimensions()).asFrameImage2D();
            this.f18990f.computeBlur(a, asFrameImage2D2);
            this.f18991g.computeBlur(a, asFrameImage2D3);
            GridSharpness computeGridSharpness = PerceptualSharpnessCalculator.computeGridSharpness(a, asFrameImage2D2, asFrameImage2D3, this.f18988d, this.f18989e);
            asFrameImage2D2.release();
            asFrameImage2D3.release();
            jxa jxa = new jxa();
            jxa.m4666a(jxa.f8063t, Float.valueOf(computeGridSharpness.getPerceptualSharpness()));
            jxa.m4666a(jxa.f8064u, Float.valueOf(computeGridSharpness.getMaxGridPerceptualSharpness()));
            a.release();
            return jxa;
        } finally {
            FrameManager.detachFromThread();
        }
    }

    public final String toString() {
        int i = this.f18987c;
        int i2 = this.f18988d;
        int i3 = this.f18989e;
        StringBuilder stringBuilder = new StringBuilder(106);
        stringBuilder.append("ImageSharpnessMetadataExtractorboxFilterSize = ");
        stringBuilder.append(i);
        stringBuilder.append("numBlocksX = ");
        stringBuilder.append(i2);
        stringBuilder.append("numBlocksY = ");
        stringBuilder.append(i3);
        return stringBuilder.toString();
    }
}
