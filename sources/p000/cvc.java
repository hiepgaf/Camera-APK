package p000;

import android.animation.TimeInterpolator;

/* compiled from: PG */
/* renamed from: cvc */
final class cvc implements TimeInterpolator {
    cvc() {
    }

    public final float getInterpolation(float f) {
        return (float) (1.0d - Math.pow((double) (1.0f - f), 4.0d));
    }
}
