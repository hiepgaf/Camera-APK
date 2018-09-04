package p000;

import android.graphics.Rect;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: fyy */
public final class fyy {
    /* renamed from: a */
    public final ive f4830a;
    /* renamed from: b */
    public final ive f4831b;
    /* renamed from: c */
    public final kbg f4832c;
    /* renamed from: d */
    public final iqp f4833d;
    /* renamed from: e */
    public final Rect f4834e;

    public fyy(ive ive, ive ive2, kbg kbg, iqp iqp, Rect rect) {
        this.f4830a = ive;
        this.f4831b = ive2;
        this.f4832c = kbg;
        this.f4833d = iqp;
        this.f4834e = rect;
    }

    /* renamed from: a */
    public static fyy m2423a(ffc ffc, iqp iqp, int i) {
        gcu gcu = new gcu(ffc, iqp, i);
        List<iqp> b = gcu.f16760a.mo1920b(gcu.f16762c);
        if (b.isEmpty()) {
            int i2 = gcu.f16762c;
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("No picture sizes supported for format: ");
            stringBuilder.append(i2);
            throw new fyx(stringBuilder.toString());
        }
        iqp a;
        iqp iqp2 = gcu.f16761b;
        jri.m13153b(b.isEmpty() ^ 1);
        iqp iqp3 = null;
        long j = Long.MAX_VALUE;
        for (iqp a2 : b) {
            iqp iqp4;
            long j2;
            long a3 = a2.m4046a();
            long j3;
            if (a2.f7329a < iqp2.f7329a) {
                j3 = j;
                iqp4 = iqp3;
                j2 = j3;
            } else if (a2.f7330b < iqp2.f7330b) {
                j3 = j;
                iqp4 = iqp3;
                j2 = j3;
            } else if (a3 < j) {
                iqp4 = a2;
                j2 = a3;
            } else {
                j3 = j;
                iqp4 = iqp3;
                j2 = j3;
            }
            iqp3 = iqp4;
            j = j2;
        }
        if (iqp3 == null) {
            a2 = ion.m3940a((List) b);
        } else {
            a2 = iqp3;
        }
        return new fyy(new ive(gcu.f16762c, a2), new ive(gcu.f16762c, ion.m3940a((List) b)), kau.f19138a, gcu.f16761b, ipz.m4019b(gcu.f16761b).m4023a(a2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyy)) {
            return false;
        }
        fyy fyy = (fyy) obj;
        if (this.f4833d.equals(fyy.f4833d) && this.f4832c.equals(fyy.f4832c) && this.f4831b.equals(fyy.f4831b) && this.f4830a.equals(fyy.f4830a) && this.f4834e.equals(fyy.f4834e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4833d, this.f4832c, this.f4831b, this.f4830a, this.f4834e});
    }

    public final String toString() {
        return jqk.m13099b("PictureSizeCalculator.Configuration").m4742a("desired size", this.f4833d).m4742a("large image reader", this.f4830a).m4742a("full-size image reader", this.f4831b).m4742a("reprocessing output image reader", this.f4832c).m4742a("crop", this.f4834e).toString();
    }
}
