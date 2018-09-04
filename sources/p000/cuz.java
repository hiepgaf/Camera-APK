package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.graphics.RectF;
import android.net.Uri;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cuz */
final class cuz implements AnimatorListener {
    /* renamed from: a */
    private final /* synthetic */ float f2775a;
    /* renamed from: b */
    private final /* synthetic */ cvf f2776b;
    /* renamed from: c */
    private final /* synthetic */ float f2777c;
    /* renamed from: d */
    private final /* synthetic */ float f2778d;
    /* renamed from: e */
    private final /* synthetic */ cuw f2779e;

    cuz(cuw cuw, float f, cvf cvf, float f2, float f3) {
        this.f2779e = cuw;
        this.f2775a = f;
        this.f2776b = cvf;
        this.f2777c = f2;
        this.f2778d = f3;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        FilmstripView filmstripView = this.f2779e.f12668f;
        float f = filmstripView.f2349j;
        float f2 = this.f2775a;
        if (f != f2) {
            this.f2776b.m1530a(this.f2777c, this.f2778d, f2 / f, filmstripView.f2348i.width(), this.f2779e.f12668f.f2348i.height());
            this.f2779e.f12668f.f2349j = this.f2775a;
        }
        cuw cuw;
        cvf cvf;
        if (this.f2779e.f12668f.m1276f()) {
            cuw = this.f2779e;
            for (int i = 0; i < 2; i++) {
                cvf = cuw.f12668f.f2352m[i];
                if (cvf != null) {
                    cvf.m1532a(0);
                }
            }
            this.f2779e.f12668f.f2354o.setVisibility(8);
            this.f2776b.m1541f();
        } else {
            cuw = this.f2779e.f12668f.f2350k;
            if (cuw.f12668f.m1277g()) {
                cvf = cuw.f12668f.f2352m[2];
                if (cvf != null) {
                    err e = cvf.f2797g.mo1066e();
                    if (e.mo1032f().m2075d()) {
                        Uri uri;
                        cvf cvf2 = cuw.f12668f.f2352m[2];
                        if (cvf2 == null) {
                            uri = Uri.EMPTY;
                        } else {
                            uri = cvf2.f2798h.mo1033g().f4155h;
                        }
                        RectF rectF = new RectF();
                        rectF.left = cvf.f2792b.getX();
                        rectF.top = cvf.f2792b.getY();
                        rectF.right = rectF.left + (((float) cvf.f2792b.getWidth()) * cvf.f2792b.getScaleX());
                        rectF.bottom = (cvf.f2792b.getScaleY() * ((float) cvf.f2792b.getHeight())) + rectF.top;
                        if (!(uri == null || uri == Uri.EMPTY)) {
                            int l = e.mo1038l();
                            hfu hfu = cuw.f12668f.f2354o;
                            if (!uri.equals(hfu.f6174e)) {
                                hfu.f6174e = uri;
                                hfu.f6175f = l;
                            }
                            hfu.m3108a();
                            hfu.f6173d = new hfw(hfu);
                            hfu.f6173d.execute(new RectF[]{rectF});
                        }
                    }
                }
            }
        }
        cuw cuw2 = this.f2779e;
        cuw2.f12664b = null;
        cuw2.f12668f.m1283m();
        this.f2779e.f12668f.invalidate();
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        int i = 0;
        this.f2779e.f12668f.f2354o.setVisibility(8);
        cuw cuw = this.f2779e;
        FilmstripView filmstripView = cuw.f12668f;
        if (filmstripView.f2349j == 1.0f) {
            while (i < 2) {
                cvf cvf = cuw.f12668f.f2352m[i];
                if (cvf != null) {
                    cvf.m1532a(4);
                }
                i++;
            }
        } else if (filmstripView.m1277g()) {
            cuw cuw2 = this.f2779e.f12668f.f2350k;
            for (int i2 = 0; i2 < 2; i2++) {
                cvf cvf2 = cuw2.f12668f.f2352m[i2];
                if (cvf2 != null) {
                    cvf2.m1532a(0);
                }
            }
        }
        this.f2779e.f12668f.f2354o.m3108a();
    }
}
