package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fky */
final class fky implements fjn, ikz {
    /* renamed from: a */
    private final fjn f21371a;
    /* renamed from: b */
    private final fyt f21372b;

    fky(fjn fjn, fkw fkw) {
        this.f21371a = fjn;
        this.f21372b = fkw.f16126a;
    }

    public final void close() {
        this.f21371a.close();
    }

    /* renamed from: c */
    public final List mo3039c() {
        List<fjj> c = this.f21371a.mo3039c();
        List arrayList = new ArrayList(c.size());
        for (fjj fjj : c) {
            fyr d = this.f21372b.mo1431d();
            if (d != null) {
                arrayList.add(fma.m17345a(fjj, d));
            } else {
                fjj.close();
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List mo3040d() {
        List<fjj> d = this.f21371a.mo3040d();
        List arrayList = new ArrayList(d.size());
        for (fjj fjj : d) {
            fyr d2 = this.f21372b.mo1431d();
            if (d2 != null) {
                arrayList.add(fma.m17346b(fjj, d2));
            } else {
                fjj.close();
            }
        }
        return arrayList;
    }

    public final fhz x_() {
        return this.f21371a.x_();
    }

    public final String t_() {
        return "ResidualFrameStoreWrapper";
    }
}
