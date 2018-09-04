package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* renamed from: kqb */
final class kqb extends knt implements RunnableFuture {
    /* renamed from: e */
    private volatile kpi f23612e;

    kqb(koi koi) {
        this.f23612e = new kqc(this, koi);
    }

    private kqb(Callable callable) {
        this.f23612e = new kqd(this, callable);
    }

    /* renamed from: a */
    protected final void mo3613a() {
        super.mo3613a();
        if (m17783c()) {
            kpi kpi = this.f23612e;
            if (kpi != null) {
                Runnable runnable = (Runnable) kpi.get();
                if ((runnable instanceof Thread) && kpi.compareAndSet(runnable, kpi.f8404b)) {
                    ((Thread) runnable).interrupt();
                    kpi.set(kpi.f8403a);
                }
            }
        }
        this.f23612e = null;
    }

    /* renamed from: a */
    static kqb m18060a(Runnable runnable, Object obj) {
        return new kqb(Executors.callable(runnable, obj));
    }

    /* renamed from: a */
    static kqb m18061a(Callable callable) {
        return new kqb(callable);
    }

    /* renamed from: b */
    protected final String mo3614b() {
        kpi kpi = this.f23612e;
        if (kpi == null) {
            return super.mo3614b();
        }
        String valueOf = String.valueOf(kpi);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 7);
        stringBuilder.append("task=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void run() {
        kpi kpi = this.f23612e;
        if (kpi != null) {
            kpi.run();
        }
        this.f23612e = null;
    }
}
