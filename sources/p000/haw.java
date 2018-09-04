package p000;

/* compiled from: PG */
/* renamed from: haw */
final class haw implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ikd f5879a;
    /* renamed from: b */
    private final /* synthetic */ Runnable f5880b;

    haw(ikd ikd, Runnable runnable) {
        this.f5879a = ikd;
        this.f5880b = runnable;
    }

    public final void run() {
        this.f5879a.execute(this.f5880b);
    }
}
