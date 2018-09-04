package p000;

import java.util.concurrent.Future;

/* renamed from: gna */
final /* synthetic */ class gna implements Runnable {
    /* renamed from: a */
    private final gmz f5477a;
    /* renamed from: b */
    private final hec f5478b;
    /* renamed from: c */
    private final glw f5479c;

    gna(gmz gmz, hec hec, glw glw) {
        this.f5477a = gmz;
        this.f5478b = hec;
        this.f5479c = glw;
    }

    public final void run() {
        gkt gkt = this.f5477a;
        eql eql = (eql) kow.m13625c((Future) jri.m13152b(gkt.z));
        gkt.m17443a(this.f5478b, this.f5479c, eql);
        gkt.m15765a(gkt.f21506s);
        if (gkt.f23272d == null) {
            gkt.f23272d = eql;
        }
    }
}
