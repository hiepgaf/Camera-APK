package p000;

/* compiled from: PG */
/* renamed from: dsv */
public final class dsv implements fbh, fwl {
    /* renamed from: a */
    private final fwl f14406a;
    /* renamed from: b */
    private final ilb f14407b = new ilb(fbi.IDLE);

    public dsv(fwl fwl) {
        this.f14406a = fwl;
    }

    /* renamed from: a */
    public final ilp mo1170a() {
        return this.f14406a.mo1170a();
    }

    public final ilp j_() {
        return this.f14407b;
    }

    /* renamed from: b */
    public final ilp mo1172b() {
        return this.f14406a.mo1172b();
    }

    /* renamed from: a */
    public final void mo1171a(fwm fwm, fwa fwa) {
        try {
            m9336a(fbi.RUNNING);
            this.f14406a.mo1171a(fwm, fwa);
        } finally {
            m9336a(fbi.IDLE);
        }
    }

    /* renamed from: a */
    private final void m9336a(fbi fbi) {
        this.f14407b.mo348a(fbi);
    }
}
