package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: hyg */
public final class hyg {
    /* renamed from: a */
    private static SharedPreferences f6820a = null;

    /* renamed from: a */
    public static SharedPreferences m3585a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f6820a == null) {
                f6820a = (SharedPreferences) htl.m3400a(new hyh(context));
            }
            sharedPreferences = f6820a;
        }
        return sharedPreferences;
    }
}
