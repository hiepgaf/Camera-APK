package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: keb */
final class keb implements Serializable {
    /* renamed from: a */
    public final Comparator f8246a;
    /* renamed from: b */
    public final boolean f8247b;
    /* renamed from: c */
    public final Object f8248c;
    /* renamed from: d */
    public final kcy f8249d;
    /* renamed from: e */
    public final boolean f8250e;
    /* renamed from: f */
    public final Object f8251f;
    /* renamed from: g */
    public final kcy f8252g;

    keb(Comparator comparator, boolean z, Object obj, kcy kcy, boolean z2, Object obj2, kcy kcy2) {
        int i = 1;
        this.f8246a = (Comparator) jri.m13152b((Object) comparator);
        this.f8247b = z;
        this.f8250e = z2;
        this.f8248c = obj;
        this.f8249d = (kcy) jri.m13152b((Object) kcy);
        this.f8251f = obj2;
        this.f8252g = (kcy) jri.m13152b((Object) kcy2);
        if (z) {
            comparator.compare(obj, obj);
        }
        if (z2) {
            comparator.compare(obj2, obj2);
        }
        if (z && z2) {
            boolean z3;
            int compare = comparator.compare(obj, obj2);
            if (compare <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            jri.m13149a(z3, "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (compare == 0) {
                int i2;
                if (kcy != kcy.OPEN) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (kcy2 == kcy.OPEN) {
                    i = 0;
                }
                jri.m13143a(i2 | i);
            }
        }
    }

    /* renamed from: a */
    static keb m4792a(Comparator comparator) {
        return new keb(comparator, false, null, kcy.OPEN, false, null, kcy.OPEN);
    }

    /* renamed from: a */
    final boolean m4794a(Object obj) {
        return (m4796c(obj) || m4795b(obj)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof keb)) {
            return false;
        }
        keb keb = (keb) obj;
        if (this.f8246a.equals(keb.f8246a) && this.f8247b == keb.f8247b && this.f8250e == keb.f8250e && this.f8249d.equals(keb.f8249d) && this.f8252g.equals(keb.f8252g) && kbf.m16436b(this.f8248c, keb.f8248c) && kbf.m16436b(this.f8251f, keb.f8251f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8246a, this.f8248c, this.f8249d, this.f8251f, this.f8252g});
    }

    /* renamed from: a */
    final keb m4793a(keb keb) {
        int compare;
        kcy kcy;
        Object obj;
        jri.m13152b((Object) keb);
        jri.m13143a(this.f8246a.equals(keb.f8246a));
        boolean z = this.f8247b;
        Object obj2 = this.f8248c;
        kcy kcy2 = this.f8249d;
        if (!z) {
            z = keb.f8247b;
            obj2 = keb.f8248c;
            kcy2 = keb.f8249d;
        } else if (keb.f8247b) {
            compare = this.f8246a.compare(obj2, keb.f8248c);
            if (compare < 0 || (compare == 0 && keb.f8249d == kcy.OPEN)) {
                obj2 = keb.f8248c;
                kcy2 = keb.f8249d;
            }
        }
        boolean z2 = this.f8250e;
        Object obj3 = this.f8251f;
        kcy kcy3 = this.f8252g;
        if (!z2) {
            z2 = keb.f8250e;
            obj3 = keb.f8251f;
            kcy3 = keb.f8252g;
        } else if (keb.f8250e) {
            compare = this.f8246a.compare(obj3, keb.f8251f);
            if (compare > 0 || (compare == 0 && keb.f8252g == kcy.OPEN)) {
                obj3 = keb.f8251f;
                kcy3 = keb.f8252g;
            }
        }
        if (!z) {
            kcy = kcy2;
            obj = obj2;
        } else if (z2) {
            compare = this.f8246a.compare(obj2, obj3);
            if (compare <= 0) {
                if (compare != 0) {
                    kcy = kcy2;
                    obj = obj2;
                } else if (kcy2 != kcy.OPEN) {
                    kcy = kcy2;
                    obj = obj2;
                } else if (kcy3 != kcy.OPEN) {
                    kcy = kcy2;
                    obj = obj2;
                }
            }
            kcy2 = kcy.OPEN;
            kcy3 = kcy.CLOSED;
            kcy = kcy2;
            obj = obj3;
        } else {
            kcy = kcy2;
            obj = obj2;
        }
        return new keb(this.f8246a, z, obj, kcy, z2, obj3, kcy3);
    }

    public final String toString() {
        char c;
        Object obj;
        char c2;
        String valueOf = String.valueOf(this.f8246a);
        if (this.f8249d == kcy.CLOSED) {
            c = '[';
        } else {
            c = '(';
        }
        if (this.f8247b) {
            obj = this.f8248c;
        } else {
            obj = "-∞";
        }
        String valueOf2 = String.valueOf(obj);
        if (this.f8250e) {
            obj = this.f8251f;
        } else {
            obj = "∞";
        }
        String valueOf3 = String.valueOf(obj);
        if (this.f8252g == kcy.CLOSED) {
            c2 = ']';
        } else {
            c2 = ')';
        }
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 4) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(":");
        stringBuilder.append(c);
        stringBuilder.append(valueOf2);
        stringBuilder.append(',');
        stringBuilder.append(valueOf3);
        stringBuilder.append(c2);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    final boolean m4795b(Object obj) {
        int i = 1;
        if (!this.f8250e) {
            return false;
        }
        int i2;
        int compare = this.f8246a.compare(obj, this.f8251f);
        if (compare > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (compare == 0) {
            compare = 1;
        } else {
            compare = 0;
        }
        if (this.f8252g != kcy.OPEN) {
            i = 0;
        }
        return i2 | (compare & i);
    }

    /* renamed from: c */
    final boolean m4796c(Object obj) {
        int i = 1;
        if (!this.f8247b) {
            return false;
        }
        int i2;
        int compare = this.f8246a.compare(obj, this.f8248c);
        if (compare < 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (compare == 0) {
            compare = 1;
        } else {
            compare = 0;
        }
        if (this.f8249d != kcy.OPEN) {
            i = 0;
        }
        return i2 | (compare & i);
    }
}
