package p000;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: kdm */
final class kdm extends kgd implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Comparator f19177a;

    kdm(Comparator comparator) {
        this.f19177a = (Comparator) jri.m13152b((Object) comparator);
    }

    public final int compare(Object obj, Object obj2) {
        return this.f19177a.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kdm)) {
            return false;
        }
        return this.f19177a.equals(((kdm) obj).f19177a);
    }

    public final int hashCode() {
        return this.f19177a.hashCode();
    }

    public final String toString() {
        return this.f19177a.toString();
    }
}
