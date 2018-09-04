package p000;

/* compiled from: PG */
/* renamed from: kdo */
final class kdo extends kdn {
    /* renamed from: b */
    public static final kdo f19178b = new kdo();
    public static final long serialVersionUID = 0;

    private kdo() {
        super(null);
    }

    /* renamed from: a */
    public final int mo2122a(kdn kdn) {
        return kdn == this ? 0 : 1;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return mo2122a((kdn) obj);
    }

    /* renamed from: a */
    final void mo2124a(StringBuilder stringBuilder) {
        throw new AssertionError();
    }

    /* renamed from: b */
    final void mo2125b(StringBuilder stringBuilder) {
        stringBuilder.append("+∞)");
    }

    /* renamed from: a */
    final Comparable mo2123a() {
        throw new IllegalStateException("range unbounded on this side");
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    /* renamed from: b */
    final boolean mo2126b(Comparable comparable) {
        return false;
    }

    private final Object readResolve() {
        return f19178b;
    }

    public final String toString() {
        return "+∞";
    }
}
