package p000;

/* compiled from: PG */
/* renamed from: fkh */
final class fkh implements fjw {
    /* renamed from: a */
    private final /* synthetic */ fki f16099a;
    /* renamed from: b */
    private final /* synthetic */ fjw f16100b;

    fkh(fki fki, fjw fjw) {
        this.f16099a = fki;
        this.f16100b = fjw;
    }

    /* renamed from: a */
    public final kpk mo1394a(fkp fkp) {
        boolean z;
        fhq a = this.f16099a.m10458a(Long.valueOf(fkp.mo2719f()));
        jri.m13152b((Object) a);
        if (a.f4562a == fkp.mo2719f()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        this.f16099a.m10460a(a);
        fkp.m17316a(fkr.f4602b, a);
        return this.f16100b.mo1394a(fkp);
    }

    /* renamed from: a */
    public final boolean mo1395a() {
        return this.f16100b.mo1395a();
    }
}
