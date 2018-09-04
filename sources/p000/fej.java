package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: fej */
public final class fej implements fde {
    /* renamed from: a */
    private final iqz f15915a;
    /* renamed from: b */
    private final ird f15916b;

    fej(ird ird, ira ira) {
        this.f15916b = ird;
        this.f15915a = ira.mo511a("Simultaneous3A");
    }

    /* renamed from: a */
    public final fdf mo1357a(fip fip, fdg fdg, fim fim) {
        Object fec = new fec(fip, fdg, new fio(fim), this.f15916b, this.f15915a);
        try {
            Object obj;
            iqz iqz = this.f15915a;
            String valueOf = String.valueOf(fdg);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
            stringBuilder.append("Acquiring 3A Lock: ");
            stringBuilder.append(valueOf);
            iqz.mo514b(stringBuilder.toString());
            fdh fdh = fdg.f4478b;
            int i;
            if (fdh == fdh.CONVERGED) {
                i = 1;
            } else if (fdh != fdh.LOCKED) {
                obj = null;
            } else {
                i = 1;
            }
            fdh fdh2 = fdg.f4477a;
            fdh fdh3 = fdh.CONVERGED;
            if (fdg.f4479c != fdh.CONVERGED) {
                Object obj2 = null;
            } else {
                int i2 = 1;
            }
            if (!(obj == null && fdh2 != fdh3 && r1 == null)) {
                fdx fdx;
                fdx fdx2;
                fdx a;
                fdx fbt;
                ird ird;
                long b;
                long j;
                long j2;
                fec.f15898b.mo519e("waitForConvergence");
                fio fio = new fio(fec.f15901e);
                fio fio2 = new fio(fec.f15901e);
                if (fec.f15899c.f4478b == fdh.ANY) {
                    fdx = null;
                } else {
                    fdx = fec.m10265b(fec.f15899c.f4478b, fio, fio2);
                }
                if (fec.f15899c.f4477a == fdh.ANY) {
                    fdx2 = null;
                } else {
                    fdx2 = fec.m10263a(fec.f15899c.f4477a, fio, fio2);
                }
                if (fec.f15899c.f4479c != fdh.ANY) {
                    a = fec.m10261a(fio, fio2);
                } else {
                    a = null;
                }
                if (fec.f15899c.f4477a == fdh.CONVERGED) {
                    Key key = CaptureRequest.CONTROL_AE_LOCK;
                    Boolean valueOf2 = Boolean.valueOf(false);
                    fio.m2303a(key, valueOf2);
                    fio2.m2303a(CaptureRequest.CONTROL_AE_LOCK, valueOf2);
                    fbt = new fbt();
                    fio2.m2307a(fds.m10251c(fbt));
                } else {
                    fbt = null;
                }
                fec.f15897a.mo1903a("SubmitIdle");
                fec.f15900d.mo1381a(Collections.singletonList(fio2.m2301a()), fiv.REPEATING);
                fec.f15897a.mo1904b();
                if (fbt != null) {
                    fec.f15897a.mo1903a("UnlockAE");
                    fbt.mo3032a();
                    fec.f15897a.mo1904b();
                }
                fec.f15897a.mo1903a("SubmitTrigger");
                fec.f15900d.mo1381a(Collections.singletonList(fio.m2301a()), fiv.NON_REPEATING);
                fec.f15897a.mo1904b();
                if (fdx != null) {
                    ird = fec.f15897a;
                    String valueOf3 = String.valueOf(fec.f15899c.f4478b);
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf3).length() + 3);
                    stringBuilder2.append("AF-");
                    stringBuilder2.append(valueOf3);
                    ird.mo1903a(stringBuilder2.toString());
                    b = fdx.mo3032a().mo3144b();
                    fec.f15897a.mo1904b();
                    j = b;
                } else {
                    j = -1;
                }
                if (fdx2 != null) {
                    ird = fec.f15897a;
                    valueOf = String.valueOf(fec.f15899c.f4477a);
                    StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(valueOf).length() + 3);
                    stringBuilder3.append("AE-");
                    stringBuilder3.append(valueOf);
                    ird.mo1903a(stringBuilder3.toString());
                    b = fdx2.mo3032a().mo3144b();
                    fec.f15897a.mo1904b();
                    j2 = b;
                } else {
                    j2 = -1;
                }
                if (a != null) {
                    ird = fec.f15897a;
                    valueOf = String.valueOf(fec.f15899c.f4479c);
                    StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(valueOf).length() + 4);
                    stringBuilder4.append("AWB-");
                    stringBuilder4.append(valueOf);
                    ird.mo1903a(stringBuilder4.toString());
                    b = a.mo3032a().mo3144b();
                    fec.f15897a.mo1904b();
                } else {
                    b = -1;
                }
                fec.f15902f = Math.max(Math.max(j2, j), b);
            }
            return fec;
        } catch (Throwable th) {
            fec.close();
        }
    }
}
