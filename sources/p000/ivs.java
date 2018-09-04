package p000;

/* compiled from: PG */
/* renamed from: ivs */
public final class ivs {
    /* renamed from: a */
    public final kpk f7498a;
    /* renamed from: b */
    private final kpk f7499b;

    public ivs(kpk kpk) {
        this(kpk, null);
    }

    public ivs(kpk kpk, kpk kpk2) {
        this.f7498a = kpk;
        this.f7499b = kpk2;
    }

    /* renamed from: a */
    public static kpk m4262a(int i, kpk kpk) {
        return kny.m18045a(kpk, new ivu(i), kpq.f8410a);
    }

    /* renamed from: a */
    public final kpk m4263a() {
        jri.m13152b(this.f7499b);
        return this.f7499b;
    }

    /* renamed from: b */
    public final boolean m4264b() {
        return this.f7499b != null;
    }

    /* renamed from: a */
    public static ivs m4261a(kpk kpk) {
        return new ivs(ivs.m4262a(-1, kpk));
    }
}
