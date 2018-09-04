package p000;

/* compiled from: PG */
/* renamed from: gqn */
public final class gqn implements gqi, gqm {
    /* renamed from: a */
    public final gqi f21544a;
    /* renamed from: b */
    private final gqi[] f21545b;

    public gqn(gqi gqi, gqi... gqiArr) {
        this.f21544a = gqi;
        this.f21545b = gqiArr;
    }

    /* renamed from: h */
    public final void mo1564h() {
        mo3005i();
    }

    /* renamed from: i */
    public final void mo3005i() {
        gqh.m2725a(this.f21544a);
        for (gqi a : this.f21545b) {
            gqh.m2725a(a);
        }
    }

    /* renamed from: a */
    public final void mo1562a() {
        this.f21544a.mo1562a();
        for (gqi a : this.f21545b) {
            a.mo1562a();
        }
    }

    /* renamed from: b */
    public final void mo1563b() {
        for (gqi b : this.f21545b) {
            b.mo1563b();
        }
        this.f21544a.mo1563b();
    }
}
