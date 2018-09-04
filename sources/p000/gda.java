package p000;

import com.google.googlex.gcam.GoudaProgressCallback;

/* compiled from: PG */
/* renamed from: gda */
final class gda extends GoudaProgressCallback {
    /* renamed from: a */
    private final /* synthetic */ gdv f16800a;

    gda(gdv gdv) {
        this.f16800a = gdv;
    }

    public final void Run(long j, float f) {
        boolean z = false;
        String str = gcv.f16763a;
        StringBuilder stringBuilder = new StringBuilder(68);
        stringBuilder.append("Gouda progress: id = ");
        stringBuilder.append(j);
        stringBuilder.append(" progress = ");
        stringBuilder.append(f);
        bli.m863a(str, stringBuilder.toString());
        gdv gdv = this.f16800a;
        if (gdv != null) {
            if (f >= 0.0f && f <= 1.0f) {
                z = true;
            }
            jri.m13143a(z);
            if (f == 0.0f) {
                gdv.f5100b.f22633i = System.currentTimeMillis();
            }
            gdv.f5099a.mo3050a((f * 0.5f) + 0.5f);
        }
    }
}
