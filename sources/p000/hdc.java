package p000;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: hdc */
final /* synthetic */ class hdc implements iqo {
    /* renamed from: a */
    private final hda f17669a;
    /* renamed from: b */
    private final ViewTreeObserver f17670b;

    hdc(hda hda, ViewTreeObserver viewTreeObserver) {
        this.f17669a = hda;
        this.f17670b = viewTreeObserver;
    }

    public final void close() {
        OnGlobalLayoutListener onGlobalLayoutListener = this.f17669a;
        ViewTreeObserver viewTreeObserver = this.f17670b;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }
}
