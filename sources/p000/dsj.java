package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: dsj */
public final class dsj {
    /* renamed from: a */
    private final drl f3268a;

    public dsj(drl drl) {
        this.f3268a = drl;
    }

    /* renamed from: a */
    public final fwl m1673a() {
        fis[] fisArr = new fis[2];
        fisArr[0] = fds.m10235a(5);
        r1 = new fin[6];
        Key key = CaptureRequest.CONTROL_AE_LOCK;
        Boolean valueOf = Boolean.valueOf(true);
        r1[3] = new fin(key, valueOf);
        r1[4] = new fin(CaptureRequest.CONTROL_AWB_LOCK, valueOf);
        r1[5] = new fin(CaptureRequest.CONTROL_CAPTURE_INTENT, Integer.valueOf(1));
        fisArr[1] = fds.m10240a(Arrays.asList(r1));
        fis a = fds.m10241a(fisArr);
        fdh fdh = fdh.ANY;
        fdg c = new fdg(fdh, fdh, fdh).m2256a(fdh.LOCKED).m2258c(fdh.LOCKED);
        drl drl = this.f3268a;
        return new dsw(new drs(drl.f3227a, drl.f3228b, drl.f3234h, drl.f3229c, drl.f3230d, drl.f3231e, kny.m18045a(drl.f3231e, new drm(a), kpq.f8410a), c, drl.f3232f, drl.f3233g, drl.f3235i, 3), 2, false);
    }
}
