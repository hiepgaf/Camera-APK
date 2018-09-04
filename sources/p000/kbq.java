package p000;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kbq */
public final class kbq implements Serializable, kbn {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Object f19155a;

    public kbq(Object obj) {
        this.f19155a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kbq)) {
            return false;
        }
        return kbf.m16436b(this.f19155a, ((kbq) obj).f19155a);
    }

    /* renamed from: b */
    public final Object mo605b() {
        return this.f19155a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19155a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19155a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
        stringBuilder.append("Suppliers.ofInstance(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
