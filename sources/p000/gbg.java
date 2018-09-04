package p000;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: gbg */
final /* synthetic */ class gbg implements Runnable {
    /* renamed from: a */
    private final gbd f5015a;
    /* renamed from: b */
    private final View f5016b;
    /* renamed from: c */
    private final OnLayoutChangeListener f5017c;

    gbg(gbd gbd, View view, OnLayoutChangeListener onLayoutChangeListener) {
        this.f5015a = gbd;
        this.f5016b = view;
        this.f5017c = onLayoutChangeListener;
    }

    public final void run() {
        gbd gbd = this.f5015a;
        View view = this.f5016b;
        OnLayoutChangeListener onLayoutChangeListener = this.f5017c;
        if (gbd.f16721b != null) {
            gbd.f16721b.run();
            gbd.f16721b = null;
        }
        view.removeOnLayoutChangeListener(onLayoutChangeListener);
    }
}
