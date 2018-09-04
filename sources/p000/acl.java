package p000;

import android.widget.ImageView.ScaleType;

/* compiled from: PG */
/* renamed from: acl */
final /* synthetic */ class acl {
    /* renamed from: a */
    public static final /* synthetic */ int[] f250a = new int[ScaleType.values().length];
    /* renamed from: b */
    private static final /* synthetic */ int[] f251b = new int[acg.values().length];

    static {
        try {
            f251b[acg.LOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f251b[acg.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f251b[acg.HIGH.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f251b[acg.IMMEDIATE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f250a[ScaleType.CENTER_CROP.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f250a[ScaleType.CENTER_INSIDE.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f250a[ScaleType.FIT_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f250a[ScaleType.FIT_START.ordinal()] = 4;
        } catch (NoSuchFieldError e8) {
        }
        try {
            f250a[ScaleType.FIT_END.ordinal()] = 5;
        } catch (NoSuchFieldError e9) {
        }
        try {
            f250a[ScaleType.FIT_XY.ordinal()] = 6;
        } catch (NoSuchFieldError e10) {
        }
        try {
            f250a[ScaleType.CENTER.ordinal()] = 7;
        } catch (NoSuchFieldError e11) {
        }
        try {
            f250a[ScaleType.MATRIX.ordinal()] = 8;
        } catch (NoSuchFieldError e12) {
        }
    }
}
