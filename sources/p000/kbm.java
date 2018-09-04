package p000;

/* compiled from: PG */
/* renamed from: kbm */
final class kbm extends kbg {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Object f19148a;

    kbm(Object obj) {
        this.f19148a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kbm)) {
            return false;
        }
        return this.f19148a.equals(((kbm) obj).f19148a);
    }

    /* renamed from: a */
    public final Object mo2081a() {
        return this.f19148a;
    }

    public final int hashCode() {
        return this.f19148a.hashCode() + 1502476572;
    }

    /* renamed from: b */
    public final boolean mo2084b() {
        return true;
    }

    /* renamed from: a */
    public final Object mo2082a(Object obj) {
        jri.m13139a(obj, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.f19148a;
    }

    /* renamed from: c */
    public final Object mo2085c() {
        return this.f19148a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19148a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 13);
        stringBuilder.append("Optional.of(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final kbg mo2083a(kaw kaw) {
        return new kbm(jri.m13139a(kaw.mo370a(this.f19148a), (Object) "the Function passed to Optional.transform() must not return null."));
    }
}
