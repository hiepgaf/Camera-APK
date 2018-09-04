package p000;

import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cuv */
public final class cuv {
    /* renamed from: a */
    public int f2771a = -1;
    /* renamed from: b */
    private final /* synthetic */ cuw f2772b;

    cuv(cuw cuw) {
        this.f2772b = cuw;
    }

    /* renamed from: a */
    public final void m1521a() {
        this.f2772b.f12667e = true;
        bli.m863a(FilmstripView.f2338a, "[fling] onScrollEnd() - onScrollEnd");
        FilmstripView filmstripView = this.f2772b.f12668f;
        cvf cvf = filmstripView.f2352m[2];
        if (cvf != null) {
            if (cvf != null) {
                if (filmstripView.m1278h() || !filmstripView.m1270b()) {
                    cve cve = filmstripView.f2364y;
                    if (cve != null) {
                        cve.mo772a(cvf.f2798h);
                    }
                } else if (filmstripView.f2350k.m8793h() || filmstripView.f2357r) {
                    String str = FilmstripView.f2338a;
                    boolean h = filmstripView.f2350k.m8793h();
                    StringBuilder stringBuilder = new StringBuilder(41);
                    stringBuilder.append("[fling] mController.isScrolling() - ");
                    stringBuilder.append(h);
                    bli.m871d(str, stringBuilder.toString());
                } else {
                    int a = cvf.m1527a();
                    int abs = (int) ((((float) Math.abs(filmstripView.f2351l - a)) * 600.0f) / ((float) filmstripView.f2348i.width()));
                    if (abs < 0) {
                        abs = 400;
                    }
                    bli.m871d(FilmstripView.f2338a, "[fling] Scroll to center.");
                    filmstripView.f2350k.m8779a(a, abs, false);
                }
            }
            if (this.f2772b.f12668f.m1278h()) {
                bli.m871d(FilmstripView.f2338a, "[fling] onScrollEnd() - Ensuring that items are at full resolution.");
                this.f2772b.f12668f.m1264a(2);
                this.f2772b.f12668f.m1264a(3);
                this.f2772b.f12668f.m1264a(1);
                this.f2772b.f12668f.m1264a(4);
            }
        }
    }

    /* renamed from: a */
    public final void m1522a(int i) {
        FilmstripView filmstripView = this.f2772b.f12668f;
        filmstripView.f2351l = (i - this.f2771a) + filmstripView.f2351l;
        this.f2771a = i;
        if (filmstripView.m1272c()) {
            bli.m863a(FilmstripView.f2338a, "[fling] onScrollUpdate() - stopScrolling!");
            this.f2772b.f12668f.f2350k.m8786b(true);
        }
        this.f2772b.f12668f.invalidate();
    }
}
