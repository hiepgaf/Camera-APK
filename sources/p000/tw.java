package p000;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: tw */
public final class tw implements Interpolator {
    public final float getInterpolation(float f) {
        float f2 = -1.0f + f;
        return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
    }
}
