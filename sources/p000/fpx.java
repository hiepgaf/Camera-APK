package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.RggbChannelVector;
import android.hardware.camera2.params.TonemapCurve;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: fpx */
public final class fpx implements kwk {
    /* renamed from: a */
    private final kwk f16348a;
    /* renamed from: b */
    private final kwk f16349b;
    /* renamed from: c */
    private final kwk f16350c;

    private fpx(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f16348a = kwk;
        this.f16349b = kwk2;
        this.f16350c = kwk3;
    }

    /* renamed from: a */
    public static fpx m10635a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new fpx(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        gfx gfx;
        kwk kwk = this.f16348a;
        kwk kwk2 = this.f16349b;
        kwk kwk3 = this.f16350c;
        fqx fqx = (fqx) kwk.mo345a();
        kwk2.mo345a();
        kbg kbg = (kbg) kwk3.mo345a();
        r2 = new fin[17];
        Key key = CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE;
        Integer valueOf = Integer.valueOf(0);
        r2[0] = new fin(key, valueOf);
        r2[1] = new fin(CaptureRequest.COLOR_CORRECTION_GAINS, new RggbChannelVector(1.0f, 1.0f, 1.0f, 1.0f));
        r2[2] = new fin(CaptureRequest.COLOR_CORRECTION_MODE, valueOf);
        r2[3] = new fin(CaptureRequest.COLOR_CORRECTION_TRANSFORM, new ColorSpaceTransform(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        r2[4] = new fin(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, valueOf);
        r2[5] = new fin(CaptureRequest.CONTROL_AE_MODE, valueOf);
        r2[6] = new fin(CaptureRequest.CONTROL_AWB_MODE, valueOf);
        r2[7] = new fin(CaptureRequest.CONTROL_MODE, valueOf);
        r2[8] = new fin(CaptureRequest.CONTROL_SCENE_MODE, valueOf);
        r2[9] = new fin(CaptureRequest.CONTROL_POST_RAW_SENSITIVITY_BOOST, Integer.valueOf(100));
        r2[10] = new fin(CaptureRequest.EDGE_MODE, valueOf);
        r2[11] = new fin(CaptureRequest.HOT_PIXEL_MODE, valueOf);
        r2[12] = new fin(CaptureRequest.NOISE_REDUCTION_MODE, valueOf);
        r2[13] = new fin(CaptureRequest.REPROCESS_EFFECTIVE_EXPOSURE_FACTOR, Float.valueOf(1.0f));
        r2[14] = new fin(CaptureRequest.SHADING_MODE, valueOf);
        r2[15] = new fin(CaptureRequest.TONEMAP_CURVE, new TonemapCurve(new float[]{0.0f, 0.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, 1.0f, 1.0f}));
        r2[16] = new fin(CaptureRequest.TONEMAP_MODE, valueOf);
        Collection asList = Arrays.asList(r2);
        if (kbg.mo2084b()) {
            gfx = (gfx) kbg.mo2081a();
        } else {
            gfx = gfy.f16889a;
        }
        return (kbg) ktm.m13963a(kbg.m4745c(new fph(fqx, asList, gfx)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
