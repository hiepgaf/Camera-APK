package p000;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: erx */
public final class erx {
    /* renamed from: a */
    public static final erx f4174a = new erx(Double.NaN, Double.NaN);
    /* renamed from: b */
    private final double f4175b;
    /* renamed from: c */
    private final double f4176c;

    static {
        erx erx = new erx(0.0d, 0.0d);
    }

    private erx(double d, double d2) {
        this.f4175b = d;
        this.f4176c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        erx erx = (erx) obj;
        if (Double.compare(erx.f4175b, this.f4175b) != 0) {
            return false;
        }
        if (Double.compare(erx.f4176c, this.f4176c) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static erx m2086a(double d, double d2) {
        if (Double.isNaN(d) || Double.isNaN(d2) || Double.isInfinite(d) || Double.isInfinite(d2) || (d == 0.0d && d2 == 0.0d)) {
            return f4174a;
        }
        return new erx(d, d2);
    }

    /* renamed from: a */
    public final String m2087a() {
        return String.format(Locale.getDefault(), "%f, %f", new Object[]{Double.valueOf(this.f4175b), Double.valueOf(this.f4176c)});
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f4175b);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f4176c);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        String valueOf = String.valueOf(m2087a());
        String str = "Location: ";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }
}
