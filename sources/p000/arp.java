package p000;

/* compiled from: PG */
/* renamed from: arp */
public final class arp {
    /* renamed from: a */
    private Class f921a;
    /* renamed from: b */
    private Class f922b;
    /* renamed from: c */
    private Class f923c;

    public arp(Class cls, Class cls2) {
        m643a(cls, cls2, null);
    }

    public arp(Class cls, Class cls2, Class cls3) {
        m643a(cls, cls2, cls3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        arp arp = (arp) obj;
        if (!this.f921a.equals(arp.f921a)) {
            return false;
        }
        if (!this.f922b.equals(arp.f922b)) {
            return false;
        }
        if (arq.m658b(this.f923c, arp.f923c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f921a.hashCode() * 31) + this.f922b.hashCode()) * 31;
        Class cls = this.f923c;
        if (cls != null) {
            hashCode = cls.hashCode();
        } else {
            hashCode = 0;
        }
        return hashCode + hashCode2;
    }

    /* renamed from: a */
    public final void m643a(Class cls, Class cls2, Class cls3) {
        this.f921a = cls;
        this.f922b = cls2;
        this.f923c = cls3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f921a);
        String valueOf2 = String.valueOf(this.f922b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(valueOf2).length());
        stringBuilder.append("MultiClassKey{first=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", second=");
        stringBuilder.append(valueOf2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
