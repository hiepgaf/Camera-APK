package p000;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: PG */
/* renamed from: oh */
final class oh implements OnGlobalLayoutListener {
    /* renamed from: a */
    private final /* synthetic */ og f8995a;

    oh(og ogVar) {
        this.f8995a = ogVar;
    }

    public final void onGlobalLayout() {
        if (this.f8995a.mo2473e() && this.f8995a.f22490b.size() > 0 && !((ol) this.f8995a.f22490b.get(0)).f9001a.f19628q) {
            View view = this.f8995a.f22492d;
            if (view == null || !view.isShown()) {
                this.f8995a.mo2471c();
                return;
            }
            for (ol olVar : this.f8995a.f22490b) {
                olVar.f9001a.mo2474f();
            }
        }
    }
}
