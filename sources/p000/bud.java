package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bud */
public final class bud implements kwk {
    /* renamed from: a */
    private final kwk f11287a;
    /* renamed from: b */
    private final kwk f11288b;
    /* renamed from: c */
    private final kwk f11289c;

    public bud(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f11287a = kwk;
        this.f11288b = kwk2;
        this.f11289c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f11287a;
        kwk kwk2 = this.f11288b;
        Context context = (Context) kwk.mo345a();
        btl btl = (btl) kwk2.mo345a();
        this.f11289c.mo345a();
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.vsl_gleam_detected_ring_diameter_scale_up)).addUpdateListener(btl.m965d());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.vsl_gleam_detected_ring_corner_radius_decrease)).addUpdateListener(btl.m964c());
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{r2, r0});
        animatorSet.addListener(new hiu("VslGleamDetectedAnimator"));
        return (hix) ktm.m13963a(hiy.m3192a(animatorSet), "Cannot return null from a non-@Nullable @Provides method");
    }
}
