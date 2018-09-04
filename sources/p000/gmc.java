package p000;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: gmc */
final /* synthetic */ class gmc implements Runnable {
    /* renamed from: a */
    private final gmb f5411a;
    /* renamed from: b */
    private final glz f5412b;
    /* renamed from: c */
    private final InputStream f5413c;
    /* renamed from: d */
    private final kbg f5414d;
    /* renamed from: e */
    private final ixx f5415e;

    gmc(gmb gmb, glz glz, InputStream inputStream, kbg kbg, ixx ixx) {
        this.f5411a = gmb;
        this.f5412b = glz;
        this.f5413c = inputStream;
        this.f5414d = kbg;
        this.f5415e = ixx;
    }

    public final void run() {
        kpk a;
        gkt gkt = this.f5411a;
        glz glz = this.f5412b;
        InputStream inputStream = this.f5413c;
        kbg kbg = this.f5414d;
        ixx ixx = this.f5415e;
        if (gkt.f23263a.mo2084b()) {
            a = ((etc) gkt.f23263a.mo2081a()).mo1278a(gkt.f21506s, inputStream, kbg, gkt.m15798y().m2813a(gkt.f21510w, new SimpleDateFormat("'MVIMG'_yyyyMMdd_HHmmss", Locale.US)), gkt.f21496i, gkt.f21511x);
        } else {
            a = kpl.m13628a(new gmd(gkt, ixx, inputStream, kbg));
            a.run();
        }
        kow.m13622a(a, new gme(gkt, glz), gkt.f21503p);
    }
}
