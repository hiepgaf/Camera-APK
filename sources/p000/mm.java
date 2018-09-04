package p000;

import android.view.Window.Callback;

/* compiled from: PG */
/* renamed from: mm */
final class mm implements pf {
    /* renamed from: a */
    private final /* synthetic */ mg f19387a;

    mm(mg mgVar) {
        this.f19387a = mgVar;
    }

    /* renamed from: a */
    public final void mo2353a(op opVar, boolean z) {
        this.f19387a.m14069a(opVar);
    }

    /* renamed from: a */
    public final boolean mo2354a(op opVar) {
        Callback callback = this.f19387a.f19363c.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, opVar);
        }
        return true;
    }
}
