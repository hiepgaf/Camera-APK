package p000;

/* compiled from: PG */
/* renamed from: ahc */
final class ahc implements ahh {
    /* renamed from: a */
    public int f9781a;
    /* renamed from: b */
    public Class f9782b;
    /* renamed from: c */
    private final ahd f9783c;

    ahc(ahd ahd) {
        this.f9783c = ahd;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahc)) {
            return false;
        }
        ahc ahc = (ahc) obj;
        if (this.f9781a == ahc.f9781a && this.f9782b == ahc.f9782b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.f9781a * 31;
        Class cls = this.f9782b;
        if (cls != null) {
            hashCode = cls.hashCode();
        } else {
            hashCode = 0;
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo71a() {
        this.f9783c.m264a(this);
    }

    public final String toString() {
        int i = this.f9781a;
        String valueOf = String.valueOf(this.f9782b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder.append("Key{size=");
        stringBuilder.append(i);
        stringBuilder.append("array=");
        stringBuilder.append(valueOf);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
