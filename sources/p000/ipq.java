package p000;

/* compiled from: PG */
/* renamed from: ipq */
public final class ipq implements iju {
    /* renamed from: a */
    private final /* synthetic */ ios f18502a;

    public ipq(ios ios) {
        this.f18502a = ios;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ kpk mo368a(Object obj, Object obj2) {
        return m12347a();
    }

    /* renamed from: a */
    private final kpk m12347a() {
        this.f18502a.f18446e.m12328b();
        ios ios = this.f18502a;
        iop iop = ios.f18450i;
        if (iop != null) {
            ios.f18446e.f18411d.remove(iop);
        }
        ior ior = this.f18502a.f18447f;
        if (ior != null) {
            ior.close();
        }
        iow iow = this.f18502a.f18448g;
        if (iow != null) {
            iow.close();
        }
        this.f18502a.f18446e.close();
        synchronized (this.f18502a.f18442a) {
            this.f18502a.f18443b = ipr.CLOSED;
        }
        return kow.m13617a(this.f18502a.f18444c);
    }
}
