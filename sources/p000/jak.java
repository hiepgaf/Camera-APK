package p000;

/* compiled from: PG */
/* renamed from: jak */
final class jak implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ jar f7612a;
    /* renamed from: b */
    private final /* synthetic */ jai f7613b;

    jak(jai jai, jar jar) {
        this.f7613b = jai;
        this.f7612a = jar;
    }

    public final void run() {
        try {
            jai jai = this.f7613b;
            jai.f7606c.mo1984a(this.f7612a, jai.f7607d, jai.f7608e, jai.f7604a);
        } catch (Throwable th) {
            Throwable th2 = th;
            if (th2 != this.f7612a) {
                th2 = jar.m4390a(th2);
                kqg.m5044a(th2, this.f7612a);
            }
            this.f7613b.m4378a(th2);
        }
    }

    public final String toString() {
        return this.f7613b.f7606c.toString();
    }
}
