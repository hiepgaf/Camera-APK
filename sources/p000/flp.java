package p000;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* renamed from: flp */
final class flp implements fjw, iqo {
    /* renamed from: a */
    public final Object f16147a = new Object();
    /* renamed from: b */
    public final Queue f16148b = new LinkedBlockingQueue();
    /* renamed from: c */
    public boolean f16149c = false;
    /* renamed from: d */
    private final fjw f16150d;

    flp(fjw fjw) {
        this.f16150d = fjw;
    }

    /* renamed from: a */
    public final kpk mo1394a(fkp fkp) {
        Object obj;
        synchronized (this.f16147a) {
            if (this.f16149c) {
                obj = null;
            } else {
                fou fou = new fou(fkp, (fyr) this.f16148b.remove());
                fkp = null;
                obj = fou;
            }
        }
        if (fkp == null) {
            return this.f16150d.mo1394a((fkp) jri.m13152b(obj));
        }
        fkp.close();
        return kow.m13617a(null);
    }

    public final void close() {
        bbo bbo = new bbo();
        synchronized (this.f16147a) {
            this.f16149c = true;
            bbo.addAll(this.f16148b);
            this.f16148b.clear();
        }
        bbo.close();
    }

    /* renamed from: a */
    public final boolean mo1395a() {
        return this.f16150d.mo1395a();
    }
}
