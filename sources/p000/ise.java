package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ise */
public final class ise {
    /* renamed from: a */
    private final ScheduledExecutorService f7383a;
    /* renamed from: b */
    private final Object f7384b = new Object();
    /* renamed from: c */
    private ikb f7385c;
    /* renamed from: d */
    private ijl f7386d;

    public ise(ScheduledExecutorService scheduledExecutorService) {
        this.f7383a = scheduledExecutorService;
        this.f7385c = new ikb();
        this.f7386d = m4137a(this.f7385c);
    }

    /* renamed from: a */
    public final iqo m4138a() {
        iqo a;
        synchronized (this.f7384b) {
            a = this.f7386d.m12242a();
            if (a == null) {
                this.f7385c = new ikb();
                this.f7386d = m4137a(this.f7385c);
                a = this.f7386d.m12242a();
                jri.m13152b((Object) a);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final iqo m4139a(iqo iqo) {
        iqo a;
        synchronized (this.f7384b) {
            a = this.f7385c.mo1879a(iqo);
        }
        return a;
    }

    /* renamed from: b */
    public final ikb m4140b() {
        ikb b;
        synchronized (this.f7384b) {
            b = this.f7385c.mo1880b();
        }
        return b;
    }

    /* renamed from: a */
    private final ijl m4137a(ikb ikb) {
        ijl ijl;
        synchronized (this.f7384b) {
            ijl = new ijl(ikb, kpq.f8410a, new ikq(new ikp(this.f7383a, 1000, TimeUnit.MILLISECONDS)));
        }
        return ijl;
    }

    /* renamed from: c */
    public final boolean m4141c() {
        boolean a;
        synchronized (this.f7384b) {
            a = this.f7385c.mo3049a();
        }
        return a;
    }
}
