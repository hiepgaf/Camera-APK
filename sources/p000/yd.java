package p000;

/* compiled from: PG */
/* renamed from: yd */
final class yd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ yl f9528a;
    /* renamed from: b */
    private final /* synthetic */ xt f9529b;

    yd(xt xtVar, yl ylVar) {
        this.f9529b = xtVar;
        this.f9528a = ylVar;
    }

    public final void run() {
        this.f9529b.f19698c.f19684c.m77b(-16);
        this.f9529b.f19698c.f19683b.obtainMessage(601, this.f9528a).sendToTarget();
    }
}
