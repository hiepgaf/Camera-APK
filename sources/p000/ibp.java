package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ibp */
final class ibp implements Cloneable {
    /* renamed from: a */
    private ibn f6908a;
    /* renamed from: b */
    private Object f6909b;
    /* renamed from: c */
    private List f6910c = new ArrayList();

    ibp() {
    }

    /* renamed from: d */
    private final ibp m3642d() {
        int i = 0;
        ibp ibp = new ibp();
        try {
            ibp.f6908a = this.f6908a;
            Collection collection = this.f6910c;
            if (collection != null) {
                ibp.f6910c.addAll(collection);
            } else {
                ibp.f6910c = null;
            }
            Object obj = this.f6909b;
            if (obj != null) {
                if (obj instanceof ibr) {
                    ibp.f6909b = (ibr) ((ibr) obj).clone();
                } else if (obj instanceof byte[]) {
                    ibp.f6909b = ((byte[]) obj).clone();
                } else if (obj instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) obj;
                    r5 = new byte[bArr.length][];
                    ibp.f6909b = r5;
                    while (i < bArr.length) {
                        r5[i] = (byte[]) bArr[i].clone();
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    ibp.f6909b = ((boolean[]) obj).clone();
                } else if (obj instanceof int[]) {
                    ibp.f6909b = ((int[]) obj).clone();
                } else if (obj instanceof long[]) {
                    ibp.f6909b = ((long[]) obj).clone();
                } else if (obj instanceof float[]) {
                    ibp.f6909b = ((float[]) obj).clone();
                } else if (obj instanceof double[]) {
                    ibp.f6909b = ((double[]) obj).clone();
                } else if (obj instanceof ibr[]) {
                    ibr[] ibrArr = (ibr[]) obj;
                    r5 = new ibr[ibrArr.length];
                    ibp.f6909b = r5;
                    while (i < ibrArr.length) {
                        r5[i] = (ibr) ibrArr[i].clone();
                        i++;
                    }
                }
            }
            return ibp;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    final int m3643a() {
        if (this.f6909b == null) {
            Iterator it = this.f6910c.iterator();
            if (!it.hasNext()) {
                return 0;
            }
            it.next();
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    public final /* synthetic */ Object clone() {
        return m3642d();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibp)) {
            return false;
        }
        ibp ibp = (ibp) obj;
        if (this.f6909b == null || ibp.f6909b == null) {
            List list = this.f6910c;
            if (list != null) {
                List list2 = ibp.f6910c;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(m3641c(), ibp.m3641c());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
        ibn ibn = this.f6908a;
        if (ibn != ibp.f6908a) {
            return false;
        }
        if (!ibn.f6904a.isArray()) {
            return this.f6909b.equals(ibp.f6909b);
        }
        Object obj2 = this.f6909b;
        return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) ibp.f6909b) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) ibp.f6909b) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) ibp.f6909b) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) ibp.f6909b) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) ibp.f6909b) : !(obj2 instanceof boolean[]) ? Arrays.deepEquals((Object[]) obj2, (Object[]) ibp.f6909b) : Arrays.equals((boolean[]) obj2, (boolean[]) ibp.f6909b);
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m3641c()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    private final byte[] m3641c() {
        byte[] bArr = new byte[m3643a()];
        ibl.m3620a(bArr, 0);
        m3644b();
        return bArr;
    }

    /* renamed from: b */
    final void m3644b() {
        if (this.f6909b == null) {
            Iterator it = this.f6910c.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }
}
