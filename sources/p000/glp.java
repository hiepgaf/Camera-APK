package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: glp */
final class glp implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ glq f5383a;
    /* renamed from: b */
    private final /* synthetic */ glo f5384b;

    glp(glo glo, glq glq) {
        this.f5384b = glo;
        this.f5383a = glq;
    }

    public final void run() {
        synchronized (this.f5384b.f17025a) {
            for (String str : this.f5384b.f17025a.keySet()) {
                gkr gkr = (gkr) this.f5384b.f17025a.get(str);
                this.f5383a.mo582a((Uri) jri.m13152b(gkr.mo2887o()), gkr.mo2883k(), null);
                this.f5383a.mo581a((Uri) jri.m13152b(gkr.mo2887o()), gkr.mo2881i());
                this.f5383a.mo583a((Uri) jri.m13152b(gkr.mo2887o()), gkr.mo2882j());
            }
        }
    }
}
