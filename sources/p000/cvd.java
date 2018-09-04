package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.graphics.RectF;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: cvd */
final class cvd implements AnimatorListener {
    /* renamed from: a */
    private boolean f2789a = false;
    /* renamed from: b */
    private final /* synthetic */ cuw f2790b;

    cvd(cuw cuw) {
        this.f2790b = cuw;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f2789a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f2789a) {
            cuw cuw = this.f2790b;
            if (cuw.f12668f.m1277g()) {
                cvf cvf = cuw.f12668f.f2352m[2];
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
        this.f2790b.f12665c = null;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
