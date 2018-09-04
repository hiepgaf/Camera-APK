package p000;

/* compiled from: PG */
/* renamed from: gjk */
public final class gjk implements fel {
    /* renamed from: a */
    public static final String f16976a = bli.m862a("SelfieFlashSwitch");
    /* renamed from: b */
    public final gkb f16977b;
    /* renamed from: c */
    public kpw f16978c;
    /* renamed from: d */
    public boolean f16979d = false;
    /* renamed from: e */
    private final ikd f16980e;
    /* renamed from: f */
    private int f16981f;
    /* renamed from: g */
    private final Object f16982g = new Object();

    public gjk(gkb gkb, ikd ikd) {
        this.f16977b = gkb;
        this.f16980e = ikd;
        this.f16978c = kpw.m18056d();
        this.f16978c.mo3557a(new gkc());
    }

    /* renamed from: a */
    public final fem mo1361a(fip fip, fim fim) {
        Object gjp = new gjp(this, fip, new fio(fim));
        try {
            bli.m869c(f16976a, "acquiring selfie flash");
            synchronized (this.f16982g) {
                this.f16981f++;
                if (this.f16981f == 1) {
                    bli.m869c(f16976a, "first active selfie flash request");
                    kpk d = kpw.m18056d();
                    this.f16980e.execute(new gjm(this, d));
                    gkc gkc = (gkc) d.get();
                    this.f16978c = kpw.m18056d();
                    fyu.m2422a(gkc.f5280a, gjp.mo3033a(fim), fip);
                }
            }
        } catch (Throwable e) {
            bli.m867b(f16976a, "Couldn't turn on selfie flash", e);
            gjp.close();
        }
        return gjp;
    }

    /* renamed from: c */
    public final void mo1362c() {
        synchronized (this.f16982g) {
            bli.m869c(f16976a, "resetting selfie flash");
            this.f16981f--;
            if (this.f16981f == 0) {
                bli.m869c(f16976a, "no more active selfie flash requests");
                this.f16980e.execute(new gjl(this));
            }
        }
    }
}
