package p000;

import java.lang.reflect.Type;

/* compiled from: PG */
/* renamed from: kna */
enum kna extends kmy {
    kna(String str) {
        super(str, 1);
    }

    /* renamed from: a */
    final Type mo2188a(Type type) {
        if (type instanceof Class) {
            return kms.m4998a((Class) type);
        }
        return new kmx(type);
    }

    /* renamed from: c */
    final Type mo2189c(Type type) {
        return (Type) jri.m13152b((Object) type);
    }
}
