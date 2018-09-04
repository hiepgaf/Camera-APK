package p000;

import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: o */
public final class C0126o {
    /* renamed from: a */
    public final int f8991a;
    /* renamed from: b */
    public final Method f8992b;

    C0126o(int i, Method method) {
        this.f8991a = i;
        this.f8992b = method;
        this.f8992b.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0126o c0126o = (C0126o) obj;
        if (this.f8991a == c0126o.f8991a && this.f8992b.getName().equals(c0126o.f8992b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8991a * 31) + this.f8992b.getName().hashCode();
    }
}
