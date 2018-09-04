package p000;

import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: ckb */
final class ckb implements kov {
    /* renamed from: a */
    private final /* synthetic */ ckd f12106a;

    ckb(ckd ckd) {
        this.f12106a = ckd;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m867b(cjq.f12094a, "Failed to set or retrieve BurstChip.", th);
    }

    public final /* synthetic */ void b_(Object obj) {
        BurstChip burstChip = (BurstChip) obj;
        burstChip.post(new ckc(this.f12106a, burstChip));
    }
}
