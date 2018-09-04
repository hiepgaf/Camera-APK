package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* renamed from: btu */
public final class btu extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ Resources f1554a;
    /* renamed from: b */
    private final /* synthetic */ bsz f1555b;
    /* renamed from: c */
    private final /* synthetic */ FocusIndicatorView f1556c;

    public btu(Resources resources, bsz bsz, FocusIndicatorView focusIndicatorView) {
        this.f1554a = resources;
        this.f1555b = bsz;
        this.f1556c = focusIndicatorView;
    }

    public final void onAnimationStart(Animator animator) {
        this.f1555b.m960d(this.f1554a.getDimension(R.dimen.active_focus_outer_ring_thickness));
        this.f1555b.m957a(this.f1554a.getDimension(R.dimen.focus_indicator_ring_view_size) / 2.0f);
        this.f1556c.invalidate();
    }
}
