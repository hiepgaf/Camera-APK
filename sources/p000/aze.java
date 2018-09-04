package p000;

/* compiled from: PG */
/* renamed from: aze */
final class aze implements fux {
    /* renamed from: a */
    private final axm f19832a;
    /* renamed from: b */
    private final ayb f19833b;
    /* renamed from: c */
    private final fux f19834c;
    /* renamed from: d */
    private fkp f19835d;

    aze(axm axm, ayb ayb, fux fux) {
        this.f19832a = axm;
        this.f19833b = ayb;
        this.f19834c = fux;
    }

    /* renamed from: a */
    public final void mo2642a(iwz iwz, kpk kpk) {
        Object obj = 1;
        if (iwz.mo2716c() == 35) {
            if (this.f19835d != null && iwz.mo2719f() <= this.f19835d.mo2719f()) {
                obj = null;
            }
            if (obj != null) {
                iwz iuz = new iuz(iwz, 2);
                fkp fkp = this.f19835d;
                if (fkp != null) {
                    fkp.close();
                }
                this.f19835d = new fkp(new iva(iuz), kpk);
                iwz = iuz;
            }
        }
        this.f19834c.mo2642a(new iva(iwz), kpk);
    }

    public final void close() {
        if (this.f19835d != null) {
            iqm a = iqm.m4037a(((Integer) this.f19832a.m736b().mo2860b()).intValue());
            iwz iwz = this.f19835d;
            this.f19833b.mo395a(new gfw(iwz, a, iwz.m17318h()));
            this.f19835d.close();
        }
        this.f19834c.close();
    }
}
