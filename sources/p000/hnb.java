package p000;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hnb */
public final class hnb implements hhj, ilp {
    /* renamed from: a */
    private final /* synthetic */ Set f21598a;

    public hnb(Set set) {
        this.f21598a = set;
    }

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        return hnc.f17943a;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2860b() {
        kwk kwk = null;
        hhx hhx = (hhx) kwk.mo345a();
        boolean z = hhx != null ? hhx.equals(hhx.PHOTO) : false;
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo1729a() {
        for (hhj a : this.f21598a) {
            a.mo1729a();
        }
    }
}
