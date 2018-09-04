package p000;

/* compiled from: PG */
/* renamed from: jfh */
public final class jfh extends jdv {
    private jfh(jdo jdo, jaq jaq) {
        super(jdo, jaq);
    }

    /* renamed from: a */
    public static jfh m17969a(jdo jdo, jdc jdc) {
        return new jfh(jdo, jdv.m17630a(jdo, new jfi(jdo, jdc)));
    }

    /* renamed from: b */
    public final jdc m17970b() {
        return ((jfb) m17634d()).mo3586d();
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        int hashCode = hashCode();
        String valueOf = String.valueOf(m17970b());
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(simpleName).length() + 21) + String.valueOf(valueOf).length());
        stringBuilder.append(simpleName);
        stringBuilder.append("@");
        stringBuilder.append(hashCode);
        stringBuilder.append("[layout=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
