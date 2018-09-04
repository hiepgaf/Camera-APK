package p000;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: PG */
/* renamed from: rk */
final class rk implements OnGlobalLayoutListener {
    /* renamed from: a */
    private final /* synthetic */ ri f9114a;

    rk(ri riVar) {
        this.f9114a = riVar;
    }

    public final void onGlobalLayout() {
        Object obj = null;
        ri riVar = this.f9114a;
        View view = riVar.f22557d;
        if (jm.m4589w(view) && view.getGlobalVisibleRect(riVar.f22556c)) {
            obj = 1;
        }
        if (obj == null) {
            this.f9114a.mo2471c();
            return;
        }
        this.f9114a.m16773a();
        super.mo2474f();
    }
}
