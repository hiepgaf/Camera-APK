package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ckw */
public final class ckw implements iqo {
    /* renamed from: a */
    public final bcy f12127a;
    /* renamed from: b */
    private final AtomicBoolean f12128b = new AtomicBoolean(false);

    public ckw(bcy bcy) {
        this.f12127a = bcy;
    }

    public final void close() {
        if (this.f12128b.compareAndSet(true, false)) {
            this.f12127a.mo701c();
            bcy bcy = this.f12127a;
            Exception exception = new Exception("Burst closed while running");
            bcy.mo699b();
        }
    }

    /* renamed from: a */
    public final synchronized void m8312a(int i) {
        this.f12127a.mo700b(i);
    }

    /* renamed from: a */
    public final synchronized void m8311a() {
        if (this.f12128b.compareAndSet(false, true)) {
            this.f12127a.mo698a(false);
        }
    }

    /* renamed from: b */
    public final synchronized void m8313b() {
        if (this.f12128b.compareAndSet(true, false)) {
            this.f12127a.mo701c();
        }
    }
}
