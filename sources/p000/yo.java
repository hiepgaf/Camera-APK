package p000;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* renamed from: yo */
final class yo extends zs {
    /* renamed from: a */
    public static final aby f19743a = new aby("AndCamAgntImp");
    /* renamed from: j */
    private static final abi f19744j = new yp();
    /* renamed from: b */
    public abh f19745b;
    /* renamed from: c */
    public zo f19746c;
    /* renamed from: d */
    public final zf f19747d;
    /* renamed from: e */
    public final abq f19748e;
    /* renamed from: f */
    public final abs f19749f;
    /* renamed from: g */
    public abi f19750g = f19744j;
    /* renamed from: h */
    private final HandlerThread f19751h = new HandlerThread("Camera Handler Thread");

    yo() {
        this.f19751h.start();
        this.f19747d = new zf(this, this, this.f19751h.getLooper());
        this.f19750g = new abi(this.f19747d);
        this.f19748e = new abq((byte) 0);
        this.f19749f = new abs(this.f19747d, this.f19751h);
        this.f19749f.start();
    }

    /* renamed from: a */
    public final abg mo2542a() {
        return ys.m14588b();
    }

    /* renamed from: b */
    protected final abi mo2544b() {
        return this.f19750g;
    }

    /* renamed from: c */
    protected final Handler mo2545c() {
        return this.f19747d;
    }

    /* renamed from: d */
    protected final abq mo2546d() {
        return this.f19748e;
    }

    /* renamed from: e */
    protected final abs mo2547e() {
        return this.f19749f;
    }

    /* renamed from: f */
    public final void mo2548f() {
        m6258a(true);
        abs abs = this.f19749f;
        synchronized (abs.f172b) {
            abs.f172b = Boolean.valueOf(true);
        }
        synchronized (abs.f171a) {
            abs.f171a.notifyAll();
        }
        this.f19748e.m76b();
    }

    /* renamed from: a */
    public final void mo2543a(abi abi) {
        this.f19750g = abi;
    }
}
