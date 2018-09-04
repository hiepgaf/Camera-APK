package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: gir */
final class gir extends BroadcastReceiver {
    /* renamed from: a */
    private final /* synthetic */ gip f5256a;

    gir(gip gip) {
        this.f5256a = gip;
    }

    public final void onReceive(Context context, Intent intent) {
        gip gip = this.f5256a;
        String valueOf = String.valueOf(intent);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
        stringBuilder.append("Received UserPresent broadcast: ");
        stringBuilder.append(valueOf);
        valueOf = stringBuilder.toString();
        gip.m11104b();
        gip.f16943a.m707a(valueOf);
    }
}
