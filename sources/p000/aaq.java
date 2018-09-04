package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: aaq */
final class aaq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Handler f32a;
    /* renamed from: b */
    private final /* synthetic */ aat f33b;
    /* renamed from: c */
    private final /* synthetic */ aah f34c;

    aaq(aah aah, Handler handler, aat aat) {
        this.f34c = aah;
        this.f32a = handler;
        this.f33b = aat;
    }

    public final void run() {
        Object obj = null;
        Handler b = this.f34c.mo2563b();
        Handler handler = this.f32a;
        aat aat = this.f33b;
        if (!(handler == null || aat == null)) {
            obj = new aau(handler, aat);
        }
        b.obtainMessage(102, obj).sendToTarget();
    }
}
