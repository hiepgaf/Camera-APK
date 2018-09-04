package p000;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ite */
public final class ite {
    /* renamed from: h */
    private static final Charset f7444h = Charset.forName("US-ASCII");
    /* renamed from: i */
    private static final int[] f7445i;
    /* renamed from: a */
    public final short f7446a;
    /* renamed from: b */
    public final short f7447b;
    /* renamed from: c */
    public boolean f7448c;
    /* renamed from: d */
    public int f7449d;
    /* renamed from: e */
    public int f7450e;
    /* renamed from: f */
    public Object f7451f = null;
    /* renamed from: g */
    public int f7452g;

    static {
        int[] iArr = new int[11];
        f7445i = iArr;
        iArr[1] = 1;
        f7445i[2] = 1;
        f7445i[3] = 2;
        f7445i[4] = 4;
        f7445i[5] = 8;
        f7445i[7] = 1;
        f7445i[9] = 4;
        f7445i[10] = 8;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    }

    public ite(short s, short s2, int i, int i2, boolean z) {
        this.f7446a = s;
        this.f7447b = s2;
        this.f7449d = i;
        this.f7448c = z;
        this.f7450e = i2;
    }

    /* renamed from: d */
    private final boolean m4178d(int i) {
        if (!this.f7448c || this.f7449d == i) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static String m4175a(short s) {
        switch (s) {
            case (short) 1:
                return "UNSIGNED_BYTE";
            case (short) 2:
                return "ASCII";
            case (short) 3:
                return "UNSIGNED_SHORT";
            case (short) 4:
                return "UNSIGNED_LONG";
            case (short) 5:
                return "UNSIGNED_RATIONAL";
            case (short) 7:
                return "UNDEFINED";
            case (short) 9:
                return "LONG";
            case (short) 10:
                return "RATIONAL";
            default:
                return "";
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ite)) {
            return false;
        }
        ite ite = (ite) obj;
        if (ite.f7446a != this.f7446a || ite.f7449d != this.f7449d || ite.f7447b != this.f7447b) {
            return false;
        }
        Object obj2 = this.f7451f;
        if (obj2 == null) {
            return ite.f7451f == null;
        } else {
            Object obj3 = ite.f7451f;
            if (obj3 == null) {
                return false;
            }
            if (obj2 instanceof long[]) {
                if (obj3 instanceof long[]) {
                    return Arrays.equals((long[]) obj2, (long[]) obj3);
                }
                return false;
            } else if (obj2 instanceof iqn[]) {
                if (obj3 instanceof iqn[]) {
                    return Arrays.equals((iqn[]) obj2, (iqn[]) obj3);
                }
                return false;
            } else if (!(obj2 instanceof byte[])) {
                return obj2.equals(obj3);
            } else {
                if (obj3 instanceof byte[]) {
                    return Arrays.equals((byte[]) obj2, (byte[]) obj3);
                }
                return false;
            }
        }
    }

    /* renamed from: a */
    public final int m4179a() {
        return this.f7449d * f7445i[this.f7447b];
    }

    /* renamed from: b */
    public final int[] m4186b() {
        Object obj = this.f7451f;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof long[])) {
            return null;
        }
        long[] jArr = (long[]) obj;
        int[] iArr = new int[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            iArr[i] = (int) jArr[i];
        }
        return iArr;
    }

    /* renamed from: c */
    public final long m4187c() {
        long[] d = m4189d();
        if (d == null || d.length <= 0) {
            return 0;
        }
        return d[0];
    }

    /* renamed from: d */
    public final long[] m4189d() {
        Object obj = this.f7451f;
        return obj instanceof long[] ? (long[]) obj : null;
    }

    /* renamed from: e */
    public final iqn m4190e() {
        iqn iqn = new iqn(0, 1);
        iqn[] f = m4191f();
        if (f == null || f.length <= 0) {
            return iqn;
        }
        return f[0];
    }

    /* renamed from: f */
    public final iqn[] m4191f() {
        Object obj = this.f7451f;
        return obj instanceof iqn[] ? (iqn[]) obj : null;
    }

    /* renamed from: g */
    public final String m4192g() {
        Object obj = this.f7451f;
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof byte[])) {
            return null;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length - 1;
        if (bArr[length] == (byte) 0) {
            bArr = Arrays.copyOf(bArr, length);
        }
        return new String(bArr, f7444h);
    }

    /* renamed from: a */
    public final long m4180a(int i) {
        Object obj = this.f7451f;
        if (obj instanceof long[]) {
            return ((long[]) obj)[i];
        }
        if (obj instanceof byte[]) {
            return (long) ((byte[]) obj)[i];
        }
        String valueOf = String.valueOf(ite.m4175a(this.f7447b));
        String str = "Cannot get integer value from ";
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }

    /* renamed from: h */
    public final boolean m4193h() {
        return this.f7451f != null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Short.valueOf(this.f7446a), Short.valueOf(this.f7447b), Boolean.valueOf(this.f7448c), Integer.valueOf(this.f7449d), Integer.valueOf(this.f7450e), this.f7451f, Integer.valueOf(this.f7452g)});
    }

    /* renamed from: b */
    public static boolean m4176b(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
    }

    /* renamed from: b */
    public static boolean m4177b(short s) {
        return s == (short) 1 || s == (short) 2 || s == (short) 3 || s == (short) 4 || s == (short) 5 || s == (short) 7 || s == (short) 9 || s == (short) 10;
    }

    /* renamed from: c */
    public final boolean m4188c(int i) {
        return m4183a(new int[]{i});
    }

    /* renamed from: a */
    public final boolean m4181a(String str) {
        short s = this.f7447b;
        if (s != (short) 2 && s != (short) 7) {
            return false;
        }
        Object bytes = str.getBytes(f7444h);
        int length = bytes.length;
        if (length > 0) {
            if (!(bytes[length - 1] == (byte) 0 || this.f7447b == (short) 7)) {
                bytes = Arrays.copyOf(bytes, length + 1);
            }
        } else if (this.f7447b == (short) 2 && this.f7449d == 1) {
            bytes = new byte[]{null};
        }
        length = bytes.length;
        if (m4178d(length)) {
            return false;
        }
        this.f7449d = length;
        this.f7451f = bytes;
        return true;
    }

    /* renamed from: a */
    public final boolean m4182a(byte[] bArr) {
        int length = bArr.length;
        if (m4178d(length)) {
            return false;
        }
        short s = this.f7447b;
        if (s != (short) 1 && s != (short) 7) {
            return false;
        }
        this.f7451f = new byte[length];
        System.arraycopy(bArr, 0, this.f7451f, 0, length);
        this.f7449d = length;
        return true;
    }

    /* renamed from: a */
    public final boolean m4183a(int[] iArr) {
        int i = 0;
        int length = iArr.length;
        if (m4178d(length)) {
            return false;
        }
        short s = this.f7447b;
        if (s != (short) 3 && s != (short) 9 && s != (short) 4) {
            return false;
        }
        int i2;
        int i3;
        if (s == (short) 3) {
            i2 = 0;
            while (i2 < length) {
                i3 = iArr[i2];
                if (i3 <= 65535) {
                    if (i3 < 0) {
                        i2 = 1;
                        break;
                    }
                    i2++;
                } else {
                    i2 = 1;
                    break;
                }
            }
            i2 = 0;
            if (i2 != 0) {
                return false;
            }
        }
        if (this.f7447b == (short) 4) {
            for (int i4 : iArr) {
                if (i4 < 0) {
                    i2 = 1;
                    break;
                }
            }
            i2 = 0;
            if (i2 != 0) {
                return false;
            }
        }
        Object obj = new long[length];
        while (true) {
            length = iArr.length;
            if (i < length) {
                obj[i] = (long) iArr[i];
                i++;
            } else {
                this.f7451f = obj;
                this.f7449d = length;
                return true;
            }
        }
    }

    /* renamed from: a */
    public final boolean m4184a(long[] jArr) {
        int length = jArr.length;
        if (m4178d(length) || this.f7447b != (short) 4) {
            return false;
        }
        boolean z;
        int i = 0;
        while (i < length) {
            long j = jArr[i];
            if (j >= 0) {
                if (j > 4294967295L) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            return false;
        }
        this.f7451f = jArr;
        this.f7449d = length;
        return true;
    }

    /* renamed from: a */
    public final boolean m4185a(iqn[] iqnArr) {
        int length = iqnArr.length;
        if (m4178d(length)) {
            return false;
        }
        short s = this.f7447b;
        if (s != (short) 5 && s != (short) 10) {
            return false;
        }
        int i;
        long j;
        boolean z;
        if (s == (short) 5) {
            i = 0;
            while (i < length) {
                iqn iqn = iqnArr[i];
                j = iqn.f7327a;
                if (j >= 0) {
                    long j2 = iqn.f7328b;
                    if (j2 >= 0) {
                        if (j <= 4294967295L) {
                            if (j2 > 4294967295L) {
                                z = true;
                                break;
                            }
                            i++;
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = true;
                    break;
                }
                z = true;
                break;
            }
            z = false;
            if (z) {
                return false;
            }
        }
        if (this.f7447b == (short) 10) {
            int length2 = iqnArr.length;
            i = 0;
            while (i < length2) {
                iqn iqn2 = iqnArr[i];
                j = iqn2.f7327a;
                if (j >= -2147483648L) {
                    long j3 = iqn2.f7328b;
                    if (j3 >= -2147483648L) {
                        if (j <= 2147483647L) {
                            if (j3 > 2147483647L) {
                                z = true;
                                break;
                            }
                            i++;
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = true;
                    break;
                }
                z = true;
                break;
            }
            z = false;
            if (z) {
                return false;
            }
        }
        this.f7451f = iqnArr;
        this.f7449d = length;
        return true;
    }

    public final String toString() {
        String str;
        String format = String.format("tag id: %04X\n", new Object[]{Short.valueOf(this.f7446a)});
        int i = this.f7450e;
        String a = ite.m4175a(this.f7447b);
        int i2 = this.f7449d;
        int i3 = this.f7452g;
        Object obj = this.f7451f;
        if (obj == null) {
            str = "";
        } else if (obj instanceof byte[]) {
            if (this.f7447b == (short) 2) {
                str = new String((byte[]) obj, f7444h);
            } else {
                str = Arrays.toString((byte[]) obj);
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr.length == 1) {
                str = String.valueOf(jArr[0]);
            } else {
                str = Arrays.toString(jArr);
            }
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 1) {
                obj = objArr[0];
                if (obj == null) {
                    str = "";
                } else {
                    str = obj.toString();
                }
            } else {
                str = Arrays.toString(objArr);
            }
        } else {
            str = obj.toString();
        }
        int length = String.valueOf(format).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 74) + String.valueOf(a).length()) + String.valueOf(str).length());
        stringBuilder.append(format);
        stringBuilder.append("ifd id: ");
        stringBuilder.append(i);
        stringBuilder.append("\ntype: ");
        stringBuilder.append(a);
        stringBuilder.append("\ncount: ");
        stringBuilder.append(i2);
        stringBuilder.append("\noffset: ");
        stringBuilder.append(i3);
        stringBuilder.append("\nvalue: ");
        stringBuilder.append(str);
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
