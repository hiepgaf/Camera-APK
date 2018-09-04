package p000;

/* compiled from: PG */
/* renamed from: zu */
final class zu implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ aaw f9596a;
    /* renamed from: b */
    private final /* synthetic */ zs f9597b;

    zu(zs zsVar, aaw aaw) {
        this.f9597b = zsVar;
        this.f9596a = aaw;
    }

    public final void run() {
        this.f9597b.mo2545c().obtainMessage(2).sendToTarget();
        this.f9597b.mo2545c().post(this.f9596a.f38a);
    }
}
