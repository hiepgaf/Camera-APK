package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: asj */
final class asj implements ffe {
    /* renamed from: a */
    private final /* synthetic */ ash f10178a;

    asj(ash ash) {
        this.f10178a = ash;
    }

    /* renamed from: a */
    public final void mo347a() {
        fhh a = this.f10178a.f933a.mo1382a();
        fio fio = new fio((fim) ((ffw) isr.m4143a(this.f10178a.f934b)).mo2860b());
        try {
            Object fcb = new fcb();
            Object fbw = new fbw(fcg.f4467a);
            fio b = this.f10178a.f935c.mo365b(fio);
            b.m2307a(fds.m10251c(fcb));
            b.m2307a(fds.m10251c(fbw));
            a.mo1381a(Arrays.asList(new fim[]{b.m2301a()}), fiv.REPEATING);
            fbw.mo3032a().mo3144b();
            this.f10178a.f935c.mo366c(fio).m2307a(this.f10178a.f937e.f4489f);
            a.mo1381a(Arrays.asList(new fim[]{r3.m2301a()}), fiv.NON_REPEATING);
            fcb.mo3032a().mo3144b();
            b.m2303a(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(true));
            a.mo1381a(Arrays.asList(new fim[]{b.m2301a()}), fiv.REPEATING);
            this.f10178a.f936d.mo3557a(aua.m694a());
            if (a != null) {
                a.close();
            }
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    kqg.m5044a(r0, th2);
                }
            }
        }
    }
}
