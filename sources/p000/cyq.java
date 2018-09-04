package p000;

import android.view.accessibility.AccessibilityManager;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* renamed from: cyq */
final class cyq implements kov {
    /* renamed from: a */
    private final /* synthetic */ bcl f12857a;
    /* renamed from: b */
    private final /* synthetic */ ikb f12858b;
    /* renamed from: c */
    private final /* synthetic */ cyd f12859c;

    cyq(cyd cyd, bcl bcl, ikb ikb) {
        this.f12859c = cyd;
        this.f12857a = bcl;
        this.f12858b = ikb;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        if (th instanceof CancellationException) {
            bli.m869c(cyd.f22726c, "OneCamera open sequence was canceled, shutting down lifetime.");
        } else {
            bli.m874e(cyd.f22726c, "OneCamera failed to open, closing lifetime.", th);
        }
        this.f12858b.close();
        if (this.f12859c.f22765p.mo2084b()) {
            ((fbd) this.f12859c.f22765p.mo2081a()).m2215a();
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        fbj fbj = (fbj) obj;
        jri.m13152b((Object) fbj);
        bli.m869c(cyd.f22726c, "OneCamera started!");
        if (!this.f12857a.f10662a.get()) {
            bli.m869c(cyd.f22726c, "OneCamera started, updating UI!");
            cyd cyd = this.f12859c;
            ikb ikb = this.f12858b;
            jri.m13152b((Object) fbj);
            fbj fbj2 = cyd.f22772w;
            if (fbj2 == null || fbj2 != fbj || cyd.f22733G) {
                cyd.f22772w = fbj;
                cyd.m16994o();
                if (cyd.f22753d.mo2860b() == fxj.AUTO) {
                    cyd.m16995p();
                }
                cyd.f22733G = false;
                if (cyd.f22765p.mo2084b()) {
                    ((fbd) cyd.f22765p.mo2081a()).m2216a(cyd.f22772w.mo2855a().f4460h);
                }
                cyd.f22771v = null;
                ikb.mo1879a(cyd.f22772w);
                fbp a = cyd.f22772w.mo2855a();
                ilp a2 = ilq.m3817a(ilq.m3822a(a.f4461i, a.f4453a, cyd.f22747U), new cyk(cyd));
                asu asu = cyd.f22749W;
                asn asn = cyd.f22772w;
                ikb.mo1879a(asu.mo354a(asn, cyd.f22773x, asn.mo2855a().f4455c, kbg.m4745c(cyd.f22772w.mo2855a().f4457e), a2));
                bli.m869c(cyd.f22726c, "OneCamera created, preparing to start OneCamera");
                cyd.f22768s.mo2757l();
                ebd.m9598i();
                cyd.f22768s.mo2757l().m9609c();
                cyd.f22768s.mo2757l().m9608b(true);
                cyd.f22768s.mo2757l().m9618h();
                cyd.f22768s.mo2757l().m9617g();
                ((ayb) cyd.f22731E.mo345a()).mo396a(cyd.f22773x.mo1922d());
                a = cyd.f22772w.mo2855a();
                cyd.f22736J.m15236c(a.f4453a);
                ikb.mo1879a(a2.mo2859a(new cyl(cyd), cyd.f22754e));
                ikb.mo1879a(a.f4456d.mo2859a(new cym(cyd), cyd.f22754e));
                ikb.mo1879a(a.f4454b.mo2859a(new cyn(cyd), cyd.f22754e));
                AccessibilityManager accessibilityManager = cyd.f22730D;
                bqq bqq = cyd.f22727A;
                ffc ffc = cyd.f22773x;
                gci gci = cyd.f22755f;
                cwc cwc = cyd.f22770u;
                brp brp = cyd.f22768s.mo2757l().f14920m;
                bsn bsn = cyd.f22729C;
                bmb bmb = cyd.f22763n;
                cyd.f22728B = new czp(accessibilityManager, bqq, ffc, gci, cwc, brp, false, cyd.f22773x.mo1933o());
                ikb.mo1879a(cyd.f22772w.mo2855a().f4457e.mo2859a(cyd.f22728B, cyd.f22754e));
                cyd.f22728B.m8904a(cyd.f22770u.f2818d.f6105a);
                cyd.m16992m();
                if (!((Boolean) cyd.f22748V.f21734c).booleanValue()) {
                    cyd.f22748V.mo348a(Boolean.valueOf(true));
                }
            }
        }
    }
}
