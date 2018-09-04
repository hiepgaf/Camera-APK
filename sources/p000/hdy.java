package p000;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;

/* compiled from: PG */
/* renamed from: hdy */
public final class hdy {
    /* renamed from: a */
    public static hdy f6075a;
    /* renamed from: b */
    private final int f6076b;
    /* renamed from: c */
    private final boolean f6077c;

    private hdy(Context context) {
        this.f6076b = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        this.f6077c = ((Activity) context).isInMultiWindowMode();
    }

    /* renamed from: a */
    public static void m3083a(Context context) {
        if (f6075a == null) {
            f6075a = new hdy(context);
        }
    }

    /* renamed from: b */
    public static int m3084b(Context context) {
        hdy hdy = f6075a;
        if (hdy != null) {
            return hdy.f6076b;
        }
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    /* renamed from: c */
    public static boolean m3085c(Context context) {
        hdy hdy = f6075a;
        if (hdy != null) {
            return hdy.f6077c;
        }
        return ((Activity) context).isInMultiWindowMode();
    }
}
