package p000;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: PG */
/* renamed from: kmq */
public class kmq extends kml implements Serializable {
    public static final long serialVersionUID = 3637540370352322684L;
    /* renamed from: a */
    private final Type f19228a;

    protected kmq() {
        this.f19228a = m4994a();
        Object obj = this.f19228a;
        jri.m13156b((obj instanceof TypeVariable) ^ 1, "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", obj);
    }

    private kmq(Type type) {
        this.f19228a = (Type) jri.m13152b((Object) type);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kmq)) {
            return false;
        }
        return this.f19228a.equals(((kmq) obj).f19228a);
    }

    public int hashCode() {
        return this.f19228a.hashCode();
    }

    /* renamed from: a */
    public static kmq m13572a(Class cls) {
        return new kmr(cls);
    }

    public String toString() {
        return kms.m5005b(this.f19228a);
    }

    protected Object writeReplace() {
        return new kmr(new kmm().m4995a(this.f19228a));
    }
}
