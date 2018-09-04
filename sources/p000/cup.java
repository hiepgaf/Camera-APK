package p000;

import android.graphics.Bitmap;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cup */
final class cup implements csj {
    /* renamed from: a */
    private final /* synthetic */ FilmstripView f12656a;

    cup(FilmstripView filmstripView) {
        this.f12656a = filmstripView;
    }

    /* renamed from: a */
    public final void mo666a(int i, cre cre) {
        bli.m863a(FilmstripView.f2338a, "onFilmstripItemInserted()");
        FilmstripView filmstripView = this.f12656a;
        if (filmstripView.f2352m[2] == null) {
            filmstripView.m1279i();
        } else {
            filmstripView.m1266a(cre);
        }
        if (this.f12656a.f2353n != null) {
            this.f12656a.f2353n.m8717a(this.f12656a.m1274d());
        }
        this.f12656a.m1280j();
        filmstripView = this.f12656a;
        if (filmstripView.f2363x != null) {
            hfz hfz = filmstripView.f2346g;
            if (hfz != null) {
                if (hfz.mo1019d() == 0) {
                    filmstripView.f2363x.setAlpha(0.7f);
                } else {
                    filmstripView.f2363x.setAlpha(0.0f);
                }
                filmstripView.invalidate();
            }
        }
    }

    /* renamed from: b */
    public final void mo668b(int i, cre cre) {
        bli.m863a(FilmstripView.f2338a, "onFilmstripItemRemoved()");
        this.f12656a.m1269b(cre);
        if (this.f12656a.f2353n != null) {
            this.f12656a.f2353n.m8717a(this.f12656a.m1274d());
        }
        FilmstripView filmstripView = this.f12656a;
        filmstripView.announceForAccessibility(filmstripView.getResources().getString(R.string.filmstrip_item_deleted));
        this.f12656a.m1280j();
        filmstripView = this.f12656a;
        if (filmstripView.f2363x != null) {
            hfz hfz = filmstripView.f2346g;
            if (hfz != null) {
                if (hfz.mo1019d() == 0) {
                    filmstripView.f2363x.setAlpha(0.7f);
                } else {
                    filmstripView.f2363x.setAlpha(0.0f);
                }
                filmstripView.invalidate();
            }
        }
    }

    /* renamed from: a */
    public final void mo667a(csk csk) {
        int i = 1;
        bli.m863a(FilmstripView.f2338a, "onFilmstripItemUpdated()");
        FilmstripView filmstripView = this.f12656a;
        cvf cvf = filmstripView.f2352m[2];
        if (cvf == null) {
            filmstripView.m1279i();
            return;
        }
        cre cre = cvf.f2797g;
        if (csk.m1463a(cre)) {
            filmstripView.m1268b(2);
            err e = cre.mo1066e();
            if (!(e == null || filmstripView.f2357r || filmstripView.f2350k.m8793h())) {
                filmstripView.f2351l = cvf.f2796f + (hjg.m3202a(e.mo1034h().f7329a, e.mo1034h().f7330b, e.mo1038l(), filmstripView.getMeasuredWidth(), filmstripView.getMeasuredHeight()).x / 2);
            }
        }
        while (i >= 0) {
            cvf[] cvfArr = filmstripView.f2352m;
            cvf cvf2 = cvfArr[i];
            if (cvf2 == null) {
                cvf2 = cvfArr[i + 1];
                if (cvf2 != null) {
                    cvfArr[i] = filmstripView.m1271c(cvf2.f2797g.mo1064c());
                }
            } else if (csk.m1463a(cvf2.f2797g)) {
                filmstripView.m1268b(i);
            }
            i--;
        }
        for (i = 3; i < 5; i++) {
            cvfArr = filmstripView.f2352m;
            cvf2 = cvfArr[i];
            if (cvf2 == null) {
                cvf2 = cvfArr[i - 1];
                if (cvf2 != null) {
                    cvfArr[i] = filmstripView.m1271c(cvf2.f2797g.mo1063b());
                }
            } else if (csk.m1463a(cvf2.f2797g)) {
                filmstripView.m1268b(i);
            }
        }
        filmstripView.m1263a();
        filmstripView.requestLayout();
    }

    /* renamed from: a */
    public final void mo665a() {
        bli.m863a(FilmstripView.f2338a, "onFilmstripItemsLoaded()");
        this.f12656a.m1279i();
        Bitmap a = this.f12656a.f2342c.mo760d().m1457a();
        if (a != null) {
            this.f12656a.m1265a(a);
        }
        this.f12656a.f2362w.mo3557a(Boolean.valueOf(true));
    }
}
