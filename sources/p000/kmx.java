package p000;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* renamed from: kmx */
final class kmx implements Serializable, GenericArrayType {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Type f8354a;

    kmx(Type type) {
        this.f8354a = kmy.f8357c.mo2189c(type);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GenericArrayType)) {
            return false;
        }
        return kbf.m16436b(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    public final Type getGenericComponentType() {
        return this.f8354a;
    }

    public final int hashCode() {
        return this.f8354a.hashCode();
    }

    public final String toString() {
        return String.valueOf(kms.m5005b(this.f8354a)).concat("[]");
    }
}
