package p000;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: ct */
public final class ct {
    /* renamed from: a */
    private static final boolean f2676a = true;
    /* renamed from: b */
    private static final int[] f2677b = new int[]{16842919};
    /* renamed from: c */
    private static final int[] f2678c = new int[]{16843623, 16842908};
    /* renamed from: d */
    private static final int[] f2679d = new int[]{16842908};
    /* renamed from: e */
    private static final int[] f2680e = new int[]{16843623};
    /* renamed from: f */
    private static final int[] f2681f = new int[]{16842913, 16842919};
    /* renamed from: g */
    private static final int[] f2682g = new int[]{16842913, 16843623, 16842908};
    /* renamed from: h */
    private static final int[] f2683h = new int[]{16842913, 16842908};
    /* renamed from: i */
    private static final int[] f2684i = new int[]{16842913, 16843623};
    /* renamed from: j */
    private static final int[] f2685j = new int[]{16842913};

    /* renamed from: a */
    public static ColorStateList m1492a(ColorStateList colorStateList) {
        if (f2676a) {
            r1 = new int[2][];
            int[] iArr = new int[]{f2685j, ct.m1491a(colorStateList, f2681f)};
            r1[1] = StateSet.NOTHING;
            iArr[1] = ct.m1491a(colorStateList, f2677b);
            return new ColorStateList(r1, iArr);
        }
        r1 = new int[10][];
        iArr = new int[]{f2681f, ct.m1491a(colorStateList, f2681f), f2682g, ct.m1491a(colorStateList, f2682g), f2683h, ct.m1491a(colorStateList, f2683h), f2684i, ct.m1491a(colorStateList, f2684i), f2685j, 0};
        r1[5] = f2677b;
        iArr[5] = ct.m1491a(colorStateList, f2677b);
        r1[6] = f2678c;
        iArr[6] = ct.m1491a(colorStateList, f2678c);
        r1[7] = f2679d;
        iArr[7] = ct.m1491a(colorStateList, f2679d);
        r1[8] = f2680e;
        iArr[8] = ct.m1491a(colorStateList, f2680e);
        r1[9] = StateSet.NOTHING;
        iArr[9] = 0;
        return new ColorStateList(r1, iArr);
    }

    /* renamed from: a */
    private static int m1491a(ColorStateList colorStateList, int[] iArr) {
        int colorForState;
        if (colorStateList != null) {
            colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            colorForState = 0;
        }
        if (!f2676a) {
            return colorForState;
        }
        int alpha = Color.alpha(colorForState);
        return gu.m2831b(colorForState, Math.min(alpha + alpha, Illuminant.kOther));
    }
}
