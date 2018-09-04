package p000;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: lp */
final class lp implements Interpolator {
    lp() {
    }

    public final float getInterpolation(float f) {
        float f2 = -1.0f + f;
        return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
    }
}
