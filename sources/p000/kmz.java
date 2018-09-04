package p000;

import java.lang.reflect.Type;

/* compiled from: PG */
/* renamed from: kmz */
enum kmz extends kmy {
    kmz(String str) {
        super(str, 0);
    }

    /* renamed from: a */
    final /* synthetic */ Type mo2188a(Type type) {
        return new kmx(type);
    }

    /* renamed from: c */
    final Type mo2189c(Type type) {
        jri.m13152b((Object) type);
        if (!(type instanceof Class)) {
            return type;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return new kmx(cls.getComponentType());
        }
        return type;
    }
}
