package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bai */
public final class bai implements bam, ivw {
    /* renamed from: b */
    private static final String f10598b = bli.m862a("AppLifetime");
    /* renamed from: a */
    public final Object f10599a = new Object();
    /* renamed from: c */
    private final ikb f10600c = new ikb();
    /* renamed from: d */
    private final Executor f10601d;
    /* renamed from: e */
    private final ScheduledExecutorService f10602e;
    /* renamed from: f */
    private final long f10603f = 1000;
    /* renamed from: g */
    private ikb f10604g = this.f10606i.mo1880b();
    /* renamed from: h */
    private ijl f10605h = m7219c(this.f10604g);
    /* renamed from: i */
    private ikb f10606i = this.f10600c.mo1880b();
    /* renamed from: j */
    private ijl f10607j = m7219c(this.f10606i);
    /* renamed from: k */
    private bcl f10608k;
    /* renamed from: l */
    private bcl f10609l;

    public bai(ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f10602e = scheduledExecutorService;
        this.f10601d = executor;
        this.f10600c.mo1879a(new bcl());
        this.f10609l = (bcl) this.f10606i.mo1879a(new bcl());
        this.f10608k = (bcl) this.f10604g.mo1879a(new bcl());
    }

    /* renamed from: a */
    public final ikb mo413a(ikb ikb) {
        ikb b = ikb.mo1880b();
        synchronized (this.f10599a) {
            if (this.f10608k.f10662a.get()) {
                this.f10604g = this.f10606i.mo1880b();
                bli.m863a(f10598b, "Creating new ForegroundLifetime");
                this.f10604g.mo1879a(bbz.m786a(f10598b, "ForegroundLifetime.close()"));
                this.f10605h = m7219c(this.f10604g);
                this.f10608k = (bcl) this.f10604g.mo1879a(new bcl());
            }
            iqo a = this.f10605h.m12242a();
            if (a != null) {
                b.mo1879a(a);
            }
        }
        return b;
    }

    /* renamed from: a */
    public final ikb mo412a() {
        return this.f10600c.mo1880b();
    }

    /* renamed from: c */
    private final ijl m7219c(ikb ikb) {
        return (ijl) ikb.mo1879a(new ijl(new baj(this, ikb), this.f10601d, new ikq(new ikp(this.f10602e, this.f10603f, TimeUnit.MILLISECONDS))));
    }

    /* renamed from: b */
    public final ikb mo415b(ikb ikb) {
        ikb b = ikb.mo1880b();
        synchronized (this.f10599a) {
            if (this.f10609l.f10662a.get()) {
                this.f10606i = this.f10600c.mo1880b();
                bli.m863a(f10598b, "Creating new VisibleLifetime");
                this.f10606i.mo1879a(bbz.m786a(f10598b, "VisibleLifetime.close()"));
                this.f10607j = m7219c(this.f10606i);
                this.f10609l = (bcl) this.f10606i.mo1879a(new bcl());
                this.f10604g = this.f10606i.mo1880b();
                bli.m863a(f10598b, "Creating new ForegroundLifetime");
                this.f10604g.mo1879a(bbz.m786a(f10598b, "ForegroundLifetime.close()"));
                this.f10605h = m7219c(this.f10604g);
                this.f10608k = (bcl) this.f10604g.mo1879a(new bcl());
            }
            iqo a = this.f10607j.m12242a();
            if (a != null) {
                b.mo1879a(a);
            }
        }
        return b;
    }

    /* renamed from: b */
    public final iji mo414b() {
        return this.f10600c;
    }

    /* renamed from: c */
    public final iji mo416c() {
        iji iji;
        synchronized (this.f10599a) {
            iji = this.f10604g;
        }
        return iji;
    }

    /* renamed from: d */
    public final iji mo417d() {
        iji iji;
        synchronized (this.f10599a) {
            iji = this.f10606i;
        }
        return iji;
    }
}
