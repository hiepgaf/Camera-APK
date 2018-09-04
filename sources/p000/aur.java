package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;

/* compiled from: PG */
/* renamed from: aur */
public final class aur implements asg {
    /* renamed from: a */
    public final fio mo364a(fio fio) {
        fio b = fio.m2308b();
        b.m2303a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
        Key key = CaptureRequest.CONTROL_MODE;
        Integer valueOf = Integer.valueOf(1);
        b.m2303a(key, valueOf);
        b.m2303a(CaptureRequest.CONTROL_AF_MODE, valueOf);
        return b;
    }

    /* renamed from: b */
    public final fio mo365b(fio fio) {
        fio b = fio.m2308b();
        aur.m7029d(b);
        b.m2303a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(0));
        return b;
    }

    /* renamed from: c */
    public final fio mo366c(fio fio) {
        fio b = fio.m2308b();
        aur.m7029d(b);
        b.m2303a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
        return b;
    }

    /* renamed from: d */
    private static void m7029d(fio fio) {
        Key key = CaptureRequest.CONTROL_MODE;
        Integer valueOf = Integer.valueOf(1);
        fio.m2303a(key, valueOf);
        fio.m2303a(CaptureRequest.CONTROL_AF_MODE, valueOf);
        fio.m2303a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(fcg.f4467a.f5215d));
        fio.m2303a(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(false));
    }
}
