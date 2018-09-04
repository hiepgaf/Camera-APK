package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* renamed from: btw */
public final class btw extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ Resources f1560a;
    /* renamed from: b */
    private final /* synthetic */ bsz f1561b;
    /* renamed from: c */
    private final /* synthetic */ FocusIndicatorView f1562c;

    public btw(Resources resources, bsz bsz, FocusIndicatorView focusIndicatorView) {
        this.f1560a = resources;
        this.f1561b = bsz;
        this.f1562c = focusIndicatorView;
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.f1561b.m958b(this.f1560a.getDimension(R.dimen.focus_lock_hold_outer_ring_diameter));
        this.f1561b.m960d(this.f1560a.getDimension(R.dimen.focus_lock_hold_outer_ring_thickness));
        this.f1561b.m957a(this.f1560a.getDimension(R.dimen.focus_indicator_ring_view_size) / 2.0f);
        this.f1562c.invalidate();
    }
}
