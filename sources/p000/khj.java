package p000;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: khj */
class khj extends khd implements Set {
    public static final long serialVersionUID = 0;

    khj(Set set, Object obj) {
        super(set, obj);
    }

    /* renamed from: a */
    /* synthetic */ Object mo2169a() {
        return mo3523c();
    }

    /* renamed from: b */
    /* synthetic */ Collection mo3243b() {
        return mo3523c();
    }

    /* renamed from: c */
    Set mo3523c() {
        return (Set) super.mo3243b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean equals;
        synchronized (this.a) {
            equals = mo3523c().equals(obj);
        }
        return equals;
    }

    public int hashCode() {
        int hashCode;
        synchronized (this.a) {
            hashCode = mo3523c().hashCode();
        }
        return hashCode;
    }
}
