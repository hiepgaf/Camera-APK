package p000;

/* compiled from: PG */
/* renamed from: fhp */
public final class fhp implements fhg {
    /* renamed from: a */
    private final kpk f16031a;
    /* renamed from: b */
    private final ilp f16032b;

    public fhp(kpk kpk) {
        this.f16031a = kpk;
        ilp a = ilq.m3821a(kpk);
        kow.m13622a(kpk, new fmx(new ilb(ilq.m3818a(Boolean.valueOf(false)))), kpq.f8410a);
        this.f16032b = ilq.m3834b(a, ilq.m3814a(r1));
    }

    /* renamed from: a */
    public final fhh mo1382a() {
        try {
            return ((fhg) this.f16031a.get()).mo1382a();
        } catch (Throwable e) {
            throw new isr(e);
        }
    }

    /* renamed from: b */
    public final ilp mo1383b() {
        return this.f16032b;
    }
}
