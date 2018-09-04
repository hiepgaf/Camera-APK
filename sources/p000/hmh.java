package p000;

/* compiled from: PG */
/* renamed from: hmh */
public final class hmh extends hml {
    /* renamed from: a */
    private final hmm f17931a;
    /* renamed from: b */
    private final ilp f17932b;
    /* renamed from: c */
    private final hmn f17933c;

    public hmh(hmm hmm, ilp ilp, hmn hmn) {
        if (hmm == null) {
            throw new NullPointerException("Null effectFactory");
        }
        this.f17931a = hmm;
        if (ilp == null) {
            throw new NullPointerException("Null activation");
        }
        this.f17932b = ilp;
        if (hmn == null) {
            throw new NullPointerException("Null order");
        }
        this.f17933c = hmn;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hml)) {
            return false;
        }
        hml hml = (hml) obj;
        if (this.f17931a.equals(hml.mo1740b()) && this.f17932b.equals(hml.mo1739a()) && this.f17933c.equals(hml.mo1741c())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final ilp mo1739a() {
        return this.f17932b;
    }

    /* renamed from: b */
    public final hmm mo1740b() {
        return this.f17931a;
    }

    /* renamed from: c */
    public final hmn mo1741c() {
        return this.f17933c;
    }

    public final int hashCode() {
        return ((((this.f17931a.hashCode() ^ 1000003) * 1000003) ^ this.f17932b.hashCode()) * 1000003) ^ this.f17933c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17931a);
        String valueOf2 = String.valueOf(this.f17932b);
        String valueOf3 = String.valueOf(this.f17933c);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 60) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("ViewfinderEffectElement{effectFactory=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", activation=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", order=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
