package p000;

/* compiled from: PG */
/* renamed from: fyg */
final class fyg extends bck {
    /* renamed from: a */
    private final /* synthetic */ fyi f23220a;
    /* renamed from: b */
    private final /* synthetic */ fyd f23221b;

    fyg(fyd fyd, bbi bbi, fyi fyi) {
        this.f23221b = fyd;
        this.f23220a = fyi;
        super(bbi);
    }

    public final void close() {
        super.close();
        synchronized (this.f23221b.f16630a) {
            this.f23221b.f16632c.remove(this.f23220a);
        }
        this.f23221b.m10886g();
    }
}
