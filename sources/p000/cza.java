package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: cza */
public final class cza {
    /* renamed from: a */
    private final iur f2846a;
    /* renamed from: b */
    private final fxj f2847b = null;

    private cza(iur iur, fxj fxj) {
        this.f2846a = iur;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cza cza = (cza) obj;
        if (kbf.m16436b(this.f2846a, cza.f2846a) && kbf.m16436b(this.f2847b, cza.f2847b)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static cza m1552a(cwc cwc) {
        return new cza(cwc.f2815a, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2846a, this.f2847b});
    }

    public final String toString() {
        kbd b = jqk.m13098b((Object) this);
        b.m4743a().f8185b = this.f2846a;
        b.m4743a().f8185b = this.f2847b;
        return b.toString();
    }
}
