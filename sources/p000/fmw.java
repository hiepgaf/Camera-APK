package p000;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* renamed from: fmw */
final class fmw implements fne {
    /* renamed from: a */
    public final BlockingQueue f16210a = new LinkedBlockingQueue();
    /* renamed from: b */
    public final ixe f16211b;
    /* renamed from: c */
    private final fxr f16212c;

    fmw(ixe ixe, ikb ikb, iuw iuw) {
        this.f16211b = ixe;
        this.f16211b.mo3159a(new fmz(this), ijy.m3789a(ikb, "CopyingManagedImageWriter.ImageListener"));
        this.f16212c = (fxr) ikb.mo1879a(new fxr(this.f16211b.mo3156a()));
    }

    /* renamed from: a */
    public final ilp mo1409a() {
        return this.f16212c.f16619a;
    }

    /* renamed from: b */
    public final int mo1410b() {
        return this.f16211b.mo3156a();
    }

    /* renamed from: a */
    public final fng mo1408a(int i) {
        Collection a = fpo.m10619a(this.f16212c, i);
        if (a == null) {
            return null;
        }
        return new fng(this, a);
    }
}
