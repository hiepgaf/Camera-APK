package p000;

import android.graphics.Matrix;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: fvk */
public final class fvk {
    static {
        bli.m862a("Face2LegacyFaceConv");
    }

    /* renamed from: a */
    public static Matrix m2401a(RectF rectF, int i, int i2, int i3, iqm iqm, boolean z, float f, float f2) {
        int height;
        int height2;
        float f3 = -1.0f;
        Matrix matrix = new Matrix();
        matrix.postTranslate(-rectF.centerX(), -rectF.centerY());
        float f4 = ((float) i) / ((float) i2);
        if (rectF.width() / rectF.height() > f4) {
            height = (int) (f4 * rectF.height());
            height2 = (int) rectF.height();
        } else {
            height = (int) rectF.width();
            height2 = (int) (rectF.width() / f4);
        }
        matrix.postRotate((float) (i3 - iqm.m4041a()));
        if (iqm == iqm.CLOCKWISE_0 || iqm == iqm.CLOCKWISE_180) {
            if (!z) {
                f3 = 1.0f;
            }
            matrix.postScale(f3, 1.0f);
        } else {
            if (!z) {
                f3 = 1.0f;
            }
            matrix.postScale(1.0f, f3);
        }
        RectF rectF2 = new RectF(0.0f, 0.0f, (float) height, (float) height2);
        matrix.mapRect(rectF2);
        matrix.postScale(f / rectF2.width(), f2 / rectF2.height());
        matrix.postTranslate(f / 2.0f, f2 / 2.0f);
        return matrix;
    }
}
