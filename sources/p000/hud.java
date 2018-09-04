package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;

/* renamed from: hud */
public final class hud extends hue {
    @Deprecated
    /* renamed from: a */
    public static Dialog m11986a(int i, Activity activity) {
        if (hue.m3462a((Context) activity, i)) {
            i = 18;
        }
        return hua.m11982a(activity, i, 0, null);
    }

    /* renamed from: a */
    public static Resources m11987a(Context context) {
        return hue.m3465c(context);
    }

    @Deprecated
    /* renamed from: b */
    public static int m11988b(Context context) {
        return hue.m3467e(context);
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m11989b(int i, Activity activity) {
        if (hue.m3462a((Context) activity, i)) {
            i = 18;
        }
        return hua.f18117a.m11985b(activity, i, 0, null);
    }
}
