package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dsa */
public final class dsa {
    /* renamed from: a */
    private final ira f3245a;
    /* renamed from: b */
    private final dqo f3246b;
    /* renamed from: c */
    private final fgr f3247c;
    /* renamed from: d */
    private final ffc f3248d;
    /* renamed from: e */
    private final bym f3249e;
    /* renamed from: f */
    private final cdo f3250f;
    /* renamed from: g */
    private final ird f3251g;
    /* renamed from: h */
    private final ccy f3252h;
    /* renamed from: i */
    private final bzt f3253i;
    /* renamed from: j */
    private final grk f3254j;
    /* renamed from: k */
    private final hjf f3255k;
    /* renamed from: l */
    private final int f3256l;

    dsa(ira ira, ird ird, dtt dtt, fgr fgr, ffc ffc, bym bym, cdo cdo, ccy ccy, bzt bzt, grk grk, hjf hjf, int i) {
        this.f3245a = ira;
        this.f3251g = ird;
        this.f3246b = dtt;
        this.f3247c = fgr;
        this.f3248d = ffc;
        this.f3249e = bym;
        this.f3250f = cdo;
        this.f3252h = ccy;
        this.f3253i = bzt;
        this.f3254j = grk;
        this.f3255k = hjf;
        this.f3256l = i;
    }

    /* renamed from: a */
    public final fwl m1671a(bxg bxg, fwl fwl, ffr ffr) {
        Set a;
        fdh fdh = fdh.ANY;
        dty dts = new dts(new fdg(fdh, fdh, fdh));
        hjf hjf = this.f3255k;
        ivy ivy = hjf.f6267b;
        if (!(ivy.f7509e || ivy.f7508d || hjf.m3195c())) {
            if (this.f3255k.m3196d()) {
            }
            a = keu.m13473a(new fin(CaptureRequest.FLASH_MODE, Integer.valueOf(0)), new fin(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1)));
            return new dsw(new dry(this.f3245a, this.f3251g, ffr, this.f3246b, fwl, dts, this.f3247c, bxg, ffr.f4538a, a, this.f3248d, this.f3249e, this.f3250f, this.f3252h, this.f3253i, this.f3254j, this.f3256l), 6, false);
        }
        if (hsy.f6600a != null) {
            fin fin = new fin(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
            Key key = CaptureRequest.CONTROL_AE_MODE;
            Integer valueOf = Integer.valueOf(1);
            a = keu.m13474a(fin, new fin(key, valueOf), new fin(hsy.f6600a, valueOf));
            return new dsw(new dry(this.f3245a, this.f3251g, ffr, this.f3246b, fwl, dts, this.f3247c, bxg, ffr.f4538a, a, this.f3248d, this.f3249e, this.f3250f, this.f3252h, this.f3253i, this.f3254j, this.f3256l), 6, false);
        }
        a = keu.m13473a(new fin(CaptureRequest.FLASH_MODE, Integer.valueOf(0)), new fin(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1)));
        return new dsw(new dry(this.f3245a, this.f3251g, ffr, this.f3246b, fwl, dts, this.f3247c, bxg, ffr.f4538a, a, this.f3248d, this.f3249e, this.f3250f, this.f3252h, this.f3253i, this.f3254j, this.f3256l), 6, false);
    }
}
