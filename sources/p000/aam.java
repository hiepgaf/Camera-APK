package p000;

/* compiled from: PG */
/* renamed from: aam */
final class aam implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ boolean f24a;
    /* renamed from: b */
    private final /* synthetic */ aah f25b;

    aam(aah aah, boolean z) {
        this.f25b = aah;
        this.f24a = z;
    }

    public final void run() {
        this.f25b.mo2563b().obtainMessage(501, this.f24a, 0).sendToTarget();
    }
}
