package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: heo */
public final class heo {
    /* renamed from: a */
    public final iqp f6105a;
    /* renamed from: b */
    public final ipz f6106b;
    /* renamed from: c */
    private final iut f6107c;

    public heo(iut iut, iqp iqp, ipz ipz) {
        this.f6107c = iut;
        this.f6105a = iqp;
        this.f6106b = ipz;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof heo)) {
            return false;
        }
        heo heo = (heo) obj;
        if (kbf.m16436b(this.f6107c, heo.f6107c) && kbf.m16436b(this.f6106b, heo.f6106b) && kbf.m16436b(this.f6105a, heo.f6105a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6107c, this.f6106b, this.f6105a});
    }

    public final String toString() {
        return jqk.m13099b("ViewfinderConfig").m4742a("cameraFacing", this.f6107c).m4742a("viewfinderAspectRatio", this.f6106b).m4742a("viewfinderResolution", this.f6105a).toString();
    }
}
