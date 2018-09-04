package p000;

import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cus */
final class cus implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ cur f2768a;

    cus(cur cur) {
        this.f2768a = cur;
    }

    public final void run() {
        if (this.f2768a.f2763c.computeScrollOffset()) {
            cur cur = this.f2768a;
            cuv cuv = cur.f2762b;
            int currX = cur.f2763c.getCurrX();
            this.f2768a.f2763c.getCurrY();
            cuv.m1522a(currX);
            this.f2768a.f2761a.removeCallbacks(this);
            this.f2768a.f2761a.post(this);
            return;
        }
        bli.m871d(FilmstripView.f2338a, "[fling] onScrollEnd from computeScrollOffset");
        this.f2768a.f2762b.m1521a();
    }
}
