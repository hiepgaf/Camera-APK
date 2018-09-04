package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: giq */
final class giq extends BroadcastReceiver {
    /* renamed from: a */
    private final /* synthetic */ gip f5255a;

    giq(gip gip) {
        this.f5255a = gip;
    }

    public final void onReceive(Context context, Intent intent) {
        gip gip = this.f5255a;
        if (gip.f16945c) {
            gip.f16944b.mo518d("Ignoring ScreenOff shutdown behavior, the activity is still started.");
            return;
        }
        String valueOf = String.valueOf(intent);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 43);
        stringBuilder.append("Received ScreenOff broadcast after onStop: ");
        stringBuilder.append(valueOf);
        valueOf = stringBuilder.toString();
        gip.m11104b();
        gip.f16943a.m707a(valueOf);
    }
}
