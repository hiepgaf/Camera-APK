package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.legacy.app.burst.editor.grid.BurstImageView;

/* compiled from: PG */
/* renamed from: cmu */
final class cmu extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ BurstImageView f2178a;
    /* renamed from: b */
    private final /* synthetic */ kvr f2179b;
    /* renamed from: c */
    private final /* synthetic */ cmp f2180c;

    cmu(cmp cmp, BurstImageView burstImageView, kvr kvr) {
        this.f2180c = cmp;
        this.f2178a = burstImageView;
        this.f2179b = kvr;
    }

    public final void onAnimationCancel(Animator animator) {
        onAnimationEnd(animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2178a.setAlpha(1.0f);
        this.f2180c.m1193a(4);
        this.f2179b.setTranslationX(0.0f);
        this.f2179b.setTranslationY(0.0f);
        this.f2179b.setScaleX(1.0f);
        this.f2179b.setScaleY(1.0f);
        this.f2179b.setClipBounds(null);
        cmp cmp = this.f2180c;
        cmp.f2163d = null;
        cmp.f2160a.m1195a();
        for (kvr e : this.f2180c.f2171l.values()) {
            e.m5472e();
        }
    }
}
