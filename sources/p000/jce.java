package p000;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: jce */
public final class jce {
    /* renamed from: a */
    private final int f7689a;
    /* renamed from: b */
    private final int[] f7690b;
    /* renamed from: c */
    private final int[] f7691c;
    /* renamed from: d */
    private final jcg f7692d;
    /* renamed from: e */
    private final boolean f7693e;

    public jce(jcg jcg, int i, int[] iArr) {
        this(jcg, i, iArr, (byte) 0);
    }

    private jce(jcg jcg, int i, int[] iArr, byte b) {
        boolean z = false;
        this.f7689a = i;
        this.f7690b = iArr;
        this.f7691c = new int[r3];
        this.f7692d = jcg;
        if (jcg.mo3164a() % 8 == 0 && i % 8 == 0) {
            for (int i2 : iArr) {
                if (i2 % 8 != 0) {
                    break;
                }
            }
            z = true;
        }
        this.f7693e = z;
        Arrays.fill(this.f7691c, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jce)) {
            return false;
        }
        jce jce = (jce) obj;
        if (this.f7689a == jce.f7689a && this.f7693e == jce.f7693e && Arrays.equals(this.f7690b, jce.f7690b) && Arrays.equals(this.f7691c, jce.f7691c) && Objects.equals(this.f7692d, jce.f7692d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.f7689a * 31) + Arrays.hashCode(this.f7690b)) * 31) + Arrays.hashCode(this.f7691c)) * 31) + this.f7692d.hashCode()) * 31) + this.f7693e;
    }

    public final String toString() {
        String d = this.f7692d.mo3165d();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(d).length() + 9);
        stringBuilder.append("Channel[");
        stringBuilder.append(d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
