package p000;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kmn */
class kmn {
    /* renamed from: a */
    private final kes f8346a = kgi.f19200a;

    kmn() {
    }

    /* renamed from: a */
    Type mo2186a(TypeVariable typeVariable, kmn kmn) {
        Type type = (Type) this.f8346a.get(new kmp(typeVariable));
        if (type != null) {
            return new kmm(kmn).m4995a(type);
        }
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length == 0) {
            return typeVariable;
        }
        Type[] a = new kmm(kmn).m4996a(bounds);
        if (knd.f8362a && Arrays.equals(bounds, a)) {
            return typeVariable;
        }
        return kms.m5002a(typeVariable.getGenericDeclaration(), typeVariable.getName(), a);
    }
}
