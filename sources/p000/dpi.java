package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dpi */
public final class dpi extends fiw {
    /* renamed from: a */
    private final /* synthetic */ Set f13802a;
    /* renamed from: b */
    private final /* synthetic */ Set f13803b;
    /* renamed from: c */
    private final /* synthetic */ iqz f13804c;

    public dpi(Set set, Set set2, iqz iqz) {
        this.f13802a = set;
        this.f13803b = set2;
        this.f13804c = iqz;
    }

    public final void a_(iwp iwp) {
        jri.m13143a(this.f13802a.contains(iwp.mo3146d().mo3139a(CaptureRequest.NOISE_REDUCTION_MODE)));
        jri.m13143a(this.f13803b.contains(iwp.mo3146d().mo3139a(CaptureRequest.EDGE_MODE)));
        Integer num = (Integer) iwp.mo3143a(CaptureResult.NOISE_REDUCTION_MODE);
        if (!this.f13802a.contains(num)) {
            iqz iqz = this.f13804c;
            String valueOf = String.valueOf(num);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 54);
            stringBuilder.append("Capture result did not contain an acceptable NR mode: ");
            stringBuilder.append(valueOf);
            iqz.mo515b(stringBuilder.toString(), new IllegalArgumentException());
        }
        num = (Integer) iwp.mo3143a(CaptureResult.EDGE_MODE);
        if (!this.f13803b.contains(num)) {
            iqz = this.f13804c;
            valueOf = String.valueOf(num);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 56);
            stringBuilder.append("Capture result did not contain an acceptable Edge mode: ");
            stringBuilder.append(valueOf);
            iqz.mo515b(stringBuilder.toString(), new IllegalArgumentException());
        }
    }
}
