package p000;

/* compiled from: PG */
/* renamed from: aak */
final class aak implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f18a;
    /* renamed from: b */
    private final /* synthetic */ boolean f19b = false;
    /* renamed from: c */
    private final /* synthetic */ aah f20c;

    aak(aah aah, int i) {
        this.f20c = aah;
        this.f18a = i;
    }

    public final void run() {
        this.f20c.mo2563b().obtainMessage(502, this.f18a, 0).sendToTarget();
    }
}
