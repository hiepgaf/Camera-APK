package p000;

import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: isi */
final /* synthetic */ class isi implements Runnable {
    /* renamed from: a */
    private final irh f7389a;

    isi(irh irh) {
        this.f7389a = irh;
    }

    public final void run() {
        irh irh = this.f7389a;
        synchronized (irh.f7351d) {
            irx irx;
            if (irh.f7350c.m4141c()) {
                irx = irh.f7354g;
                if (irx != null) {
                    irh.f7354g = null;
                    irh.f7353f = null;
                } else {
                    irx = null;
                }
            } else {
                iur iur = irh.f7353f;
                if (iur == null) {
                    irx = null;
                } else if (irh.f7355h == null) {
                    irq irq = irh.f7349b;
                    irh.f7357j = new irl((Handler) irq.m4088a((Handler) irq.f7370a.mo345a(), 1), (Executor) irq.m4088a((Executor) irq.f7371b.mo345a(), 2), (CameraManager) irq.m4088a((CameraManager) irq.f7372c.mo345a(), 3), (irs) irq.m4088a((irs) irq.f7373d.mo345a(), 4), (ird) irq.m4088a((ird) irq.f7374e.mo345a(), 5), (iya) irq.m4088a((iya) irq.f7375f.mo345a(), 6), (String) irq.m4088a(iur.f7482b, 7));
                    irx b = irh.f7357j.m12419b();
                    b.m12431a(new ism(irh, iur));
                    b.m12431a((iri) jri.m13152b(irh.f7354g));
                    irh.f7355h = iur;
                    irh.f7356i = b;
                    irh.f7350c.m4139a(new isk(irh));
                    irh.f7348a.mo523b(iur);
                    irx = null;
                } else {
                    irx = null;
                }
            }
            irh.f7358k = false;
        }
        if (irx != null) {
            irx.mo1153b();
        }
    }
}
