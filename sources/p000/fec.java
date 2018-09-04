package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: fec */
final class fec implements fdf {
    /* renamed from: a */
    public final ird f15897a;
    /* renamed from: b */
    public final iqz f15898b;
    /* renamed from: c */
    public final fdg f15899c;
    /* renamed from: d */
    public final fip f15900d;
    /* renamed from: e */
    public final fio f15901e;
    /* renamed from: f */
    public long f15902f = -1;
    /* renamed from: g */
    private final fio f15903g;
    /* renamed from: h */
    private final fio f15904h;
    /* renamed from: i */
    private final fio f15905i;
    /* renamed from: j */
    private boolean f15906j = false;

    public fec(fip fip, fdg fdg, fio fio, ird ird, iqz iqz) {
        this.f15900d = fip;
        this.f15899c = fdg;
        this.f15901e = fio;
        this.f15897a = ird;
        this.f15898b = iqz;
        this.f15903g = new fio(fio);
        this.f15904h = new fio(fio);
        this.f15905i = new fio(fio);
    }

    /* renamed from: a */
    final fdx m10263a(fdh fdh, fio fio, fio fio2) {
        if (fdh == fdh.CONVERGED) {
            Object fcf = new fcf();
            fio.m2303a(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
            fio.m2307a(fds.m10251c(fcf));
            fio2.m2307a(fds.m10251c(fcf));
            this.f15905i.m2303a(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(true));
            return fcf;
        } else if (fdh == fdh.LOCKED) {
            fdx fcb = new fcb();
            fio.m2307a(fds.m10251c(fcb));
            fio2.m2307a(fds.m10251c(fcb));
            return fcb;
        } else {
            throw new IllegalArgumentException("Unknown requirement for AE!");
        }
    }

    /* renamed from: b */
    final fdx m10265b(fdh fdh, fio fio, fio fio2) {
        Object fcp = new fcp();
        if (fdh == fdh.CONVERGED) {
            Object obj;
            fim a = this.f15901e.m2301a();
            Key key = CaptureRequest.CONTROL_AF_MODE;
            for (fin fin : a.f4567b) {
                if (fin.f4571a.equals(key)) {
                    obj = fin.f4572b;
                    break;
                }
            }
            obj = null;
            Integer num = (Integer) obj;
            if (!(num == null || num.intValue() == 1)) {
                key = CaptureRequest.CONTROL_AF_MODE;
                Integer valueOf = Integer.valueOf(1);
                fio.m2303a(key, valueOf);
                fio2.m2303a(CaptureRequest.CONTROL_AF_MODE, valueOf);
                this.f15903g.m2303a(CaptureRequest.CONTROL_AF_MODE, num);
            }
        }
        this.f15904h.m2303a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
        fio.m2303a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
        fio.m2307a(fds.m10251c(fcp));
        fio2.m2307a(fds.m10251c(fcp));
        return fcp;
    }

    /* renamed from: a */
    static fdx m10261a(fio fio, fio fio2) {
        Object fdd = new fdd();
        if (fio != null) {
            fio.m2307a(fds.m10251c(fdd));
        }
        fio2.m2307a(fds.m10251c(fdd));
        return fdd;
    }

    public final void close() {
        if (!this.f15906j) {
            this.f15906j = true;
            try {
                this.f15897a.mo1903a("Reset 3A");
                this.f15900d.mo1381a(Collections.singletonList(this.f15903g.m2301a()), fiv.REPEATING);
                this.f15900d.mo1381a(Collections.singletonList(this.f15904h.m2301a()), fiv.NON_REPEATING);
                this.f15900d.mo1381a(Collections.singletonList(this.f15905i.m2301a()), fiv.NON_REPEATING);
                this.f15897a.mo1904b();
            } catch (Throwable e) {
                this.f15898b.mo513a("Unable to reset after 3A lock", e);
            }
        }
    }

    /* renamed from: a */
    public final long mo1358a() {
        return this.f15902f;
    }

    /* renamed from: a */
    public final fim mo1359a(fim fim) {
        fio fio = new fio(fim);
        Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        Integer valueOf = Integer.valueOf(0);
        fio.m2303a(key, valueOf);
        fio.m2303a(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, valueOf);
        switch (this.f15899c.f4478b.ordinal()) {
            case 2:
                fio.m2303a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
                break;
        }
        switch (this.f15899c.f4477a.ordinal()) {
            case 1:
                fio.m2303a(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(true));
                break;
        }
        switch (this.f15899c.f4479c.ordinal()) {
            case 1:
                fio.m2303a(CaptureRequest.CONTROL_AWB_LOCK, Boolean.valueOf(true));
                break;
            case 2:
                fio.m2303a(CaptureRequest.CONTROL_AWB_LOCK, Boolean.valueOf(true));
                break;
        }
        return fio.m2301a();
    }
}
