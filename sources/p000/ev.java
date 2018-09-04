package p000;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: ev */
final class ev implements TypeEvaluator {
    ev() {
    }

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        return new Rect(rect.left + ((int) (((float) (rect2.left - rect.left)) * f)), ((int) (((float) (rect2.top - rect.top)) * f)) + rect.top, ((int) (((float) (rect2.right - rect.right)) * f)) + rect.right, ((int) (((float) (rect2.bottom - rect.bottom)) * f)) + rect.bottom);
    }
}
