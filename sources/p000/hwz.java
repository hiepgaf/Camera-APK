package p000;

import android.content.Context;
import android.util.Log;

/* renamed from: hwz */
final class hwz {
    /* renamed from: a */
    private static Context f6790a;

    static {
        Object obj = new Object();
    }

    /* renamed from: a */
    static synchronized void m3574a(Context context) {
        synchronized (hwz.class) {
            if (f6790a != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f6790a = context.getApplicationContext();
            }
        }
    }
}
