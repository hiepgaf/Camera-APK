package p000;

import android.graphics.Bitmap.Config;

/* compiled from: PG */
/* renamed from: jqq */
final /* synthetic */ class jqq {
    /* renamed from: a */
    public static final /* synthetic */ int[] f7938a = new int[Config.values().length];

    static {
        try {
            f7938a[Config.RGB_565.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f7938a[Config.ALPHA_8.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f7938a[Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f7938a[Config.ARGB_8888.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
