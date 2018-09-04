package p000;

/* compiled from: PG */
/* renamed from: fkn */
final class fkn implements kov {
    /* renamed from: a */
    private final /* synthetic */ long f16111a;
    /* renamed from: b */
    private final /* synthetic */ fkm f16112b;

    fkn(fkm fkm, long j) {
        this.f16112b = fkm;
        this.f16111a = j;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void b_(Object obj) {
        synchronized (this.f16112b.f16110b) {
            this.f16112b.f16109a.remove(Long.valueOf(this.f16111a));
        }
    }
}
