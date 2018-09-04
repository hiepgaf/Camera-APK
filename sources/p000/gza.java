package p000;

import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: gza */
public final class gza {
    /* renamed from: a */
    public float f5842a = 0.0f;
    /* renamed from: b */
    public float f5843b = 0.0f;
    /* renamed from: c */
    public final gyz f5844c;
    /* renamed from: d */
    public int f5845d;
    /* renamed from: e */
    public boolean f5846e = true;
    /* renamed from: f */
    private final WindowManager f5847f;
    /* renamed from: g */
    private final ilp f5848g;

    static {
        bli.m862a("PrevSwipeGstMgr");
    }

    public gza(gyz gyz, WindowManager windowManager, ilp ilp) {
        this.f5844c = gyz;
        this.f5847f = windowManager;
        this.f5848g = ilp;
    }

    /* renamed from: a */
    public final boolean m2942a(boolean z) {
        if (!this.f5846e || m2939b(z)) {
            return false;
        }
        int i;
        if (this.f5842a > 0.0f) {
            i = go.bn;
        } else {
            i = go.bo;
        }
        float max = Math.max(0.0f, Math.min(1.0f, Math.abs(this.f5842a) / 250.0f));
        if (((double) Math.abs(this.f5842a)) < 125.0d) {
            if (Math.abs(this.f5843b) > 3.0f) {
                this.f5844c.m2929a(max, i);
            } else {
                this.f5844c.m2933b(max, i);
                m2940a();
            }
        } else if (Math.abs(this.f5842a) < 250.0f) {
            this.f5844c.m2929a(max, i);
        } else {
            gyz gyz = this.f5844c;
            if (gyz.m2936b(i)) {
                hhx a = gyz.m2928a(i);
                if (a != null) {
                    gyz.m2938c(a);
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m2941a(float f, boolean z) {
        if (!m2939b(z)) {
            if (this.f5847f.getDefaultDisplay().getRotation() == 1) {
                f = -f;
            }
            this.f5843b = f / 1000.0f;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m2943b(float f, boolean z) {
        if (!this.f5846e) {
            return false;
        }
        if (m2939b(z)) {
            return false;
        }
        if (z && this.f5847f.getDefaultDisplay().getRotation() == 1) {
            f = -f;
        }
        this.f5842a += f;
        int i = this.f5845d + 1;
        this.f5845d = i;
        if (i > 2) {
            float f2;
            if (this.f5842a <= 0.0f) {
                i = go.bo;
            } else {
                i = go.bn;
            }
            if (this.f5842a > 0.0f && this.f5844c.m2935b()) {
                f2 = 0.0f;
            } else if (this.f5842a >= 0.0f || !this.f5844c.m2932a()) {
                float max = Math.max(0.0f, Math.min(1.0f, Math.abs(this.f5842a) / 250.0f));
                gyz gyz = this.f5844c;
                if (gyz.m2936b(i)) {
                    hhx a = gyz.m2928a(i);
                    if (a != null) {
                        if (!gyz.f5831e && ((double) max) > 0.0d) {
                            gyz.m2930a(a);
                            gyz.f5831e = true;
                        }
                        gyz.f5829c.m8431a();
                        gyz.f5829c.setAlpha(max);
                        gyz.f5829c.m8432a((int) ((1.0f - max) * 250.0f), a, i);
                        if (!gyz.f5833g) {
                            boolean z2;
                            BottomBarController bottomBarController = gyz.f5827a;
                            if (i == go.bo) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            bottomBarController.setProgress(max, z2);
                        }
                        if (max <= 0.0f) {
                            gyz.m2937c();
                            gyz.f5831e = false;
                        }
                    }
                    f2 = max;
                } else {
                    f2 = max;
                }
            } else {
                f2 = 0.0f;
            }
            if (f2 == 0.0f) {
                this.f5844c.m2933b(0.0f, i);
                m2940a();
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void m2940a() {
        this.f5845d = 0;
        this.f5842a = 0.0f;
        this.f5843b = 0.0f;
        gyz gyz = this.f5844c;
        if (gyz.f5833g) {
            if (gyz.f5834h.mo2084b()) {
                ((gzf) gyz.f5834h.mo2081a()).m2947c();
            }
        } else if (gyz.f5832f == hhx.PHOTO) {
            gyz.f5827a.setProgress(1.0f, true);
        } else {
            gyz.f5827a.setProgress(1.0f, false);
        }
        gyz.m2937c();
    }

    /* renamed from: b */
    private final boolean m2939b(boolean z) {
        if (z && (((Boolean) this.f5848g.mo2860b()).booleanValue() || this.f5847f.getDefaultDisplay().getRotation() == 0 || this.f5847f.getDefaultDisplay().getRotation() == 2)) {
            return true;
        }
        return false;
    }
}
