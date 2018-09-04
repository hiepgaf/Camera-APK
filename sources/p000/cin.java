package p000;

import android.os.HandlerThread;
import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: cin */
final class cin implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ cig f2071a;

    cin(cig cig) {
        this.f2071a = cig;
    }

    public final void run() {
        cig cig = this.f2071a;
        cig.f2041h = null;
        chh chh = (chh) cig.f2044k.getAndSet(null);
        if (chh != null) {
            chh.close();
        }
        cig.f2045l.set(null);
        HandlerThread handlerThread = (HandlerThread) cig.f2042i.getAndSet(null);
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        grw grw = (grw) cig.f2043j.getAndSet(null);
        if (grw != null) {
            cig.f2055v.mo1589a(grw.f5656b.getName(), grw.f5655a, cig.f2038e, ((float) (SystemClock.elapsedRealtime() - cig.f2057x)) / 1000.0f);
        }
    }
}
