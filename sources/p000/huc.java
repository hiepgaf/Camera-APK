package p000;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

/* renamed from: huc */
public class huc {
    /* renamed from: c */
    public static final int f6667c = hue.f6668a;

    static {
        huc huc = new huc();
    }

    huc() {
    }

    /* renamed from: a */
    public static int m3453a(Context context) {
        int e = hue.m3467e(context);
        return hue.m3462a(context, e) ? 18 : e;
    }

    /* renamed from: a */
    public static PendingIntent m3454a(Context context, int i, int i2, String str) {
        Intent a = huc.m3455a(context, i, str);
        return a != null ? PendingIntent.getActivity(context, 0, a, 268435456) : null;
    }

    /* renamed from: a */
    public static Intent m3455a(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                return (context == null || !htl.m3424a(context)) ? hwj.m3562a("com.google.android.gms", huc.m3457a(context, str)) : hwj.m3560a();
            case 3:
                return hwj.m3561a("com.google.android.gms");
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static String m3456a(int i) {
        return hue.m3461a(i);
    }

    /* renamed from: a */
    private static String m3457a(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gcore_");
        stringBuilder.append(f6667c);
        stringBuilder.append("-");
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append(str);
        }
        stringBuilder.append("-");
        if (context != null) {
            stringBuilder.append(context.getPackageName());
        }
        stringBuilder.append("-");
        if (context != null) {
            try {
                stringBuilder.append(iad.f6871a.m3601a(context).m3600b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException e) {
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static boolean m3458a(Context context, int i) {
        return hue.m3462a(context, i);
    }

    /* renamed from: b */
    public static boolean m3460b(int i) {
        return hue.m3464b(i);
    }

    /* renamed from: b */
    public static void m3459b(Context context) {
        if (!hue.f6669b.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException e) {
            }
        }
    }
}
