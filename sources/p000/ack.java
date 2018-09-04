package p000;

/* compiled from: PG */
/* renamed from: ack */
final class ack implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ aqd f248a;
    /* renamed from: b */
    private final /* synthetic */ acj f249b;

    ack(acj acj, aqd aqd) {
        this.f249b = acj;
        this.f248a = aqd;
    }

    public final void run() {
        if (!this.f248a.isCancelled()) {
            acj acj = this.f249b;
            aqs aqs = this.f248a;
            acj.m122a(aqs, (aqf) aqs);
        }
    }
}
