package p000;

/* compiled from: PG */
/* renamed from: hrz */
public final class hrz {
    /* renamed from: a */
    public static final String f6534a = bli.m862a("BlurStack");
    /* renamed from: b */
    public float[] f6535b;
    /* renamed from: c */
    public hsc[] f6536c;
    /* renamed from: d */
    public int f6537d;

    /* renamed from: a */
    public final int m3327a(int i, int i2) {
        return this.f6536c[i].f6560b + i2;
    }

    /* renamed from: a */
    public final float m3326a(int i) {
        return this.f6535b[i - 1];
    }

    /* renamed from: a */
    public static float m3323a() {
        return 25.0f;
    }

    /* renamed from: b */
    public final int m3328b(int i) {
        hsc hsc = this.f6536c[i];
        return (hsc.f6559a - hsc.f6560b) + 1;
    }

    /* renamed from: c */
    public static int m3324c(int i) {
        return 64 - (i / 4);
    }

    /* renamed from: d */
    public static int m3325d(int i) {
        return (64 - i) << 2;
    }

    public final String toString() {
        String valueOf = String.valueOf("disparity range: 64, 1\n");
        hsc hsc = this.f6536c[this.f6537d];
        int i = hsc.f6559a;
        int i2 = hsc.f6560b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
        stringBuilder.append(valueOf);
        stringBuilder.append("focus disparity: ");
        stringBuilder.append(i);
        stringBuilder.append(", ");
        stringBuilder.append(i2);
        stringBuilder.append("\n");
        valueOf = String.valueOf(stringBuilder.toString());
        i2 = this.f6536c.length;
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder2.append(valueOf);
        stringBuilder2.append("num of layers: ");
        stringBuilder2.append(i2);
        stringBuilder2.append("\n");
        valueOf = String.valueOf(stringBuilder2.toString());
        i2 = this.f6537d;
        stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 25);
        stringBuilder2.append(valueOf);
        stringBuilder2.append("focus layer: ");
        stringBuilder2.append(i2);
        stringBuilder2.append("\n");
        String stringBuilder3 = stringBuilder2.toString();
        int i3 = 0;
        while (true) {
            hsc[] hscArr = this.f6536c;
            if (i3 >= hscArr.length) {
                return stringBuilder3;
            }
            hsc hsc2 = hscArr[i3];
            i = hsc2.f6559a;
            int i4 = hsc2.f6560b;
            stringBuilder3 = String.valueOf(stringBuilder3);
            StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(stringBuilder3).length() + 50);
            stringBuilder4.append(stringBuilder3);
            stringBuilder4.append("\nlayer ");
            stringBuilder4.append(i3);
            stringBuilder4.append(" num of disparities ");
            stringBuilder4.append((i - i4) + 1);
            stringBuilder4.append("\n");
            stringBuilder3 = stringBuilder4.toString();
            while (i >= i4) {
                stringBuilder3 = String.valueOf(stringBuilder3);
                float a = m3326a(i);
                StringBuilder stringBuilder5 = new StringBuilder(String.valueOf(stringBuilder3).length() + 68);
                stringBuilder5.append(stringBuilder3);
                stringBuilder5.append("layer ");
                stringBuilder5.append(i3);
                stringBuilder5.append(" disparity ");
                stringBuilder5.append(i);
                stringBuilder5.append(" disk radius ");
                stringBuilder5.append(a);
                stringBuilder5.append("\n");
                i--;
                stringBuilder3 = stringBuilder5.toString();
            }
            i3++;
        }
    }
}
