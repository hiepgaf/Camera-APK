package p000;

import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: fuh */
public final class fuh implements fue {
    /* renamed from: a */
    public final iqz f16529a;

    fuh(ira ira) {
        this.f16529a = ira.mo511a("TuningDataLogger");
    }

    /* renamed from: a */
    private final kpk m10769a(Collection collection) {
        return kny.m18045a(kow.m13616a((Iterable) collection), new fuj(this), kpq.f8410a);
    }

    /* renamed from: a */
    public final void mo1424a(fub fub) {
        kpk a = m10769a(Collections.unmodifiableMap(fub.f4717d).values());
        kpk a2 = m10769a(Collections.unmodifiableList(fub.f4722i));
        kow.m13622a(kow.m13621a(a, a2), new fui(this, fub), kpq.f8410a);
    }
}
