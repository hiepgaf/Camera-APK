package p000;

import android.content.Intent;
import android.util.Log;

/* renamed from: hqy */
final /* synthetic */ class hqy implements hqr {
    /* renamed from: a */
    private final hqx f18087a;

    hqy(hqx hqx) {
        this.f18087a = hqx;
    }

    /* renamed from: a */
    public final void mo1774a(hra hra) {
        hqx hqx = this.f18087a;
        if (hra.f21619c == 0) {
            Intent intent = new Intent("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
            intent.setPackage("com.google.android.googlequicksearchbox");
            try {
                if (hqx.f21609a.bindService(intent, hqx, 65)) {
                    hqx.m15922a(2);
                    return;
                }
                Log.e("LensServiceConnImpl", "Unable to bind Lens service.");
                hqx.m15922a(5);
                return;
            } catch (Throwable e) {
                Log.e("LensServiceConnImpl", "Unable to bind Lens service due to security exception.", e);
                hqx.m15922a(5);
                return;
            }
        }
        hqx.m15922a(4);
    }
}
