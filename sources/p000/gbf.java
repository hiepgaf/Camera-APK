package p000;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: gbf */
final /* synthetic */ class gbf implements Runnable {
    /* renamed from: a */
    private final View f5013a;
    /* renamed from: b */
    private final OnLayoutChangeListener f5014b;

    gbf(View view, OnLayoutChangeListener onLayoutChangeListener) {
        this.f5013a = view;
        this.f5014b = onLayoutChangeListener;
    }

    public final void run() {
        this.f5013a.removeOnLayoutChangeListener(this.f5014b);
    }
}
