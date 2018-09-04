package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: iqp */
public final class iqp {
    /* renamed from: a */
    public final int f7329a;
    /* renamed from: b */
    public final int f7330b;
    /* renamed from: c */
    private volatile iqp f7331c;

    public iqp(int i, int i2) {
        this.f7329a = i;
        this.f7330b = i2;
        this.f7331c = null;
    }

    private iqp(int i, int i2, iqp iqp) {
        this.f7329a = i;
        this.f7330b = i2;
        this.f7331c = iqp;
    }

    /* renamed from: a */
    public final long m4046a() {
        return ((long) this.f7329a) * ((long) this.f7330b);
    }

    /* renamed from: b */
    public final iqp m4048b() {
        return this.f7329a >= this.f7330b ? this : m4052f();
    }

    /* renamed from: c */
    public final iqp m4049c() {
        return this.f7330b >= this.f7329a ? this : m4052f();
    }

    /* renamed from: d */
    public final float m4050d() {
        return ((float) this.f7329a) / ((float) this.f7330b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iqp iqp = (iqp) obj;
        if (this.f7329a == iqp.f7329a && this.f7330b == iqp.f7330b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7329a), Integer.valueOf(this.f7330b)});
    }

    /* renamed from: a */
    public static iqp m4043a(int i, int i2) {
        return new iqp(i, i2);
    }

    /* renamed from: a */
    public static iqp m4044a(Point point) {
        return new iqp(point.x, point.y);
    }

    /* renamed from: a */
    public static iqp m4045a(Rect rect) {
        return new iqp(rect.width(), rect.height());
    }

    /* renamed from: a */
    public final iqp m4047a(iqm iqm) {
        switch (iqm.ordinal()) {
            case 1:
            case 3:
                return m4052f();
            default:
                return this;
        }
    }

    /* renamed from: e */
    public final Size m4051e() {
        return new Size(this.f7329a, this.f7330b);
    }

    public final String toString() {
        int i = this.f7329a;
        int i2 = this.f7330b;
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    /* renamed from: f */
    public final iqp m4052f() {
        iqp iqp = this.f7331c;
        if (iqp != null) {
            return iqp;
        }
        iqp = new iqp(this.f7330b, this.f7329a, this);
        this.f7331c = iqp;
        return iqp;
    }
}
