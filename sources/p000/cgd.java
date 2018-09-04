package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: cgd */
final class cgd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ err f1944a;
    /* renamed from: b */
    private final /* synthetic */ hio f1945b;
    /* renamed from: c */
    private final /* synthetic */ int f1946c;
    /* renamed from: d */
    private final /* synthetic */ cgc f1947d;

    cgd(cgc cgc, err err, hio hio, int i) {
        this.f1947d = cgc;
        this.f1944a = err;
        this.f1945b = hio;
        this.f1946c = i;
    }

    public final void run() {
        err e;
        cre d = this.f1947d.f1943a.f20256G.mo1020d(0);
        if (d != cre.f2587c) {
            e = d.mo1066e();
        } else {
            e = null;
        }
        if (e == this.f1944a) {
            hio hio = this.f1945b;
            if (hio == null || !hio.f6240a.mo2084b()) {
                int i = this.f1946c;
                if (i == 0 || (this.f1947d.f1943a.f20298x && i == 1)) {
                    this.f1947d.f1943a.f20299y.mo1662b();
                    this.f1947d.f1943a.f20294t.m2802b();
                    this.f1947d.f1943a.f20262M.mo769m();
                    return;
                }
                return;
            }
            Bitmap bitmap = (Bitmap) this.f1945b.f6240a.mo2081a();
            String str = cfk.f20249a;
            String valueOf = String.valueOf(new iqp(bitmap.getWidth(), bitmap.getHeight()));
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
            stringBuilder.append("updateCaptureIndicatorWithFirstFilmstripItem bitmap=");
            stringBuilder.append(valueOf);
            bli.m871d(str, stringBuilder.toString());
            this.f1947d.f1943a.f20299y.mo1658a(bitmap, 0);
            this.f1947d.f1943a.f20294t.m2801a(new gss(bitmap, iqm.CLOCKWISE_0));
            this.f1947d.f1943a.f20262M.mo755a(bitmap);
            return;
        }
        bli.m871d(cfk.f20249a, "first filmstrip item changed, cancel indicator update");
    }
}
