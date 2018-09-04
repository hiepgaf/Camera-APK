package p000;

import android.view.Window;

/* compiled from: PG */
/* renamed from: guk */
final class guk implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Window f5702a;
    /* renamed from: b */
    private final /* synthetic */ guj f5703b;

    guk(guj guj, Window window) {
        this.f5703b = guj;
        this.f5702a = window;
    }

    public final void run() {
        this.f5702a.getDecorView().setOnSystemUiVisibilityChangeListener(this.f5703b.f17365e);
    }
}
