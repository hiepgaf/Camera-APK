package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bua */
public final class bua implements kwk {
    /* renamed from: a */
    private final kwk f11275a;
    /* renamed from: b */
    private final kwk f11276b;
    /* renamed from: c */
    private final kwk f11277c;

    public bua(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f11275a = kwk;
        this.f11276b = kwk2;
        this.f11277c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f11275a;
        kwk kwk2 = this.f11276b;
        Context context = (Context) kwk.mo345a();
        btl btl = (btl) kwk2.mo345a();
        this.f11277c.mo345a();
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_release_inner_splash_diameter_scale_down)).addUpdateListener(btl.m962a());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_release_inner_splash_opacity_fade_out)).addUpdateListener(btl.m963b());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_release_outer_ring_diameter_scale_down)).addUpdateListener(btl.m965d());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_release_outer_ring_opacity_fade_out)).addUpdateListener(btl.m966e());
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{r2, r3, r4, r0});
        animatorSet.addListener(new hiu("FocusLockReleaseAnimation"));
        return (hix) ktm.m13963a(hiy.m3192a(animatorSet), "Cannot return null from a non-@Nullable @Provides method");
    }
}
