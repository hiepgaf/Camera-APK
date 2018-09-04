package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: flx */
final class flx implements fjn, ikz {
    /* renamed from: a */
    private final flg f21377a;
    /* renamed from: b */
    private final fhz f21378b;
    /* renamed from: c */
    private final iqo f21379c;

    flx(flg flg, fhz fhz, iqo iqo) {
        this.f21377a = flg;
        this.f21378b = fhz;
        this.f21379c = iqo;
    }

    public final void close() {
        this.f21379c.close();
    }

    /* renamed from: c */
    public final List mo3039c() {
        return this.f21377a.mo3440a();
    }

    /* renamed from: d */
    public final List mo3040d() {
        return this.f21377a.mo3441c();
    }

    public final fhz x_() {
        return this.f21378b;
    }

    public final String t_() {
        return "ResidualFrameStore";
    }
}
