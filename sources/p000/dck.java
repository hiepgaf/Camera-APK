package p000;

import android.view.accessibility.AccessibilityManager;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: dck */
final class dck implements dbw {
    /* renamed from: a */
    public final /* synthetic */ dch f20925a;

    dck(dch dch) {
        this.f20925a = dch;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2951a(Object obj) {
        daw daw = (daw) obj;
        fbj fbj = daw.f2917a;
        bug bug = this.f20925a;
        if (bug.f20918h) {
            fbj.close();
            return new dbx(this.f20925a, (byte) 0);
        }
        ikb b = ((dbu) bug.m991d()).mo2936l().m4140b();
        ((dbu) this.f20925a.m991d()).mo2908G().execute(new dcm(this, b));
        b.mo1879a(((dbu) this.f20925a.m991d()).mo2902A().mo354a(fbj, this.f20925a.f20916f, fbj.mo2855a().f4455c, kbg.m4745c(fbj.mo2855a().f4457e), ilq.m3818a(Boolean.valueOf(false))));
        cwc cwc = daw.f2918b;
        AccessibilityManager a = ((dbu) this.f20925a.m991d()).mo2925a();
        bqq t = ((dbu) this.f20925a.m991d()).mo2944t();
        bug = this.f20925a;
        ffc ffc = bug.f20916f;
        gci L = ((dbu) bug.m991d()).mo2913L();
        brp brp = ((dbu) this.f20925a.m991d()).mo2929e().mo2757l().f14920m;
        ((dbu) this.f20925a.m991d()).mo2948x();
        ((dbu) this.f20925a.m991d()).mo2940p();
        Object czp = new czp(a, t, ffc, L, cwc, brp, false, this.f20925a.f20916f.mo1933o());
        b.mo1879a(fbj.mo2855a().f4457e.mo2859a(czp, ((dbu) this.f20925a.m991d()).mo2908G()));
        czp.m8904a(cwc.f2818d.f6105a);
        b.mo1879a(fbj.mo2855a().f4460h.mo2859a(new dcl(this), Executors.newSingleThreadExecutor(iel.m3721c("IntHdrFl", 0))));
        dch dch = this.f20925a;
        iur iur = dch.f20915e;
        return new dei(this.f20925a, dbo.m15270a(new dbs(fbj, dch.f20914d, dch.f20916f, dch.f20917g, dch.f20919i, dch.f20921k, b), ((dbu) this.f20925a.m991d()).mo2927c(), ((dbu) this.f20925a.m991d()).mo2946v(), ((dbu) this.f20925a.m991d()).mo2947w(), ((dbu) this.f20925a.m991d()).mo2908G(), ((dbu) this.f20925a.m991d()).mo2935k(), ((dbu) this.f20925a.m991d()).mo2909H(), ((dbu) this.f20925a.m991d()).mo2907F(), ((dbu) this.f20925a.m991d()).mo2913L(), ((dbu) this.f20925a.m991d()).mo2928d(), ((dbu) this.f20925a.m991d()).mo2903B(), ((dbu) this.f20925a.m991d()).mo2921T(), ((dbu) this.f20925a.m991d()).mo2938n(), ((dbu) this.f20925a.m991d()).mo2918Q()));
    }
}
