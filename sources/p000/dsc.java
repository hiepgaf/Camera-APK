package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: dsc */
final class dsc implements fwl {
    /* renamed from: a */
    private final fwl f14356a;
    /* renamed from: b */
    private final kbg f14357b;
    /* renamed from: c */
    private final kbg f14358c;
    /* renamed from: d */
    private ilp f14359d;
    /* renamed from: e */
    private final ffc f14360e;

    dsc(fwl fwl, ffc ffc, kbg kbg, kbg kbg2, ilp ilp) {
        this.f14356a = fwl;
        this.f14360e = ffc;
        this.f14357b = kbg;
        this.f14358c = kbg2;
        this.f14359d = ilp;
    }

    /* renamed from: a */
    public final ilp mo1170a() {
        return this.f14356a.mo1170a();
    }

    /* renamed from: b */
    public final ilp mo1172b() {
        return this.f14356a.mo1172b();
    }

    /* renamed from: a */
    public final void mo1171a(fwm fwm, fwa fwa) {
        Object obj;
        eyh eyh = null;
        if (!this.f14357b.mo2084b()) {
            obj = null;
        } else if (!((etc) this.f14357b.mo2081a()).mo1286a()) {
            obj = null;
        } else if (((etc) this.f14357b.mo2081a()).mo1289b()) {
            obj = 1;
        } else {
            obj = null;
        }
        if (!(obj == null || ((Boolean) this.f14359d.mo2860b()).booleanValue())) {
            kpk kpk;
            gkr gkr = fwa.f4753b;
            int a = axm.m734a(fwa.f4752a.f4445a, this.f14360e);
            if (this.f14358c.mo2084b()) {
                eyh = ((eyg) this.f14358c.mo2081a()).m2191a(fwa.f4753b.mo2884l());
            }
            etc etc = (etc) this.f14357b.mo2081a();
            Uri o = gkr.mo2887o();
            if (eyh != null) {
                kpk = eyh.f4350b;
            } else {
                kpk = kow.m13617a(kau.f19138a);
            }
            etc.mo1281a(o, a, kpk);
        }
        this.f14356a.mo1171a(fwm, fwa);
        if (eyh != null) {
            synchronized (eyh.f4355g) {
                jri.m13153b(eyh.f4355g.f4348c.containsKey(Long.valueOf(eyh.f4354f)));
                if (!eyh.f4351c) {
                    eyh.f4350b.mo3557a(kau.f19138a);
                }
                eyh.f4355g.f4348c.remove(Long.valueOf(eyh.f4354f));
            }
        }
    }
}
