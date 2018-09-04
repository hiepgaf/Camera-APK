package p000;

import java.util.LinkedList;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: fov */
public final class fov implements iqo {
    /* renamed from: a */
    public final bcz f16278a;
    /* renamed from: b */
    private final Object f16279b = new Object();
    /* renamed from: c */
    private final Queue f16280c;
    /* renamed from: d */
    private int f16281d;
    /* renamed from: e */
    private final ilb f16282e;
    /* renamed from: f */
    private final int f16283f;
    /* renamed from: g */
    private volatile boolean f16284g = false;

    public fov(int i) {
        this.f16281d = i;
        this.f16283f = -1;
        this.f16280c = new LinkedList();
        this.f16278a = new bcz();
        this.f16282e = new ilb(Integer.valueOf(this.f16281d));
    }

    public final void close() {
        this.f16284g = true;
    }

    /* renamed from: a */
    final void m10591a() {
        synchronized (this.f16279b) {
            foy foy = (foy) this.f16280c.poll();
            if (foy == null) {
                this.f16281d++;
                this.f16282e.mo348a(Integer.valueOf(this.f16281d));
                return;
            }
            m10589a(foy.f4649a, foy.f4650b, foy.f4651c);
        }
    }

    /* renamed from: a */
    private final void m10589a(fow fow, fyr fyr, kpw kpw) {
        kow.m13622a(fow.mo568a(), new fox(this, kpw, fyr), kpq.f8410a);
    }

    /* renamed from: a */
    public final kpk m10590a(fow fow) {
        if (this.f16284g) {
            return fow.mo569b();
        }
        kpk d = kpw.m18056d();
        fyr a = this.f16278a.m16884a();
        synchronized (this.f16279b) {
            if (this.f16281d > 0) {
                jri.m13153b(this.f16280c.isEmpty());
                this.f16281d--;
                this.f16282e.mo348a(Integer.valueOf(this.f16281d));
                m10589a(fow, a, d);
                return d;
            }
            int i = this.f16283f;
            if (i < 0 || (i >= 0 && this.f16280c.size() < this.f16283f)) {
                this.f16280c.add(new foy(fow, a, d));
                return d;
            }
            a.close();
            d = kow.m13618a(new isr("Not enough capacity."));
            return d;
        }
    }
}
