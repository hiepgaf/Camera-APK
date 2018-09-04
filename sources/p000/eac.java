package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: eac */
public final class eac {
    /* renamed from: a */
    private static final String f3436a = bli.m862a("PictureSizeLoader");
    /* renamed from: b */
    private final bkw f3437b;
    /* renamed from: c */
    private final fbn f3438c;
    /* renamed from: d */
    private final bfk f3439d;

    public eac(bkw bkw, fbn fbn, bfk bfk) {
        this.f3437b = bkw;
        this.f3438c = fbn;
        this.f3439d = bfk;
    }

    /* renamed from: a */
    final List m1722a(iut iut) {
        iur b = this.f3438c.mo1346b(iut);
        if (b == null) {
            return new ArrayList(0);
        }
        return gly.m11183a(eag.m1728a(this.f3438c.m10176b(b).mo1920b(256)), this.f3437b.m848a());
    }

    /* renamed from: b */
    final kbg m1723b(iut iut) {
        iur b = this.f3438c.mo1346b(iut);
        if (b == null) {
            return kau.f19138a;
        }
        kbg b2 = this.f3439d.mo2670b(b);
        if (b2.mo2084b()) {
            boolean z;
            List a = ((bez) b2.mo2081a()).m803a(inc.FPS_30);
            if (a.size() >= 3) {
                z = true;
            } else {
                z = false;
            }
            jri.m13143a(z);
            eao eao = new eao();
            eao.f3463a = ((iob) jri.m13152b(iob.m3918a((ine) a.get(0)))).f7208a;
            eao.f3464b = ((iob) jri.m13152b(iob.m3918a((ine) a.get(1)))).f7208a;
            eao.f3465c = ((iob) jri.m13152b(iob.m3918a((ine) a.get(2)))).f7208a;
            return kbg.m4745c(eao);
        }
        bli.m873e(f3436a, "CamcorderCharacteristics not available");
        return kau.f19138a;
    }
}
