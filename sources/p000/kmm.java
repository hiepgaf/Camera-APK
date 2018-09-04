package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* compiled from: PG */
/* renamed from: kmm */
public final class kmm {
    /* renamed from: a */
    private final kmn f8345a;

    public kmm() {
        this.f8345a = new kmn();
    }

    kmm(kmn kmn) {
        this.f8345a = kmn;
    }

    /* renamed from: a */
    public final Type m4995a(Type type) {
        jri.m13152b((Object) type);
        if (type instanceof TypeVariable) {
            kmn kmn = this.f8345a;
            TypeVariable typeVariable = (TypeVariable) type;
            return kmn.mo2186a(typeVariable, new kmo(typeVariable, kmn));
        } else if (type instanceof ParameterizedType) {
            Type a;
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                a = m4995a(ownerType);
            } else {
                a = null;
            }
            return kms.m5000a(a, (Class) m4995a(parameterizedType.getRawType()), m4996a(parameterizedType.getActualTypeArguments()));
        } else if (type instanceof GenericArrayType) {
            return kms.m5001a(m4995a(((GenericArrayType) type).getGenericComponentType()));
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new knh(m4996a(wildcardType.getLowerBounds()), m4996a(wildcardType.getUpperBounds()));
        }
    }

    /* renamed from: a */
    final Type[] m4996a(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = m4995a(typeArr[i]);
        }
        return typeArr2;
    }
}
