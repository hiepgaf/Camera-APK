package p000;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* renamed from: ei */
final class ei extends Property {
    ei(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        fo.m2354a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
    }
}
