package p000;

/* compiled from: PG */
/* renamed from: jaj */
final class jaj implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Object f7610a;
    /* renamed from: b */
    private final /* synthetic */ jai f7611b;

    jaj(jai jai, Object obj) {
        this.f7611b = jai;
        this.f7610a = obj;
    }

    public final void run() {
        try {
            jai jai = this.f7611b;
            jai.f7605b.mo1984a(this.f7610a, jai.f7607d, jai.f7608e, jai.f7604a);
        } catch (Throwable th) {
            this.f7611b.m4378a(th);
        }
    }
}
