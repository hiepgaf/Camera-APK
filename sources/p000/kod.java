package p000;

/* compiled from: PG */
/* renamed from: kod */
final class kod implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f8386a;
    /* renamed from: b */
    private final /* synthetic */ kpk f8387b;
    /* renamed from: c */
    private final /* synthetic */ koc f8388c;

    kod(koc koc, int i, kpk kpk) {
        this.f8388c = koc;
        this.f8386a = i;
        this.f8387b = kpk;
    }

    public final void run() {
        try {
            this.f8388c.m13606a(this.f8386a, this.f8387b);
        } finally {
            this.f8388c.m13605a();
        }
    }
}
