package p000;

/* compiled from: PG */
/* renamed from: jfj */
public final class jfj implements Comparable {
    /* renamed from: b */
    public static final jfj f7758b = new jfj(3, 0);
    /* renamed from: c */
    public static final jfj f7759c = new jfj(3, 1);
    /* renamed from: a */
    public final int f7760a;
    /* renamed from: d */
    private final int f7761d;

    static {
        jfj jfj = new jfj(2, 0);
        jfj = new jfj(3, 2);
    }

    public jfj(int i, int i2) {
        this.f7760a = i;
        this.f7761d = i2;
    }

    /* renamed from: a */
    public final int m4447a(jfj jfj) {
        int i = this.f7760a;
        int i2 = jfj.f7760a;
        if (i >= i2) {
            return i > i2 ? 1 : this.f7761d - jfj.f7761d;
        } else {
            return -1;
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return m4447a((jfj) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfj)) {
            return false;
        }
        jfj jfj = (jfj) obj;
        if (this.f7760a == jfj.f7760a && this.f7761d == jfj.f7761d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f7760a * 31) + this.f7761d;
    }

    /* renamed from: b */
    public final boolean m4448b(jfj jfj) {
        return m4447a(jfj) >= 0;
    }

    public final String toString() {
        int i = this.f7760a;
        int i2 = this.f7761d;
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append(i);
        stringBuilder.append(".");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }
}
