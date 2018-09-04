package p000;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: kv */
public abstract class kv implements OnTouchListener {
    /* renamed from: q */
    private static final int f8616q = ViewConfiguration.getTapTimeout();
    /* renamed from: a */
    public final kw f8617a = new kw();
    /* renamed from: b */
    public final View f8618b;
    /* renamed from: c */
    public boolean f8619c;
    /* renamed from: d */
    public boolean f8620d;
    /* renamed from: e */
    public boolean f8621e;
    /* renamed from: f */
    private final Interpolator f8622f = new AccelerateInterpolator();
    /* renamed from: g */
    private Runnable f8623g;
    /* renamed from: h */
    private float[] f8624h = new float[]{0.0f, 0.0f};
    /* renamed from: i */
    private float[] f8625i = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    /* renamed from: j */
    private int f8626j;
    /* renamed from: k */
    private int f8627k;
    /* renamed from: l */
    private float[] f8628l = new float[]{0.0f, 0.0f};
    /* renamed from: m */
    private float[] f8629m = new float[]{0.0f, 0.0f};
    /* renamed from: n */
    private float[] f8630n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    /* renamed from: o */
    private boolean f8631o;
    /* renamed from: p */
    private boolean f8632p;

    /* renamed from: a */
    public abstract boolean mo2328a();

    /* renamed from: a */
    public abstract boolean mo2329a(int i);

    /* renamed from: b */
    public abstract void mo2330b(int i);

    public kv(View view) {
        this.f8618b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f = displayMetrics.density;
        float f2 = displayMetrics.density;
        float[] fArr = this.f8630n;
        f = ((float) ((int) ((f * 1575.0f) + 0.5f))) / 1000.0f;
        fArr[0] = f;
        fArr[1] = f;
        float[] fArr2 = this.f8629m;
        f2 = ((float) ((int) ((f2 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f2;
        fArr2[1] = f2;
        this.f8626j = 1;
        float[] fArr3 = this.f8625i;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        fArr3 = this.f8624h;
        fArr3[0] = 0.2f;
        fArr3[1] = 0.2f;
        fArr3 = this.f8628l;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f8627k = f8616q;
        kw kwVar = this.f8617a;
        kwVar.f8724a = 500;
        kwVar.f8725b = 500;
    }

    /* renamed from: a */
    private final float m5365a(int i, float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float a = kv.m5364a(this.f8624h[i] * f2, 0.0f, this.f8625i[i]);
        a = m5363a(f2 - f, a) - m5363a(f, a);
        if (a < 0.0f) {
            a = -this.f8622f.getInterpolation(-a);
        } else if (a > 0.0f) {
            a = this.f8622f.getInterpolation(a);
        } else {
            a = 0.0f;
            if (a == 0.0f) {
                return 0.0f;
            }
            f4 = this.f8628l[i];
            f5 = this.f8629m[i];
            f6 = this.f8630n[i];
            f4 *= f3;
            if (a <= 0.0f) {
                return kv.m5364a(a * f4, f5, f6);
            }
            return -kv.m5364a((-a) * f4, f5, f6);
        }
        a = kv.m5364a(a, -1.0f, 1.0f);
        if (a == 0.0f) {
            return 0.0f;
        }
        f4 = this.f8628l[i];
        f5 = this.f8629m[i];
        f6 = this.f8630n[i];
        f4 *= f3;
        if (a <= 0.0f) {
            return -kv.m5364a((-a) * f4, f5, f6);
        }
        return kv.m5364a(a * f4, f5, f6);
    }

    /* renamed from: a */
    static float m5364a(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* renamed from: a */
    private final float m5363a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f8626j;
        switch (i) {
            case 0:
            case 1:
                if (f >= f2) {
                    return 0.0f;
                }
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f8621e && i == 1) {
                    return 1.0f;
                }
                return 0.0f;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                return 0.0f;
            default:
                return 0.0f;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f8632p) {
            switch (motionEvent.getActionMasked()) {
                case 0:
                    this.f8620d = true;
                    this.f8631o = false;
                    break;
                case 1:
                case 3:
                    m5366c();
                    break;
                case 2:
                    break;
                default:
                    break;
            }
            float a = m5365a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f8618b.getWidth());
            float a2 = m5365a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f8618b.getHeight());
            kw kwVar = this.f8617a;
            kwVar.f8726c = a;
            kwVar.f8727d = a2;
            if (!this.f8621e && m5371b()) {
                if (this.f8623g == null) {
                    this.f8623g = new kx(this);
                }
                this.f8621e = true;
                this.f8619c = true;
                if (!this.f8631o) {
                    int i = this.f8627k;
                    if (i > 0) {
                        jm.m4557a(this.f8618b, this.f8623g, (long) i);
                        this.f8631o = true;
                    }
                }
                this.f8623g.run();
                this.f8631o = true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m5366c() {
        int i = 0;
        if (this.f8619c) {
            this.f8621e = false;
            return;
        }
        kw kwVar = this.f8617a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - kwVar.f8728e);
        int i3 = kwVar.f8725b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        kwVar.f8733j = i;
        kwVar.f8732i = kwVar.m5474a(currentAnimationTimeMillis);
        kwVar.f8731h = currentAnimationTimeMillis;
    }

    /* renamed from: a */
    public final kv m5367a(boolean z) {
        if (this.f8632p && !z) {
            m5366c();
        }
        this.f8632p = z;
        return this;
    }

    /* renamed from: b */
    final boolean m5371b() {
        kw kwVar = this.f8617a;
        float f = kwVar.f8727d;
        int abs = (int) (f / Math.abs(f));
        float f2 = kwVar.f8726c;
        int abs2 = (int) (f2 / Math.abs(f2));
        if (abs != 0 && mo2329a(abs)) {
            return true;
        }
        if (abs2 == 0) {
            return false;
        }
        mo2328a();
        return false;
    }
}
