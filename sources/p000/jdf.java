package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jdf */
public final class jdf {
    /* renamed from: a */
    public final float[] f7718a;

    private jdf(float[] fArr) {
        boolean z;
        if (fArr.length == 9) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.f7718a = fArr;
    }

    /* renamed from: a */
    public static jdf m4417a(float[] fArr) {
        return new jdf(Arrays.copyOf(fArr, fArr.length));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jdf)) {
            return false;
        }
        return Arrays.equals(this.f7718a, ((jdf) obj).f7718a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7718a);
    }

    /* renamed from: a */
    public final float[] m4418a() {
        float[] fArr = this.f7718a;
        return Arrays.copyOf(fArr, fArr.length);
    }

    public final String toString() {
        float[] fArr = this.f7718a;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        StringBuilder stringBuilder = new StringBuilder(153);
        stringBuilder.append("[");
        stringBuilder.append(f);
        stringBuilder.append(", ");
        stringBuilder.append(f2);
        stringBuilder.append(", ");
        stringBuilder.append(f3);
        stringBuilder.append("; ");
        stringBuilder.append(f4);
        stringBuilder.append(", ");
        stringBuilder.append(f5);
        stringBuilder.append(", ");
        stringBuilder.append(f6);
        stringBuilder.append("; ");
        stringBuilder.append(f7);
        stringBuilder.append(", ");
        stringBuilder.append(f8);
        stringBuilder.append(", ");
        stringBuilder.append(f9);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
