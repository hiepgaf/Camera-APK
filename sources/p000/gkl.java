package p000;

import android.os.SystemClock;

/* renamed from: gkl */
final /* synthetic */ class gkl implements Runnable {
    /* renamed from: a */
    private final gkk f5313a;
    /* renamed from: b */
    private final grw f5314b;
    /* renamed from: c */
    private final long f5315c;

    gkl(gkk gkk, grw grw, long j) {
        this.f5313a = gkk;
        this.f5314b = grw;
        this.f5315c = j;
    }

    public final void run() {
        boolean z;
        gkk gkk = this.f5313a;
        grw grw = this.f5314b;
        long j = this.f5315c;
        kow.m13622a(gkk.m15761D(), new gkn(gkk, gkk.m17406u()), kpq.f8410a);
        if (gkk.f23261g != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        gkk.A.mo3557a(new gko(gkk));
        gkk.f23260f.mo1589a(gkk.f23257c.mo1624b(), grw.f5655a, gkk.f23256b, ((float) (SystemClock.elapsedRealtime() - j)) / 1000.0f);
    }
}
