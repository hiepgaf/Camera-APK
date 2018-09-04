package p000;

import com.google.googlex.gcam.GoudaSwigWrapper;

/* renamed from: gcw */
final /* synthetic */ class gcw implements Runnable {
    /* renamed from: a */
    private final gcv f5074a;

    gcw(gcv gcv) {
        this.f5074a = gcv;
    }

    public final void run() {
        gcv gcv = this.f5074a;
        synchronized (gcv.f16766d) {
            GoudaSwigWrapper goudaSwigWrapper = gcv.f16769g;
            if (goudaSwigWrapper != null) {
                goudaSwigWrapper.Init();
                gcv.f16768f = true;
            }
        }
    }
}
