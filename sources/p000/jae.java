package p000;

/* compiled from: PG */
/* renamed from: jae */
final class jae implements Runnable {
    /* renamed from: a */
    private final kpk f7602a;
    /* renamed from: b */
    private final izh f7603b;

    public jae(kpk kpk, izh izh) {
        this.f7602a = kpk;
        this.f7603b = izh;
    }

    public final void run() {
        try {
            kow.m13625c(this.f7602a);
        } catch (kqe e) {
            this.f7603b.mo1972a(jar.m4390a(e.getCause()));
        }
    }
}
