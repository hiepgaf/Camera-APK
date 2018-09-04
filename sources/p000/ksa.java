package p000;

/* compiled from: PG */
/* renamed from: ksa */
public final class ksa extends krz implements ktg {
    public ksa() {
        this(hqg.f23583c);
    }

    private ksa(ksb ksb) {
        super((kry) ksb);
    }

    public ksa(byte b) {
        this(hqp.f23588c);
    }

    /* renamed from: i */
    private final ksb m17998i() {
        if (this.c) {
            return (ksb) this.b;
        }
        ((ksb) this.b).f23582g.m5126d();
        return (ksb) super.mo3600e();
    }

    /* renamed from: e */
    public final /* synthetic */ kry mo3600e() {
        return m17998i();
    }

    /* renamed from: g */
    public final /* synthetic */ kte mo3544g() {
        return m17998i();
    }

    /* renamed from: h */
    public final void mo3601h() {
        if (this.c) {
            super.mo3601h();
            ((ksb) this.b).f23582g = ((ksb) this.b).f23582g.m5121a();
        }
    }

    /* renamed from: a */
    public final ksa m17999a(int i) {
        mo3601h();
        hqg hqg = (hqg) this.b;
        hqg.f23585a |= 1;
        hqg.f23586b = i;
        return this;
    }

    /* renamed from: a */
    public final ksa m18000a(krl krl, Object obj) {
        krl a = kry.m17793a(krl);
        if (a.f8439a != this.f23440a) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        mo3601h();
        krr krr = ((ksb) this.b).f23582g;
        if (krr.f8453b) {
            krr a2 = krr.m5121a();
            ((ksb) this.b).f23582g = a2;
            krr = a2;
        }
        krs krs = a.f8442d;
        if (a.f8442d.f8457c.f8614d == gcb.f5060j) {
            obj = Integer.valueOf(((kse) obj).mo1771a());
        }
        krr.m5123b(krs, obj);
        return this;
    }
}
