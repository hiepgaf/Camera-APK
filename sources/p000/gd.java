package p000;

import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* renamed from: gd */
final class gd extends gk implements Runnable {
    /* renamed from: a */
    public boolean f16797a;
    /* renamed from: h */
    private final CountDownLatch f16798h = new CountDownLatch(1);
    /* renamed from: i */
    private final /* synthetic */ gc f16799i;

    gd(gc gcVar) {
        this.f16799i = gcVar;
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo1457a() {
        return m10983d();
    }

    /* renamed from: d */
    private final Object m10983d() {
        try {
            return this.f16799i.mo3192b();
        } catch (hi e) {
            if (this.f5278f.get()) {
                return null;
            }
            throw e;
        }
    }

    /* renamed from: b */
    protected final void mo1459b() {
        try {
            this.f16799i.m10945a(this);
        } finally {
            this.f16798h.countDown();
        }
    }

    /* renamed from: a */
    protected final void mo1458a(Object obj) {
        try {
            gf gfVar = this.f16799i;
            if (gfVar.f16733a != this) {
                gfVar.m10945a(this);
            } else if (!gfVar.f5128f) {
                SystemClock.uptimeMillis();
                gfVar.f16733a = null;
                gfVar.mo3193b(obj);
            }
            this.f16798h.countDown();
        } catch (Throwable th) {
            this.f16798h.countDown();
        }
    }

    public final void run() {
        this.f16797a = false;
        this.f16799i.m10944a();
    }
}
