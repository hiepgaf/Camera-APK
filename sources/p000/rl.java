package p000;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow.OnDismissListener;

/* compiled from: PG */
/* renamed from: rl */
final class rl implements OnDismissListener {
    /* renamed from: a */
    private final /* synthetic */ OnGlobalLayoutListener f9115a;
    /* renamed from: b */
    private final /* synthetic */ ri f9116b;

    rl(ri riVar, OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f9116b = riVar;
        this.f9115a = onGlobalLayoutListener;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f9116b.f22557d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f9115a);
        }
    }
}
