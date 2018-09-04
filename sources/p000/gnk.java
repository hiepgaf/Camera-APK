package p000;

/* compiled from: PG */
/* renamed from: gnk */
public final class gnk implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ byte[] f5507a;
    /* renamed from: b */
    private final /* synthetic */ int f5508b;
    /* renamed from: c */
    private final /* synthetic */ gnh f5509c;

    public gnk(gnh gnh, byte[] bArr, int i) {
        this.f5509c = gnh;
        this.f5507a = bArr;
        this.f5508b = i;
    }

    public final void run() {
        synchronized (this.f5509c.f5498a) {
            for (glq a : this.f5509c.f5498a) {
                a.mo586a(this.f5507a, this.f5508b);
            }
        }
    }
}
