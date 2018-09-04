package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: ksd */
public final class ksd {
    /* renamed from: a */
    public static final Charset f8515a = Charset.forName("UTF-8");
    /* renamed from: b */
    public static final byte[] f8516b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8516b = bArr;
        ByteBuffer.wrap(bArr);
        bArr = f8516b;
        kre.m5072a(bArr, bArr.length);
    }

    /* renamed from: a */
    static Object m5131a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static Object m5133a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static int m5129a(boolean z) {
        return !z ? 1237 : 1231;
    }

    /* renamed from: a */
    public static int m5130a(byte[] bArr) {
        int length = bArr.length;
        length = ksd.m5127a(length, bArr, 0, length);
        if (length == 0) {
            return 1;
        }
        return length;
    }

    /* renamed from: a */
    public static int m5128a(long j) {
        return (int) ((j >>> 32) ^ j);
    }

    /* renamed from: a */
    static boolean m5134a() {
        return false;
    }

    /* renamed from: b */
    public static boolean m5135b(byte[] bArr) {
        return kur.f8594a.m5361a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    static Object m5132a(Object obj, Object obj2) {
        return ((kte) obj).mo3539h().mo3253a((kte) obj2).mo3544g();
    }

    /* renamed from: a */
    static int m5127a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: c */
    public static String m5136c(byte[] bArr) {
        return new String(bArr, f8515a);
    }
}
