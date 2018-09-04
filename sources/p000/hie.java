package p000;

import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: hie */
public final class hie {
    /* renamed from: b */
    private static final RectF f6223b = new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f);
    /* renamed from: a */
    public final Matrix f6224a;
    /* renamed from: c */
    private final Matrix f6225c;

    public hie(boolean z, int i, RectF rectF) {
        Object obj = null;
        if (!(rectF.width() == 0.0f || rectF.height() == 0.0f)) {
            obj = 1;
        }
        if (obj == null) {
            throw new IllegalArgumentException("previewRect");
        }
        float f;
        Matrix matrix = new Matrix();
        if (z) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        matrix.setScale(f, 1.0f);
        matrix.postRotate((float) i);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(f6223b, rectF, ScaleToFit.FILL);
        matrix.setConcat(matrix2, matrix);
        this.f6225c = matrix;
        matrix2 = this.f6225c;
        Matrix matrix3 = new Matrix();
        matrix2.invert(matrix3);
        this.f6224a = matrix3;
    }
}
