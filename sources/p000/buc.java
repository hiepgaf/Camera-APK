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
/* renamed from: buc */
public final class buc implements kwk {
    /* renamed from: a */
    private final kwk f11281a;
    /* renamed from: b */
    private final kwk f11282b;
    /* renamed from: c */
    private final kwk f11283c;
    /* renamed from: d */
    private final kwk f11284d;
    /* renamed from: e */
    private final kwk f11285e;
    /* renamed from: f */
    private final kwk f11286f;

    public buc(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f11281a = kwk;
        this.f11282b = kwk2;
        this.f11283c = kwk3;
        this.f11284d = kwk4;
        this.f11285e = kwk5;
        this.f11286f = kwk6;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f11281a;
        kwk kwk2 = this.f11282b;
        kwk kwk3 = this.f11283c;
        kwk kwk4 = this.f11284d;
        kwk kwk5 = this.f11285e;
        Context context = (Context) kwk.mo345a();
        Resources resources = (Resources) kwk2.mo345a();
        btl btl = (btl) kwk3.mo345a();
        bsz bsz = (bsz) kwk4.mo345a();
        FocusIndicatorView focusIndicatorView = (FocusIndicatorView) kwk5.mo345a();
        this.f11286f.mo345a();
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.passive_focus_scan_outer_ring_diameter_scale_down)).addUpdateListener(btl.m965d());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.passive_focus_scan_outer_ring_opacity_fade_in)).addUpdateListener(btl.m966e());
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{r5, r0});
        animatorSet.addListener(new btv(resources, bsz, focusIndicatorView));
        animatorSet.addListener(new hiu("PassiveFocusScanAnimation"));
        return (hix) ktm.m13963a(hiy.m3192a(animatorSet), "Cannot return null from a non-@Nullable @Provides method");
    }
}
