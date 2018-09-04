package p000;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.util.List;

/* compiled from: PG */
/* renamed from: cuw */
public final class cuw implements csw {
    /* renamed from: a */
    public final ValueAnimator f12663a;
    /* renamed from: b */
    public ValueAnimator f12664b;
    /* renamed from: c */
    public AnimatorSet f12665c;
    /* renamed from: d */
    public final cur f12666d;
    /* renamed from: e */
    public boolean f12667e;
    /* renamed from: f */
    public final /* synthetic */ FilmstripView f12668f;
    /* renamed from: g */
    private final cuv f12669g = new cuv(this);
    /* renamed from: h */
    private final AnimatorUpdateListener f12670h = new cux(this);

    public cuw(FilmstripView filmstripView) {
        this.f12668f = filmstripView;
        TimeInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
        this.f12666d = new cur(filmstripView.f2342c.getContext(), new Handler(Looper.getMainLooper()), this.f12669g, decelerateInterpolator);
        this.f12667e = true;
        this.f12663a = new ValueAnimator();
        this.f12663a.addUpdateListener(this.f12670h);
        this.f12663a.setInterpolator(decelerateInterpolator);
        this.f12663a.addListener(new cuy(this));
    }

    /* renamed from: a */
    final float m8776a(boolean z) {
        cvf cvf = this.f12668f.f2352m[2];
        if (cvf == null) {
            return 1.0f;
        }
        err e = cvf.f2797g.mo1066e();
        if (e == null || !e.mo1032f().m2075d()) {
            return 1.0f;
        }
        float f = (float) e.mo1034h().f7329a;
        if (e.mo1038l() == 90 || e.mo1038l() == MediaDecoder.ROTATE_90_LEFT) {
            f = (float) e.mo1034h().f7330b;
        }
        f /= (float) cvf.f2792b.getWidth();
        if (z) {
            return f * this.f12668f.f2359t;
        }
        return f;
    }

    /* renamed from: a */
    public final cre mo1070a() {
        return this.f12668f.m1274d();
    }

    /* renamed from: f */
    public final void m8791f() {
        FilmstripView filmstripView = this.f12668f;
        if (filmstripView.f2352m[2] != null && filmstripView.f2349j != 0.7f) {
            m8775b(0.7f);
            filmstripView = this.f12668f;
            cvf[] cvfArr = filmstripView.f2352m;
            cvfArr = filmstripView.f2352m;
            if (filmstripView.f2349j == 0.7f && filmstripView.f2353n != null) {
                filmstripView.m1274d();
            }
        }
    }

    /* renamed from: b */
    public final void mo1075b() {
        cvf cvf = this.f12668f.f2352m[2];
        if (!(cvf == null || cvf.m1539d())) {
            this.f12668f.m1281k();
            FilmstripView filmstripView = this.f12668f;
            if (filmstripView.f2346g.mo998a(filmstripView.f2352m[2].f2797g) < 7) {
                this.f12668f.m1279i();
            } else {
                FilmstripView filmstripView2 = this.f12668f;
                bli.m869c(FilmstripView.f2338a, "loadAtBeginning()");
                List a = filmstripView2.f2346g.mo1010b(0).mo1060a(2);
                for (int i = 0; i < 5; i++) {
                    cvf cvf2 = filmstripView2.f2352m[i];
                    if (!(cvf2 == null || a.contains(cvf2.f2797g))) {
                        filmstripView2.f2352m[i].m1540e();
                    }
                    cre cre = (cre) a.get(i);
                    if (cre == cre.f2587c) {
                        filmstripView2.f2352m[i] = null;
                    } else {
                        int d = filmstripView2.m1273d(cre);
                        if (d == -1) {
                            filmstripView2.f2352m[i] = filmstripView2.m1271c(cre);
                        } else {
                            cvf[] cvfArr = filmstripView2.f2352m;
                            cvfArr[i] = cvfArr[d];
                        }
                    }
                }
                filmstripView2.f2351l = -1;
                filmstripView2.f2349j = 1.0f;
                filmstripView2.m1263a();
                filmstripView2.m1280j();
                filmstripView2.invalidate();
                cst cst = filmstripView2.f2353n;
                if (cst != null) {
                    cst.m8718b();
                    filmstripView2.f2353n.m8717a(filmstripView2.m1274d());
                }
            }
        }
        this.f12668f.m1281k();
        this.f12668f.m1282l();
    }

    /* renamed from: c */
    public final void mo1077c() {
        if (!this.f12668f.m1276f()) {
            m8775b(1.0f);
        }
    }

    /* renamed from: c */
    final boolean m8788c(int i) {
        cvf cvf = this.f12668f.f2352m[i];
        if (cvf == null) {
            return false;
        }
        m8786b(true);
        m8779a(cvf.m1527a(), 800, false);
        return true;
    }

    /* renamed from: a */
    public final boolean mo1073a(int i) {
        FilmstripView filmstripView = this.f12668f;
        cvf cvf = filmstripView.f2352m[2];
        if (cvf == null || filmstripView.f2346g.mo1000a(i) == null) {
            return false;
        }
        int i2 = cvf.f2795e;
        int a = cvf.m1527a();
        int i3 = i2;
        i2 = cvf.f2792b.getMeasuredWidth();
        while (i3 != i) {
            int i4;
            if (i3 >= i) {
                i4 = i3 - 1;
            } else {
                i4 = i3 + 1;
            }
            int i5 = i4 - i3;
            iqp g = this.f12668f.f2346g.mo1000a(i4).mo1033g().m2079g();
            if (g.f7330b > 0) {
                i3 = (this.f12668f.getMeasuredHeight() * g.f7329a) / g.f7330b;
            } else {
                i3 = LfuScheduler.MAX_PRIORITY;
            }
            i3 = Math.min(this.f12668f.getMeasuredWidth(), i3);
            a = ((((i2 / 2) + (i3 / 2)) + this.f12668f.f2347h) * i5) + a;
            i2 = i3;
            i3 = i4;
        }
        m8786b(true);
        m8779a(a, 800, false);
        return true;
    }

    /* renamed from: d */
    public final boolean mo1078d() {
        return m8788c(3);
    }

    /* renamed from: e */
    public final boolean mo1079e() {
        return m8788c(1);
    }

    /* renamed from: g */
    public final boolean m8792g() {
        AnimatorSet animatorSet = this.f12665c;
        return animatorSet != null && animatorSet.isRunning();
    }

    /* renamed from: h */
    public final boolean m8793h() {
        int i = 0;
        cur cur = this.f12666d;
        if (cur.f2763c.isFinished() && !cur.f2764d.isRunning()) {
            i = 1;
        }
        return i ^ 1;
    }

    /* renamed from: a */
    public final boolean mo1074a(err err) {
        for (cvf cvf : this.f12668f.f2352m) {
            if (err != null && cvf != null && cvf.f2792b.getVisibility() == 0 && err.equals(cvf.f2798h)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m8794i() {
        ValueAnimator valueAnimator = this.f12664b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* renamed from: b */
    private final void m8775b(float f) {
        if (this.f12668f.f2352m[2] != null) {
            this.f12663a.cancel();
            this.f12663a.setDuration(400);
            this.f12663a.setFloatValues(new float[]{this.f12668f.f2349j, f});
            this.f12663a.start();
        }
    }

    /* renamed from: a */
    public final void m8778a(float f) {
        if (m8786b(false)) {
            FilmstripView filmstripView = this.f12668f;
            filmstripView.f2351l = (int) (((float) filmstripView.f2351l) + f);
            if (filmstripView.m1272c()) {
                this.f12668f.f2350k.m8786b(true);
            }
            this.f12668f.invalidate();
        }
    }

    /* renamed from: a */
    public final void m8779a(int i, int i2, boolean z) {
        FilmstripView filmstripView = this.f12668f;
        if (filmstripView.f2352m[2] != null) {
            this.f12667e = z;
            cur cur = this.f12666d;
            int i3 = filmstripView.f2351l;
            cur.f2764d.cancel();
            cur.f2764d.setDuration((long) i2);
            cur.f2764d.setIntValues(new int[]{i3, (i - i3) + i3});
            cur.f2762b.f2771a = i3;
            cur.f2764d.start();
        }
    }

    /* renamed from: a */
    public final void mo1072a(hfz hfz) {
        FilmstripView filmstripView = this.f12668f;
        filmstripView.f2346g = hfz;
        int max = (int) (((float) Math.max(filmstripView.getHeight(), filmstripView.getWidth())) * 0.7f);
        filmstripView.f2346g.mo1013b(max, max);
        filmstripView.f2346g.mo1006a(new csz(new cup(filmstripView)));
    }

    /* renamed from: b */
    public final void mo1076b(int i) {
        this.f12668f.f2347h = i;
    }

    /* renamed from: a */
    public final void mo1071a(cst cst) {
        this.f12668f.f2353n = cst;
    }

    /* renamed from: b */
    public final boolean m8786b(boolean z) {
        if (!m8793h()) {
            return true;
        }
        if (!this.f12667e && !z) {
            return false;
        }
        cur cur = this.f12666d;
        cur.f2763c.forceFinished(true);
        cur.f2764d.cancel();
        return true;
    }
}
