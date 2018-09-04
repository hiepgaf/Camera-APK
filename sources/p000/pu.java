package p000;

import android.support.v7.widget.ActionBarOverlayLayout;

/* compiled from: PG */
/* renamed from: pu */
public final class pu implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ActionBarOverlayLayout f9038a;

    public pu(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f9038a = actionBarOverlayLayout;
    }

    public final void run() {
        this.f9038a.m6807c();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9038a;
        actionBarOverlayLayout.f10053h = actionBarOverlayLayout.f10047b.animate().translationY(0.0f).setListener(this.f9038a.f10054i);
    }
}
