package p000;

import android.view.Window;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: eem */
public final class eem extends edf implements gqm {
    /* renamed from: n */
    public gql f23108n;
    /* renamed from: o */
    public gqn f23109o;
    /* renamed from: p */
    public gqn f23110p = new gqn(new eeo(this), new gqi[0]);
    /* renamed from: q */
    public gqn f23111q;
    /* renamed from: r */
    public gqn f23112r;

    public eem(eih eih, ilp ilp, boolean z, edo edo, ecd ecd, ehp ehp, ehg ehg) {
        super(eih, ilp, z);
        this.f23109o = new gqn(new een(this), edo, ecd);
        this.f23111q = new gqn(new eep(this), ehp);
        this.f23112r = new gqn(new eeq(this), ehg);
        this.f23108n = new gql(this.f23109o, true);
    }

    /* renamed from: h */
    public final void mo1564h() {
        mo3005i();
    }

    /* renamed from: i */
    public final void mo3005i() {
        this.f23108n.m2729a();
        this.f23109o.mo3005i();
        this.f23110p.mo3005i();
        this.f23111q.mo3005i();
        this.f23112r.mo3005i();
    }

    /* renamed from: a */
    public final void mo1562a() {
        super.mo1562a();
        this.f23108n.m2731b();
    }

    /* renamed from: b */
    public final void mo1563b() {
        super.mo1563b();
        this.f23108n.m2732c();
    }

    /* renamed from: s */
    public final void mo3002s() {
        if (this.f23108n.m2734e() != null) {
            ((gqj) this.f23108n.m2734e().f21544a).mo3002s();
        }
    }

    /* renamed from: a */
    public final void mo3426a(kwk kwk, Window window, BottomBarController bottomBarController, hcd hcd, how how, gwp gwp, fbr fbr, bxj bxj) {
        if (!this.f23108n.m2735f()) {
            super.mo3426a(kwk, window, bottomBarController, hcd, how, gwp, fbr, bxj);
            this.f23108n.f5629a = go.bg;
        }
    }

    /* renamed from: a */
    public final void mo2999a(boolean z) {
        if (this.f23108n.m2734e() != null) {
            ((gqj) this.f23108n.m2734e().f21544a).mo2999a(z);
        }
    }

    /* renamed from: q */
    public final void mo3000q() {
        if (this.f23108n.m2734e() != null) {
            ((gqj) this.f23108n.m2734e().f21544a).mo3000q();
        }
    }

    /* renamed from: r */
    public final void mo3001r() {
        if (this.f23108n.m2734e() != null) {
            ((gqj) this.f23108n.m2734e().f21544a).mo3001r();
        }
    }
}
