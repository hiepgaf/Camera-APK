package p000;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* renamed from: eg */
final class eg extends Property {
    eg(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        en enVar = (en) obj;
        PointF pointF = (PointF) obj2;
        enVar.f3969a = Math.round(pointF.x);
        enVar.f3970b = Math.round(pointF.y);
        enVar.f3973e++;
        if (enVar.f3973e == enVar.f3974f) {
            enVar.m1896a();
        }
    }
}
