package p000;

/* compiled from: PG */
/* renamed from: dsw */
public final class dsw implements fwl {
    /* renamed from: a */
    private fwl f14408a;
    /* renamed from: b */
    private boolean f14409b;
    /* renamed from: c */
    private int f14410c;

    static {
        bli.m862a("UsgStatsImgCapCmd");
    }

    public dsw(fwl fwl, int i, boolean z) {
        this.f14408a = (fwl) jri.m13152b((Object) fwl);
        this.f14410c = i;
        this.f14409b = z;
    }

    /* renamed from: a */
    public final ilp mo1170a() {
        return this.f14408a.mo1170a();
    }

    /* renamed from: b */
    public final ilp mo1172b() {
        return this.f14408a.mo1172b();
    }

    /* renamed from: a */
    public final void mo1171a(fwm fwm, fwa fwa) {
        fwa.f4753b.mo1482h().mo1521a(this.f14409b);
        fwa.f4753b.mo2862a(this.f14410c);
        this.f14408a.mo1171a(fwm, fwa);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14408a.toString());
        String str = "UsageStats for ";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }
}
