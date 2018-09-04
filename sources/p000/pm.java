package p000;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* renamed from: pm */
final class pm implements OnAttachStateChangeListener {
    /* renamed from: a */
    private final /* synthetic */ pk f9026a;

    pm(pk pkVar) {
        this.f9026a = pkVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f9026a.f22520d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f9026a.f22520d = view.getViewTreeObserver();
            }
            pk pkVar = this.f9026a;
            pkVar.f22520d.removeGlobalOnLayoutListener(pkVar.f22518b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
