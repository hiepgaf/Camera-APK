package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: kvi */
final class kvi implements Cloneable {
    /* renamed from: a */
    public kvg f8651a;
    /* renamed from: b */
    public Object f8652b;
    /* renamed from: c */
    public List f8653c;

    kvi() {
        this.f8653c = new ArrayList();
    }

    kvi(kvg kvg, Object obj) {
        this.f8651a = kvg;
        this.f8652b = obj;
    }

    /* renamed from: a */
    public final kvi m5449a() {
        int i = 0;
        kvi kvi = new kvi();
        try {
            kvi.f8651a = this.f8651a;
            Collection collection = this.f8653c;
            if (collection == null) {
                kvi.f8653c = null;
            } else {
                kvi.f8653c.addAll(collection);
            }
            Object obj = this.f8652b;
            if (obj != null) {
                if (obj instanceof kvl) {
                    kvi.f8652b = ((kvl) obj).clone();
                } else if (obj instanceof byte[]) {
                    kvi.f8652b = ((byte[]) obj).clone();
                } else if (obj instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) obj;
                    Object obj2 = new byte[bArr.length][];
                    kvi.f8652b = obj2;
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        obj2[i2] = (byte[]) bArr[i2].clone();
                    }
                } else if (obj instanceof boolean[]) {
                    kvi.f8652b = ((boolean[]) obj).clone();
                } else if (obj instanceof int[]) {
                    kvi.f8652b = ((int[]) obj).clone();
                } else if (obj instanceof long[]) {
                    kvi.f8652b = ((long[]) obj).clone();
                } else if (obj instanceof float[]) {
                    kvi.f8652b = ((float[]) obj).clone();
                } else if (obj instanceof double[]) {
                    kvi.f8652b = ((double[]) obj).clone();
                } else if (obj instanceof kvl[]) {
                    kvl[] kvlArr = (kvl[]) obj;
                    Object obj3 = new kvl[kvlArr.length];
                    kvi.f8652b = obj3;
                    while (i < kvlArr.length) {
                        obj3[i] = kvlArr[i].clone();
                        i++;
                    }
                }
            }
            return kvi;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ Object clone() {
        return m5449a();
    }

    /* renamed from: b */
    final int m5452b() {
        if (this.f8652b == null) {
            int i = 0;
            for (kvm kvm : this.f8653c) {
                i = (kvm.f8657b.length + kvd.m5423b(kvm.f8656a)) + i;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kvi)) {
            return false;
        }
        kvi kvi = (kvi) obj;
        if (this.f8652b == null || kvi.f8652b == null) {
            List list = this.f8653c;
            if (list != null) {
                List list2 = kvi.f8653c;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(m5448c(), kvi.m5448c());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
        kvg kvg = this.f8651a;
        if (kvg != kvi.f8651a) {
            return false;
        }
        if (!kvg.f8644a.isArray()) {
            return this.f8652b.equals(kvi.f8652b);
        }
        Object obj2 = this.f8652b;
        if (obj2 instanceof byte[]) {
            return Arrays.equals((byte[]) obj2, (byte[]) kvi.f8652b);
        }
        if (obj2 instanceof int[]) {
            return Arrays.equals((int[]) obj2, (int[]) kvi.f8652b);
        }
        if (obj2 instanceof long[]) {
            return Arrays.equals((long[]) obj2, (long[]) kvi.f8652b);
        }
        if (obj2 instanceof float[]) {
            return Arrays.equals((float[]) obj2, (float[]) kvi.f8652b);
        }
        if (obj2 instanceof double[]) {
            return Arrays.equals((double[]) obj2, (double[]) kvi.f8652b);
        }
        if (obj2 instanceof boolean[]) {
            return Arrays.equals((boolean[]) obj2, (boolean[]) kvi.f8652b);
        }
        return Arrays.deepEquals((Object[]) obj2, (Object[]) kvi.f8652b);
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m5448c()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    final void m5451a(kvg kvg, Object obj) {
        this.f8651a = kvg;
        this.f8652b = obj;
        this.f8653c = null;
    }

    /* renamed from: c */
    private final byte[] m5448c() {
        byte[] bArr = new byte[m5452b()];
        m5450a(kvd.m5421a(bArr, 0, bArr.length));
        return bArr;
    }

    /* renamed from: a */
    final void m5450a(kvd kvd) {
        if (this.f8652b == null) {
            for (kvm kvm : this.f8653c) {
                kvd.m5439e(kvm.f8656a);
                kvd.m5430a(kvm.f8657b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }
}
