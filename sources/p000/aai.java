package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: aai */
public final class aai implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Handler f13a;
    /* renamed from: b */
    private final /* synthetic */ zy f14b;
    /* renamed from: c */
    private final /* synthetic */ aah f15c;

    public aai(aah aah, Handler handler, zy zyVar) {
        this.f15c = aah;
        this.f13a = handler;
        this.f14b = zyVar;
    }

    public final void run() {
        this.f15c.mo2563b().obtainMessage(3, this.f15c.mo2565c(), 0, zz.m14622a(this.f13a, this.f14b)).sendToTarget();
    }
}
