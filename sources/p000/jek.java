package p000;

/* compiled from: PG */
/* renamed from: jek */
public final class jek extends jdv {
    public jek(jdo jdo, jaq jaq) {
        super(jdo, jaq);
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        int hashCode = hashCode();
        String valueOf = String.valueOf(((jfb) m17634d()).mo3586d());
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
