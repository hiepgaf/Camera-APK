package p000;

/* compiled from: PG */
/* renamed from: il */
public final class il {
    /* renamed from: a */
    public static final int[] f7072a = new int[0];
    /* renamed from: b */
    public static final Object[] f7073b = new Object[0];

    /* renamed from: a */
    public static int m3809a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return i4 ^ -1;
    }

    /* renamed from: a */
    public static int m3810a(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else if (j2 <= j) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    public static boolean m3811a(Object obj, Object obj2) {
        boolean z = true;
        if (obj != obj2) {
            if (obj == null) {
                z = false;
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: c */
    private static int m3813c(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m3808a(int i) {
        return il.m3813c(i << 2) / 4;
    }

    /* renamed from: b */
    public static int m3812b(int i) {
        return il.m3813c(i << 3) / 8;
    }
}
