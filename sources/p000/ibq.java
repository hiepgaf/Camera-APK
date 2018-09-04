package p000;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: ibq */
public final class ibq {
    /* renamed from: a */
    public static final Object f6911a = new Object();

    static {
        Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
    }

    /* renamed from: a */
    public static int m3645a(float[] fArr) {
        return (fArr == null || fArr.length == 0) ? 0 : Arrays.hashCode(fArr);
    }

    /* renamed from: a */
    public static int m3646a(int[] iArr) {
        return (iArr == null || iArr.length == 0) ? 0 : Arrays.hashCode(iArr);
    }

    /* renamed from: a */
    public static int m3647a(long[] jArr) {
        return (jArr == null || jArr.length == 0) ? 0 : Arrays.hashCode(jArr);
    }

    /* renamed from: a */
    public static int m3648a(Object[] objArr) {
        int i = 0;
        int length = objArr != null ? objArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode();
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m3649a(byte[][] bArr) {
        int i = 0;
        int length = bArr != null ? bArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            byte[] bArr2 = bArr[i2];
            if (bArr2 != null) {
                i = (i * 31) + Arrays.hashCode(bArr2);
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m3650a(ibm ibm, ibm ibm2) {
        ibo ibo = ibm.f18158o;
        if (ibo != null) {
            ibm2.f18158o = (ibo) ibo.clone();
        }
    }

    /* renamed from: a */
    public static boolean m3651a(float[] fArr, float[] fArr2) {
        return (fArr == null || fArr.length == 0) ? fArr2 == null || fArr2.length == 0 : Arrays.equals(fArr, fArr2);
    }

    /* renamed from: a */
    public static boolean m3652a(int[] iArr, int[] iArr2) {
        return (iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2);
    }

    /* renamed from: a */
    public static boolean m3653a(long[] jArr, long[] jArr2) {
        return (jArr == null || jArr.length == 0) ? jArr2 == null || jArr2.length == 0 : Arrays.equals(jArr, jArr2);
    }

    /* renamed from: a */
    public static boolean m3654a(Object[] objArr, Object[] objArr2) {
        if (objArr != null) {
            int length = objArr.length;
        } else {
            boolean z = false;
        }
        int length2 = objArr2 != null ? objArr2.length : 0;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3;
            boolean z2;
            boolean z3 = i2 >= length;
            if (i2 >= length) {
                i3 = i;
            } else if (objArr[i2] == null) {
                i2++;
            } else {
                i3 = i;
            }
            while (true) {
                z2 = i3 >= length2;
                if (i3 < length2 && objArr2[i3] == null) {
                    i3++;
                } else if (i2 >= length && i3 >= length2) {
                    return true;
                } else {
                    if (z3 != z2 && objArr[i2].equals(objArr2[i3])) {
                        i = i3 + 1;
                        i2++;
                    }
                }
            }
            if (i2 >= length) {
                return true;
            }
            return z3 != z2 ? false : false;
        }
    }

    /* renamed from: a */
    public static boolean m3655a(byte[][] bArr, byte[][] bArr2) {
        if (bArr != null) {
            int length = bArr.length;
        } else {
            boolean z = false;
        }
        int length2 = bArr2 != null ? bArr2.length : 0;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3;
            boolean z2;
            boolean z3 = i2 >= length;
            if (i2 >= length) {
                i3 = i;
            } else if (bArr[i2] == null) {
                i2++;
            } else {
                i3 = i;
            }
            while (true) {
                z2 = i3 >= length2;
                if (i3 < length2 && bArr2[i3] == null) {
                    i3++;
                } else if (i2 >= length && i3 >= length2) {
                    return true;
                } else {
                    if (z3 != z2 && Arrays.equals(bArr[i2], bArr2[i3])) {
                        i = i3 + 1;
                        i2++;
                    }
                }
            }
            if (i2 >= length) {
                return true;
            }
            return z3 != z2 ? false : false;
        }
    }
}
