package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CaptureResult.Key;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dsl */
public final class dsl {
    /* renamed from: a */
    private static final long f3269a = 1000000000;
    /* renamed from: b */
    private final dru f3270b;
    /* renamed from: c */
    private final dro f3271c;
    /* renamed from: d */
    private final ffc f3272d;

    dsl(dru dru, dro dro, ffc ffc) {
        this.f3270b = dru;
        this.f3271c = dro;
        this.f3272d = ffc;
    }

    /* renamed from: a */
    public final fwl m1674a(fwl fwl) {
        Set a;
        Key key = CaptureResult.EDGE_MODE;
        Integer valueOf = Integer.valueOf(3);
        Key key2 = CaptureResult.NOISE_REDUCTION_MODE;
        Integer valueOf2 = Integer.valueOf(4);
        dty dtw = new dtw(kes.m4807b(key, valueOf, key2, valueOf2));
        fdh fdh = fdh.ANY;
        fdg fdg = new fdg(fdh, fdh, fdh);
        if (this.f3272d.mo1937s()) {
            fdg = fdg.m2257b(fdh.LOCKED);
        }
        dty dtv = new dtv(new dts(dtw, fdg), kgn.f22045a);
        if (hsy.f6600a != null) {
            fin fin = new fin(CaptureRequest.EDGE_MODE, valueOf);
            fin fin2 = new fin(CaptureRequest.NOISE_REDUCTION_MODE, valueOf2);
            CaptureRequest.Key key3 = CaptureRequest.FLASH_MODE;
            valueOf2 = Integer.valueOf(0);
            a = keu.m13475a(fin, fin2, new fin(key3, valueOf2), new fin(hsy.f6600a, valueOf2));
        } else {
            a = keu.m13474a(new fin(CaptureRequest.EDGE_MODE, valueOf), new fin(CaptureRequest.NOISE_REDUCTION_MODE, valueOf2), new fin(CaptureRequest.FLASH_MODE, Integer.valueOf(0)));
        }
        dro dro = this.f3271c;
        fjs a2 = this.f3270b.m1670a(f3269a);
        long j = f3269a;
        return new dsw(new dtx(dro.f3237b, dro.f3236a, dro.f3238c.m2276a(3, new fju(a2, new fjt())), dro.f3240e, fwl, dtv, dro.f3241f, 1, 3, j, a, dro.f3239d), 3, false);
    }
}
