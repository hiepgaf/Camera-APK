package p000;

import android.graphics.PointF;
import com.google.android.apps.camera.legacy.app.filmstrip.transition.FilmstripTransitionLayout;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;

/* compiled from: PG */
/* renamed from: ctn */
public final class ctn {
    /* renamed from: a */
    public final /* synthetic */ PeekableFilmstripLayout f2699a;

    public ctn(PeekableFilmstripLayout peekableFilmstripLayout) {
        this.f2699a = peekableFilmstripLayout;
    }

    /* renamed from: a */
    public final void m1507a() {
        FilmstripTransitionLayout filmstripTransitionLayout = this.f2699a.f12260f;
        filmstripTransitionLayout.f2324h = new cvk(this);
        jri.m13152b(filmstripTransitionLayout.f2328l);
        ctv a = filmstripTransitionLayout.m1240a();
        ctu a2 = a.m1520a();
        a.f2722b = filmstripTransitionLayout.f2328l.m1511b();
        a.f2724d = filmstripTransitionLayout.f2328l.m1512c();
        a.f2725e = a2.f2715c;
        a.f2727g = filmstripTransitionLayout.f2328l.m1510a();
        filmstripTransitionLayout.f2327k = a.m1520a();
        filmstripTransitionLayout.m1247d();
        filmstripTransitionLayout.f2318b.start();
        filmstripTransitionLayout.f2328l = null;
    }

    /* renamed from: b */
    public final void m1509b() {
        this.f2699a.m8399c();
        FilmstripTransitionLayout filmstripTransitionLayout = this.f2699a.f12260f;
        filmstripTransitionLayout.f2325i = new cvj(this);
        jri.m13152b(filmstripTransitionLayout.f2328l);
        ctv a = filmstripTransitionLayout.m1240a();
        a.f2721a = filmstripTransitionLayout.f2328l.m1511b();
        a.f2723c = filmstripTransitionLayout.f2328l.m1512c();
        a.f2726f = filmstripTransitionLayout.f2328l.m1510a();
        filmstripTransitionLayout.f2327k = a.m1520a();
        filmstripTransitionLayout.m1246c();
        filmstripTransitionLayout.f2319c.start();
    }

    /* renamed from: a */
    public final void m1508a(float f, float f2, float f3) {
        FilmstripTransitionLayout filmstripTransitionLayout = this.f2699a.f12260f;
        jri.m13152b(filmstripTransitionLayout.f2328l);
        cto cto = filmstripTransitionLayout.f2328l;
        cto.f2700a -= f;
        cto.f2701b -= f2;
        cto.f2702c = f3;
        float b = cto.m1511b();
        filmstripTransitionLayout.f2322f.setScaleX(b);
        filmstripTransitionLayout.f2322f.setScaleY(b);
        PointF c = filmstripTransitionLayout.f2328l.m1512c();
        filmstripTransitionLayout.f2322f.setTranslationX(c.x);
        filmstripTransitionLayout.f2322f.setTranslationY(c.y);
        filmstripTransitionLayout.m1241a(filmstripTransitionLayout.f2328l.m1510a());
    }
}
