package p000;

import java.util.NavigableMap;

/* compiled from: PG */
/* renamed from: bod */
final class bod extends iww {
    /* renamed from: a */
    private final /* synthetic */ fkp f22609a;
    /* renamed from: b */
    private final /* synthetic */ boc f22610b;

    bod(boc boc, iwz iwz, fkp fkp) {
        this.f22610b = boc;
        this.f22609a = fkp;
        super(iwz);
    }

    public final void close() {
        long f = this.f22609a.mo2719f();
        NavigableMap navigableMap = this.f22610b.f11135a.f18646a;
        Long valueOf = Long.valueOf(f);
        fkp fkp = (fkp) ((iqo) navigableMap.remove(valueOf));
        if (fkp != null) {
            ixi ixi = this.f22610b.f11135a;
            synchronized (ixi.f18646a) {
                ixi.f18647b.remove(valueOf);
            }
            fkp.close();
        }
    }
}
