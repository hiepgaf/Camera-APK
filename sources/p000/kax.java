package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kax */
public final class kax implements Serializable, kaw {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final kaw f19139a;
    /* renamed from: b */
    private final kaw f19140b;

    public kax(kaw kaw, kaw kaw2) {
        this.f19139a = (kaw) jri.m13152b((Object) kaw);
        this.f19140b = (kaw) jri.m13152b((Object) kaw2);
    }

    /* renamed from: a */
    public final Object mo370a(Object obj) {
        return this.f19139a.mo370a(this.f19140b.mo370a(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kax)) {
            return false;
        }
        kax kax = (kax) obj;
        if (this.f19140b.equals(kax.f19140b) && this.f19139a.equals(kax.f19139a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19140b.hashCode() ^ this.f19139a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19139a);
        String valueOf2 = String.valueOf(this.f19140b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("(");
        stringBuilder.append(valueOf2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
