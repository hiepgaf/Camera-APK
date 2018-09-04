package p000;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: PG */
/* renamed from: knf */
final class knf {
    /* renamed from: a */
    private final GenericDeclaration f8366a;
    /* renamed from: b */
    private final String f8367b;
    /* renamed from: c */
    private final ken f8368c;

    knf(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
        kms.m5003a(typeArr, "bound for type variable");
        this.f8366a = (GenericDeclaration) jri.m13152b((Object) genericDeclaration);
        this.f8367b = (String) jri.m13152b((Object) str);
        this.f8368c = ken.m13460b(typeArr);
    }

    public final boolean equals(Object obj) {
        if (knd.f8362a) {
            if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof kng)) {
                return false;
            }
            knf knf = ((kng) Proxy.getInvocationHandler(obj)).f8370a;
            if (this.f8367b.equals(knf.f8367b) && this.f8366a.equals(knf.f8366a) && this.f8368c.equals(knf.f8368c)) {
                return true;
            }
            return false;
        } else if (!(obj instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (this.f8367b.equals(typeVariable.getName()) && this.f8366a.equals(typeVariable.getGenericDeclaration())) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        return this.f8366a.hashCode() ^ this.f8367b.hashCode();
    }

    public final String toString() {
        return this.f8367b;
    }
}
