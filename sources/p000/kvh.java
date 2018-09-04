package p000;

/* compiled from: PG */
/* renamed from: kvh */
public final class kvh implements Cloneable {
    /* renamed from: a */
    public static final kvi f8646a = new kvi();
    /* renamed from: b */
    public boolean f8647b;
    /* renamed from: c */
    public kvi[] f8648c;
    /* renamed from: d */
    private int[] f8649d;
    /* renamed from: e */
    private int f8650e;

    kvh() {
        this(10);
    }

    private kvh(int i) {
        this.f8647b = false;
        int d = kvh.m5441d(i);
        this.f8649d = new int[d];
        this.f8648c = new kvi[d];
        this.f8650e = 0;
    }

    /* renamed from: a */
    final int m5442a(int i) {
        int i2 = this.f8650e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f8649d[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    public final kvh m5443a() {
        int i = 0;
        int b = m5445b();
        kvh kvh = new kvh(b);
        System.arraycopy(this.f8649d, 0, kvh.f8649d, 0, b);
        while (i < b) {
            kvi kvi = this.f8648c[i];
            if (kvi != null) {
                kvh.f8648c[i] = kvi.m5449a();
            }
            i++;
        }
        kvh.f8650e = b;
        return kvh;
    }

    public final /* synthetic */ Object clone() {
        return m5443a();
    }

    /* renamed from: b */
    final kvi m5446b(int i) {
        if (this.f8647b) {
            m5440c();
        }
        return this.f8648c[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kvh)) {
            return false;
        }
        kvh kvh = (kvh) obj;
        if (m5445b() != kvh.m5445b()) {
            return false;
        }
        int i;
        boolean z;
        int[] iArr = this.f8649d;
        int[] iArr2 = kvh.f8649d;
        int i2 = this.f8650e;
        for (i = 0; i < i2; i++) {
            if (iArr[i] != iArr2[i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            kvi[] kviArr = this.f8648c;
            kvi[] kviArr2 = kvh.f8648c;
            i2 = this.f8650e;
            for (i = 0; i < i2; i++) {
                if (!kviArr[i].equals(kviArr2[i])) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m5440c() {
        int i = this.f8650e;
        int[] iArr = this.f8649d;
        kvi[] kviArr = this.f8648c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            kvi kvi = kviArr[i3];
            if (kvi != f8646a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    kviArr[i2] = kvi;
                    kviArr[i3] = null;
                }
                i2++;
            }
        }
        this.f8647b = false;
        this.f8650e = i2;
    }

    /* renamed from: c */
    final kvi m5447c(int i) {
        int a = m5442a(i);
        if (a < 0 || this.f8648c[a] == f8646a) {
            return null;
        }
        return this.f8648c[a];
    }

    public final int hashCode() {
        int i = 17;
        int i2 = 0;
        if (this.f8647b) {
            m5440c();
        }
        while (i2 < this.f8650e) {
            i = (((i * 31) + this.f8649d[i2]) * 31) + this.f8648c[i2].hashCode();
            i2++;
        }
        return i;
    }

    /* renamed from: d */
    private static int m5441d(int i) {
        int i2;
        int i3 = i << 2;
        for (int i4 = 4; i4 < 32; i4++) {
            i2 = (1 << i4) - 12;
            if (i3 <= i2) {
                break;
            }
        }
        i2 = i3;
        return i2 / 4;
    }

    /* renamed from: a */
    final void m5444a(int i, kvi kvi) {
        int a = m5442a(i);
        if (a >= 0) {
            this.f8648c[a] = kvi;
            return;
        }
        a ^= -1;
        if (a >= this.f8650e || this.f8648c[a] != f8646a) {
            Object obj;
            Object obj2;
            if (this.f8647b && this.f8650e >= this.f8649d.length) {
                m5440c();
                a = m5442a(i) ^ -1;
            }
            int i2 = this.f8650e;
            if (i2 >= this.f8649d.length) {
                i2 = kvh.m5441d(i2 + 1);
                obj = new int[i2];
                obj2 = new kvi[i2];
                Object obj3 = this.f8649d;
                System.arraycopy(obj3, 0, obj, 0, obj3.length);
                obj3 = this.f8648c;
                System.arraycopy(obj3, 0, obj2, 0, obj3.length);
                this.f8649d = obj;
                this.f8648c = obj2;
            }
            i2 = this.f8650e - a;
            if (i2 != 0) {
                obj = this.f8649d;
                int i3 = a + 1;
                System.arraycopy(obj, a, obj, i3, i2);
                obj2 = this.f8648c;
                System.arraycopy(obj2, a, obj2, i3, this.f8650e - a);
            }
            this.f8649d[a] = i;
            this.f8648c[a] = kvi;
            this.f8650e++;
            return;
        }
        this.f8649d[a] = i;
        this.f8648c[a] = kvi;
    }

    /* renamed from: b */
    final int m5445b() {
        if (this.f8647b) {
            m5440c();
        }
        return this.f8650e;
    }
}
