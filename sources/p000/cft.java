package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: cft */
final class cft implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f1926a;
    /* renamed from: b */
    private final /* synthetic */ int f1927b;
    /* renamed from: c */
    private final /* synthetic */ cfk f1928c;

    cft(cfk cfk, Bitmap bitmap, int i) {
        this.f1928c = cfk;
        this.f1926a = bitmap;
        this.f1927b = i;
    }

    public final void run() {
        cfk cfk = this.f1928c;
        cfk.f20299y.mo1660a(cfk.f20257H.mo2846b());
        this.f1928c.f20299y.mo1658a(this.f1926a, this.f1927b);
        kow.m13622a(this.f1928c.f20294t.m2801a(new gss(this.f1926a, iqm.m4037a(this.f1927b))), new cfu(), kpq.f8410a);
    }
}
