package p000;

import android.graphics.Bitmap.Config;

/* compiled from: PG */
/* renamed from: ahj */
final /* synthetic */ class ahj {
    /* renamed from: a */
    public static final /* synthetic */ int[] f458a = new int[Config.values().length];

    static {
        try {
            f458a[Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f458a[Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f458a[Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f458a[Config.ALPHA_8.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
