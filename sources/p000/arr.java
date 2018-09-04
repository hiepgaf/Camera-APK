package p000;

import android.graphics.Bitmap.Config;

/* compiled from: PG */
/* renamed from: arr */
final /* synthetic */ class arr {
    /* renamed from: a */
    public static final /* synthetic */ int[] f926a = new int[Config.values().length];

    static {
        try {
            f926a[Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f926a[Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f926a[Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f926a[Config.RGBA_F16.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f926a[Config.ARGB_8888.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
