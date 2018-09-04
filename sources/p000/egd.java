package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: egd */
public final class egd extends ehu implements gqm {
    /* renamed from: a */
    public gql f23146a = new gql(this.f23147b, true);
    /* renamed from: b */
    public gqn f23147b;
    /* renamed from: c */
    public gqn f23148c;

    public egd(eih eih, ilp ilp, ilp ilp2, bxj bxj, edk edk, eil eil) {
        super(eih, ilp, ilp2, bxj);
        this.f23147b = new gqn(new ege(this), edk);
        this.f23148c = new gqn(new egf(this), eil);
    }

    /* renamed from: h */
    public final void mo1564h() {
        mo3005i();
    }

    /* renamed from: i */
    public final void mo3005i() {
        this.f23146a.m2729a();
        this.f23147b.mo3005i();
        this.f23148c.mo3005i();
    }

    /* renamed from: a */
    public final void mo1562a() {
        super.mo1562a();
        this.f23146a.m2731b();
    }

    /* renamed from: b */
    public final void mo1563b() {
        super.mo1563b();
        this.f23146a.m2732c();
    }

    /* renamed from: a */
    public final void mo3432a(BottomBarController bottomBarController, hcd hcd, how how, gyz gyz) {
        if (!this.f23146a.m2735f()) {
            super.mo3432a(bottomBarController, hcd, how, gyz);
            this.f23146a.f5629a = go.bg;
        }
    }

    /* renamed from: K */
    public final void mo3016K() {
        if (this.f23146a.m2734e() != null) {
            ((gqj) this.f23146a.m2734e().f21544a).mo3016K();
        }
    }

    /* renamed from: L */
    public final void mo3015L() {
        if (this.f23146a.m2734e() != null) {
            ((gqj) this.f23146a.m2734e().f21544a).mo3015L();
        }
    }
}
