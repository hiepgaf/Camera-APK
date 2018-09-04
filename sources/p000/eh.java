package p000;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* renamed from: eh */
final class eh extends Property {
    eh(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        en enVar = (en) obj;
        PointF pointF = (PointF) obj2;
        enVar.f3971c = Math.round(pointF.x);
        enVar.f3972d = Math.round(pointF.y);
        enVar.f3974f++;
        if (enVar.f3973e == enVar.f3974f) {
            enVar.m1896a();
        }
    }
}
