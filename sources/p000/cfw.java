package p000;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: cfw */
final class cfw implements iqt {
    /* renamed from: a */
    private final /* synthetic */ int f11824a;
    /* renamed from: b */
    private final /* synthetic */ AtomicReference f11825b;
    /* renamed from: c */
    private final /* synthetic */ cfk f11826c;

    cfw(cfk cfk, int i, AtomicReference atomicReference) {
        this.f11826c = cfk;
        this.f11824a = i;
        this.f11825b = atomicReference;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((grt) this.f11826c.f20283i.modeSwitch().getCurrentSession()).m11410b();
            this.f11826c.f20266Q.mo1596b(this.f11824a, 0, ((grt) this.f11826c.f20283i.modeSwitch().getCurrentSession()).f2411k, ((grt) this.f11826c.f20283i.modeSwitch().getCurrentSession()).f17270a);
            if (this.f11825b.get() != null) {
                ((iqo) this.f11825b.get()).close();
            }
        }
    }
}
