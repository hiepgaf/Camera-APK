package p000;

import android.support.v7.widget.ActionBarOverlayLayout;

/* compiled from: PG */
/* renamed from: pv */
public final class pv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ActionBarOverlayLayout f9039a;

    public pv(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f9039a = actionBarOverlayLayout;
    }

    public final void run() {
        this.f9039a.m6807c();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9039a;
        actionBarOverlayLayout.f10053h = actionBarOverlayLayout.f10047b.animate().translationY((float) (-this.f9039a.f10047b.getHeight())).setListener(this.f9039a.f10054i);
    }
}
