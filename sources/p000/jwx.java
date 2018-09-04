package p000;

import java.util.Objects;

/* compiled from: PG */
/* renamed from: jwx */
public final class jwx extends jxn {
    /* renamed from: a */
    public final String f19094a;

    public jwx(String str, String str2, long j, int i, int i2) {
        this(str, str2, j, i, i2, 0);
    }

    public jwx(String str, String str2, long j, int i, int i2, long j2) {
        super(str2, j, i, i2, j2);
        jri.m13152b((Object) str);
        this.f19094a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwx)) {
            return false;
        }
        jwx jwx = (jwx) obj;
        if (Objects.equals(this.f19094a, jwx.f19094a) && Objects.equals(this.b, jwx.f8070b) && this.c == jwx.f8071c && this.e == jwx.f8073e && this.d == jwx.f8072d && this.f == jwx.f8074f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f19094a, this.b, Long.valueOf(this.c), Integer.valueOf(this.e), Integer.valueOf(this.d), Long.valueOf(this.f)});
    }
}
