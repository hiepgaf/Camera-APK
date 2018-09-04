package p000;

import android.content.ContentResolver;
import android.content.Context;

/* renamed from: htv */
final class htv {
    /* renamed from: a */
    public final ContentResolver f6656a;

    htv(Context context) {
        if (context != null) {
            if (htu.f18114a == null) {
                htu.f18114a = Boolean.valueOf(iad.f6871a.m3601a(context).f6870a.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
            }
            if (htu.f18114a.booleanValue()) {
                this.f6656a = context.getContentResolver();
                ibj.m3610a(this.f6656a, "gms:playlog:service:sampling_");
                return;
            }
        }
        this.f6656a = null;
    }
}
