package p000;

import com.google.android.apps.camera.burstchip.BurstChip;

/* renamed from: cka */
final /* synthetic */ class cka implements Runnable {
    /* renamed from: a */
    private final cjq f2093a;

    cka(cjq cjq) {
        this.f2093a = cjq;
    }

    public final void run() {
        cjq cjq = this.f2093a;
        if (!cjq.f12096c.isDone()) {
            cjq.f12096c.mo3557a((BurstChip) cjq.f12095b.inflate());
        }
    }
}
