package p000;

/* compiled from: PG */
/* renamed from: dqp */
public final class dqp implements dqo {
    /* renamed from: a */
    private final Object f14262a = new Object();
    /* renamed from: b */
    private long f14263b = -1;

    /* renamed from: a */
    public final long mo1168a(long j) {
        long j2;
        synchronized (this.f14262a) {
            j2 = this.f14263b;
            this.f14263b = Math.max(j2, j);
        }
        return j2;
    }
}
