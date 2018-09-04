package p000;

import com.google.android.apps.camera.burstchip.BurstChip;

/* renamed from: ckc */
final /* synthetic */ class ckc implements Runnable {
    /* renamed from: a */
    private final ckd f2094a;
    /* renamed from: b */
    private final BurstChip f2095b;

    ckc(ckd ckd, BurstChip burstChip) {
        this.f2094a = ckd;
        this.f2095b = burstChip;
    }

    public final void run() {
        this.f2094a.mo702a(this.f2095b);
    }
}
