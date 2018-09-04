package p000;

/* compiled from: PG */
/* renamed from: adm */
public final class adm {
    /* renamed from: e */
    private static final ado f335e = new adn();
    /* renamed from: a */
    public final Object f336a;
    /* renamed from: b */
    public final ado f337b;
    /* renamed from: c */
    public final String f338c;
    /* renamed from: d */
    public volatile byte[] f339d;

    private adm(String str, Object obj, ado ado) {
        this.f338c = aqe.m586a(str);
        this.f336a = obj;
        this.f337b = (ado) aqe.m585a((Object) ado, "Argument must not be null");
    }

    /* renamed from: a */
    public static adm m170a(String str, Object obj, ado ado) {
        return new adm(str, obj, ado);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adm)) {
            return false;
        }
        return this.f338c.equals(((adm) obj).f338c);
    }

    public final int hashCode() {
        return this.f338c.hashCode();
    }

    /* renamed from: a */
    public static adm m168a(String str) {
        return new adm(str, null, f335e);
    }

    /* renamed from: a */
    public static adm m169a(String str, Object obj) {
        return new adm(str, obj, f335e);
    }

    public final String toString() {
        String str = this.f338c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 14);
        stringBuilder.append("Option{key='");
        stringBuilder.append(str);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
