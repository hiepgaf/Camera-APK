package p000;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kgp */
final class kgp extends kgd implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final kgd f19205a;

    kgp(kgd kgd) {
        this.f19205a = (kgd) jri.m13152b((Object) kgd);
    }

    public final int compare(Object obj, Object obj2) {
        return this.f19205a.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kgp)) {
            return false;
        }
        return this.f19205a.equals(((kgp) obj).f19205a);
    }

    public final int hashCode() {
        return -this.f19205a.hashCode();
    }

    /* renamed from: a */
    public final Object mo2157a(Iterable iterable) {
        return this.f19205a.mo2160b(iterable);
    }

    /* renamed from: a */
    public final Object mo2158a(Object obj, Object obj2) {
        return this.f19205a.mo2161b(obj, obj2);
    }

    /* renamed from: a */
    public final Object mo2159a(Iterator it) {
        return this.f19205a.mo2162b(it);
    }

    /* renamed from: b */
    public final Object mo2160b(Iterable iterable) {
        return this.f19205a.mo2157a(iterable);
    }

    /* renamed from: b */
    public final Object mo2161b(Object obj, Object obj2) {
        return this.f19205a.mo2158a(obj, obj2);
    }

    /* renamed from: b */
    public final Object mo2162b(Iterator it) {
        return this.f19205a.mo2159a(it);
    }

    /* renamed from: a */
    public final kgd mo2152a() {
        return this.f19205a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19205a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 10);
        stringBuilder.append(valueOf);
        stringBuilder.append(".reverse()");
        return stringBuilder.toString();
    }
}
