package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: ezu */
public final class ezu {
    /* renamed from: a */
    private static final String f4387a = bli.m862a("TimedFutures");

    /* renamed from: a */
    public static kpk m2204a(kpk kpk, long j, Handler handler) {
        Object obj = new Object();
        kpk d = kpw.m18056d();
        Throwable th = new Throwable();
        handler.postDelayed(new ezv(obj, d, th), j);
        kpk.mo1985a(new ezw(obj, d, th, kpk), kpq.f8410a);
        return d;
    }

    /* renamed from: a */
    static final /* synthetic */ void m2205a(Object obj, kpw kpw, Throwable th) {
        synchronized (obj) {
            if (!kpw.isDone()) {
                bli.m867b(f4387a, "Timed out future", th);
                kpw.m17780a(new aci("Future timed out", th));
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m2206a(Object obj, kpw kpw, Throwable th, kpk kpk) {
        synchronized (obj) {
            if (kpw.isDone()) {
                bli.m867b(f4387a, "Value arriving for future timed out previously", th);
                return;
            }
            kpw.mo3616b(kpk);
        }
    }
}
