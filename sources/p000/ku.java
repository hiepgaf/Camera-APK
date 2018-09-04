package p000;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: ku */
class ku implements Interpolator {
    /* renamed from: a */
    private final float[] f8561a;
    /* renamed from: b */
    private final float f8562b = (1.0f / ((float) (this.f8561a.length - 1)));

    protected ku(float[] fArr) {
        this.f8561a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int length = this.f8561a.length;
        length = Math.min((int) (((float) (length - 1)) * f), length - 2);
        float f2 = this.f8562b;
        float[] fArr = this.f8561a;
        float f3 = fArr[length];
        return ((fArr[length + 1] - f3) * ((f - (((float) length) * f2)) / f2)) + f3;
    }
}
