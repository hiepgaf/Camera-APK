package p000;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: fng */
public final class fng implements iqo {
    /* renamed from: a */
    private final Object f16221a = new Object();
    /* renamed from: b */
    private Queue f16222b;
    /* renamed from: c */
    private final /* synthetic */ fmw f16223c;

    fng(fmw fmw, Collection collection) {
        this.f16223c = fmw;
        this.f16222b = new ArrayDeque(collection);
    }

    public final void close() {
        bbo bbo = new bbo();
        synchronized (this.f16221a) {
            bbo.addAll(this.f16222b);
            this.f16222b.clear();
        }
        bbo.close();
    }

    /* renamed from: a */
    private final fnf m10537a(long j) {
        fnf fmy;
        synchronized (this.f16221a) {
            fyr fyr;
            try {
                fyr = (fyr) this.f16222b.poll();
                try {
                    jri.m13139a((Object) fyr, (Object) "Cannot create more images than were reserved, or create images after closed");
                    fmy = new fmy(this.f16223c, this.f16223c.f16211b.mo3157a(j), fyr);
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (fyr != null) {
                        fyr.close();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                th2 = th3;
                fyr = null;
                if (fyr != null) {
                    fyr.close();
                }
                throw th2;
            }
        }
        return fmy;
    }

    /* renamed from: a */
    public final fnf m10538a(long j, iwz iwz) {
        try {
            Object a = m10537a(j);
            iuw.m4258a(iwz, a);
            fnf fnf = (fnf) jri.m13152b(a);
            return fnf;
        } finally {
            iwz.close();
        }
    }
}
