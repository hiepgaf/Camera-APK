package p000;

/* compiled from: PG */
/* renamed from: ckn */
public final class ckn implements jqw {
    /* renamed from: a */
    public final fkp f12108a;
    /* renamed from: b */
    public final chs f12109b;

    public ckn(chs chs) {
        jri.m13152b((Object) chs);
        this.f12108a = null;
        this.f12109b = chs;
    }

    public ckn(fkp fkp) {
        jri.m13152b((Object) fkp);
        this.f12108a = fkp;
        this.f12109b = null;
    }

    public final void close() {
        fkp fkp = this.f12108a;
        if (fkp != null) {
            fkp.close();
        }
    }

    /* renamed from: a */
    public final int mo703a() {
        fkp fkp = this.f12108a;
        return fkp == null ? this.f12109b.f1997d : fkp.mo2717d();
    }

    /* renamed from: b */
    public final int mo704b() {
        fkp fkp = this.f12108a;
        return fkp == null ? this.f12109b.f1996c : fkp.mo2720g();
    }
}
