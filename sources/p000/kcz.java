package p000;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kcz */
public final class kcz extends kgd implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final kaw f19169a;
    /* renamed from: b */
    private final kgd f19170b;

    public kcz(kaw kaw, kgd kgd) {
        this.f19169a = (kaw) jri.m13152b((Object) kaw);
        this.f19170b = (kgd) jri.m13152b((Object) kgd);
    }

    public final int compare(Object obj, Object obj2) {
        return this.f19170b.compare(this.f19169a.mo370a(obj), this.f19169a.mo370a(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kcz)) {
            return false;
        }
        kcz kcz = (kcz) obj;
        if (this.f19169a.equals(kcz.f19169a) && this.f19170b.equals(kcz.f19170b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19169a, this.f19170b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19170b);
        String valueOf2 = String.valueOf(this.f19169a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 13) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(".onResultOf(");
        stringBuilder.append(valueOf2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
