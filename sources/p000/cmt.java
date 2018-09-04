package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.camera.legacy.app.burst.editor.grid.BurstImageView;

/* compiled from: PG */
/* renamed from: cmt */
final class cmt extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ BurstImageView f2175a;
    /* renamed from: b */
    private final /* synthetic */ kvr f2176b;
    /* renamed from: c */
    private final /* synthetic */ cmp f2177c;

    cmt(cmp cmp, BurstImageView burstImageView, kvr kvr) {
        this.f2177c = cmp;
        this.f2175a = burstImageView;
        this.f2176b = kvr;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f2175a.setAlpha(1.0f);
        this.f2177c.f2163d = null;
        this.f2176b.setClipBounds(null);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2177c.f2165f.setVisibility(4);
        for (View a : this.f2177c.f2171l.values()) {
            cmp.m1188a(a);
        }
        onAnimationCancel(animator);
    }
}
