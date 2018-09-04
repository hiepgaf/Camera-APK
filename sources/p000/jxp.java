package p000;

import java.util.Objects;

/* compiled from: PG */
/* renamed from: jxp */
public final class jxp extends jxn {
    /* renamed from: a */
    private final int f19097a;

    public jxp(String str, long j, int i, int i2, int i3) {
        this(str, j, i, i2, i3, (byte) 0);
    }

    private jxp(String str, long j, int i, int i2, int i3, byte b) {
        boolean z;
        super(str, j, i2, i3);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.f19097a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxp)) {
            return false;
        }
        jxp jxp = (jxp) obj;
        if (this.b.equals(jxp.f8070b) && this.f19097a == jxp.f19097a && this.c == jxp.f8071c && this.e == jxp.f8073e && this.d == jxp.f8072d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.b, Long.valueOf(this.c), Integer.valueOf(this.f19097a), Integer.valueOf(this.e), Integer.valueOf(this.d)});
    }
}
