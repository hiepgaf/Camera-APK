package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: yx */
final class yx implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Handler f9549a;
    /* renamed from: b */
    private final /* synthetic */ aag f9550b;
    /* renamed from: c */
    private final /* synthetic */ yu f9551c;

    yx(yu yuVar, Handler handler, aag aag) {
        this.f9551c = yuVar;
        this.f9549a = handler;
        this.f9550b = aag;
    }

    public final void run() {
        aah aah = this.f9551c;
        aah.f19755a.f19747d.obtainMessage(104, zk.m6255a(this.f9549a, aah, this.f9550b)).sendToTarget();
    }
}
