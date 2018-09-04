package p000;

import android.graphics.drawable.AnimatedVectorDrawable;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

/* compiled from: PG */
/* renamed from: ght */
public class ght extends ghs {
    /* renamed from: d */
    public ProgressOverlay f23234d;
    /* renamed from: e */
    public boolean f23235e;
    /* renamed from: f */
    public AnimatedVectorDrawable f23236f;

    /* renamed from: a */
    public void mo3563a(ghz ghz, ProgressOverlay progressOverlay) {
        this.f23234d = progressOverlay;
        this.f23236f = this.f23234d.f2396a;
        this.f23236f.registerAnimationCallback(new ghu(this));
        this.f23235e = false;
    }
}
