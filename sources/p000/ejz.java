package p000;

/* compiled from: PG */
/* renamed from: ejz */
final class ejz implements emc {
    /* renamed from: a */
    private final /* synthetic */ ejy f15221a;

    ejz(ejy ejy) {
        this.f15221a = ejy;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo1141a(Object obj) {
        Float f = (Float) obj;
        ekm ekm = this.f15221a.f3717I;
        ekm.f3807a = f.floatValue();
        ekm.m1839a();
        bwb bwb = this.f15221a.f3747w;
        if (bwb != null) {
            synchronized (bwb.f1650k) {
                if (!bwb.f1647h) {
                    bwb.f1648i.post(bwb.f1651l);
                    bwb.f1647h = true;
                }
            }
        }
    }
}
