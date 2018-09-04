package p000;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: at */
public final class at extends Property {
    /* renamed from: a */
    private final Matrix f960a = new Matrix();

    public at() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public final /* synthetic */ Object get(Object obj) {
        this.f960a.set(((ImageView) obj).getImageMatrix());
        return this.f960a;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
