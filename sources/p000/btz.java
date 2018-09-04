package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* renamed from: btz */
public final class btz implements kwk {
    /* renamed from: a */
    private final kwk f11269a;
    /* renamed from: b */
    private final kwk f11270b;
    /* renamed from: c */
    private final kwk f11271c;
    /* renamed from: d */
    private final kwk f11272d;
    /* renamed from: e */
    private final kwk f11273e;
    /* renamed from: f */
    private final kwk f11274f;

    public btz(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f11269a = kwk;
        this.f11270b = kwk2;
        this.f11271c = kwk3;
        this.f11272d = kwk4;
        this.f11273e = kwk5;
        this.f11274f = kwk6;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f11269a;
        kwk kwk2 = this.f11270b;
        kwk kwk3 = this.f11271c;
        kwk kwk4 = this.f11272d;
        kwk kwk5 = this.f11273e;
        Context context = (Context) kwk.mo345a();
        Resources resources = (Resources) kwk2.mo345a();
        btl btl = (btl) kwk3.mo345a();
        bsz bsz = (bsz) kwk4.mo345a();
        FocusIndicatorView focusIndicatorView = (FocusIndicatorView) kwk5.mo345a();
        this.f11274f.mo345a();
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_hold_inner_splash_diameter_scale_up);
        valueAnimator.addUpdateListener(btl.m962a());
        ValueAnimator valueAnimator2 = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_hold_inner_splash_opacity_fade_in);
        valueAnimator2.addUpdateListener(btl.m963b());
        ValueAnimator valueAnimator3 = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_hold_outer_ring_opacity_fade_in);
        valueAnimator3.addUpdateListener(btl.m966e());
        ValueAnimator valueAnimator4 = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_hold_outer_ring_thickness_scale_up);
        valueAnimator4.addUpdateListener(new btr(btl));
        Animator animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimator).with(valueAnimator2).with(valueAnimator3).with(valueAnimator4);
        animatorSet.addListener(new btw(resources, bsz, focusIndicatorView));
        animatorSet.addListener(new hiu("FocusLockHoldAnimation"));
        return (hix) ktm.m13963a(hiy.m3192a(animatorSet), "Cannot return null from a non-@Nullable @Provides method");
    }
}
