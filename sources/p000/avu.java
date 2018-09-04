package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;

/* compiled from: PG */
/* renamed from: avu */
public final class avu implements asg {
    /* renamed from: a */
    private final ilp f10392a;

    public avu(ilp ilp) {
        this.f10392a = ilp;
    }

    /* renamed from: a */
    public final fio mo364a(fio fio) {
        fio b = fio.m2308b();
        b.m2303a(hsz.f6609c, hsz.f6612f);
        b.m2303a(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
        b.m2303a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
        return b;
    }

    /* renamed from: b */
    public final fio mo365b(fio fio) {
        fio b = fio.m2308b();
        avu.m7068d(b);
        b.m2303a(hsz.f6609c, hsz.f6610d);
        return b;
    }

    /* renamed from: c */
    public final fio mo366c(fio fio) {
        fio b = fio.m2308b();
        avu.m7068d(b);
        b.m2303a(hsz.f6609c, hsz.f6611e);
        b.m2303a(CaptureRequest.CONTROL_AF_REGIONS, (MeteringRectangle[]) this.f10392a.mo2860b());
        return b;
    }

    /* renamed from: d */
    private static void m7068d(fio fio) {
        fio.m2303a(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
        fio.m2303a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
        fio.m2303a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(0));
        fio.m2303a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(fcg.f4467a.f5215d));
        fio.m2303a(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(false));
    }
}
