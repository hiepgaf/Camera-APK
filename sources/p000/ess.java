package p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: ess */
public class ess implements eyu {
    /* renamed from: a */
    public static final String f15486a = ess.class.getSimpleName();
    /* renamed from: b */
    private final eyu f15487b;
    /* renamed from: c */
    private final kpk f15488c;

    public ess(kpk kpk, fah fah, eyu eyu) {
        this.f15487b = eyu;
        this.f15488c = kpk;
    }

    /* renamed from: a */
    public final void mo1290a() {
        this.f15487b.mo1290a();
    }

    /* renamed from: a */
    public final void mo1291a(long j) {
        kow.m13622a(this.f15488c, new est(), kpq.f8410a);
        kpk kpk = this.f15488c;
        kow.m13622a(ezu.m2204a(kpk, 10000, new Handler(Looper.getMainLooper())), new ezs(kpk, new Throwable()), kpq.f8410a);
        this.f15487b.mo1291a(j);
    }
}
