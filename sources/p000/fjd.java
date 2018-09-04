package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: fjd */
public final class fjd implements ilp {
    /* renamed from: a */
    private final ilb f21369a = new ilb(fds.m10234a());
    /* renamed from: b */
    private final List f21370b = new ArrayList();

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        return this.f21369a.mo2859a(iqt, executor);
    }

    /* renamed from: a */
    public final synchronized void m15681a(fiw fiw) {
        this.f21370b.add(fiw);
        this.f21369a.mo348a(fds.m10239a(this.f21370b));
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2860b() {
        return (fis) this.f21369a.mo2860b();
    }
}
