package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import com.google.googlex.gcam.BaseFrameCallback;

/* compiled from: PG */
/* renamed from: bzh */
final class bzh extends BaseFrameCallback {
    /* renamed from: a */
    private final /* synthetic */ bzx f11533a;
    /* renamed from: b */
    private final /* synthetic */ bze f11534b;

    bzh(bze bze, bzx bzx) {
        this.f11534b = bze;
        this.f11533a = bzx;
    }

    public final void Run(int i, int i2, long j) {
        boolean z;
        String str = bze.f1734a;
        Object[] objArr = new Object[3];
        Object valueOf = Integer.valueOf(i2);
        objArr[0] = valueOf;
        Object valueOf2 = Long.valueOf(j);
        objArr[1] = valueOf2;
        objArr[2] = Integer.valueOf(i);
        bli.m863a(str, String.format(null, "Base frame selected as %d (timestamp %d), shotId = %d", objArr));
        if (this.f11534b.f1752s == go.f5588z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        if (i2 < this.f11534b.f1737d.size()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13146a(z, "Base frame index %s >= payload timestamps size %s", i2, this.f11534b.f1737d.size());
        if (i2 < this.f11534b.f1736c.size()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13146a(z, "Base frame index %s >= payload metadata size %s", i2, this.f11534b.f1736c.size());
        if (((Long) this.f11534b.f1737d.get(i2)).longValue() == j) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "Base frame timestamps don't match");
        if (this.f11533a.mo595a().mo2084b()) {
            bzy bzy = (bzy) this.f11533a.mo595a().mo2081a();
            Object obj = (iwp) this.f11534b.f1736c.get(i2);
            ccy ccy = bzy.f1763a;
            kbg kbg = bzy.f1764b;
            fwa fwa = bzy.f1765c;
            int i3 = bzy.f1766d;
            knk knk = bzy.f1767e;
            knk knk2 = bzy.f1768f;
            knk knk3 = bzy.f1769g;
            if (kbg.mo2084b()) {
                eyh eyh = (eyh) kbg.mo2081a();
                kbg a = ((etc) eyh.f4355g.f4346a.mo2081a()).mo1277a(j);
                if (a.mo2084b()) {
                    eym eym = eyh.f4355g.f4347b;
                    eyl eyl = new eyl(eym.f4358b, eym.f4357a, eyh.f4352d, eyh.f4353e, eyh.f4349a);
                    eyh.f4352d.mo3557a((iwz) a.mo2081a());
                    eyh.f4350b.mo3616b(kny.m18045a(eyh.f4349a, eyi.f15757a, kpq.f8410a));
                } else {
                    eyh.f4350b.mo3557a(kau.f19138a);
                }
            }
            etj etj = ccy.f11684f;
            if (etj.f4222a.mo2084b()) {
                kbg = ((etc) etj.f4222a.mo2081a()).mo1277a(j);
            } else {
                kbg = kau.f19138a;
            }
            if (kbg.mo2084b()) {
                Bitmap a2 = YuvUtilNative.m1351a((iwz) kbg.mo2081a());
                ((iwz) kbg.mo2081a()).close();
                if (a2 != null) {
                    fwa.f4755d.mo3052a(a2, i3);
                }
            }
            knk.mo3557a(valueOf);
            knk2.mo3557a(valueOf2);
            knk3.mo3557a(obj);
        }
    }
}
