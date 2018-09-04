package p000;

import android.annotation.TargetApi;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: dvq */
public final class dvq implements dvp {
    /* renamed from: a */
    private final iqz f14622a;
    /* renamed from: b */
    private double f14623b = 33.0d;

    public dvq(ira ira) {
        this.f14622a = ira.mo511a("FrameJank");
    }

    /* renamed from: a */
    public final void mo1178a(iwp iwp, double d, double d2) {
        double d3 = this.f14623b;
        if (d3 > 33.0d && d > 33.0d) {
            double d4 = (d - d3) / d3;
            if (d4 >= 1.5d) {
                iqz iqz = this.f14622a;
                StringBuilder stringBuilder = new StringBuilder(146);
                stringBuilder.append("JANK! Time between frames (");
                stringBuilder.append(d);
                stringBuilder.append("ms) increased by ");
                stringBuilder.append(d4 * 100.0d);
                stringBuilder.append("% over the expected delta (");
                stringBuilder.append(d3);
                stringBuilder.append("ms)");
                iqz.mo518d(stringBuilder.toString());
            }
        }
        if (d > 33.0d) {
            d3 = this.f14623b;
            if (d > d3) {
                this.f14623b = ((d3 * 10.0d) + d) / 11.0d;
            } else {
                this.f14623b = d;
            }
        }
    }
}
