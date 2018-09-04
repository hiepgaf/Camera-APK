package p000;

/* compiled from: PG */
/* renamed from: cij */
final class cij implements koj {
    /* renamed from: a */
    public final /* synthetic */ cig f12034a;
    /* renamed from: b */
    private final /* synthetic */ ikd f12035b;

    cij(cig cig, ikd ikd) {
        this.f12034a = cig;
        this.f12035b = ikd;
    }

    /* renamed from: a */
    public final /* synthetic */ kpk mo419a(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return kow.m13617a(Boolean.valueOf(false));
        }
        kpk a;
        gqw gqw = this.f12034a.f2054u;
        if (gqw.f5643b == null) {
            gqw.m2742b();
        } else if (gqw.f5642a.mo2084b()) {
            gqw.f5643b.f22407g = (float) (System.currentTimeMillis() - ((Long) gqw.f5642a.mo2081a()).longValue());
        }
        chf chf = (chf) this.f12034a.f2045l.getAndSet(null);
        if (chf == null) {
            a = kow.m13618a(new RuntimeException("Trying to stop a burst when none is running."));
        } else {
            ikd.m12259a();
            chf.f11944c.set(true);
            a = chf.f11945d;
        }
        kow.m13622a(a, new cik(this), this.f12035b);
        return a;
    }
}
