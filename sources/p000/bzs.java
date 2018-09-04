package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.googlex.gcam.Tuning;

/* compiled from: PG */
/* renamed from: bzs */
public final class bzs {
    /* renamed from: a */
    public final Tuning f1760a;
    /* renamed from: b */
    public final fvj f1761b;

    bzs(Tuning tuning, iwp iwp) {
        jri.m13152b((Object) iwp);
        this.f1760a = (Tuning) jri.m13152b((Object) tuning);
        Object obj = (Face[]) iwp.mo3143a(CaptureResult.STATISTICS_FACES);
        Object obj2 = (Rect) iwp.mo3143a(CaptureResult.SCALER_CROP_REGION);
        jri.m13152b(obj);
        jri.m13152b(obj2);
        this.f1761b = new fvj(obj, obj2);
    }
}
