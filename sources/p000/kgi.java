package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kgi */
public final class kgi extends kes {
    /* renamed from: a */
    public static final kes f19200a = new kgi(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    /* renamed from: b */
    private final transient int[] f19201b;
    /* renamed from: c */
    private final transient Object[] f19202c;
    /* renamed from: d */
    private final transient int f19203d;

    private kgi(int[] iArr, Object[] objArr, int i) {
        this.f19201b = iArr;
        this.f19202c = objArr;
        this.f19203d = i;
    }

    /* renamed from: a */
    public static kgi m13503a(int i, Object[] objArr) {
        if (i == 0) {
            return (kgi) f19200a;
        }
        if (i == 1) {
            khb.m4892b(objArr[0], objArr[1]);
            return new kgi(null, objArr, 1);
        }
        jri.m13151b(i, objArr.length >> 1);
        return new kgi(kgi.m13504a(objArr, i, keu.m13481b(i), 0), objArr, i);
    }

    /* renamed from: f */
    final keu mo2153f() {
        return new kgj(this, this.f19202c, 0, this.f19203d);
    }

    /* renamed from: a */
    static int[] m13504a(Object[] objArr, int i, int i2, int i3) {
        if (i == 1) {
            khb.m4892b(objArr[i3], objArr[i3 ^ 1]);
            return null;
        }
        int i4 = i2 - 1;
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i5 + i5;
            int i7 = i6 + i3;
            Object obj = objArr[i7];
            Object obj2 = objArr[i6 + (i3 ^ 1)];
            khb.m4892b(obj, obj2);
            i6 = khb.m4893c(obj.hashCode());
            while (true) {
                i6 &= i4;
                int i8 = iArr[i6];
                if (i8 == -1) {
                    break;
                } else if (objArr[i8].equals(obj)) {
                    String valueOf = String.valueOf(obj);
                    String valueOf2 = String.valueOf(obj2);
                    String valueOf3 = String.valueOf(objArr[i8]);
                    String valueOf4 = String.valueOf(objArr[i8 ^ 1]);
                    int length = String.valueOf(valueOf).length();
                    int length2 = String.valueOf(valueOf2).length();
                    StringBuilder stringBuilder = new StringBuilder((((length + 39) + length2) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length());
                    stringBuilder.append("Multiple entries with same key: ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append("=");
                    stringBuilder.append(valueOf2);
                    stringBuilder.append(" and ");
                    stringBuilder.append(valueOf3);
                    stringBuilder.append("=");
                    stringBuilder.append(valueOf4);
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else {
                    i6++;
                }
            }
            iArr[i6] = i7;
        }
        return iArr;
    }

    /* renamed from: g */
    final keu mo2154g() {
        return new kgl(this, new kgm(this.f19202c, 0, this.f19203d));
    }

    /* renamed from: b */
    final keh mo2131b() {
        return new kgm(this.f19202c, 1, this.f19203d);
    }

    public final Object get(Object obj) {
        return kgi.m13502a(this.f19201b, this.f19202c, this.f19203d, 0, obj);
    }

    /* renamed from: a */
    static Object m13502a(int[] iArr, Object[] objArr, int i, int i2, Object obj) {
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                return objArr[i2 ^ 1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int c = khb.m4893c(obj.hashCode());
            while (true) {
                c &= length;
                int i3 = iArr[c];
                if (i3 == -1) {
                    return null;
                }
                if (objArr[i3].equals(obj)) {
                    return objArr[i3 ^ 1];
                }
                c++;
            }
        }
    }

    /* renamed from: i */
    final boolean mo2156i() {
        return false;
    }

    public final int size() {
        return this.f19203d;
    }
}
