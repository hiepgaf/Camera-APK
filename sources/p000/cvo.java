package p000;

import android.app.Activity;
import android.net.Uri;
import android.nfc.NfcAdapter;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;

/* compiled from: PG */
/* renamed from: cvo */
final class cvo implements ctt {
    /* renamed from: a */
    private final /* synthetic */ PeekableFilmstripLayout f12676a;

    cvo(PeekableFilmstripLayout peekableFilmstripLayout) {
        this.f12676a = peekableFilmstripLayout;
    }

    /* renamed from: a */
    public final void mo1099a() {
        bli.m863a(PeekableFilmstripLayout.f12255a, "Filmstrip show animation cancelled.");
        this.f12676a.f12267m.set(false);
    }

    /* renamed from: b */
    public final void mo1100b() {
        if (this.f12676a.f12266l.mo765i()) {
            bli.m863a(PeekableFilmstripLayout.f12255a, "Activity finishing. Aborting filmstrip show animation.");
            this.f12676a.f12267m.set(false);
            return;
        }
        bli.m863a(PeekableFilmstripLayout.f12255a, "Filmstrip show animation ended.");
        this.f12676a.f12257c.setTranslationX(0.0f);
        PeekableFilmstripLayout peekableFilmstripLayout = this.f12676a;
        peekableFilmstripLayout.f12262h = true;
        peekableFilmstripLayout.f12265k.b_();
        peekableFilmstripLayout = this.f12676a;
        peekableFilmstripLayout.setBackgroundColor(peekableFilmstripLayout.getResources().getColor(17170444, null));
        cst a = this.f12676a.f12256b;
        if (!a.f12618a.f20274Y) {
            bli.m863a(cfk.f20249a, "onFilmstripShown");
            cfk cfk = a.f12618a;
            cfk.f20273X = true;
            cfk.f20266Q.mo1568a(a.f12618a.m14963H(), 5);
            cfk = a.f12618a;
            cre a2 = cfk.f20253D.mo1070a();
            if (a2 == cre.f2587c) {
                bli.m873e(cfk.f20249a, "Current data ID not found.");
                cfk.f20263N.m1439a(null);
                cfk.f20300z.m1446c(false);
                cfk.f20300z.m1447d(false);
                cfk.f20300z.m1443a(false);
                cfk.f20300z.m1445b(false);
                cfk.f20300z.m1444b();
                cfk.m14964I();
            } else {
                err e = a2.mo1066e();
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
                int a3 = cfk.f20256G.mo998a(a2);
                if (!cfk.f20256G.mo1023e(a3)) {
                    cfk.f20256G.mo1024f(a3);
                }
            }
        }
        this.f12676a.f12256b.m8720d();
        this.f12676a.f12258d.m1283m();
        this.f12676a.f12267m.set(false);
        bli.m863a(PeekableFilmstripLayout.f12255a, "Filmstrip show animation complete.");
    }

    /* renamed from: c */
    public final void mo1101c() {
    }
}
