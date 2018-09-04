package p000;

import android.graphics.Rect;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ipz */
public final class ipz {
    /* renamed from: a */
    public static final ipz f7303a = ipz.m4018a(4, 3);
    /* renamed from: b */
    public static final ipz f7304b = ipz.m4018a(16, 9);
    /* renamed from: c */
    public final int f7305c;
    /* renamed from: d */
    public final int f7306d;

    private ipz(int i, int i2) {
        this.f7305c = i;
        this.f7306d = i2;
    }

    /* renamed from: a */
    public final ipz m4024a() {
        if (this.f7305c < this.f7306d) {
            return m4021d();
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipz)) {
            return false;
        }
        ipz ipz = (ipz) obj;
        if (this.f7306d == ipz.f7306d && this.f7305c == ipz.f7305c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Rect m4022a(Rect rect) {
        ipz a = ipz.m4018a(rect.width(), rect.height());
        if (this.f7305c * a.f7306d > a.f7305c * this.f7306d) {
            int width = (rect.width() * this.f7306d) / this.f7305c;
            int height = ((rect.height() - width) / 2) + rect.top;
            return new Rect(rect.left, height, rect.left + rect.width(), width + height);
        }
        width = (rect.height() * this.f7305c) / this.f7306d;
        height = ((rect.width() - width) / 2) + rect.left;
        return new Rect(height, rect.top, width + height, rect.top + rect.height());
    }

    /* renamed from: a */
    public final Rect m4023a(iqp iqp) {
        return m4022a(new Rect(0, 0, iqp.f7329a, iqp.f7330b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7305c), Integer.valueOf(this.f7306d)});
    }

    /* renamed from: a */
    public final boolean m4025a(ipz ipz) {
        return ((double) Math.abs(m4026b() - ipz.m4027b(this).m4026b())) < 0.025d;
    }

    /* renamed from: c */
    private final boolean m4020c() {
        return this.f7305c <= this.f7306d;
    }

    /* renamed from: a */
    public static ipz m4018a(int i, int i2) {
        int intValue = BigInteger.valueOf((long) i).gcd(BigInteger.valueOf((long) i2)).intValue();
        return new ipz(i / intValue, i2 / intValue);
    }

    /* renamed from: b */
    public static ipz m4019b(iqp iqp) {
        return ipz.m4018a(iqp.f7329a, iqp.f7330b);
    }

    /* renamed from: b */
    public final float m4026b() {
        return ((float) this.f7305c) / ((float) this.f7306d);
    }

    public final String toString() {
        return String.format(null, "AspectRatio[%d:%d]", new Object[]{Integer.valueOf(this.f7305c), Integer.valueOf(this.f7306d)});
    }

    /* renamed from: d */
    private final ipz m4021d() {
        return ipz.m4018a(this.f7306d, this.f7305c);
    }

    /* renamed from: b */
    public final ipz m4027b(ipz ipz) {
        if (!ipz.m4020c()) {
            return m4024a();
        }
        if (m4020c()) {
            return this;
        }
        return m4021d();
    }
}
