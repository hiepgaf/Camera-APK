package p000;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: PG */
/* renamed from: pl */
final class pl implements OnGlobalLayoutListener {
    /* renamed from: a */
    private final /* synthetic */ pk f9025a;

    pl(pk pkVar) {
        this.f9025a = pkVar;
    }

    public final void onGlobalLayout() {
        if (this.f9025a.mo2473e()) {
            pk pkVar = this.f9025a;
            if (!pkVar.f22517a.f19628q) {
                View view = pkVar.f22519c;
                if (view == null || !view.isShown()) {
                    this.f9025a.mo2471c();
                } else {
                    this.f9025a.f22517a.mo2474f();
                }
            }
        }
    }
}
