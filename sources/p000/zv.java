package p000;

/* compiled from: PG */
/* renamed from: zv */
final class zv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zs f9598a;

    zv(zs zsVar) {
        this.f9598a = zsVar;
    }

    public final void run() {
        this.f9598a.mo2545c().removeCallbacksAndMessages(null);
        this.f9598a.mo2545c().obtainMessage(2).sendToTarget();
    }
}
