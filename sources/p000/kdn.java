package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kdn */
public abstract class kdn implements Serializable, Comparable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    public final Comparable f8243a;

    kdn(Comparable comparable) {
        this.f8243a = comparable;
    }

    /* renamed from: a */
    abstract void mo2124a(StringBuilder stringBuilder);

    /* renamed from: b */
    abstract void mo2125b(StringBuilder stringBuilder);

    /* renamed from: b */
    abstract boolean mo2126b(Comparable comparable);

    public abstract int hashCode();

    /* renamed from: a */
    static kdn m4786a(Comparable comparable) {
        return new kdr(comparable);
    }

    /* renamed from: a */
    public int mo2122a(kdn kdn) {
        if (kdn == kdq.f19179b) {
            return 1;
        }
        if (kdn == kdo.f19178b) {
            return -1;
        }
        int b = kge.m13497b(this.f8243a, kdn.f8243a);
        if (b != 0) {
            return b;
        }
        boolean z = this instanceof kdp;
        if (z == (kdn instanceof kdp)) {
            return 0;
        }
        if (z) {
            return 1;
        }
        return -1;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return mo2122a((kdn) obj);
    }

    /* renamed from: a */
    public Comparable mo2123a() {
        return this.f8243a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kdn)) {
            return false;
        }
        try {
            if (mo2122a((kdn) obj) == 0) {
                return true;
            }
            return false;
        } catch (ClassCastException e) {
            return false;
        }
    }
}
