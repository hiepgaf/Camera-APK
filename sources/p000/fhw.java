package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fhw */
public final class fhw implements fhg {
    /* renamed from: a */
    public final AtomicInteger f16041a = new AtomicInteger(0);
    /* renamed from: b */
    public final ilb f16042b = new ilb(Boolean.valueOf(true));
    /* renamed from: c */
    private final fhg f16043c;

    public fhw(fhg fhg) {
        this.f16043c = fhg;
    }

    /* renamed from: a */
    public final fhh mo1382a() {
        boolean z;
        boolean z2 = true;
        int incrementAndGet = this.f16041a.incrementAndGet();
        ilb ilb = this.f16042b;
        if (incrementAndGet == 0) {
            z = true;
        } else {
            z = false;
        }
        ilb.mo348a(Boolean.valueOf(z));
        try {
            return new fhx(this, this.f16043c.mo1382a());
        } catch (InterruptedException e) {
            int decrementAndGet = this.f16041a.decrementAndGet();
            ilb ilb2 = this.f16042b;
            if (decrementAndGet != 0) {
                z2 = false;
            }
            ilb2.mo348a(Boolean.valueOf(z2));
            throw e;
        }
    }

    /* renamed from: b */
    public final ilp mo1383b() {
        return this.f16042b;
    }
}
