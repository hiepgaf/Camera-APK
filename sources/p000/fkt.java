package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fkt */
final class fkt implements fia {
    /* renamed from: a */
    public final AtomicBoolean f16119a = new AtomicBoolean(false);
    /* renamed from: b */
    public final AtomicBoolean f16120b = new AtomicBoolean(false);
    /* renamed from: c */
    public final /* synthetic */ fyr f16121c;
    /* renamed from: d */
    public final /* synthetic */ fks f16122d;

    fkt(fks fks, fyr fyr) {
        this.f16122d = fks;
        this.f16121c = fyr;
    }

    /* renamed from: a */
    public final void mo1384a() {
        jri.m13153b(this.f16120b.get() ^ 1);
        if (!this.f16119a.getAndSet(true)) {
            this.f16121c.close();
        }
    }

    /* renamed from: b */
    public final fiw mo1385b() {
        return fds.m10243a(this.f16122d.f16114b, new fku(this));
    }

    /* renamed from: c */
    public final Set mo1386c() {
        return this.f16122d.f16113a;
    }
}
