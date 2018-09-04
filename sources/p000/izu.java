package p000;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: izu */
public class izu {
    /* renamed from: a */
    public final int[] f7592a;

    protected izu(int[] iArr) {
        boolean z;
        int i = 0;
        jri.m13152b((Object) iArr);
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        while (i < length) {
            int i2 = iArr[i];
            if (i2 >= 0) {
                i++;
            } else {
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("One dimension is < 0: ");
                stringBuilder.append(i2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        this.f7592a = (int[]) iArr.clone();
    }

    /* renamed from: a */
    public final izv m4368a() {
        int[] iArr = this.f7592a;
        int length = iArr.length;
        if (length == 2) {
            return izu.m4367a(iArr[0], m4369b());
        }
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append("Attempting to convert ");
        stringBuilder.append(length);
        stringBuilder.append("D size to 2D!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izu)) {
            return false;
        }
        return Arrays.equals(this.f7592a, ((izu) obj).f7592a);
    }

    /* renamed from: a */
    public static izv m4367a(int i, int i2) {
        return new izv(i, i2);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f7592a);
    }

    /* renamed from: b */
    public final int m4369b() {
        int[] iArr = this.f7592a;
        return iArr.length > 1 ? iArr[1] : 1;
    }

    public String toString() {
        int i = 0;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[2];
        objArr[0] = Arrays.toString(this.f7592a);
        int[] iArr = this.f7592a;
        if (iArr.length != 0) {
            i = iArr[0];
            int i2 = 1;
            while (true) {
                int[] iArr2 = this.f7592a;
                if (i2 >= iArr2.length) {
                    break;
                }
                i *= iArr2[i2];
                i2++;
            }
        }
        objArr[1] = Integer.valueOf(i);
        return String.format(locale, "Dimensions = %s, Volume = %d)", objArr);
    }
}
