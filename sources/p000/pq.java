package p000;

/* compiled from: PG */
/* renamed from: pq */
public final class pq implements kg {
    /* renamed from: a */
    private boolean f19541a = false;
    /* renamed from: b */
    private int f19542b;
    /* renamed from: c */
    private final /* synthetic */ pp f19543c;

    protected pq(pp ppVar) {
        this.f19543c = ppVar;
    }

    /* renamed from: a */
    public final void mo2166a() {
        this.f19541a = true;
    }

    /* renamed from: b */
    public final void mo2167b() {
        if (!this.f19541a) {
            pp ppVar = this.f19543c;
            ppVar.f9031e = null;
            super.setVisibility(this.f19542b);
        }
    }

    /* renamed from: c */
    public final void mo2168c() {
        super.setVisibility(0);
        this.f19541a = false;
    }

    /* renamed from: a */
    public final pq m14311a(kd kdVar, int i) {
        this.f19543c.f9031e = kdVar;
        this.f19542b = i;
        return this;
    }
}
