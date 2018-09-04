package p000;

import com.google.android.apps.camera.stats.ViewfinderJankSession;

/* compiled from: PG */
/* renamed from: dvs */
public final class dvs implements dvp {
    /* renamed from: a */
    private final ViewfinderJankSession f14625a;
    /* renamed from: b */
    private double f14626b = 33.0d;

    dvs(ViewfinderJankSession viewfinderJankSession) {
        this.f14625a = viewfinderJankSession;
    }

    /* renamed from: a */
    public final void mo1178a(iwp iwp, double d, double d2) {
        double d3 = this.f14626b;
        if (d3 > 33.0d && d > 33.0d) {
            double d4 = (d - d3) / d3;
            if (d4 >= 0.5d) {
                ViewfinderJankSession viewfinderJankSession = this.f14625a;
                synchronized (viewfinderJankSession.f12333a) {
                    if (d4 >= 0.5d) {
                        viewfinderJankSession.f12336d++;
                    }
                    if (d4 >= 1.5d) {
                        viewfinderJankSession.f12337e++;
                    }
                    if (d4 >= 5.0d) {
                        viewfinderJankSession.f12338f++;
                    }
                    if (d4 >= 1.5d) {
                        kke a = ViewfinderJankSession.m8428a(iwp, d, d3);
                        viewfinderJankSession.f12335c.add(a);
                        viewfinderJankSession.m8430a(a);
                    }
                }
            }
        }
        if (d > 33.0d) {
            d3 = this.f14626b;
            if (d > d3) {
                this.f14626b = ((d3 * 10.0d) + d) / 11.0d;
            } else {
                this.f14626b = d;
            }
        }
    }
}
