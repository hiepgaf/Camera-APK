package p000;

import java.io.File;
import java.io.InputStream;

/* renamed from: gmj */
final /* synthetic */ class gmj implements Runnable {
    /* renamed from: a */
    private final gmi f5434a;
    /* renamed from: b */
    private final ixx f5435b;
    /* renamed from: c */
    private final InputStream f5436c;
    /* renamed from: d */
    private final kbg f5437d;
    /* renamed from: e */
    private final glz f5438e;

    gmj(gmi gmi, ixx ixx, InputStream inputStream, kbg kbg, glz glz) {
        this.f5434a = gmi;
        this.f5435b = ixx;
        this.f5436c = inputStream;
        this.f5437d = kbg;
        this.f5438e = glz;
    }

    public final void run() {
        gkt gkt = this.f5434a;
        ixx ixx = this.f5435b;
        InputStream inputStream = this.f5436c;
        kbg kbg = this.f5437d;
        glz glz = this.f5438e;
        File a = gkt.m15798y().m2811a(gkt.f21496i, ixx);
        try {
            gkt.f21511x.mo1523b(gkt.m15797x().mo1613a(a, inputStream, kbg));
            gkt.A.mo3557a(glz.m2612a(a));
        } catch (Throwable e) {
            bli.m867b(gmi.f23266a, "CameraFileUtil.writeFile() throws : ", e);
            gkt.A.m17780a(e);
        }
    }
}
