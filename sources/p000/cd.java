package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: cd */
abstract class cd extends AnimatorListenerAdapter implements AnimatorUpdateListener {
    /* renamed from: a */
    private boolean f1843a;
    /* renamed from: b */
    private float f1844b;
    /* renamed from: c */
    private float f1845c;
    /* renamed from: d */
    private final /* synthetic */ bu f1846d;

    private cd(bu buVar) {
        this.f1846d = buVar;
    }

    /* renamed from: a */
    protected abstract float mo607a();

    public void onAnimationEnd(Animator animator) {
        this.f1846d.f1582h.m8757a(this.f1845c);
        this.f1843a = false;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.f1843a) {
            this.f1844b = this.f1846d.f1582h.f12641a;
            this.f1845c = mo607a();
            this.f1843a = true;
        }
        cu cuVar = this.f1846d.f1582h;
        float f = this.f1844b;
        cuVar.m8757a(f + ((this.f1845c - f) * valueAnimator.getAnimatedFraction()));
    }
}
