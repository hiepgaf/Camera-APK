package p000;

import android.graphics.PointF;
import com.google.android.apps.camera.legacy.app.filmstrip.transition.FilmstripTransitionLayout;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;

/* compiled from: PG */
/* renamed from: ctm */
public final class ctm implements cth {
    /* renamed from: a */
    public final ctg f12630a;
    /* renamed from: b */
    public cth f12631b;
    /* renamed from: c */
    public int f12632c;
    /* renamed from: d */
    private final ctn f12633d;
    /* renamed from: e */
    private final float f12634e;
    /* renamed from: f */
    private long f12635f = -1;
    /* renamed from: g */
    private int f12636g;
    /* renamed from: h */
    private double f12637h;
    /* renamed from: i */
    private boolean f12638i;
    /* renamed from: j */
    private long f12639j;

    public ctm(ctn ctn, ctg ctg, float f) {
        this.f12633d = (ctn) jri.m13152b((Object) ctn);
        this.f12630a = (ctg) jri.m13152b((Object) ctg);
        this.f12634e = f;
        ctg.mo1080a((cth) this);
    }

    /* renamed from: b */
    public final void m8746b() {
        if (this.f12637h > ((double) this.f12634e)) {
            this.f12632c = go.f5555S;
            this.f12633d.m1509b();
            return;
        }
        this.f12632c = go.f5556T;
        this.f12633d.m1507a();
    }

    /* renamed from: a */
    public final boolean mo1083a(float f, float f2) {
        if (this.f12632c == go.f5553Q) {
            cth cth = this.f12631b;
            if (cth != null) {
                return cth.mo1083a(f, f2);
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo1087b(float f, float f2) {
        this.f12632c = go.f5553Q;
        this.f12635f = -1;
        this.f12638i = true;
        this.f12637h = 0.0d;
        cth cth = this.f12631b;
        return cth != null ? cth.mo1087b(f, f2) : false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public final boolean mo1089c(float r6, float r7) {
        /*
        r5 = this;
        r4 = 1;
        r0 = r5.f12632c;
        r1 = p000.go.f5553Q;
        if (r0 != r1) goto L_0x0012;
    L_0x0007:
        r0 = r5.f12631b;
        if (r0 == 0) goto L_0x0012;
    L_0x000b:
        r0 = r0.mo1089c(r6, r7);
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        return r4;
    L_0x0012:
        r0 = r5.f12632c;
        r1 = p000.go.f5554R;
        if (r0 != r1) goto L_0x0011;
    L_0x0018:
        r0 = r5.f12637h;
        r2 = r5.f12634e;
        r2 = (double) r2;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0039;
    L_0x0021:
        r0 = r5.f12638i;
        if (r0 == 0) goto L_0x002f;
    L_0x0025:
        r0 = p000.go.f5555S;
        r5.f12632c = r0;
        r0 = r5.f12633d;
        r0.m1509b();
        goto L_0x0011;
    L_0x002f:
        r0 = p000.go.f5556T;
        r5.f12632c = r0;
        r0 = r5.f12633d;
        r0.m1507a();
        goto L_0x0011;
    L_0x0039:
        r0 = p000.go.f5556T;
        r5.f12632c = r0;
        r0 = r5.f12633d;
        r0.m1507a();
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: ctm.c(float, float):boolean");
    }

    /* renamed from: d */
    public final void mo1090d(float f, float f2) {
        if (this.f12632c == go.f5553Q) {
            cth cth = this.f12631b;
            if (cth != null) {
                cth.mo1090d(f, f2);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1086a(float f, float f2, int i, long j) {
        if (this.f12632c == go.f5553Q) {
            cth cth = this.f12631b;
            if (cth != null) {
                return cth.mo1086a(f, f2, i, j);
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo1088b(float f, float f2, int i, long j) {
        if (i == 2) {
            this.f12639j = j;
        } else if (i == 1) {
            this.f12639j = 0;
        }
        if (this.f12632c == go.f5553Q) {
            cth cth = this.f12631b;
            if (cth != null) {
                return cth.mo1088b(f, f2, i, j);
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo1091e(float f, float f2) {
        if (this.f12632c == go.f5553Q) {
            this.f12632c = go.f5557U;
        }
        cth cth = this.f12631b;
        return cth != null ? cth.mo1091e(f, f2) : false;
    }

    /* renamed from: a */
    public final void mo1082a() {
        cth cth = this.f12631b;
        if (cth != null) {
            cth.mo1082a();
        }
    }

    /* renamed from: a */
    public final boolean mo1084a(float f, float f2, float f3) {
        cth cth = this.f12631b;
        return cth != null ? cth.mo1084a(f, f2, f3) : false;
    }

    /* renamed from: a */
    public final boolean mo1085a(float f, float f2, float f3, float f4, float f5, float f6, int i, long j) {
        boolean z;
        float f7;
        cth cth;
        float f8 = f3 - f;
        float f9 = f4 - f2;
        double hypot = Math.hypot((double) f8, (double) f9);
        if (hypot > this.f12637h) {
            z = true;
        } else {
            z = false;
        }
        this.f12638i = z;
        this.f12637h = hypot;
        int a = go.m2647a(f8, f9);
        float f10 = (float) (this.f12637h / ((double) this.f12634e));
        if (f10 > 1.0f) {
            f7 = 1.0f;
        } else {
            f7 = f10;
        }
        if (this.f12632c == go.f5553Q) {
            cth = this.f12631b;
            if (cth != null && cth.mo1085a(f, f2, f3, f4, f5, f6, i, j)) {
                return true;
            }
            if (a == go.f5559W) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f12635f < 0) {
                this.f12635f = currentTimeMillis;
                return false;
            } else if (i > 1) {
                return false;
            } else {
                this.f12632c = go.f5554R;
                this.f12636g = a;
                ctn ctn = this.f12633d;
                PeekableFilmstripLayout peekableFilmstripLayout = ctn.f2699a;
                peekableFilmstripLayout.f12257c.setTranslationX((float) peekableFilmstripLayout.getMeasuredWidth());
                peekableFilmstripLayout = ctn.f2699a;
                peekableFilmstripLayout.setBackgroundColor(peekableFilmstripLayout.getResources().getColor(17170445, null));
                FilmstripTransitionLayout filmstripTransitionLayout = ctn.f2699a.f12260f;
                if (filmstripTransitionLayout.f2327k != null) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13153b(z);
                if (filmstripTransitionLayout.f2328l == null) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13153b(z);
                filmstripTransitionLayout.setVisibility(0);
                filmstripTransitionLayout.m1245b();
                ctu ctu = filmstripTransitionLayout.f2327k;
                float f11 = ctu.f2713a;
                PointF pointF = ctu.f2714b;
                filmstripTransitionLayout.f2328l = new cto(f11, pointF.x, pointF.y);
                ctn.f2699a.f12265k.mo2833j();
                ctn.f2699a.f12256b.m8721e();
            }
        }
        if (this.f12632c == go.f5554R && i <= 1) {
            if (this.f12636g == go.f5558V) {
                this.f12633d.m1508a(f5, 0.0f, f7);
            } else {
                this.f12633d.m1508a(f5, f6, f7);
            }
        }
        if (this.f12632c == go.f5557U) {
            if (Math.abs(j - this.f12639j) < 200) {
                return false;
            }
            cth = this.f12631b;
            if (cth != null && cth.mo1085a(f, f2, f3, f4, f5, f6, i, j)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo1092f(float f, float f2) {
        if (this.f12632c == go.f5553Q) {
            cth cth = this.f12631b;
            if (cth != null) {
                return cth.mo1092f(f, f2);
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo1093g(float f, float f2) {
        if (this.f12632c == go.f5557U) {
            this.f12632c = go.f5553Q;
        }
        if (this.f12632c == go.f5553Q) {
            cth cth = this.f12631b;
            if (cth != null) {
                return cth.mo1093g(f, f2);
            }
        }
        if (this.f12632c == go.f5554R) {
            m8746b();
        }
        return false;
    }
}
