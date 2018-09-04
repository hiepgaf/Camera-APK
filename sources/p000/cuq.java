package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cuq */
public final class cuq implements cth {
    /* renamed from: a */
    private float f12657a;
    /* renamed from: b */
    private float f12658b;
    /* renamed from: c */
    private int f12659c = 0;
    /* renamed from: d */
    private float f12660d;
    /* renamed from: e */
    private cvf f12661e;
    /* renamed from: f */
    private final /* synthetic */ FilmstripView f12662f;

    public cuq(FilmstripView filmstripView) {
        this.f12662f = filmstripView;
    }

    /* renamed from: a */
    public final boolean mo1083a(float f, float f2) {
        float f3 = 1.0f;
        FilmstripView filmstripView = this.f12662f;
        cvf cvf = filmstripView.f2352m[2];
        if (cvf == null) {
            return false;
        }
        if (filmstripView.m1275e()) {
            this.f12662f.f2350k.mo1077c();
            return true;
        }
        filmstripView = this.f12662f;
        if (filmstripView.f2349j < 1.0f) {
            return false;
        }
        if (!filmstripView.f2350k.m8786b(false)) {
            return false;
        }
        cuw cuw;
        ValueAnimator valueAnimator;
        float a;
        if (this.f12662f.m1276f()) {
            cuw = this.f12662f.f2350k;
            valueAnimator = cuw.f12664b;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            a = cuw.m8776a(false);
            if (cuw.f12668f.f2349j < a - (0.1f * a)) {
                f3 = a;
            }
            cuw.f12664b = new ValueAnimator();
            cuw.f12664b.setFloatValues(new float[]{cuw.f12668f.f2349j, f3});
            cuw.f12664b.setDuration(200);
            cuw.f12664b.addListener(new cuz(cuw, f3, cvf, f, f2));
            cuw.f12664b.addUpdateListener(new cva(cuw, cvf, f, f2));
            cuw.f12664b.start();
            cvf cvf2 = this.f12662f.f2352m[2];
            if (!(cvf2 == null || cvf2.f2799i == go.f5562Z)) {
                cvf2.f2799i = go.f5562Z;
                String str = FilmstripView.f2338a;
                int i = cvf2.f2795e;
                StringBuilder stringBuilder = new StringBuilder(43);
                stringBuilder.append("[ViewItem:");
                stringBuilder.append(i);
                stringBuilder.append("] data.renderFullRes()");
                bli.m863a(str, stringBuilder.toString());
                cvf2.f2798h.mo1044b(cvf2.f2792b);
            }
            return true;
        }
        filmstripView = this.f12662f;
        if (filmstripView.f2349j > 1.0f) {
            cuw = filmstripView.f2350k;
            valueAnimator = cuw.f12664b;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            a = cuw.m8776a(false);
            if (cuw.f12668f.f2349j < a - (0.1f * a)) {
                f3 = a;
            }
            cuw.f12664b = new ValueAnimator();
            cuw.f12664b.setFloatValues(new float[]{cuw.f12668f.f2349j, f3});
            cuw.f12664b.setDuration(200);
            cuw.f12664b.addListener(new cuz(cuw, f3, cvf, f, f2));
            cuw.f12664b.addUpdateListener(new cva(cuw, cvf, f, f2));
            cuw.f12664b.start();
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo1087b(float f, float f2) {
        this.f12659c = 0;
        SystemClock.uptimeMillis();
        this.f12660d = f2;
        cuw cuw = this.f12662f.f2350k;
        if (cuw.m8792g()) {
            cuw.f12665c.cancel();
        }
        if (this.f12662f.f2350k.m8786b(false)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo1089c(float f, float f2) {
        FilmstripView filmstripView = this.f12662f;
        cvf cvf = filmstripView.f2352m[2];
        if (cvf == null) {
            return false;
        }
        cuw cuw;
        float b;
        if (filmstripView.m1277g()) {
            cuw = this.f12662f.f2350k;
            if (cuw.f12668f.m1277g()) {
                cvf = cuw.f12668f.f2352m[2];
                if (cvf != null) {
                    float pow = (float) (Math.pow((double) Math.max(Math.abs(f), Math.abs(f2)), 0.3333333432674408d) * 0.05000000074505806d);
                    b = cvf.m1534b() * cuw.f12668f.f2349j;
                    float c = cvf.m1537c() * cuw.f12668f.f2349j;
                    float[] fArr = new float[2];
                    fArr[0] = b;
                    fArr[1] = b + ((pow / 4.0f) * f);
                    Animator ofFloat = ValueAnimator.ofFloat(fArr);
                    Animator ofFloat2 = ValueAnimator.ofFloat(new float[]{c, (r7 * f2) + c});
                    ofFloat2.addUpdateListener(new cvb(cuw, ofFloat, ofFloat2, cvf));
                    cuw.f12665c = new AnimatorSet();
                    cuw.f12665c.play(ofFloat).with(ofFloat2);
                    cuw.f12665c.setDuration((long) ((int) (1000.0f * pow)));
                    cuw.f12665c.setInterpolator(new cvc());
                    cuw.f12665c.addListener(new cvd(cuw));
                    cuw.f12665c.start();
                }
            }
            return true;
        } else if (Math.abs(f) < Math.abs(f2)) {
            return true;
        } else {
            FilmstripView filmstripView2;
            if (this.f12662f.f2349j == 1.0f) {
                int a = cvf.m1527a();
                cvf cvf2;
                if (f > 0.0f) {
                    filmstripView2 = this.f12662f;
                    if (filmstripView2.f2351l <= a) {
                        cvf2 = filmstripView2.f2352m[1];
                        if (cvf2 == null) {
                            return false;
                        }
                        filmstripView2.f2350k.m8779a(cvf2.m1527a(), 400, true);
                    } else {
                        filmstripView2.f2350k.m8779a(a, 400, true);
                        return true;
                    }
                } else if (this.f12662f.f2350k.m8786b(false)) {
                    filmstripView2 = this.f12662f;
                    if (filmstripView2.f2351l >= a) {
                        cvf2 = filmstripView2.f2352m[3];
                        if (cvf2 == null) {
                            return false;
                        }
                        filmstripView2.f2350k.m8779a(cvf2.m1527a(), 400, true);
                    } else {
                        filmstripView2.f2350k.m8779a(a, 400, true);
                        return true;
                    }
                }
            }
            filmstripView = this.f12662f;
            if (filmstripView.f2349j == 0.7f) {
                cuw = filmstripView.f2350k;
                if (cuw.m8786b(false)) {
                    filmstripView2 = cuw.f12668f;
                    cvf cvf3 = filmstripView2.f2352m[2];
                    if (cvf3 != null) {
                        b = f / filmstripView2.f2349j;
                        if (filmstripView2.m1276f() && b < 0.0f) {
                            cuw.m8791f();
                        }
                        int width = cuw.f12668f.getWidth();
                        int i = cvf3.f2795e;
                        int i2 = cvf3.f2796f;
                        filmstripView2 = cuw.f12668f;
                        int i3 = filmstripView2.f2347h;
                        int d = filmstripView2.f2346g.mo1019d();
                        filmstripView2 = cuw.f12668f;
                        int i4 = filmstripView2.f2347h;
                        cur cur = cuw.f12666d;
                        i3 += width;
                        i = i2 + ((width + i4) * ((d - i) + 100));
                        cur.f2763c.fling(filmstripView2.f2351l, 0, (int) (-f), 0, i2 - (i3 * (i + 100)), i, 0, 0);
                        Handler handler = cur.f2761a;
                        if (!(handler == null || cur.f2762b == null)) {
                            handler.removeCallbacks(cur.f2765e);
                            cur.f2761a.post(cur.f2765e);
                        }
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    public final void mo1090d(float f, float f2) {
        if (this.f12662f.m1274d() != cre.f2587c) {
            this.f12662f.f2353n;
            this.f12662f.m1274d();
        }
    }

    /* renamed from: a */
    public final boolean mo1086a(float f, float f2, int i, long j) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo1088b(float f, float f2, int i, long j) {
        return false;
    }

    /* renamed from: e */
    public final boolean mo1091e(float f, float f2) {
        if (!this.f12662f.f2350k.m8793h()) {
            FilmstripView filmstripView = this.f12662f;
            if (!filmstripView.f2357r) {
                filmstripView.f2358s = true;
                if (filmstripView.m1277g()) {
                    filmstripView.f2350k.f12668f.f2354o.m3108a();
                    filmstripView.f2354o.setVisibility(8);
                }
                this.f12661e = this.f12662f.f2352m[2];
                cvf cvf = this.f12661e;
                if (!(cvf == null || cvf.f2801k)) {
                    cvf.f2801k = true;
                    cvf.f2792b.setAlpha(1.0f);
                }
                this.f12657a = 1.0f;
                this.f12658b = Math.max(this.f12662f.f2350k.m8776a(true), 1.0f);
                return true;
            }
        }
        this.f12662f.f2358s = false;
        return false;
    }

    /* renamed from: a */
    public final void mo1082a() {
        FilmstripView filmstripView = this.f12662f;
        if (filmstripView.f2358s) {
            filmstripView.f2358s = false;
            cvf cvf = this.f12661e;
            if (cvf != null) {
                cvf.f2801k = false;
            }
            filmstripView.m1283m();
            filmstripView = this.f12662f;
            if (filmstripView.f2349j <= 1.1f) {
                int i;
                cuw cuw = filmstripView.f2350k;
                for (i = 0; i < 2; i++) {
                    cvf cvf2 = cuw.f12668f.f2352m[i];
                    if (cvf2 != null) {
                        cvf2.m1532a(0);
                    }
                }
                filmstripView = this.f12662f;
                float f = filmstripView.f2349j;
                if (f <= 0.8f) {
                    filmstripView.f2350k.m8791f();
                } else if (this.f12657a > 1.0f || f > 0.9f) {
                    if (filmstripView.m1277g()) {
                        filmstripView = this.f12662f;
                        filmstripView.f2349j = 1.0f;
                        filmstripView.m1281k();
                    }
                    this.f12662f.f2350k.mo1077c();
                    FilmstripView filmstripView2 = this.f12662f;
                    cvf cvf3 = filmstripView2.f2352m[2];
                    if (cvf3 != null) {
                        if (filmstripView2.m1278h() || !filmstripView2.m1270b()) {
                            cve cve = filmstripView2.f2364y;
                            if (cve != null) {
                                cve.mo772a(cvf3.f2798h);
                            }
                        } else if (filmstripView2.f2350k.m8793h() || filmstripView2.f2357r) {
                            String str = FilmstripView.f2338a;
                            boolean h = filmstripView2.f2350k.m8793h();
                            StringBuilder stringBuilder = new StringBuilder(41);
                            stringBuilder.append("[fling] mController.isScrolling() - ");
                            stringBuilder.append(h);
                            bli.m871d(str, stringBuilder.toString());
                        } else {
                            int a = cvf3.m1527a();
                            i = (int) ((((float) Math.abs(filmstripView2.f2351l - a)) * 600.0f) / ((float) filmstripView2.f2348i.width()));
                            if (i < 0) {
                                i = 400;
                            }
                            bli.m871d(FilmstripView.f2338a, "[fling] Scroll to center.");
                            filmstripView2.f2350k.m8779a(a, i, false);
                        }
                    }
                } else {
                    filmstripView.f2350k.m8791f();
                }
                this.f12657a = 1.0f;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1084a(float f, float f2, float f3) {
        int i = 0;
        FilmstripView filmstripView = this.f12662f;
        if (!filmstripView.f2358s) {
            return false;
        }
        this.f12657a = (this.f12657a * 0.3f) + (f3 * 0.7f);
        float f4 = filmstripView.f2349j;
        float f5 = f4 * f3;
        FilmstripView filmstripView2;
        if (f4 < 1.0f && f5 < 1.0f) {
            float f6;
            if (f5 <= 0.7f) {
                f6 = 0.7f;
            } else {
                f6 = f5;
            }
            if (f4 != f6) {
                if (f4 == 0.7f && filmstripView.f2353n != null) {
                    filmstripView.m1274d();
                }
                if (f6 == 0.7f) {
                    filmstripView2 = this.f12662f;
                    bli.m863a(FilmstripView.f2338a, "onEnterFilmstrip()");
                    cst cst = filmstripView2.f2353n;
                    if (cst != null) {
                        filmstripView2.m1274d();
                        cst.m8719c();
                    }
                }
            }
            filmstripView2 = this.f12662f;
            filmstripView2.f2349j = f6;
            filmstripView2.invalidate();
        } else if (f4 < 1.0f && f5 >= 1.0f) {
            if (f4 == 0.7f && filmstripView.f2353n != null) {
                filmstripView.m1274d();
            }
            r0 = this.f12662f;
            r0.f2349j = 1.0f;
            r0.f2360u = false;
            r1 = r0.f2353n;
            if (r1 != null) {
                r0.m1274d();
                r1.m8720d();
            }
            cuw cuw = this.f12662f.f2350k;
            while (i < 2) {
                cvf cvf = cuw.f12668f.f2352m[i];
                if (cvf != null) {
                    cvf.m1532a(4);
                }
                i++;
            }
            this.f12662f.invalidate();
        } else if (f4 < 1.0f || f5 >= 1.0f) {
            if (!filmstripView.m1277g()) {
                cuw cuw2 = this.f12662f.f2350k;
                for (int i2 = 0; i2 < 2; i2++) {
                    cvf cvf2 = cuw2.f12668f.f2352m[i2];
                    if (cvf2 != null) {
                        cvf2.m1532a(4);
                    }
                }
            }
            cvf cvf3 = this.f12662f.f2352m[2];
            float min = Math.min(f5, this.f12658b);
            filmstripView2 = this.f12662f;
            f5 = filmstripView2.f2349j;
            if (min == f5) {
                return true;
            }
            cvf3.m1530a(f, f2, min / f5, filmstripView2.f2348i.width(), this.f12662f.f2348i.height());
            r0 = this.f12662f;
            r0.f2349j = min;
            if (r0.f2349j == 1.0f) {
                r0.f2360u = false;
                r1 = r0.f2353n;
                if (r1 != null) {
                    r0.m1274d();
                    r1.m8720d();
                }
            }
            cvf3 = this.f12662f.f2352m[2];
            if (!(cvf3 == null || cvf3.f2799i == go.f5562Z)) {
                cvf3.f2799i = go.f5562Z;
                String str = FilmstripView.f2338a;
                int i3 = cvf3.f2795e;
                StringBuilder stringBuilder = new StringBuilder(43);
                stringBuilder.append("[ViewItem:");
                stringBuilder.append(i3);
                stringBuilder.append("] data.renderFullRes()");
                bli.m863a(str, stringBuilder.toString());
                cvf3.f2798h.mo1044b(cvf3.f2792b);
            }
        } else {
            filmstripView.f2349j = 1.0f;
            filmstripView.invalidate();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo1085a(float f, float f2, float f3, float f4, float f5, float f6, int i, long j) {
        FilmstripView filmstripView = this.f12662f;
        cvf cvf = filmstripView.f2352m[2];
        if (cvf == null) {
            return false;
        }
        if (i > 1) {
            return false;
        }
        if (filmstripView.m1277g()) {
            filmstripView.f2350k.f12668f.f2354o.m3108a();
            filmstripView.f2354o.setVisibility(8);
        }
        if (this.f12662f.m1277g()) {
            cvf cvf2 = this.f12662f.f2352m[2];
            float b = cvf2.m1534b();
            float f7 = this.f12662f.f2349j;
            float c = cvf2.m1537c();
            FilmstripView filmstripView2 = this.f12662f;
            float f8 = filmstripView2.f2349j;
            cvf2.m1529a((b * f7) - f5, (c * f8) - f6, f8, f8, filmstripView2.f2348i.width(), this.f12662f.f2348i.height());
            return true;
        }
        filmstripView = this.f12662f;
        int i2 = (int) (f5 / filmstripView.f2349j);
        filmstripView.f2350k.m8786b(true);
        filmstripView = this.f12662f;
        if (!filmstripView.f2357r) {
            filmstripView.f2357r = true;
        }
        int i3;
        if (filmstripView.m1275e()) {
            if (this.f12659c == 0) {
                if (Math.abs(f5) > Math.abs(f6)) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                this.f12659c = i3;
            }
            if (this.f12659c != 2) {
                Rect rect = new Rect();
                int i4 = 0;
                while (i4 < 5) {
                    cvf2 = this.f12662f.f2352m[i4];
                    if (cvf2 != null) {
                        cvf2.f2792b.getHitRect(rect);
                        if (rect.contains((int) f3, (int) f4)) {
                            break;
                        }
                    }
                    i4++;
                }
                if (i4 == 5) {
                    return true;
                }
                err e = this.f12662f.f2352m[i4].f2797g.mo1066e();
                float c2 = this.f12662f.f2352m[i4].m1537c() - (f6 / this.f12662f.f2349j);
                if (!e.mo1032f().m2074c() && c2 > 0.0f) {
                    c2 = 0.0f;
                }
                if (!e.mo1032f().m2074c() && r0 < 0.0f) {
                    c2 = 0.0f;
                }
                this.f12662f.f2352m[i4].m1538c(c2);
            } else if (this.f12662f.f2351l == cvf.m1527a() && cvf.m1539d() && f5 < 0.0f) {
                this.f12662f.f2357r = false;
                this.f12659c = 0;
                return false;
            } else {
                this.f12662f.f2350k.m8778a((float) i2);
            }
        } else if (this.f12662f.m1276f()) {
            if (this.f12659c == 0) {
                if (Math.abs(f5) > Math.abs(f6)) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                this.f12659c = i3;
            }
            if (this.f12659c != 1) {
                filmstripView = this.f12662f;
                if (filmstripView.f2352m[2] == null || (i2 < 0 && filmstripView.f2351l <= cvf.m1527a() && cvf.m1539d())) {
                    this.f12662f.f2357r = false;
                    this.f12659c = 0;
                    return false;
                }
                this.f12662f.f2350k.m8778a((float) i2);
            } else if (this.f12662f.m1278h()) {
                return false;
            } else {
                return true;
            }
        }
        this.f12662f.invalidate();
        return true;
    }

    /* renamed from: f */
    public final boolean mo1092f(float f, float f2) {
        FilmstripView filmstripView = this.f12662f;
        cvf cvf = filmstripView.f2352m[2];
        if (cvf == null) {
            return false;
        }
        err err = cvf.f2798h;
        if (filmstripView.m1275e() && cvf.f2793c.contains(f, f2)) {
            if (!(err == null || err.mo1030a(this.f12662f.f2341b, cvf.f2797g))) {
                this.f12662f.f2350k.mo1077c();
            }
            return true;
        } else if (!this.f12662f.m1276f() && !this.f12662f.m1277g()) {
            return false;
        } else {
            if (!(err == null || err.mo1030a(this.f12662f.f2341b, cvf.f2797g))) {
                filmstripView = this.f12662f;
                cst cst;
                if (filmstripView.f2360u) {
                    filmstripView.f2360u = false;
                    cst = filmstripView.f2353n;
                    if (cst != null) {
                        filmstripView.m1274d();
                        cst.m8720d();
                    }
                    this.f12662f.f2343d.mo2835l();
                } else {
                    filmstripView.f2360u = true;
                    cst = filmstripView.f2353n;
                    if (cst != null) {
                        filmstripView.m1274d();
                        cfk cfk = cst.f12618a;
                        if (cfk.f20273X) {
                            cfk.f20269T = true;
                            cfk.m14972Q();
                            cfk cfk2 = cst.f12618a;
                            ikd.m12259a();
                            if (!cfk2.f20270U) {
                                bli.m871d(cfk.f20249a, "stopPreviewWhenEnteringFilmstrip");
                                cfk2.f20270U = true;
                                cfk2.f20296v.execute(cfk2.ac);
                                cfk2.ad.mo348a((Boolean) cfk2.f20276b.mo693b().mo2860b());
                            }
                        }
                    }
                    this.f12662f.f2343d.mo2835l();
                }
            }
            return true;
        }
    }

    /* renamed from: g */
    public final boolean mo1093g(float f, float f2) {
        FilmstripView filmstripView = this.f12662f;
        if (filmstripView.f2352m[2] == null) {
            return false;
        }
        if (filmstripView.f2350k.m8794i() || this.f12662f.f2350k.m8792g()) {
            return false;
        }
        cvf cvf;
        if (this.f12662f.m1277g()) {
            cuw cuw = this.f12662f.f2350k;
            if (cuw.f12668f.m1277g()) {
                cvf cvf2 = cuw.f12668f.f2352m[2];
                if (cvf2 != null) {
                    err e = cvf2.f2797g.mo1066e();
                    if (e.mo1032f().m2075d()) {
                        Uri uri;
                        cvf = cuw.f12668f.f2352m[2];
                        if (cvf == null) {
                            uri = Uri.EMPTY;
                        } else {
                            uri = cvf.f2798h.mo1033g().f4155h;
                        }
                        RectF rectF = new RectF();
                        rectF.left = cvf2.f2792b.getX();
                        rectF.top = cvf2.f2792b.getY();
                        rectF.right = rectF.left + (((float) cvf2.f2792b.getWidth()) * cvf2.f2792b.getScaleX());
                        rectF.bottom = (cvf2.f2792b.getScaleY() * ((float) cvf2.f2792b.getHeight())) + rectF.top;
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
            return true;
        }
        int i;
        FilmstripView filmstripView2;
        this.f12662f.getHeight();
        this.f12662f.getHeight();
        this.f12662f.f2357r = false;
        this.f12659c = 0;
        Math.abs(f2 - this.f12660d);
        SystemClock.uptimeMillis();
        for (i = 0; i < 5; i++) {
            cvf cvf3 = this.f12662f.f2352m[i];
            if (!(cvf3 == null || cvf3.m1537c() == 0.0f)) {
                filmstripView2 = this.f12662f;
                filmstripView2.m1267a(filmstripView2.f2352m[i]);
            }
        }
        filmstripView2 = this.f12662f;
        cvf = filmstripView2.f2352m[2];
        if (cvf == null) {
            return true;
        }
        if (cvf != null) {
            if (filmstripView2.m1278h() || !filmstripView2.m1270b()) {
                cve cve = filmstripView2.f2364y;
                if (cve != null) {
                    cve.mo772a(cvf.f2798h);
                }
            } else if (filmstripView2.f2350k.m8793h() || filmstripView2.f2357r) {
                String str = FilmstripView.f2338a;
                boolean h = filmstripView2.f2350k.m8793h();
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("[fling] mController.isScrolling() - ");
                stringBuilder.append(h);
                bli.m871d(str, stringBuilder.toString());
            } else {
                int a = cvf.m1527a();
                i = (int) ((((float) Math.abs(filmstripView2.f2351l - a)) * 600.0f) / ((float) filmstripView2.f2348i.width()));
                if (i < 0) {
                    i = 400;
                }
                bli.m871d(FilmstripView.f2338a, "[fling] Scroll to center.");
                filmstripView2.f2350k.m8779a(a, i, false);
            }
        }
        return false;
    }
}
