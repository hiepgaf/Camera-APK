package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fyh */
final class fyh implements fyr {
    /* renamed from: a */
    private final fyr f21437a;
    /* renamed from: b */
    private final AtomicBoolean f21438b = new AtomicBoolean(false);
    /* renamed from: c */
    private final /* synthetic */ fyd f21439c;

    fyh(fyd fyd, fyr fyr) {
        this.f21439c = fyd;
        this.f21437a = fyr;
    }

    public final void close() {
        boolean z = true;
        if (!this.f21438b.getAndSet(true)) {
            synchronized (this.f21439c.f16630a) {
                int size = this.f21439c.f16633d.size();
                fyd fyd = this.f21439c;
                if (size != fyd.f16635f) {
                    if (!fyd.f16636g) {
                        z = false;
                    }
                }
                if (!z) {
                    fyd.f16633d.add(this.f21437a);
                    fyd fyd2 = this.f21439c;
                    fyd2.f16634e.f21744b = Integer.valueOf(fyd2.m10885f());
                    this.f21439c.m10886g();
                }
            }
            if (z) {
                this.f21437a.close();
            }
        }
    }
}
