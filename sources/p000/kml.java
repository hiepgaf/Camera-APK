package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* renamed from: kml */
class kml {
    kml() {
    }

    kml(byte b) {
        this();
    }

    kml(char c) {
        this();
    }

    /* renamed from: a */
    final Type m4994a() {
        Object genericSuperclass = getClass().getGenericSuperclass();
        jri.m13148a(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
