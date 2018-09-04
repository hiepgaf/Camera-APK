package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.SensorManager;

/* compiled from: PG */
/* renamed from: cbu */
public final class cbu {
    /* renamed from: a */
    public final Context f1837a;

    cbu(Context context) {
        this.f1837a = context;
    }

    /* renamed from: a */
    public static Object m1099a(Context context, String str) {
        try {
            System.currentTimeMillis();
            return context.getSystemService(str);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public final ActivityManager m1100a() {
        return (ActivityManager) cbu.m1099a(this.f1837a, "activity");
    }

    /* renamed from: b */
    public final SensorManager m1101b() {
        return (SensorManager) cbu.m1099a(this.f1837a, "sensor");
    }
}
