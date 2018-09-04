package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: ieb */
public final class ieb extends BroadcastReceiver {
    /* renamed from: a */
    public Context f6967a;
    /* renamed from: b */
    private final iec f6968b;

    public ieb(iec iec) {
        this.f6968b = iec;
    }

    /* renamed from: a */
    public final synchronized void m3696a() {
        Context context = this.f6967a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f6967a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f6968b.m3697a();
            m3696a();
        }
    }
}
