package p000;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* renamed from: oi */
final class oi implements OnAttachStateChangeListener {
    /* renamed from: a */
    private final /* synthetic */ og f8996a;

    oi(og ogVar) {
        this.f8996a = ogVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f8996a.f22493e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f8996a.f22493e = view.getViewTreeObserver();
            }
            og ogVar = this.f8996a;
            ogVar.f22493e.removeGlobalOnLayoutListener(ogVar.f22491c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
