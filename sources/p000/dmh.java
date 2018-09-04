package p000;

/* compiled from: PG */
/* renamed from: dmh */
final class dmh implements dob {
    /* renamed from: a */
    private final /* synthetic */ dmf f21107a;

    dmh(dmf dmf) {
        this.f21107a = dmf;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2951a(Object obj) {
        kpk kpk = this.f21107a.f21102i;
        if (kpk != null) {
            kpk.cancel(true);
            this.f21107a.f21102i = null;
        }
        bfe bfe = this.f21107a.f21103j;
        if (bfe != null) {
            bfe.close();
            this.f21107a.f21103j = null;
        }
        this.f21107a.f21100g = true;
        return null;
    }
}
