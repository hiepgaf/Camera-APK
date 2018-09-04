package p000;

import android.view.accessibility.AccessibilityManager;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: dgx */
final class dgx implements kov {
    /* renamed from: a */
    public final /* synthetic */ dgl f13183a;

    dgx(dgl dgl) {
        this.f13183a = dgl;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
    }

    public final /* synthetic */ void b_(Object obj) {
        cwh cwh = (cwh) obj;
        dgl dgl = this.f13183a;
        dgl.f21024z = cwh;
        dgl.f21001c.mo2757l();
        ebd.m9598i();
        this.f13183a.f21001c.mo2757l().m9609c();
        this.f13183a.f21001c.mo2757l().m9618h();
        this.f13183a.f20974A.mo1879a(cwh.m15227b().mo2859a(new dgy(this), this.f13183a.f21002d));
        dgl dgl2 = this.f13183a;
        dgl2.f20974A.mo1879a(dgl2.f21024z.mo2855a().f4457e.mo2859a(dgl2.f20984K, Executors.newSingleThreadExecutor(iel.m3721c("PortFcDet", 0))));
        dgl2.f20979F = dgl2.f21024z.mo2855a().f4458f;
        cwh cwh2 = dgl2.f21024z;
        cwc cwc = cwh2.f20805b;
        AccessibilityManager accessibilityManager = dgl2.f21016r;
        bqq bqq = dgl2.f21017s;
        ffc ffc = cwh2.f20806c;
        gci gci = dgl2.f21015q;
        brp brp = dgl2.f21018t;
        bsn bsn = dgl2.f21014p;
        bmb bmb = dgl2.f21013o;
        dgl2.f20978E = new czp(accessibilityManager, bqq, ffc, gci, cwc, brp, false, ffc.mo1933o());
        dgl2.f20974A.mo1879a(dgl2.f21024z.mo2855a().f4457e.mo2859a(dgl2.f20978E, dgl2.f21002d));
        dgl2.f20978E.m8904a(cwc.f2818d.f6105a);
        iqo a = this.f13183a.f21006h.mo354a(cwh, cwh.f20806c, cwh.mo2855a().f4455c, kbg.m4745c(cwh.mo2855a().f4457e), this.f13183a.f21010l);
        this.f13183a.f20974A.mo1879a(cwh.mo2855a().f4455c.mo2859a(new dgz(this), Executors.newSingleThreadExecutor(iel.m3721c("PortAfCb", 0))));
        this.f13183a.f20974A.mo1879a(a);
        if (cwh != null && this.f13183a.f21009k.mo2084b()) {
            ((fbd) this.f13183a.f21009k.mo2081a()).m2216a(cwh.mo2855a().f4460h);
        }
        dgl = this.f13183a;
        dgl.f21002d.execute(new dgr(dgl));
    }
}
