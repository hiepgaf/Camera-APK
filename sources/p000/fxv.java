package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fxv */
public final class fxv implements fyt {
    /* renamed from: a */
    public final AtomicInteger f16626a = new AtomicInteger(0);

    /* renamed from: a */
    public final bbi mo1428a(int i) {
        iqo bbo = new bbo();
        for (int i2 = 0; i2 < i; i2++) {
            bbo.add(new fxx(this));
        }
        bbi d = bcp.m14749d();
        d.m14753a(bbo);
        return d;
    }

    /* renamed from: a */
    public final iqo mo1429a() {
        return new fxw();
    }

    /* renamed from: c */
    public final ilp mo1430c() {
        return ilq.m3818a(Integer.valueOf(LfuScheduler.MAX_PRIORITY));
    }

    /* renamed from: d */
    public final fyr mo1431d() {
        return new fxx(this);
    }
}
