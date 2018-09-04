package p000;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kne */
final class kne implements Serializable, ParameterizedType {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Type f8363a;
    /* renamed from: b */
    private final ken f8364b;
    /* renamed from: c */
    private final Class f8365c;

    kne(Type type, Class cls, Type[] typeArr) {
        boolean z;
        jri.m13152b((Object) cls);
        if (typeArr.length == cls.getTypeParameters().length) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        kms.m5003a(typeArr, "type parameter");
        this.f8363a = type;
        this.f8365c = cls;
        this.f8364b = kmy.f8357c.m5008a(typeArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        if (getRawType().equals(parameterizedType.getRawType()) && kbf.m16436b(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
            return true;
        }
        return false;
    }

    public final Type[] getActualTypeArguments() {
        return kms.m5004a(this.f8364b);
    }

    public final Type getOwnerType() {
        return this.f8363a;
    }

    public final Type getRawType() {
        return this.f8365c;
    }

    public final int hashCode() {
        int hashCode;
        Type type = this.f8363a;
        if (type != null) {
            hashCode = type.hashCode();
        } else {
            hashCode = 0;
        }
        return (hashCode ^ this.f8364b.hashCode()) ^ this.f8365c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f8363a != null && kmy.f8357c.mo2191a()) {
            stringBuilder.append(kmy.f8357c.mo2190b(this.f8363a));
            stringBuilder.append('.');
        }
        stringBuilder.append(this.f8365c.getName());
        stringBuilder.append('<');
        kaz kaz = kms.f8349b;
        Object obj = this.f8364b;
        Object obj2 = kms.f8348a;
        jri.m13152b(obj);
        jri.m13152b(obj2);
        stringBuilder.append(kaz.m4735a(new key(obj, obj2)));
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}
