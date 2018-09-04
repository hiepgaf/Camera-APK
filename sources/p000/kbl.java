package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kbl */
public final class kbl implements Serializable, kbj {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final kbj f19147a;

    public kbl(kbj kbj) {
        this.f19147a = (kbj) jri.m13152b((Object) kbj);
    }

    /* renamed from: a */
    public final boolean mo2094a(Object obj) {
        return this.f19147a.mo2094a(obj) ^ 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kbl)) {
            return false;
        }
        return this.f19147a.equals(((kbl) obj).f19147a);
    }

    public final int hashCode() {
        return this.f19147a.hashCode() ^ -1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19147a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("Predicates.not(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
