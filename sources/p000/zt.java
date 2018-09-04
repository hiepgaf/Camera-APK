package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: zt */
public final class zt implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f9592a;
    /* renamed from: b */
    private final /* synthetic */ Handler f9593b;
    /* renamed from: c */
    private final /* synthetic */ zy f9594c;
    /* renamed from: d */
    private final /* synthetic */ zs f9595d;

    public zt(zs zsVar, int i, Handler handler, zy zyVar) {
        this.f9595d = zsVar;
        this.f9592a = i;
        this.f9593b = handler;
        this.f9594c = zyVar;
    }

    public final void run() {
        this.f9595d.mo2545c().obtainMessage(1, this.f9592a, 0, zz.m14622a(this.f9593b, this.f9594c)).sendToTarget();
    }
}
