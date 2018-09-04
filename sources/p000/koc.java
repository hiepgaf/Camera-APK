package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: koc */
abstract class koc extends koe implements Runnable {
    /* renamed from: a */
    public keh f19240a;
    /* renamed from: b */
    public final boolean f19241b;
    /* renamed from: d */
    private final boolean f19242d = true;
    /* renamed from: e */
    private final /* synthetic */ kob f19243e;

    koc(kob kob, keh keh, boolean z) {
        this.f19243e = kob;
        super(keh.size());
        this.f19240a = (keh) jri.m13152b((Object) keh);
        this.f19241b = z;
    }

    /* renamed from: a */
    abstract void mo3248a(boolean z, int i, Object obj);

    /* renamed from: b */
    abstract void mo3249b();

    /* renamed from: a */
    final void mo2199a(Set set) {
        if (!this.f19243e.isCancelled()) {
            kob.m18051a(set, ((knn) this.f19243e.value).f8378b);
        }
    }

    /* renamed from: a */
    final void m13605a() {
        boolean z;
        int i = 0;
        int a = koe.f8390c.mo2200a(this);
        if (a >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "Less than 0 remaining futures");
        if (a == 0) {
            if ((this.f19242d & (this.f19241b ^ 1)) != 0) {
                Iterator c = this.f19240a.mo2144c();
                while (c.hasNext()) {
                    a = i + 1;
                    m13606a(i, (kpk) c.next());
                    i = a;
                }
            }
            mo3249b();
        }
    }

    /* renamed from: a */
    private final void m13603a(Throwable th) {
        int a;
        int i = 1;
        jri.m13152b((Object) th);
        if (this.f19241b) {
            a = this.f19243e.m17780a(th);
            if (a != 0) {
                mo3250d();
            } else {
                Set set = this.seenExceptions;
                if (set == null) {
                    set = Collections.newSetFromMap(new ConcurrentHashMap());
                    mo2199a(set);
                    koe.f8390c.mo2201a(this, set);
                    set = this.seenExceptions;
                }
                i = kob.m18051a(set, th);
            }
        } else {
            a = 0;
        }
        boolean z = th instanceof Error;
        if (((((a ^ 1) & this.f19241b) & i) | z) != 0) {
            String str;
            if (z) {
                str = "Input Future failed with Error";
            } else {
                str = "Got more than one input Future failure. Logging failures after the first";
            }
            kob.f23607e.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture$RunningState", "handleException", str, th);
        }
    }

    /* renamed from: a */
    final void m13606a(int i, Future future) {
        boolean z = false;
        if (this.f19241b) {
            z = true;
        } else if (!this.f19243e.isDone()) {
            z = true;
        } else if (this.f19243e.isCancelled()) {
            z = true;
        }
        jri.m13154b(z, (Object) "Future was done before all dependencies completed");
        try {
            jri.m13154b(future.isDone(), (Object) "Tried to set value from future which is not done");
            if (this.f19241b) {
                if (future.isCancelled()) {
                    knk knk = this.f19243e;
                    knk.f23608f = null;
                    knk.cancel(false);
                    return;
                }
                Object b = kow.m13623b(future);
                if (this.f19242d) {
                    mo3248a(this.f19241b, i, b);
                }
            } else if (this.f19242d && !future.isCancelled()) {
                mo3248a(this.f19241b, i, kow.m13623b(future));
            }
        } catch (ExecutionException e) {
            m13603a(e.getCause());
        } catch (Throwable th) {
            m13603a(th);
        }
    }

    /* renamed from: c */
    static void m13604c() {
    }

    /* renamed from: d */
    void mo3250d() {
        this.f19240a = null;
    }

    public final void run() {
        m13605a();
    }
}
