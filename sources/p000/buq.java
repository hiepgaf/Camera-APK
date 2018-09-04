package p000;

/* compiled from: PG */
/* renamed from: buq */
public final class buq implements buo {
    /* renamed from: a */
    private static final String f20160a = bli.m862a("ProcessingMedia");
    /* renamed from: b */
    private final eqi f20161b;
    /* renamed from: c */
    private hrd f20162c = hrd.INDETERMINATE;
    /* renamed from: d */
    private int f20163d = -1;
    /* renamed from: e */
    private boolean f20164e = false;
    /* renamed from: f */
    private agn f20165f;

    buq(eqi eqi) {
        this.f20161b = eqi;
    }

    public final synchronized void close() {
        this.f20165f = null;
    }

    /* renamed from: a */
    public final agn mo2705a() {
        return this.f20165f;
    }

    /* renamed from: b */
    public final eqi mo2708b() {
        return this.f20161b;
    }

    /* renamed from: c */
    public final hrd mo2709c() {
        return this.f20162c;
    }

    /* renamed from: d */
    public final int mo2710d() {
        return this.f20163d;
    }

    /* renamed from: e */
    public final boolean mo2711e() {
        return this.f20164e;
    }

    /* renamed from: a */
    public final synchronized void mo2707a(agn agn) {
        this.f20165f = agn;
        this.f20164e = true;
    }

    /* renamed from: a */
    public final void mo2706a(int i) {
        String str = f20160a;
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append("updateProgressPercentage ");
        stringBuilder.append(i);
        bli.m863a(str, stringBuilder.toString());
        this.f20163d = Math.max(this.f20163d, Math.min(i, 100));
        if (this.f20163d > 0) {
            this.f20162c = hrd.DETERMINATE;
        }
    }
}
