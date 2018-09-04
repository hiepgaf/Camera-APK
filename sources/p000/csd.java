package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: csd */
final class csd implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ crw f2638a;

    csd(crw crw) {
        this.f2638a = crw;
    }

    public final void onClick(View view) {
        crx crx = this.f2638a.f2614c;
        if (crx != null) {
            cre a = crx.m1450a();
            if (a != cre.f2587c) {
                crx.f2631a.m14985a(a.mo1066e());
                return;
            }
            bli.m873e(cfk.f20249a, "onProgressErrorClicked with INVALID node");
        }
    }
}
