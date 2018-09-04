package p000;

import android.graphics.Point;
import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.List;

/* compiled from: PG */
/* renamed from: ejf */
public final class ejf {
    /* renamed from: a */
    private static final String f3663a = bli.m862a("CameraSizeUtility");
    /* renamed from: b */
    private static ejg f3664b = null;
    /* renamed from: c */
    private static ejg f3665c = null;
    /* renamed from: d */
    private static ejg f3666d = null;

    /* renamed from: b */
    private static ejg m1764b(aaz aaz, int i) {
        int i2;
        int i3;
        int abs;
        int i4;
        double d;
        int i5;
        double d2;
        double abs2;
        int i6;
        List a = aaz.m31a();
        List c = aaz.m37c();
        int[] iArr = new int[a.size()];
        int i7 = 0;
        for (i2 = 0; i2 < a.size(); i2++) {
            iArr[i2] = -1;
            double d3 = ((double) ((abw) a.get(i2)).f178a.x) / ((double) ((abw) a.get(i2)).f178a.y);
            int i8 = Integer.MAX_VALUE;
            i3 = 0;
            while (i3 < c.size()) {
                if (Math.abs(d3 - (((double) ((abw) c.get(i3)).f178a.x) / ((double) ((abw) c.get(i3)).f178a.y))) < 0.03d && ((abw) c.get(i3)).f178a.x < 640) {
                    abs = Math.abs(((abw) c.get(i3)).f178a.x - 320);
                    if (abs < i8) {
                        iArr[i2] = i3;
                        i8 = abs;
                    }
                }
                i3++;
            }
            if (iArr[i2] >= 0) {
                i7++;
            }
        }
        if (i7 == 0) {
            i8 = 0;
            i4 = -1;
            d = 320.0d;
            while (i8 < c.size()) {
                d3 = (double) Math.abs(((abw) c.get(i8)).f178a.x - 320);
                double d4 = d3 < d ? d3 : d;
                i3 = d3 < d ? i8 : i4;
                i8++;
                i4 = i3;
                d = d4;
            }
            for (abs = 0; abs < a.size(); abs++) {
                iArr[abs] = i4;
            }
            i5 = 0;
            d = Double.MAX_VALUE;
            i2 = -1;
            d2 = Double.MAX_VALUE;
        } else {
            i5 = 0;
            d = Double.MAX_VALUE;
            i2 = -1;
            d2 = Double.MAX_VALUE;
        }
        while (i5 < a.size()) {
            double d5;
            if (iArr[i5] < 0) {
                d5 = d;
                d = d2;
                i4 = i2;
                d4 = d5;
            } else {
                double abs3 = (double) Math.abs(((abw) a.get(i5)).f178a.x - i);
                abs2 = Math.abs((((double) ((abw) a.get(i5)).f178a.x) / ((double) ((abw) a.get(i5)).f178a.y)) - 3.3333333333333335d);
                if (i2 < 0) {
                    d4 = abs2;
                    d = abs3;
                    i4 = i5;
                } else if (abs3 < d2) {
                    d4 = abs2;
                    d = abs3;
                    i4 = i5;
                } else if (abs3 != d2) {
                    d5 = d;
                    d = d2;
                    i4 = i2;
                    d4 = d5;
                } else if (abs2 < d) {
                    d4 = abs2;
                    d = abs3;
                    i4 = i5;
                } else {
                    d5 = d;
                    d = d2;
                    i4 = i2;
                    d4 = d5;
                }
            }
            i5++;
            d5 = d;
            d = d4;
            i2 = i4;
            d2 = d5;
        }
        if (d > 0.03d) {
            double d6 = ((double) i) * 0.35d;
            int i9 = 0;
            d3 = d2;
            i6 = i2;
            while (i9 < a.size()) {
                if (iArr[i9] < 0) {
                    d4 = d;
                    i8 = i6;
                    d = d3;
                } else {
                    d2 = Math.abs((((double) ((abw) a.get(i9)).f178a.x) / ((double) ((abw) a.get(i9)).f178a.y)) - 3.3333333333333335d);
                    abs2 = (double) Math.abs(((abw) a.get(i9)).f178a.x - i);
                    if (0.03d + d2 < d) {
                        double abs4 = (double) Math.abs(((abw) a.get(i9)).f178a.x - i);
                        if (abs4 < d6) {
                            d4 = d2;
                        } else {
                            d4 = d;
                        }
                        if (abs4 < d6) {
                            d = abs2;
                        } else {
                            d = d3;
                        }
                        i8 = abs4 < d6 ? i9 : i6;
                    } else if (Math.abs(d2 - d) >= 0.03d) {
                        d4 = d;
                        i8 = i6;
                        d = d3;
                    } else if (abs2 < d3) {
                        d4 = d2;
                        d = abs2;
                        i8 = i9;
                    } else {
                        d4 = d;
                        i8 = i6;
                        d = d3;
                    }
                }
                i9++;
                d3 = d;
                i6 = i8;
                d = d4;
            }
        } else {
            i6 = i2;
        }
        i2 = iArr[i6];
        abw abw = (abw) a.get(i6);
        String str = f3663a;
        Point point = abw.f178a;
        i3 = point.x;
        abs = point.y;
        StringBuilder stringBuilder = new StringBuilder(38);
        stringBuilder.append("Image size : ");
        stringBuilder.append(i3);
        stringBuilder.append(" x ");
        stringBuilder.append(abs);
        bli.m863a(str, stringBuilder.toString());
        return new ejg((abw) c.get(i2), (abw) a.get(i6));
    }

    /* renamed from: a */
    public static ejg m1762a(aaz aaz) {
        if (f3664b == null) {
            f3664b = ejf.m1764b(aaz, 3000);
        }
        return f3664b;
    }

    /* renamed from: a */
    public static ejg m1763a(aaz aaz, int i) {
        if (i == go.ar) {
            return ejf.m1762a(aaz);
        }
        if (i == go.as) {
            if (f3665c == null) {
                f3665c = ejf.m1764b(aaz, 1800);
            }
            return f3665c;
        } else if (i != go.at) {
            return ejf.m1762a(aaz);
        } else {
            if (f3666d == null) {
                f3666d = ejf.m1764b(aaz, DepthmapTask.DEPTH_PROCESSING_LATTICE_HR_MAX_SIZE_PX);
            }
            return f3666d;
        }
    }
}
