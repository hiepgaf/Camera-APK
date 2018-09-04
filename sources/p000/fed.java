package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fed */
public final class fed implements fel {
    /* renamed from: a */
    public final iqz f15907a;
    /* renamed from: b */
    public final ikb f15908b;

    public fed(ira ira, ikb ikb) {
        this.f15907a = ira.mo511a("SimpleTorchSwitch");
        this.f15908b = ikb;
    }

    /* renamed from: a */
    public final fem mo1361a(fip fip, fim fim) {
        Object fef = new fef(this, fip, new fio(fim));
        try {
            fee fee = new fee(3);
            fio fio = new fio(fef.f21351b);
            fio.m2303a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
            fio.m2303a(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
            fio.m2307a(fds.m10251c(fee));
            fim a = fio.m2301a();
            fef.f21350a.mo1381a(Arrays.asList(new fim[]{a}), fiv.REPEATING);
            fef.f21352c.f15908b.mo1879a(new feg(fee));
            fee.m10270b();
            return fef;
        } catch (Throwable th) {
            fef.close();
        }
    }

    /* renamed from: c */
    public final void mo1362c() {
    }
}
