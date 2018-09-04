package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gjp */
final class gjp implements fem {
    /* renamed from: a */
    private final fip f21467a;
    /* renamed from: b */
    private final fio f21468b;
    /* renamed from: c */
    private final AtomicBoolean f21469c = new AtomicBoolean(false);
    /* renamed from: d */
    private final /* synthetic */ gjk f21470d;

    gjp(gjk gjk, fip fip, fio fio) {
        this.f21470d = gjk;
        this.f21467a = fip;
        this.f21468b = fio;
    }

    public final void close() {
        if (!this.f21469c.getAndSet(true) && this.f21470d.f16979d) {
            fim a = new fio(this.f21468b).m2301a();
            try {
                this.f21467a.mo1381a(Arrays.asList(new fim[]{a}), fiv.REPEATING);
            } catch (Throwable e) {
                bli.m867b(gjk.f16976a, "Couldn't reset external flash AE mode", e);
            }
        }
    }

    /* renamed from: a */
    public final fim mo3033a(fim fim) {
        fio fio = new fio(fim);
        if (this.f21470d.f16979d) {
            fio.m2303a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(5));
        }
        return fio.m2301a();
    }
}
