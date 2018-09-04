package p000;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: gbe */
final /* synthetic */ class gbe implements Runnable {
    /* renamed from: a */
    private final View f5011a;
    /* renamed from: b */
    private final OnLayoutChangeListener f5012b;

    gbe(View view, OnLayoutChangeListener onLayoutChangeListener) {
        this.f5011a = view;
        this.f5012b = onLayoutChangeListener;
    }

    public final void run() {
        this.f5011a.addOnLayoutChangeListener(this.f5012b);
    }
}
