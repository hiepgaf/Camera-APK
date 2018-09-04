package p000;

import java.util.Queue;

/* compiled from: PG */
/* renamed from: agv */
abstract class agv {
    /* renamed from: a */
    private final Queue f451a = arq.m652a(20);

    agv() {
    }

    /* renamed from: a */
    abstract ahh mo72a();

    /* renamed from: b */
    final ahh m265b() {
        ahh ahh = (ahh) this.f451a.poll();
        if (ahh == null) {
            return mo72a();
        }
        return ahh;
    }

    /* renamed from: a */
    public final void m264a(ahh ahh) {
        if (this.f451a.size() < 20) {
            this.f451a.offer(ahh);
        }
    }
}
