package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

/* renamed from: hws */
public final class hws {
    /* renamed from: a */
    private static Object f6784a = new Object();
    /* renamed from: b */
    private static boolean f6785b;
    /* renamed from: c */
    private static int f6786c;

    /* renamed from: a */
    public static int m3566a(Context context) {
        synchronized (f6784a) {
            if (f6785b) {
            } else {
                f6785b = true;
                try {
                    Bundle bundle = iad.f6871a.m3601a(context).m3599a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        bundle.getString("com.google.app.id");
                        f6786c = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (Throwable e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
        return f6786c;
    }
}
