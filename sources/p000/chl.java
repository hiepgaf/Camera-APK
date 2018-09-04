package p000;

/* compiled from: PG */
/* renamed from: chl */
final class chl extends izy {
    /* renamed from: a */
    private final /* synthetic */ chj f20307a;

    chl(chj chj) {
        this.f20307a = chj;
    }

    public final /* synthetic */ void a_(Object obj) {
        jar jar = (jar) obj;
        bli.m863a(chj.f11961a, "processBurstResults : stopping previewer with error");
        this.f20307a.f11983l.mo1903a("BurstControllerImpl#processBurstResults_stopPreviewWithError");
        try {
            this.f20307a.f11980i.m8313b();
            ckw ckw = this.f20307a.f11980i;
            jar.getCause();
            ckw.f12127a.mo699b();
            bli.m863a(chj.f11961a, "processBurstResults : handling exception");
            this.f20307a.f11983l.mo1903a("BurstControllerImpl#processBurstResults_handleException");
            try {
                this.f20307a.m8202b();
                this.f20307a.f11974c.m1159a(jar);
            } finally {
                this.f20307a.f11983l.mo1904b();
            }
        } finally {
            this.f20307a.f11983l.mo1904b();
        }
    }
}
