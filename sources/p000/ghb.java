package p000;

import android.graphics.Rect;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ghb */
public final class ghb extends ggq {
    /* renamed from: b */
    private final ggr f21465b;
    /* renamed from: i */
    private final ird f21466i;

    public ghb(gfw gfw, Executor executor, gfv gfv, get get, iqp iqp, kbg kbg, ird ird) {
        super(gfw, executor, gfv, go.aU, get, iqp, go.aR, ird);
        this.f21466i = ird;
        if (kbg.mo2084b()) {
            this.f21465b = (ggr) kbg.mo2081a();
            gfw gfw2 = this.f21465b.f5167g;
            boolean z = gfw2 != null ? gfw2 == this.g : true;
            jri.m13143a(z);
            if (this.f21465b.f5163c == this.c) {
                z = true;
            } else {
                z = false;
            }
            jri.m13143a(z);
            return;
        }
        this.f21465b = null;
    }

    /* renamed from: a */
    public final void mo3059a(String str) {
    }

    public final void run() {
        this.f21466i.mo1903a("PreviewChained");
        gfw gfw = (gfw) jri.m13152b(this.g);
        Rect a = ggr.m2545a(gfw.f5149b, gfw.f5153f);
        ggq.m11066a(gfw);
        int a2 = fzb.m10902a(new iqp(a.width(), a.height()), this.a);
        ggt a3 = m11068a(gfw, a2);
        try {
            m2546a(this.e, a3, go.aW);
            int g = gfw.f5149b.mo2720g() / a2;
            int d = gfw.f5149b.mo2717d() / a2;
            StringBuilder stringBuilder = new StringBuilder(102);
            stringBuilder.append("TIMER_END Rendering preview YUV buffer available, w=");
            stringBuilder.append(g);
            stringBuilder.append(" h=");
            stringBuilder.append(d);
            stringBuilder.append(" of subsample ");
            stringBuilder.append(a2);
            m11069a(a3, m11071a(gfw.f5149b, a, a2), go.aW);
            ggr ggr = this.f21465b;
            if (ggr != null) {
                this.c.mo1474a((ggr) this, ggr);
            }
            this.c.mo1472a(gfw.f5149b, this.d);
            this.f21466i.mo1904b();
        } catch (Throwable th) {
            this.c.mo1472a(gfw.f5149b, this.d);
        }
    }
}
