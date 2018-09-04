package p000;

/* renamed from: iei */
public final class iei {
    /* renamed from: a */
    private final Object f6974a;
    /* renamed from: b */
    private final String f6975b;

    public iei(Object obj, String str) {
        this.f6974a = obj;
        this.f6975b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iei)) {
            return false;
        }
        iei iei = (iei) obj;
        return this.f6974a == iei.f6974a && this.f6975b.equals(iei.f6975b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f6974a) * 31) + this.f6975b.hashCode();
    }
}
