package p000;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* renamed from: fp */
final class fp extends Property {
    fp(Class cls, String str) {
        super(cls, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(fo.f4639a.mo1419a((View) obj));
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        fo.m2352a((View) obj, ((Float) obj2).floatValue());
    }
}
