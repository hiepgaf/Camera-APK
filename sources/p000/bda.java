package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bda */
final class bda implements fyr {
    /* renamed from: a */
    private final AtomicBoolean f19879a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ bcz f19880b;

    bda(bcz bcz) {
        this.f19880b = bcz;
    }

    public final void close() {
        if (!this.f19879a.getAndSet(true)) {
            ilb ilb = this.f19880b;
            synchronized (ilb.f22608a) {
                ilb.mo348a(Integer.valueOf(((Integer) ilb.f21734c).intValue() - 1));
            }
        }
    }
}
