package p000;

/* compiled from: PG */
/* renamed from: fj */
final class fj extends fd {
    /* renamed from: a */
    private fh f21367a;

    fj(fh fhVar) {
        this.f21367a = fhVar;
    }

    /* renamed from: a */
    public final void mo1274a(ex exVar) {
        fh fhVar = this.f21367a;
        fhVar.f16007r--;
        if (fhVar.f16007r == 0) {
            fhVar.f16008s = false;
            fhVar.m2170c();
        }
        exVar.mo1374b((fc) this);
    }

    /* renamed from: c */
    public final void mo1276c() {
        fh fhVar = this.f21367a;
        if (!fhVar.f16008s) {
            fhVar.m2176f();
            this.f21367a.f16008s = true;
        }
    }
}
