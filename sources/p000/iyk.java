package p000;

import android.util.Size;
import android.view.Surface;

/* renamed from: iyk */
final /* synthetic */ class iyk implements Runnable {
    /* renamed from: a */
    private final iye f7556a;
    /* renamed from: b */
    private final Surface f7557b;
    /* renamed from: c */
    private final Size f7558c;

    iyk(iye iye, Surface surface, Size size) {
        this.f7556a = iye;
        this.f7557b = surface;
        this.f7558c = size;
    }

    public final void run() {
        iye iye = this.f7556a;
        Surface surface = this.f7557b;
        Size size = this.f7558c;
        synchronized (iye.f18683m) {
            iye.f18678h.mo1903a("setOutputSurface");
            jri.m13154b(iye.f18688r ^ 1, (Object) "Tried to set output surface after ViewfinderEffectsPipeline is closed");
            if (iye.f18684n.mo2084b()) {
                if (iye.f18685o.mo3495c() == surface && iye.f18685o.m17661d() == null) {
                    throw new jhu();
                }
                ((jdk) iye.f18684n.mo2081a()).close();
            }
            iye.f18685o = new jfo(surface);
            jdo jdo = iye.f18672b;
            iye.f18684n = kbg.m4745c(new jdk(jdo, jdo.mo3491f().m17631a(new jdm(iye.f18685o, izu.m4367a(size.getWidth(), size.getHeight())))));
            iye.f18678h.mo1904b();
        }
    }
}
