package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameManager;
import com.google.android.libraries.smartburst.filterfw.imageutils.Histograms;
import com.google.android.libraries.smartburst.filterfw.imageutils.RgbToHsvConverter;
import com.google.android.libraries.smartburst.utils.Feature;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;

/* compiled from: PG */
/* renamed from: jtd */
public final class jtd implements jtf {
    /* renamed from: a */
    private final int f19021a = 6;
    /* renamed from: b */
    private final int f19022b = 3;
    /* renamed from: c */
    private final int f19023c = 26;
    /* renamed from: d */
    private final int f19024d = 51;
    /* renamed from: e */
    private final int f19025e;
    /* renamed from: f */
    private final FloatBuffer f19026f;
    /* renamed from: g */
    private final FloatBuffer f19027g;

    public jtd() {
        int i = this.f19021a;
        this.f19025e = i;
        this.f19026f = jtd.m13187a(i * this.f19022b);
        this.f19027g = jtd.m13187a(this.f19025e);
    }

    /* renamed from: a */
    private static FloatBuffer m13187a(int i) {
        return ByteBuffer.allocateDirect(i << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* renamed from: a */
    public final synchronized List mo2048a(Bitmap bitmap) {
        List a;
        jri.m13152b((Object) bitmap);
        FrameManager.attachToThread();
        try {
            FrameImage2D a2 = jqk.m13076a(bitmap);
            RgbToHsvConverter rgbToHsvConverter = new RgbToHsvConverter(false);
            FrameImage2D a3 = jqk.m13075a(bitmap.getWidth(), bitmap.getHeight());
            rgbToHsvConverter.convertImage(a2, a3);
            this.f19026f.rewind();
            this.f19027g.rewind();
            Histograms.extractHueSatValueHistogram(a3, this.f19021a, this.f19022b, this.f19025e, this.f19023c, this.f19024d, this.f19026f, this.f19027g);
            float[] a4 = jtd.m13188a(this.f19026f);
            float[] a5 = jtd.m13188a(this.f19027g);
            Feature feature = new Feature(jza.HUE_SAT_HISTOGRAM, a4);
            Feature feature2 = new Feature(jza.VALUE_HISTOGRAM, a5);
            a2.release();
            a3.release();
            a = khb.m4864a(feature, feature2);
            FrameManager.detachFromThread();
        } catch (Throwable th) {
            FrameManager.detachFromThread();
        }
        return a;
    }

    /* renamed from: a */
    private static float[] m13188a(FloatBuffer floatBuffer) {
        float[] fArr = new float[floatBuffer.remaining()];
        floatBuffer.get(fArr);
        return fArr;
    }
}
