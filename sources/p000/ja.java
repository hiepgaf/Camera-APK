package p000;

/* compiled from: PG */
/* renamed from: ja */
public final class ja implements Cloneable {
    /* renamed from: a */
    public static final Object f7597a = new Object();
    /* renamed from: b */
    public boolean f7598b;
    /* renamed from: c */
    public int[] f7599c;
    /* renamed from: d */
    public Object[] f7600d;
    /* renamed from: e */
    public int f7601e;

    public ja() {
        this(10);
    }

    public ja(int i) {
        this.f7598b = false;
        if (i == 0) {
            this.f7599c = il.f7072a;
            this.f7600d = il.f7073b;
        } else {
            int a = il.m3808a(i);
            this.f7599c = new int[a];
            this.f7600d = new Object[a];
        }
        this.f7601e = 0;
    }

    /* renamed from: c */
    private final ja m4370c() {
        try {
            ja jaVar = (ja) super.clone();
            try {
                jaVar.f7599c = (int[]) this.f7599c.clone();
                jaVar.f7600d = (Object[]) this.f7600d.clone();
                return jaVar;
            } catch (CloneNotSupportedException e) {
                return jaVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public final /* synthetic */ Object clone() {
        return m4370c();
    }

    /* renamed from: a */
    public final void m4372a() {
        int i = this.f7601e;
        int[] iArr = this.f7599c;
        Object[] objArr = this.f7600d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f7597a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f7598b = false;
        this.f7601e = i2;
    }

    /* renamed from: a */
    public final int m4371a(int i) {
        if (this.f7598b) {
            m4372a();
        }
        return this.f7599c[i];
    }

    /* renamed from: a */
    public final void m4373a(int i, Object obj) {
        int a = il.m3809a(this.f7599c, this.f7601e, i);
        if (a >= 0) {
            this.f7600d[a] = obj;
            return;
        }
        a ^= -1;
        if (a >= this.f7601e || this.f7600d[a] != f7597a) {
            Object obj2;
            Object obj3;
            if (this.f7598b && this.f7601e >= this.f7599c.length) {
                m4372a();
                a = il.m3809a(this.f7599c, this.f7601e, i) ^ -1;
            }
            int i2 = this.f7601e;
            if (i2 >= this.f7599c.length) {
                i2 = il.m3808a(i2 + 1);
                obj2 = new int[i2];
                obj3 = new Object[i2];
                Object obj4 = this.f7599c;
                System.arraycopy(obj4, 0, obj2, 0, obj4.length);
                obj4 = this.f7600d;
                System.arraycopy(obj4, 0, obj3, 0, obj4.length);
                this.f7599c = obj2;
                this.f7600d = obj3;
            }
            i2 = this.f7601e - a;
            if (i2 != 0) {
                obj2 = this.f7599c;
                int i3 = a + 1;
                System.arraycopy(obj2, a, obj2, i3, i2);
                obj3 = this.f7600d;
                System.arraycopy(obj3, a, obj3, i3, this.f7601e - a);
            }
            this.f7599c[a] = i;
            this.f7600d[a] = obj;
            this.f7601e++;
            return;
        }
        this.f7599c[a] = i;
        this.f7600d[a] = obj;
    }

    /* renamed from: b */
    public final int m4374b() {
        if (this.f7598b) {
            m4372a();
        }
        return this.f7601e;
    }

    public final String toString() {
        if (m4374b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f7601e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f7601e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m4371a(i));
            stringBuilder.append('=');
            ja b = m4375b(i);
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
    public final Object m4375b(int i) {
        if (this.f7598b) {
            m4372a();
        }
        return this.f7600d[i];
    }
}
