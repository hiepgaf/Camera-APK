package p000;

/* compiled from: PG */
/* renamed from: fpg */
final class fpg implements fux {
    /* renamed from: a */
    private final fux f21381a;
    /* renamed from: b */
    private final /* synthetic */ fpf f21382b;

    fpg(fpf fpf, fux fux) {
        this.f21382b = fpf;
        this.f21381a = fux;
    }

    /* renamed from: a */
    public final void mo2642a(iwz iwz, kpk kpk) {
        if (this.f21382b.f16303a.contains(Integer.valueOf(iwz.mo2716c()))) {
            this.f21381a.mo2642a(iwz, kpk);
        } else {
            iwz.close();
        }
    }

    public final void close() {
        this.f21381a.close();
    }
}
