package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: yv */
final class yv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Handler f9543a;
    /* renamed from: b */
    private final /* synthetic */ aag f9544b;
    /* renamed from: c */
    private final /* synthetic */ yu f9545c;

    yv(yu yuVar, Handler handler, aag aag) {
        this.f9545c = yuVar;
        this.f9543a = handler;
        this.f9544b = aag;
    }

    public final void run() {
        aah aah = this.f9545c;
        aah.f19755a.f19747d.obtainMessage(107, zk.m6255a(this.f9543a, aah, this.f9544b)).sendToTarget();
    }
}
