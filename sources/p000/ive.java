package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ive */
public final class ive {
    /* renamed from: a */
    public final int f7494a;
    /* renamed from: b */
    public final iqp f7495b;

    public ive(int i, iqp iqp) {
        this.f7494a = i;
        this.f7495b = iqp;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ive)) {
            ive ive = (ive) obj;
            if (ive.f7494a == this.f7494a && ive.f7495b.equals(this.f7495b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7494a), this.f7495b});
    }

    public final String toString() {
        return jqk.m13099b("ImageReaderFormat").m4742a("ImageFormat", ion.m3961b(this.f7494a)).m4742a("Size", this.f7495b).toString();
    }
}
