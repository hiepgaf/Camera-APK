package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: iqn */
public final class iqn {
    /* renamed from: a */
    public final long f7327a;
    /* renamed from: b */
    public final long f7328b;

    public iqn(long j, long j2) {
        this.f7327a = j;
        this.f7328b = j2;
    }

    public iqn(iqn iqn) {
        this.f7327a = iqn.f7327a;
        this.f7328b = iqn.f7328b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqn)) {
            return false;
        }
        iqn iqn = (iqn) obj;
        if (this.f7327a == iqn.f7327a && this.f7328b == iqn.f7328b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7327a), Long.valueOf(this.f7328b)});
    }

    /* renamed from: a */
    public final double m4042a() {
        return ((double) this.f7327a) / ((double) this.f7328b);
    }

    public final String toString() {
        long j = this.f7327a;
        long j2 = this.f7328b;
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append(j);
        stringBuilder.append("/");
        stringBuilder.append(j2);
        return stringBuilder.toString();
    }
}
