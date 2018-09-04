package p000;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: eup */
public final class eup implements jgx {
    /* renamed from: a */
    public final jgx f15578a;
    /* renamed from: b */
    public final Set f15579b = new HashSet();
    /* renamed from: c */
    public final Object f15580c = new Object();

    public eup(jgx jgx) {
        this.f15578a = jgx;
    }

    /* renamed from: a */
    public final jhf mo1292a(jhe jhe) {
        euq euq = new euq(jhe.f7832a);
        synchronized (this.f15580c) {
            this.f15579b.add(euq);
        }
        return new eur(this, this.f15578a.mo1292a(jhe), euq.f4253a, euq.f4254b);
    }

    /* renamed from: c */
    final int m9964c() {
        int i;
        synchronized (this.f15580c) {
            i = 0;
            for (euq euq : this.f15579b) {
                if (!euq.f4254b.get()) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo1293a() {
        this.f15578a.mo1293a();
    }

    /* renamed from: b */
    public final kpk mo1294b() {
        return this.f15578a.mo1294b();
    }
}
