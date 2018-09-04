package p000;

/* compiled from: PG */
/* renamed from: chm */
final class chm extends izy {
    /* renamed from: a */
    private final /* synthetic */ dpu f20308a;
    /* renamed from: b */
    private final /* synthetic */ chj f20309b;

    chm(chj chj, dpu dpu) {
        this.f20309b = chj;
        this.f20308a = dpu;
    }

    public final /* synthetic */ void a_(Object obj) {
        jrg jrg = (jrg) obj;
        bli.m863a(chj.f11961a, "processBurstResults : stopping previewer");
        chj chj = this.f20309b;
        if (chj.f11984m) {
            throw new IllegalStateException("Analysis encountered an error!");
        }
        chj.f11983l.mo1903a("BurstControllerImpl#processBurstResults_stopPreview");
        try {
            this.f20309b.f11980i.m8313b();
            this.f20309b.f11980i.m8312a(jrg.m13136f());
            bli.m863a(chj.f11961a, "processBurstResults : populating results");
            this.f20309b.f11983l.mo1903a("BurstControllerImpl#processBurstResults_populateResults");
            try {
                this.f20309b.m8200a(jrg, this.f20308a);
            } finally {
                this.f20309b.f11983l.mo1904b();
            }
        } finally {
            this.f20309b.f11983l.mo1904b();
        }
    }
}
