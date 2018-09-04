package p000;

import java.util.Objects;

/* compiled from: PG */
/* renamed from: jzp */
public final class jzp {
    /* renamed from: a */
    public final int f8149a;
    /* renamed from: b */
    public final int f8150b;

    public jzp(int i, int i2) {
        this.f8149a = i;
        this.f8150b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzp)) {
            return false;
        }
        jzp jzp = (jzp) obj;
        if (this.f8149a == jzp.f8149a && this.f8150b == jzp.f8150b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f8149a), Integer.valueOf(this.f8150b)});
    }

    /* renamed from: a */
    public static jzp m4713a(int i, int i2) {
        return new jzp(i, i2);
    }

    /* renamed from: a */
    public static jzp m4714a(jqs jqs) {
        return new jzp(jqs.mo704b(), jqs.mo703a());
    }

    public final String toString() {
        return String.format("Size(%d, %d)", new Object[]{Integer.valueOf(this.f8149a), Integer.valueOf(this.f8150b)});
    }
}
