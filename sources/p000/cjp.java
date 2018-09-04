package p000;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: cjp */
public final class cjp {
    /* renamed from: a */
    private static final long f2082a = 100000000;
    /* renamed from: b */
    private final Object f2083b;
    /* renamed from: c */
    private final long f2084c;
    /* renamed from: d */
    private final chx f2085d;
    /* renamed from: e */
    private int f2086e;
    /* renamed from: f */
    private long f2087f;

    static {
        bli.m862a("BurstVolKey");
    }

    public cjp(chx chx) {
        this(chx, f2082a, new iya());
    }

    private cjp(chx chx, long j, iya iya) {
        boolean z;
        this.f2083b = new Object();
        this.f2086e = go.f5542F;
        jri.m13152b((Object) chx);
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        jri.m13152b((Object) iya);
        this.f2085d = chx;
        this.f2084c = j;
    }

    /* renamed from: a */
    public final boolean m1161a() {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        synchronized (this.f2083b) {
            if (this.f2086e == go.f5542F) {
                this.f2086e = go.f5543G;
                this.f2087f = elapsedRealtimeNanos;
            } else if (elapsedRealtimeNanos - this.f2087f > this.f2084c && this.f2086e == go.f5543G) {
                this.f2086e = go.f5544H;
                this.f2085d.mo1108a(chw.VOLUME_BUTTON);
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m1162b() {
        synchronized (this.f2083b) {
            if (this.f2086e == go.f5543G) {
                this.f2086e = go.f5542F;
                return false;
            } else if (this.f2086e == go.f5544H) {
                this.f2086e = go.f5542F;
                this.f2085d.mo1109a(chw.VOLUME_BUTTON, true);
                return true;
            } else {
                return false;
            }
        }
    }
}
