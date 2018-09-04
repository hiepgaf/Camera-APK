package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ijn */
final class ijn implements iqo {
    /* renamed from: a */
    private final AtomicBoolean f18311a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ ijl f18312b;

    ijn(ijl ijl) {
        this.f18312b = ijl;
    }

    public final void close() {
        boolean z = false;
        if (!this.f18311a.getAndSet(true)) {
            synchronized (this.f18312b.f18308d) {
                boolean z2;
                ijl ijl = this.f18312b;
                ijl.f18306b--;
                if (ijl.f18306b >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jri.m13144a(z2, (Object) "The number of handles should never be negative.");
                ijl = this.f18312b;
                synchronized (ijl.f18308d) {
                    if (ijl.f18310f) {
                    } else {
                        if (ijl.f18306b == 0) {
                            ikq ikq = ijl.f18307c;
                            if (ikq != null) {
                                ikq.m12264a(ijl.f18309e);
                            } else {
                                ijl.f18310f = true;
                                z = true;
                            }
                        }
                        if (z) {
                            ijl.f18305a.close();
                        }
                    }
                }
            }
        }
    }
}
