package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kge */
public final class kge extends kgf implements Serializable, kbj {
    /* renamed from: c */
    private static final kge f19197c = new kge(kdq.f19179b, kdo.f19178b);
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    public final kdn f19198a;
    /* renamed from: b */
    public final kdn f19199b;

    private kge(kdn kdn, kdn kdn2) {
        this.f19198a = (kdn) jri.m13152b((Object) kdn);
        this.f19199b = (kdn) jri.m13152b((Object) kdn2);
        if (kdn.mo2122a(kdn2) > 0 || kdn == kdo.f19178b || kdn2 == kdq.f19179b) {
            String valueOf = String.valueOf(kge.m13498b(kdn, kdn2));
            String str = "Invalid range: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new IllegalArgumentException(valueOf);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final /* synthetic */ boolean mo2094a(Object obj) {
        return m13501b((Comparable) obj);
    }

    /* renamed from: a */
    public static kge m13494a(Comparable comparable) {
        return kge.m13496a(kdn.m4786a(comparable), kdo.f19178b);
    }

    /* renamed from: a */
    public static kge m13495a(Comparable comparable, Comparable comparable2) {
        return kge.m13496a(kdn.m4786a(comparable), new kdp(comparable2));
    }

    /* renamed from: b */
    static int m13497b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* renamed from: b */
    public final boolean m13501b(Comparable comparable) {
        jri.m13152b((Object) comparable);
        return this.f19198a.mo2126b(comparable) && !this.f19199b.mo2126b(comparable);
    }

    /* renamed from: a */
    private static kge m13496a(kdn kdn, kdn kdn2) {
        return new kge(kdn, kdn2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kge)) {
            return false;
        }
        kge kge = (kge) obj;
        if (this.f19198a.equals(kge.f19198a) && this.f19199b.equals(kge.f19199b)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m13499a() {
        return this.f19199b != kdo.f19178b;
    }

    public final int hashCode() {
        return (this.f19198a.hashCode() * 31) + this.f19199b.hashCode();
    }

    final Object readResolve() {
        if (equals(f19197c)) {
            return f19197c;
        }
        return this;
    }

    public final String toString() {
        return kge.m13498b(this.f19198a, this.f19199b);
    }

    /* renamed from: b */
    private static String m13498b(kdn kdn, kdn kdn2) {
        StringBuilder stringBuilder = new StringBuilder(16);
        kdn.mo2124a(stringBuilder);
        stringBuilder.append("..");
        kdn2.mo2125b(stringBuilder);
        return stringBuilder.toString();
    }
}
