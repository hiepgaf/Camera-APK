package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: PG */
/* renamed from: mq */
final class mq {
    /* renamed from: a */
    public nc f8828a;
    /* renamed from: b */
    public boolean f8829b;
    /* renamed from: c */
    public BroadcastReceiver f8830c;
    /* renamed from: d */
    public IntentFilter f8831d;
    /* renamed from: e */
    public final /* synthetic */ mg f8832e;

    mq(mg mgVar, nc ncVar) {
        this.f8832e = mgVar;
        this.f8828a = ncVar;
        this.f8829b = ncVar.m5618a();
    }

    /* renamed from: a */
    final void m5592a() {
        BroadcastReceiver broadcastReceiver = this.f8830c;
        if (broadcastReceiver != null) {
            this.f8832e.f19362b.unregisterReceiver(broadcastReceiver);
            this.f8830c = null;
        }
    }
}
