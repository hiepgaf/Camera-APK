package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fef */
final class fef implements fem {
    /* renamed from: a */
    public final fip f21350a;
    /* renamed from: b */
    public final fio f21351b;
    /* renamed from: c */
    public final /* synthetic */ fed f21352c;
    /* renamed from: d */
    private final AtomicBoolean f21353d = new AtomicBoolean(false);

    fef(fed fed, fip fip, fio fio) {
        this.f21352c = fed;
        this.f21350a = fip;
        this.f21351b = fio;
    }

    public final void close() {
        Throwable e;
        if (!this.f21353d.getAndSet(true)) {
            try {
                fee fee = new fee(2);
                fio fio = new fio(this.f21351b);
                fim a = fio.m2301a();
                fio.m2303a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                fio.m2303a(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
                fio.m2307a(fds.m10251c(fee));
                this.f21350a.mo1381a(Arrays.asList(new fim[]{fio.m2301a()}), fiv.NON_REPEATING);
                this.f21350a.mo1381a(Arrays.asList(new fim[]{a}), fiv.REPEATING);
                this.f21352c.f15908b.mo1879a(new feh(fee));
                fee.m10270b();
                return;
            } catch (isr e2) {
                e = e2;
            } catch (InterruptedException e3) {
                e = e3;
            }
        } else {
            return;
        }
        this.f21352c.f15907a.mo513a("Unable to reset after torch on.", e);
    }

    /* renamed from: a */
    public final fim mo3033a(fim fim) {
        fio fio = new fio(fim);
        fio.m2303a(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
        fio.m2303a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
        return fio.m2301a();
    }
}
