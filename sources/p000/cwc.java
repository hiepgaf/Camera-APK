package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: cwc */
public final class cwc {
    /* renamed from: a */
    public final iur f2815a;
    /* renamed from: b */
    public final iut f2816b;
    /* renamed from: c */
    public final iqp f2817c;
    /* renamed from: d */
    public final heo f2818d;
    /* renamed from: e */
    private final ipz f2819e;

    public cwc(iur iur, iut iut, ipz ipz, iqp iqp, heo heo) {
        this.f2815a = (iur) jri.m13152b((Object) iur);
        this.f2816b = (iut) jri.m13152b((Object) iut);
        this.f2819e = (ipz) jri.m13152b((Object) ipz);
        this.f2817c = (iqp) jri.m13152b((Object) iqp);
        this.f2818d = (heo) jri.m13152b((Object) heo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cwc)) {
            return false;
        }
        cwc cwc = (cwc) obj;
        if (kbf.m16436b(this.f2815a, cwc.f2815a) && kbf.m16436b(this.f2816b, cwc.f2816b) && kbf.m16436b(this.f2819e, cwc.f2819e) && kbf.m16436b(this.f2817c, cwc.f2817c) && kbf.m16436b(this.f2818d, cwc.f2818d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2815a, this.f2816b, this.f2819e, this.f2817c, this.f2818d});
    }

    public final String toString() {
        return jqk.m13099b("ActiveModuleConfig").m4742a("cameraId", this.f2815a).m4742a("cameraFacing", this.f2816b).m4742a("aspectRatio", this.f2819e).m4742a("captureResolution", this.f2817c).m4742a("viewfinderConfig", this.f2818d).toString();
    }
}
