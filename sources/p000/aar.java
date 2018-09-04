package p000;

/* compiled from: PG */
/* renamed from: aar */
final class aar implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ aaw f35a;
    /* renamed from: b */
    private final /* synthetic */ aah f36b;

    aar(aah aah, aaw aaw) {
        this.f36b = aah;
        this.f35a = aaw;
    }

    public final void run() {
        this.f36b.mo2563b().obtainMessage(103, this.f35a).sendToTarget();
    }
}
