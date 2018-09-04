package p000;

/* compiled from: PG */
/* renamed from: kau */
public final class kau extends kbg {
    /* renamed from: a */
    public static final kau f19138a = new kau();
    public static final long serialVersionUID = 0;

    private kau() {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    /* renamed from: a */
    public final Object mo2081a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final int hashCode() {
        return 2040732332;
    }

    /* renamed from: b */
    public final boolean mo2084b() {
        return false;
    }

    /* renamed from: a */
    public final Object mo2082a(Object obj) {
        return jri.m13139a(obj, (Object) "use Optional.orNull() instead of Optional.or(null)");
    }

    /* renamed from: c */
    public final Object mo2085c() {
        return null;
    }

    private final Object readResolve() {
        return f19138a;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    /* renamed from: a */
    public final kbg mo2083a(kaw kaw) {
        jri.m13152b((Object) kaw);
        return f19138a;
    }
}
