package p000;

/* compiled from: PG */
/* renamed from: dsn */
public final class dsn {
    /* renamed from: a */
    public final ffc f3273a;
    /* renamed from: b */
    private final ird f3274b;
    /* renamed from: c */
    private final ira f3275c;
    /* renamed from: d */
    private final fuw f3276d;
    /* renamed from: e */
    private final fjk f3277e;
    /* renamed from: f */
    private final fhg f3278f;
    /* renamed from: g */
    private final kpk f3279g;
    /* renamed from: h */
    private final fde f3280h;
    /* renamed from: i */
    private final dqp f3281i;
    /* renamed from: j */
    private final gjk f3282j;
    /* renamed from: k */
    private final fds f3283k = new fds();

    public dsn(ird ird, ira ira, fjk fjk, fhg fhg, kpk kpk, fde fde, fuw fuw, dqp dqp, gjk gjk, ffc ffc) {
        this.f3274b = ird;
        this.f3275c = ira;
        this.f3277e = fjk;
        this.f3278f = fhg;
        this.f3279g = kpk;
        this.f3280h = fde;
        this.f3282j = gjk;
        this.f3273a = ffc;
        this.f3276d = fuw;
        this.f3281i = dqp;
    }

    /* renamed from: a */
    public final fwl m1675a() {
        boolean z;
        fel fel;
        if (this.f3273a.mo1921c() == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        kpk a = kny.m18045a(this.f3279g, new dso(this, z), kpq.f8410a);
        fdh fdh = fdh.ANY;
        fdg b = new fdg(fdh, fdh, fdh).m2256a(fdh.CONVERGED).m2257b(fdh.LOCKED);
        ird ird = this.f3274b;
        ira ira = this.f3275c;
        dqp dqp = this.f3281i;
        fjk fjk = this.f3277e;
        fhg fhg = this.f3278f;
        kpk kpk = this.f3279g;
        fde fde = this.f3280h;
        fuw fuw = this.f3276d;
        if (z) {
            fel = this.f3282j;
        } else {
            fel = this.f3283k;
        }
        return new dsw(new drs(ird, ira, dqp, fjk, fhg, kpk, a, b, fde, fuw, fel, 1), 2, true);
    }
}
