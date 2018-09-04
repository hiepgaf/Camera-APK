package p000;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: btx */
public final class btx implements kwk {
    /* renamed from: a */
    private final kwk f11260a;
    /* renamed from: b */
    private final kwk f11261b;
    /* renamed from: c */
    private final kwk f11262c;

    public btx(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f11260a = kwk;
        this.f11261b = kwk2;
        this.f11262c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f11260a;
        kwk kwk2 = this.f11261b;
        Context context = (Context) kwk.mo345a();
        btl btl = (btl) kwk2.mo345a();
        this.f11262c.mo345a();
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.active_focus_converge_outer_ring_opacity_fade_out);
        valueAnimator.addUpdateListener(btl.m966e());
        valueAnimator.addListener(new hiu("ActiveFocusConvergeAnimation"));
        return (hix) ktm.m13963a(hiy.m3192a(valueAnimator), "Cannot return null from a non-@Nullable @Provides method");
    }
}
