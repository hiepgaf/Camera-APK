package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bue */
public final class bue implements kwk {
    /* renamed from: a */
    private final kwk f11290a;
    /* renamed from: b */
    private final kwk f11291b;
    /* renamed from: c */
    private final kwk f11292c;

    public bue(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f11290a = kwk;
        this.f11291b = kwk2;
        this.f11292c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f11290a;
        kwk kwk2 = this.f11291b;
        Context context = (Context) kwk.mo345a();
        btl btl = (btl) kwk2.mo345a();
        this.f11292c.mo345a();
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.vsl_gleam_selected_ring_diameter_scale_up)).addUpdateListener(btl.m965d());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.vsl_gleam_selected_ring_corner_radius_decrease)).addUpdateListener(btl.m964c());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.vsl_gleam_selected_ring_opacity_fade_in)).addUpdateListener(btl.m966e());
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{r2, r3, r0});
        animatorSet.addListener(new btm(btl));
        animatorSet.addListener(new hiu("VslGleamSelectedAnimator"));
        return (hix) ktm.m13963a(hiy.m3192a(animatorSet), "Cannot return null from a non-@Nullable @Provides method");
    }
}
