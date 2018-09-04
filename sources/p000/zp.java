package p000;

import java.util.Comparator;

/* compiled from: PG */
/* renamed from: zp */
final class zp implements Comparator {
    zp() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int[] iArr = (int[]) obj;
        int[] iArr2 = (int[]) obj2;
        int i = iArr[0];
        int i2 = iArr2[0];
        return i == i2 ? iArr[1] - iArr2[1] : i - i2;
    }
}
