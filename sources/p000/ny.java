package p000;

/* compiled from: PG */
/* renamed from: ny */
final class ny extends kh {
    /* renamed from: a */
    private boolean f22483a = false;
    /* renamed from: b */
    private int f22484b = 0;
    /* renamed from: c */
    private final /* synthetic */ nx f22485c;

    ny(nx nxVar) {
        this.f22485c = nxVar;
    }

    /* renamed from: b */
    public final void mo2167b() {
        int i = this.f22484b + 1;
        this.f22484b = i;
        if (i == this.f22485c.f8984a.size()) {
            kg kgVar = this.f22485c.f8985b;
            if (kgVar != null) {
                kgVar.mo2167b();
            }
            this.f22484b = 0;
            this.f22483a = false;
            this.f22485c.f8986c = false;
        }
    }

    /* renamed from: c */
    public final void mo2168c() {
        if (!this.f22483a) {
            this.f22483a = true;
            kg kgVar = this.f22485c.f8985b;
            if (kgVar != null) {
                kgVar.mo2168c();
            }
        }
    }
}
