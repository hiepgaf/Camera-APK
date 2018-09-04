package p000;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: knh */
final class knh implements Serializable, WildcardType {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final ken f8371a;
    /* renamed from: b */
    private final ken f8372b;

    knh(Type[] typeArr, Type[] typeArr2) {
        kms.m5003a(typeArr, "lower bound for wildcard");
        kms.m5003a(typeArr2, "upper bound for wildcard");
        this.f8371a = kmy.f8357c.m5008a(typeArr);
        this.f8372b = kmy.f8357c.m5008a(typeArr2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        if (this.f8371a.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.f8372b.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
            return true;
        }
        return false;
    }

    public final Type[] getLowerBounds() {
        return kms.m5004a(this.f8371a);
    }

    public final Type[] getUpperBounds() {
        return kms.m5004a(this.f8372b);
    }

    public final int hashCode() {
        return this.f8371a.hashCode() ^ this.f8372b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("?");
        ken ken = this.f8371a;
        int size = ken.size();
        int i = 0;
        while (i < size) {
            Object obj = ken.get(i);
            i++;
            Type type = (Type) obj;
            stringBuilder.append(" super ");
            stringBuilder.append(kmy.f8357c.mo2190b(type));
        }
        for (Type type2 : kms.m4999a(this.f8372b)) {
            stringBuilder.append(" extends ");
            stringBuilder.append(kmy.f8357c.mo2190b(type2));
        }
        return stringBuilder.toString();
    }
}
