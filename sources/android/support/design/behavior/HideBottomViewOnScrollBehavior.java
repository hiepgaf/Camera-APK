package android.support.design.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import p000.as;
import p000.bf;
import p000.dj;

/* compiled from: PG */
public class HideBottomViewOnScrollBehavior extends dj {
    /* renamed from: a */
    public ViewPropertyAnimator f9901a;
    /* renamed from: b */
    private int f9902b = 0;
    /* renamed from: c */
    private int f9903c = 2;

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private final void m6672a(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.f9901a = view.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new bf(this));
    }

    /* renamed from: a */
    public final boolean mo118a(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f9902b = view.getMeasuredHeight();
        return super.mo118a(coordinatorLayout, view, i);
    }

    /* renamed from: a */
    public final void mo116a(View view, int i) {
        int i2 = this.f9903c;
        ViewPropertyAnimator viewPropertyAnimator;
        if (i2 != 1 && i > 0) {
            viewPropertyAnimator = this.f9901a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f9903c = 1;
            m6672a(view, this.f9902b, 175, as.f929b);
        } else if (i2 != 2 && i < 0) {
            viewPropertyAnimator = this.f9901a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f9903c = 2;
            m6672a(view, 0, 225, as.f930c);
        }
    }

    /* renamed from: a */
    public final boolean mo117a(int i) {
        return i == 2;
    }
}
