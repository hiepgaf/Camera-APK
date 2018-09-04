package p000;

import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: glg */
final /* synthetic */ class glg implements Runnable {
    /* renamed from: a */
    private final glf f5362a;
    /* renamed from: b */
    private final gmq f5363b;
    /* renamed from: c */
    private final glz f5364c;
    /* renamed from: d */
    private final InputStream f5365d;
    /* renamed from: e */
    private final kpw f5366e;

    glg(glf glf, gmq gmq, glz glz, InputStream inputStream, kpw kpw) {
        this.f5362a = glf;
        this.f5363b = gmq;
        this.f5364c = glz;
        this.f5365d = inputStream;
        this.f5366e = kpw;
    }

    public final void run() {
        glf glf = this.f5362a;
        gmq gmq = this.f5363b;
        glz glz = this.f5364c;
        InputStream inputStream = this.f5365d;
        knk knk = this.f5366e;
        try {
            gmp gmp = glf.f21519e;
            ixx ixx = glz.f5405b;
            iqp iqp = glz.f5404a;
            if (ixx.m4333a()) {
                gmp.f5457b.mo1636a(gmq.f5459b, gmp.f5456a.getContentResolver(), gmq.f5458a, gmq.f5460c, glz.f5409f, ((Long) glz.f5408e.mo2082a(Long.valueOf(0))).longValue(), inputStream, iqp.f7329a, iqp.f7330b, ixx);
            } else {
                gmp.f5457b.mo1635a(gmq.f5459b, gmp.f5456a.getContentResolver(), gmq.f5458a, gmq.f5460c, glz.f5409f, ((Integer) glz.f5406c.mo2082a(Integer.valueOf(0))).intValue(), glz.f5407d, inputStream, iqp.f7329a, iqp.f7330b, ixx);
            }
        } catch (Throwable e) {
            bli.m867b(glf.f21514a, "Failed to persist image!", e);
        }
        if (glf.f21521g != null) {
            glf.m15839r();
            glf.f21523i.mo1524c();
            glf.f21518d.m2638a((Uri) jri.m13152b(glf.f21521g), new ArrayList());
            glf.m15819a("capturePersisted");
        } else {
            glf.m15838q();
            glf.m15819a("captureFailed");
            glf.mo1481a(hci.m11747a(), true, "Failed to persist capture, there is no uri.");
        }
        knk.mo3557a(kbg.m4744b(glf.f21521g));
    }
}
