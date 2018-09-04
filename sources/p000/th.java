package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: th */
final class th implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ tg f9277a;

    th(tg tgVar) {
        this.f9277a = tgVar;
    }

    public final void run() {
        View view = this.f9277a.f19623l;
        if (view != null && view.getWindowToken() != null) {
            this.f9277a.mo2474f();
        }
    }
}
