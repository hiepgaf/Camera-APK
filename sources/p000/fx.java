package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: fx */
final class fx extends AnimatorListenerAdapter implements fc {
    /* renamed from: a */
    private final View f16600a;
    /* renamed from: b */
    private final int f16601b;
    /* renamed from: c */
    private final ViewGroup f16602c;
    /* renamed from: d */
    private final boolean f16603d;
    /* renamed from: e */
    private boolean f16604e;
    /* renamed from: f */
    private boolean f16605f = false;

    fx(View view, int i) {
        this.f16600a = view;
        this.f16601b = i;
        this.f16602c = (ViewGroup) view.getParent();
        this.f16603d = true;
        m10844a(true);
    }

    /* renamed from: d */
    private final void m10845d() {
        if (!this.f16605f) {
            fo.m2353a(this.f16600a, this.f16601b);
            ViewGroup viewGroup = this.f16602c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m10844a(false);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f16605f = true;
    }

    public final void onAnimationEnd(Animator animator) {
        m10845d();
    }

    public final void onAnimationPause(Animator animator) {
        if (!this.f16605f) {
            fo.m2353a(this.f16600a, this.f16601b);
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationResume(Animator animator) {
        if (!this.f16605f) {
            fo.m2353a(this.f16600a, 0);
        }
    }

    public final void onAnimationStart(Animator animator) {
    }

    /* renamed from: a */
    public final void mo1274a(ex exVar) {
        m10845d();
        exVar.mo1374b((fc) this);
    }

    /* renamed from: a */
    public final void mo1273a() {
        m10844a(false);
    }

    /* renamed from: b */
    public final void mo1275b() {
        m10844a(true);
    }

    /* renamed from: c */
    public final void mo1276c() {
    }

    /* renamed from: a */
    private final void m10844a(boolean z) {
        if (this.f16603d && this.f16604e != z) {
            ViewGroup viewGroup = this.f16602c;
            if (viewGroup != null) {
                this.f16604e = z;
                df.m1602a(viewGroup, z);
            }
        }
    }
}
