package p000;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: gmd */
final /* synthetic */ class gmd implements Callable {
    /* renamed from: a */
    private final gmb f5416a;
    /* renamed from: b */
    private final ixx f5417b;
    /* renamed from: c */
    private final InputStream f5418c;
    /* renamed from: d */
    private final kbg f5419d;

    gmd(gmb gmb, ixx ixx, InputStream inputStream, kbg kbg) {
        this.f5416a = gmb;
        this.f5417b = ixx;
        this.f5418c = inputStream;
        this.f5419d = kbg;
    }

    public final Object call() {
        gkt gkt = this.f5416a;
        ixx ixx = this.f5417b;
        InputStream inputStream = this.f5418c;
        kbg kbg = this.f5419d;
        File a = gkt.m15798y().m2811a(gkt.f21496i, ixx);
        gkt.f21511x.mo1523b(gkt.m15797x().mo1613a(a, inputStream, kbg));
        return a;
    }
}
