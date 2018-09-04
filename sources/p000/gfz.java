package p000;

import android.os.SystemClock;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gfz */
public final class gfz extends gfk {
    /* renamed from: c */
    public static final String f23229c = bli.m862a("LkyShtImgFltr");
    /* renamed from: d */
    private final kbg f23230d;
    /* renamed from: e */
    private final epl f23231e;
    /* renamed from: f */
    private gfw f23232f = null;
    /* renamed from: g */
    private double f23233g = 0.0d;

    private gfz(gfh gfh, ggw ggw, kbg kbg, epl epl) {
        super(gfh, ggw, true);
        this.f23230d = kbg;
        this.f23231e = epl;
    }

    public final synchronized void close() {
        SystemClock.elapsedRealtimeNanos();
        super.close();
    }

    /* renamed from: a */
    public static gfz m17361a(gfa gfa, Executor executor, kbg kbg, iqb iqb, ggc ggc, ird ird) {
        Long.toString(SystemClock.elapsedRealtime());
        epl epl = new epl(new iya());
        ggw ggw = new ggw(gfa, executor, iqb, ggc, epl, ird);
        gfz gfz = new gfz(gfa, ggw, kbg, epl);
        ggw.f5179c = gfz;
        return gfz;
    }

    /* renamed from: a */
    public final synchronized void m17365a(Set set, gkr gkr) {
        String str;
        int size;
        StringBuilder stringBuilder;
        if (set.size() == 0) {
            str = f23229c;
            size = set.size();
            stringBuilder = new StringBuilder(104);
            stringBuilder.append("Filtered Image future failed to return a single image. There are ");
            stringBuilder.append(size);
            stringBuilder.append(" images.  No Image produced.");
            bli.m873e(str, stringBuilder.toString());
        } else if (set.size() > 1) {
            str = f23229c;
            size = set.size();
            stringBuilder = new StringBuilder(88);
            stringBuilder.append("Filtered Image return multiple images. There are ");
            stringBuilder.append(size);
            stringBuilder.append(" images.  No Image produced.");
            bli.m866b(str, stringBuilder.toString());
            throw new IllegalStateException("Lucky Shot Filter returned multiple images.");
        } else {
            this.f23231e.f4036e = SystemClock.elapsedRealtimeNanos();
            str = f23229c;
            epl epl = this.f23231e;
            long j = epl.f4036e;
            long j2 = epl.f4035d;
            StringBuilder stringBuilder2 = new StringBuilder(54);
            stringBuilder2.append("LS calculation session time (ms)= ");
            stringBuilder2.append((j - j2) / 1000000);
            bli.m871d(str, stringBuilder2.toString());
            grg h = gkr.mo1482h();
            if (h != null) {
                grj a = h.mo1510a();
                if (a != null) {
                    epl = this.f23231e;
                    a.f17255c = epl.f4035d;
                    a.f17256d = epl.f4036e;
                    a.f17257e = epl.m1947b();
                }
            }
            if (this.f23230d.mo2084b()) {
                ggb ggb = (ggb) this.f23230d.mo2081a();
                gfw gfw = (gfw) set.iterator().next();
                gkr.mo1482h().mo1513a(this.f23231e);
                ggb.f5157b.f21383a.f16366a.mo519e("finish lucky shot selection, pass to the piped image saver");
                try {
                    ggb.f5156a.mo2642a(gfw.f5149b, (kpk) jri.m13152b(gfw.f5151d));
                } finally {
                    ggb.f5156a.close();
                }
            }
        }
    }

    /* renamed from: a */
    public final kpk mo3056a() {
        this.f23231e.f4035d = SystemClock.elapsedRealtimeNanos();
        return super.mo3056a();
    }

    /* renamed from: a */
    public final synchronized gfw m17362a(gfw gfw, double d) {
        gfw gfw2 = this.f23232f;
        if (gfw2 == null || d > this.f23233g) {
            this.f23232f = gfw;
            this.f23233g = d;
            gfw = gfw2;
        }
        return gfw;
    }
}
