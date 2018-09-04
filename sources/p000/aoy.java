package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
/* renamed from: aoy */
final class aoy extends BroadcastReceiver {
    /* renamed from: a */
    private final /* synthetic */ aox f819a;

    aoy(aox aox) {
        this.f819a = aox;
    }

    public final void onReceive(Context context, Intent intent) {
        aox aox = this.f819a;
        boolean z = aox.f19803b;
        aox.f19803b = aox.m14684a(context);
        if (z != this.f819a.f19803b) {
            if (Log.isLoggable("ConnectivityMonitor", 3)) {
                boolean z2 = this.f819a.f19803b;
                StringBuilder stringBuilder = new StringBuilder(40);
                stringBuilder.append("connectivity changed, isConnected: ");
                stringBuilder.append(z2);
                Log.d("ConnectivityMonitor", stringBuilder.toString());
            }
            aox = this.f819a;
            aov aov = aox.f19802a;
            if (aox.f19803b) {
                api api = aov.f818a;
                for (aqb aqb : arq.m651a(api.f831a)) {
                    if (!(aqb.mo327e() || aqb.mo326d())) {
                        aqb.mo330h();
                        if (api.f833c) {
                            api.f832b.add(aqb);
                        } else {
                            aqb.mo324b();
                        }
                    }
                }
            }
        }
    }
}
