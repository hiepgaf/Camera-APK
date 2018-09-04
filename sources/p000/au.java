package p000;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: PG */
/* renamed from: au */
public final class au implements TypeEvaluator {
    /* renamed from: a */
    private final float[] f965a = new float[9];
    /* renamed from: b */
    private final float[] f966b = new float[9];
    /* renamed from: c */
    private final Matrix f967c = new Matrix();

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Matrix matrix = (Matrix) obj2;
        ((Matrix) obj).getValues(this.f965a);
        matrix.getValues(this.f966b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f966b;
            float f2 = fArr[i];
            float f3 = this.f965a[i];
            fArr[i] = ((f2 - f3) * f) + f3;
        }
        this.f967c.setValues(this.f966b);
        return this.f967c;
    }
}
