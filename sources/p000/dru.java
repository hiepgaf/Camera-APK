package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: dru */
public final class dru {
    /* renamed from: a */
    private final ffc f3242a;
    /* renamed from: b */
    private final fjd f3243b;

    dru(ffc ffc, fjd fjd) {
        this.f3242a = ffc;
        this.f3243b = fjd;
    }

    /* renamed from: a */
    public final fjs m1670a(long j) {
        fjr fjr;
        fiw fjp = new fjp(j);
        this.f3243b.m15681a(fjp);
        fjs[] fjsArr = new fjs[2];
        fjsArr[0] = fjp;
        if (this.f3242a.mo1937s()) {
            fjr = new fjr(CaptureResult.CONTROL_AF_STATE, keu.m13475a(Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(2), Integer.valueOf(6)));
        } else {
            fjr = new fjq();
        }
        fjsArr[1] = fjr;
        return new fjo(fjsArr);
    }
}
