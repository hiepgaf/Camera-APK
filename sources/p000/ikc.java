package p000;

/* compiled from: PG */
/* renamed from: ikc */
public final class ikc {
    /* renamed from: a */
    private long f7044a;
    /* renamed from: b */
    private final /* synthetic */ long f7045b = 66666666;

    /* renamed from: a */
    public final synchronized long m3790a() {
        return Math.max(0, this.f7045b - (System.nanoTime() - this.f7044a));
    }

    /* renamed from: b */
    public final synchronized void m3791b() {
        this.f7044a = System.nanoTime();
    }
}
