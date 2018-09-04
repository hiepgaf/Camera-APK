package p000;

/* compiled from: PG */
/* renamed from: ajr */
final class ajr implements ajo {
    /* renamed from: a */
    private final String f9841a;

    ajr(String str) {
        this.f9841a = str;
    }

    /* renamed from: a */
    public final String mo99a() {
        return this.f9841a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ajr)) {
            return false;
        }
        return this.f9841a.equals(((ajr) obj).f9841a);
    }

    public final int hashCode() {
        return this.f9841a.hashCode();
    }

    public final String toString() {
        String str = this.f9841a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 29);
        stringBuilder.append("StringHeaderFactory{value='");
        stringBuilder.append(str);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
