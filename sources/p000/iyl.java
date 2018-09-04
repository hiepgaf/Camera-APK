package p000;

/* compiled from: PG */
/* renamed from: iyl */
public final class iyl {
    /* renamed from: a */
    private static final char[] f7559a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static String m4340a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        for (length = 0; length < bArr.length; length++) {
            byte b = bArr[length];
            char c = f7559a[(b >> 4) & 15];
            char c2 = f7559a[b & 15];
            int i = length + length;
            cArr[i] = c;
            cArr[i + 1] = c2;
        }
        return new String(cArr);
    }
}
