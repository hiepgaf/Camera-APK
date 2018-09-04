package p000;

import android.app.Activity;
import android.net.Uri;
import android.nfc.NfcAdapter;

/* compiled from: PG */
/* renamed from: cfm */
public final class cfm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ cre f1917a;
    /* renamed from: b */
    private final /* synthetic */ cst f1918b;

    public cfm(cst cst, cre cre) {
        this.f1918b = cst;
        this.f1917a = cre;
    }

    public final void run() {
        cfk cfk = this.f1918b.f12618a;
        cre cre = this.f1917a;
        if (cre == cre.f2587c) {
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
        err e = cre.mo1066e();
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
        int a = cfk.f20256G.mo998a(cre);
        if (!cfk.f20256G.mo1023e(a)) {
            cfk.f20256G.mo1024f(a);
        }
    }
}
