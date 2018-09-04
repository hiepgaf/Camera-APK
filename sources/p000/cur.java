package p000;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.os.Handler;
import android.widget.Scroller;

/* compiled from: PG */
/* renamed from: cur */
public final class cur {
    /* renamed from: a */
    public final Handler f2761a;
    /* renamed from: b */
    public final cuv f2762b;
    /* renamed from: c */
    public final Scroller f2763c;
    /* renamed from: d */
    public final ValueAnimator f2764d;
    /* renamed from: e */
    public final Runnable f2765e = new cus(this);
    /* renamed from: f */
    private final AnimatorUpdateListener f2766f = new cut(this);
    /* renamed from: g */
    private final AnimatorListener f2767g = new cuu(this);

    public cur(Context context, Handler handler, cuv cuv, TimeInterpolator timeInterpolator) {
        this.f2761a = handler;
        this.f2762b = cuv;
        this.f2763c = new Scroller(context);
        this.f2764d = new ValueAnimator();
        this.f2764d.addUpdateListener(this.f2766f);
        this.f2764d.addListener(this.f2767g);
        this.f2764d.setInterpolator(timeInterpolator);
    }
}
