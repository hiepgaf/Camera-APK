package p000;

/* compiled from: PG */
/* renamed from: kdp */
final class kdp extends kdn {
    public static final long serialVersionUID = 0;

    kdp(Comparable comparable) {
        super((Comparable) jri.m13152b((Object) comparable));
    }

    /* renamed from: a */
    final void mo2124a(StringBuilder stringBuilder) {
        stringBuilder.append('(');
        stringBuilder.append(this.a);
    }

    /* renamed from: b */
    final void mo2125b(StringBuilder stringBuilder) {
        stringBuilder.append(this.a);
        stringBuilder.append(']');
    }

    public final int hashCode() {
        return this.a.hashCode() ^ -1;
    }

    /* renamed from: b */
    final boolean mo2126b(Comparable comparable) {
        return kge.m13497b(this.a, comparable) < 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 2);
        stringBuilder.append("/");
        stringBuilder.append(valueOf);
        stringBuilder.append("\\");
        return stringBuilder.toString();
    }
}
