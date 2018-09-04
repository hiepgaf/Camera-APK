package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: mr */
final class mr extends BroadcastReceiver {
    /* renamed from: a */
    private final /* synthetic */ mq f8833a;

    mr(mq mqVar) {
        this.f8833a = mqVar;
    }

    public final void onReceive(Context context, Intent intent) {
        mq mqVar = this.f8833a;
        boolean a = mqVar.f8828a.m5618a();
        if (a != mqVar.f8829b) {
            mqVar.f8829b = a;
            mqVar.f8832e.mo2336a();
        }
    }
}
