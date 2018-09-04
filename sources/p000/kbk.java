package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kbk */
public final class kbk implements Serializable, kbj {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Object f19146a;

    public kbk(Object obj) {
        this.f19146a = obj;
    }

    /* renamed from: a */
    public final boolean mo2094a(Object obj) {
        return this.f19146a.equals(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kbk)) {
            return false;
        }
        return this.f19146a.equals(((kbk) obj).f19146a);
    }

    public final int hashCode() {
        return this.f19146a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19146a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
        stringBuilder.append("Predicates.equalTo(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
