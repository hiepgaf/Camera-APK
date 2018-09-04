package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: eey */
public final class eey extends edo implements gqm {
    /* renamed from: o */
    public gql f23458o = new gql(this.f23460q, true);
    /* renamed from: p */
    public gqn f23459p;
    /* renamed from: q */
    public gqn f23460q;
    /* renamed from: r */
    public gqn f23461r;

    public eey(ilp ilp, ehm ehm, ehu ehu, gzy gzy, edk edk) {
        super(ilp);
        this.f23459p = new gqn(new eez(this), ehm);
        this.f23460q = new gqn(new efa(this), ehu, gzy);
        this.f23461r = new gqn(new efb(this), edk);
    }

    /* renamed from: h */
    public final void mo1564h() {
        mo3005i();
    }

    /* renamed from: i */
    public final void mo3005i() {
        this.f23458o.m2729a();
        this.f23459p.mo3005i();
        this.f23460q.mo3005i();
        this.f23461r.mo3005i();
    }

    /* renamed from: a */
    public final void mo1562a() {
        super.mo1562a();
        this.f23458o.m2731b();
    }

    /* renamed from: b */
    public final void mo1563b() {
        super.mo1563b();
        this.f23458o.m2732c();
    }

    /* renamed from: s */
    public final void mo3002s() {
        if (this.f23458o.m2734e() != null) {
            ((edn) this.f23458o.m2734e().f21544a).mo3002s();
        }
    }

    /* renamed from: a */
    public final void mo3560a(kwk kwk, hdm hdm, fbr fbr, BottomBarController bottomBarController, hcd hcd, gju gju, how how, kbg kbg, bsn bsn, gwp gwp) {
        if (!this.f23458o.m2735f()) {
            super.mo3560a(kwk, hdm, fbr, bottomBarController, hcd, gju, how, kbg, bsn, gwp);
            this.f23458o.f5629a = go.bg;
        }
    }

    public final void o_() {
        if (this.f23458o.m2734e() != null) {
            ((edn) this.f23458o.m2734e().f21544a).o_();
        }
    }

    public final void p_() {
        if (this.f23458o.m2734e() != null) {
            ((edn) this.f23458o.m2734e().f21544a).p_();
        }
    }
}
