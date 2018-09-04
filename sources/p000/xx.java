package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: xx */
final class xx implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ zx f9519a;
    /* renamed from: b */
    public final /* synthetic */ Handler f9520b;
    /* renamed from: c */
    private final /* synthetic */ xt f9521c;

    xx(xt xtVar, zx zxVar, Handler handler) {
        this.f9521c = xtVar;
        this.f9519a = zxVar;
        this.f9520b = handler;
    }

    public final void run() {
        Object xyVar;
        if (this.f9519a != null) {
            xyVar = new xy(this);
        } else {
            xyVar = null;
        }
        this.f9521c.f19698c.f19683b.obtainMessage(303, xyVar).sendToTarget();
    }
}
