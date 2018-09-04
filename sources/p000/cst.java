package p000;

import android.app.Activity;
import android.net.Uri;
import android.nfc.NfcAdapter;

/* compiled from: PG */
/* renamed from: cst */
public final class cst implements kwk {
    /* renamed from: a */
    public final /* synthetic */ cfk f12618a;

    public cst(cfk cfk) {
        this.f12618a = cfk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final void m8717a(cre cre) {
        cfk cfk = this.f12618a;
        if (cfk.f20273X) {
            cfk.f20281g.execute(new cfm(this, cre));
        }
    }

    /* renamed from: b */
    public final void m8718b() {
        cfk cfk = this.f12618a;
        if (cfk.f20273X) {
            cre a = cfk.f20253D.mo1070a();
            if (a == cre.f2587c) {
                bli.m873e(cfk.f20249a, "Current data ID not found.");
                cfk.f20263N.m1439a(null);
                cfk.f20300z.m1446c(false);
                cfk.f20300z.m1447d(false);
                cfk.f20300z.m1443a(false);
                cfk.f20300z.m1445b(false);
                cfk.f20300z.m1444b();
                cfk.m14964I();
                return;
            }
            err e = a.mo1066e();
            cfk.m14985a(e);
            cfk.m14971P();
            cfk.f20263N.m1439a(e);
            if (cfk.f20298x) {
                cfk.f20300z.m1446c(false);
                cfk.f20300z.m1447d(false);
            } else {
                if (!cfk.f20290p.getAndSet(true)) {
                    cfk.f20289o.mo1903a("NFC#init");
                    NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(cfk.f20280f);
                    if (defaultAdapter != null) {
                        defaultAdapter.setBeamPushUris(null, (Activity) cfk.f20292r.get());
                        defaultAdapter.setBeamPushUrisCallback(new cfq(cfk), (Activity) cfk.f20292r.get());
                        cfk.f20289o.mo1904b();
                    }
                }
                Uri uri = e.mo1033g().f4155h;
                if (uri.equals(Uri.EMPTY)) {
                    cfk.f20291q[0] = null;
                } else {
                    cfk.f20291q[0] = uri;
                }
            }
            int a2 = cfk.f20256G.mo998a(a);
            if (!cfk.f20256G.mo1023e(a2)) {
                cfk.f20256G.mo1024f(a2);
            }
        }
    }

    /* renamed from: c */
    public final void m8719c() {
        cfk cfk = this.f12618a;
        if (cfk.f20273X) {
            cfk.f20269T = true;
            cfk.m14972Q();
            cfk = this.f12618a;
            ikd.m12259a();
            if (!cfk.f20270U) {
                bli.m871d(cfk.f20249a, "stopPreviewWhenEnteringFilmstrip");
                cfk.f20270U = true;
                cfk.f20296v.execute(cfk.ac);
                cfk.ad.mo348a((Boolean) cfk.f20276b.mo693b().mo2860b());
            }
        }
    }

    /* renamed from: d */
    public final void m8720d() {
        cfk cfk = this.f12618a;
        if (cfk.f20273X) {
            cfk.f20269T = true;
            cfk.m14972Q();
            cfk = this.f12618a;
            ikd.m12259a();
            if (!cfk.f20270U) {
                bli.m871d(cfk.f20249a, "stopPreviewWhenEnteringFilmstrip");
                cfk.f20270U = true;
                cfk.f20296v.execute(cfk.ac);
                cfk.ad.mo348a((Boolean) cfk.f20276b.mo693b().mo2860b());
            }
        }
    }

    /* renamed from: e */
    public final void m8721e() {
        this.f12618a.m14962G();
        cfk cfk = this.f12618a;
        cfk.f20269T = false;
        cfk.m14972Q();
        this.f12618a.m14970O();
    }
}
