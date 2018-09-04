package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: tn */
final class tn implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ tg f9283a;

    tn(tg tgVar) {
        this.f9283a = tgVar;
    }

    public final void run() {
        View view = this.f9283a.f19616e;
        if (view != null && jm.m4589w(view) && this.f9283a.f19616e.getCount() > this.f9283a.f19616e.getChildCount()) {
            int childCount = this.f9283a.f19616e.getChildCount();
            tg tgVar = this.f9283a;
            if (childCount <= tgVar.f19622k) {
                tgVar.f19629r.setInputMethodMode(2);
                this.f9283a.mo2474f();
            }
        }
    }
}
