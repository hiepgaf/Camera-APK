package p000;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.ExternalViewerButton;
import com.google.android.apps.camera.legacy.app.refocus.ViewerActivity;
import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import com.google.android.apps.camera.ui.widget.Cling;

/* compiled from: PG */
/* renamed from: crz */
final class crz implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ crw f2633a;

    crz(crw crw) {
        this.f2633a = crw;
    }

    public final void onClick(View view) {
        crx crx = this.f2633a.f2614c;
        if (crx != null) {
            cre a = crx.m1450a();
            if (a != cre.f2587c) {
                err e = a.mo1066e();
                Uri uri = e.mo1033g().f4155h;
                if (uri.equals(Uri.EMPTY)) {
                    bli.m873e(cfk.f20249a, "Cannot open empty URL.");
                    return;
                }
                if (e.mo1037k().f4114b.f4122h) {
                    cfk cfk = crx.f2631a;
                    eja eja = cfk.f20258I;
                    if (eja != null) {
                        eja.m9711a((Activity) cfk.f20292r.get(), uri);
                        return;
                    }
                }
                if (e.mo1037k().f4114b.f4123i) {
                    eja eja2 = crx.f2631a.f20258I;
                    Intent intent = new Intent(eja2.f15201e.mo2756k(), ViewerActivity.class);
                    intent.setDataAndType(uri, GDepthUtil.MIME_JPEG);
                    intent.addFlags(65536);
                    eja2.f15201e.mo2749b(intent);
                    if (crx.f2631a.f20287m.mo1535a("default_scope", "pref_should_show_refocus_viewer_cling")) {
                        crx.f2631a.f20287m.mo1540b("default_scope", "pref_should_show_refocus_viewer_cling", false);
                        crw crw = crx.f2631a.f20300z;
                        ExternalViewerButton externalViewerButton = crw.f2616e;
                        Cling cling = (Cling) externalViewerButton.f2335c.get(cum.REFOCUS);
                        if (cling != null) {
                            ExternalViewerButton externalViewerButton2 = crw.f2616e;
                            cum cum = cum.REFOCUS;
                            Cling cling2 = (Cling) externalViewerButton2.f2335c.get(cum);
                            if (cling2 == null) {
                                String str = ExternalViewerButton.f2333a;
                                String valueOf = String.valueOf(cum);
                                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 48);
                                stringBuilder.append("Cling does not exist for the given viewer type: ");
                                stringBuilder.append(valueOf);
                                bli.m873e(str, stringBuilder.toString());
                            } else {
                                externalViewerButton2.f2335c.remove(cum);
                                cling2.m1338a(null);
                            }
                            cling.setVisibility(8);
                            crw.f2613b.removeView(cling);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (e.mo1037k().f4114b.f4124j) {
                    crx.f2631a.mo2741a(a);
                    return;
                } else {
                    return;
                }
            }
            bli.m873e(cfk.f20249a, "Cannot open INVALID node.");
        }
    }
}
