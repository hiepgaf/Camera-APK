package p000;

import android.graphics.drawable.Animatable2.AnimationCallback;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: ghu */
final class ghu extends AnimationCallback {
    /* renamed from: a */
    private final /* synthetic */ ght f5200a;

    ghu(ght ght) {
        this.f5200a = ght;
    }

    public final void onAnimationEnd(Drawable drawable) {
        super.onAnimationEnd(drawable);
        ght ght = this.f5200a;
        if (ght.f23235e) {
            ght.f23236f.start();
        }
    }
}
