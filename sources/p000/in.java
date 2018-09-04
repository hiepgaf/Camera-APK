package p000;

/* compiled from: PG */
/* renamed from: in */
public final class in implements Cloneable {
    /* renamed from: a */
    public static final Object f7117a = new Object();
    /* renamed from: b */
    public boolean f7118b;
    /* renamed from: c */
    public long[] f7119c;
    /* renamed from: d */
    public Object[] f7120d;
    /* renamed from: e */
    public int f7121e;

    public in() {
        this((byte) 0);
    }

    private in(byte b) {
        this.f7118b = false;
        int b2 = il.m3812b(10);
        this.f7119c = new long[b2];
        this.f7120d = new Object[b2];
        this.f7121e = 0;
    }

    /* renamed from: a */
    public final void m3865a() {
        int i = this.f7121e;
        Object[] objArr = this.f7120d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f7121e = 0;
        this.f7118b = false;
    }

    /* renamed from: d */
    private final in m3863d() {
        try {
            in inVar = (in) super.clone();
            try {
                inVar.f7119c = (long[]) this.f7119c.clone();
                inVar.f7120d = (Object[]) this.f7120d.clone();
                return inVar;
            } catch (CloneNotSupportedException e) {
                return inVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public final /* synthetic */ Object clone() {
        return m3863d();
    }

    /* renamed from: a */
    public final void m3866a(long j) {
        int a = il.m3810a(this.f7119c, this.f7121e, j);
        if (a >= 0 && this.f7120d[a] != f7117a) {
            this.f7120d[a] = f7117a;
            this.f7118b = true;
        }
    }

    /* renamed from: b */
    public final void m3870b() {
        int i = this.f7121e;
        long[] jArr = this.f7119c;
        Object[] objArr = this.f7120d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f7117a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f7118b = false;
        this.f7121e = i2;
    }

    /* renamed from: b */
    public final Object m3869b(long j) {
        int a = il.m3810a(this.f7119c, this.f7121e, j);
        if (a < 0 || this.f7120d[a] == f7117a) {
            return null;
        }
        return this.f7120d[a];
    }

    /* renamed from: a */
    public final long m3864a(int i) {
        if (this.f7118b) {
            m3870b();
        }
        return this.f7119c[i];
    }

    /* renamed from: a */
    public final void m3867a(long j, Object obj) {
        int a = il.m3810a(this.f7119c, this.f7121e, j);
        if (a >= 0) {
            this.f7120d[a] = obj;
            return;
        }
        a ^= -1;
        if (a >= this.f7121e || this.f7120d[a] != f7117a) {
            Object obj2;
            Object obj3;
            if (this.f7118b && this.f7121e >= this.f7119c.length) {
                m3870b();
                a = il.m3810a(this.f7119c, this.f7121e, j) ^ -1;
            }
            int i = this.f7121e;
            if (i >= this.f7119c.length) {
                i = il.m3812b(i + 1);
                obj2 = new long[i];
                obj3 = new Object[i];
                Object obj4 = this.f7119c;
                System.arraycopy(obj4, 0, obj2, 0, obj4.length);
                obj4 = this.f7120d;
                System.arraycopy(obj4, 0, obj3, 0, obj4.length);
                this.f7119c = obj2;
                this.f7120d = obj3;
            }
            i = this.f7121e - a;
            if (i != 0) {
                obj2 = this.f7119c;
                int i2 = a + 1;
                System.arraycopy(obj2, a, obj2, i2, i);
                obj3 = this.f7120d;
                System.arraycopy(obj3, a, obj3, i2, this.f7121e - a);
            }
            this.f7119c[a] = j;
            this.f7120d[a] = obj;
            this.f7121e++;
            return;
        }
        this.f7119c[a] = j;
        this.f7120d[a] = obj;
    }

    /* renamed from: c */
    public final int m3871c() {
        if (this.f7118b) {
            m3870b();
        }
        return this.f7121e;
    }

    public final String toString() {
        if (m3871c() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f7121e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f7121e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m3864a(i));
            stringBuilder.append('=');
            in b = m3868b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final Object m3868b(int i) {
        if (this.f7118b) {
            m3870b();
        }
        return this.f7120d[i];
    }
}
