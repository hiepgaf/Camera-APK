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
/* renamed from: bty */
public final class bty implements kwk {
    /* renamed from: a */
    private final kwk f11263a;
    /* renamed from: b */
    private final kwk f11264b;
    /* renamed from: c */
    private final kwk f11265c;
    /* renamed from: d */
    private final kwk f11266d;
    /* renamed from: e */
    private final kwk f11267e;
    /* renamed from: f */
    private final kwk f11268f;

    public bty(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f11263a = kwk;
        this.f11264b = kwk2;
        this.f11265c = kwk3;
        this.f11266d = kwk4;
        this.f11267e = kwk5;
        this.f11268f = kwk6;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f11263a;
        kwk kwk2 = this.f11264b;
        kwk kwk3 = this.f11265c;
        kwk kwk4 = this.f11266d;
        kwk kwk5 = this.f11267e;
        Context context = (Context) kwk.mo345a();
        Resources resources = (Resources) kwk2.mo345a();
        btl btl = (btl) kwk3.mo345a();
        bsz bsz = (bsz) kwk4.mo345a();
        FocusIndicatorView focusIndicatorView = (FocusIndicatorView) kwk5.mo345a();
        this.f11268f.mo345a();
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.active_focus_scan_inner_splash_diameter_scale_up)).addUpdateListener(btl.m962a());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.active_focus_scan_inner_splash_opacity_fade_in)).addUpdateListener(btl.m963b());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.active_focus_scan_inner_splash_opacity_fade_out)).addUpdateListener(btl.m963b());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.active_focus_scan_outer_ring_diameter_scale_down)).addUpdateListener(btl.m965d());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.active_focus_scan_outer_ring_opacity_fade_in)).addUpdateListener(btl.m966e());
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{r5, r6, r7, r8, r0});
        animatorSet.addListener(new btu(resources, bsz, focusIndicatorView));
        animatorSet.addListener(new hiu("ActiveFocusScanAnimation"));
        return (hix) ktm.m13963a(hiy.m3192a(animatorSet), "Cannot return null from a non-@Nullable @Provides method");
    }
}
