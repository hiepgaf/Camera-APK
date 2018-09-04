package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fdj */
public final class fdj implements fde {
    /* renamed from: a */
    private final fde f15884a;

    public fdj(fde fde) {
        this.f15884a = fde;
    }

    /* renamed from: a */
    public final fdf mo1357a(fip fip, fdg fdg, fim fim) {
        Integer num;
        for (fin fin : fim.f4567b) {
            if (fin.f4571a.equals(CaptureRequest.CONTROL_AF_MODE)) {
                num = (Integer) fin.f4572b;
                break;
            }
        }
        num = null;
        if (num == null || !num.equals(Integer.valueOf(1))) {
            return this.f15884a.mo1357a(fip, fdg, fim);
        }
        int equals;
        fdg a;
        fdg b = fdg.m2257b(fdh.ANY);
        for (fin fin2 : fim.f4567b) {
            if (fin2.f4571a.equals(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION)) {
                equals = fin2.f4572b.equals(Integer.valueOf(0)) ^ 1;
                break;
            }
        }
        equals = 0;
        if (equals != 0) {
            a = b.m2256a(fdh.ANY);
        } else {
            a = b;
        }
        return new fdk(this.f15884a.mo1357a(fip, a, fim), num);
    }
}
