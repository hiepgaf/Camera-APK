package p000;

import java.io.File;
import java.io.InputStream;

/* renamed from: gnb */
final /* synthetic */ class gnb implements Runnable {
    /* renamed from: a */
    private final gmz f5480a;
    /* renamed from: b */
    private final ixx f5481b;
    /* renamed from: c */
    private final InputStream f5482c;
    /* renamed from: d */
    private final kbg f5483d;
    /* renamed from: e */
    private final glz f5484e;

    gnb(gmz gmz, ixx ixx, InputStream inputStream, kbg kbg, glz glz) {
        this.f5480a = gmz;
        this.f5481b = ixx;
        this.f5482c = inputStream;
        this.f5483d = kbg;
        this.f5484e = glz;
    }

    public final void run() {
        gkt gkt = this.f5480a;
        ixx ixx = this.f5481b;
        InputStream inputStream = this.f5482c;
        kbg kbg = this.f5483d;
        glz glz = this.f5484e;
        File a = gkt.m15798y().m2811a(gkt.f21496i, ixx);
        try {
            gkt.f21511x.mo1523b(gkt.m15797x().mo1613a(a, inputStream, kbg));
            gkt.A.mo3557a(new gnd(gkt, a, ixx, glz));
        } catch (Throwable e) {
            bli.m867b(gmz.f23269a, "CameraFileUtil.writeFile() throws : ", e);
            gkt.A.m17780a(e);
        }
    }
}
