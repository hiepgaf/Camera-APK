package p000;

import android.os.SystemClock;

/* renamed from: fql */
final /* synthetic */ class fql implements koj {
    /* renamed from: a */
    private final fqh f16389a;

    fql(fqh fqh) {
        this.f16389a = fqh;
    }

    /* renamed from: a */
    public final kpk mo419a(Object obj) {
        fqh fqh = this.f16389a;
        fri fri = (fri) obj;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        kpk a = fqh.f21398e.f16377d.mo1412a(fri);
        kow.m13622a(a, new fqt(fqh, fri, elapsedRealtimeNanos), kpq.f8410a);
        return a;
    }
}
