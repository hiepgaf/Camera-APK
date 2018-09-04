package p000;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: co */
public final class co {
    /* renamed from: a */
    public final ArrayList f2220a = new ArrayList();
    /* renamed from: b */
    public cq f2221b = null;
    /* renamed from: c */
    public ValueAnimator f2222c = null;
    /* renamed from: d */
    private final AnimatorListener f2223d = new cp(this);

    /* renamed from: a */
    public final void m1209a(int[] iArr, ValueAnimator valueAnimator) {
        cq cqVar = new cq(iArr, valueAnimator);
        valueAnimator.addListener(this.f2223d);
        this.f2220a.add(cqVar);
    }
}
