package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: btm */
final class btm extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ btl f1547a;

    btm(btl btl) {
        this.f1547a = btl;
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.f1547a.f1545d.m958b(this.f1547a.f1542a.getDimension(R.dimen.focus_lock_hold_outer_ring_diameter));
        this.f1547a.f1545d.m960d(this.f1547a.f1542a.getDimension(R.dimen.focus_lock_hold_outer_ring_thickness));
        this.f1547a.f1545d.m957a(this.f1547a.f1542a.getDimension(R.dimen.focus_indicator_ring_view_size) / 2.0f);
        this.f1547a.f1543b.invalidate();
    }
}
