package p000;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bub */
public final class bub implements kwk {
    /* renamed from: a */
    private final kwk f11278a;
    /* renamed from: b */
    private final kwk f11279b;
    /* renamed from: c */
    private final kwk f11280c;

    public bub(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f11278a = kwk;
        this.f11279b = kwk2;
        this.f11280c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f11278a;
        kwk kwk2 = this.f11279b;
        Context context = (Context) kwk.mo345a();
        btl btl = (btl) kwk2.mo345a();
        this.f11280c.mo345a();
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.passive_focus_converge_outer_ring_opacity_fade_out);
        valueAnimator.addUpdateListener(btl.m966e());
        valueAnimator.addListener(new hiu("PassiveFocusConvergeAnimation"));
        return (hix) ktm.m13963a(hiy.m3192a(valueAnimator), "Cannot return null from a non-@Nullable @Provides method");
    }
}
