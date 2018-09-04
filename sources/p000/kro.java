package p000;

/* compiled from: PG */
/* renamed from: kro */
public final class kro {
    /* renamed from: a */
    private final Object f8447a;
    /* renamed from: b */
    private final int f8448b;

    public kro(Object obj, int i) {
        this.f8447a = obj;
        this.f8448b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kro)) {
            return false;
        }
        kro kro = (kro) obj;
        if (this.f8447a == kro.f8447a && this.f8448b == kro.f8448b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f8447a) * 65535) + this.f8448b;
    }
}
