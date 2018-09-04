package p000;

/* compiled from: PG */
/* renamed from: azd */
public final class azd implements fuw {
    /* renamed from: a */
    private final axm f10560a;
    /* renamed from: b */
    private final ayb f10561b;
    /* renamed from: c */
    private final fuw f10562c;

    public azd(fuw fuw, axm axm, ayb ayb) {
        this.f10560a = (axm) jri.m13152b((Object) axm);
        this.f10561b = (ayb) jri.m13152b((Object) ayb);
        this.f10562c = (fuw) jri.m13152b((Object) fuw);
    }

    /* renamed from: a */
    public final fux mo404a(fwa fwa) {
        return new aze(this.f10560a, this.f10561b, this.f10562c.mo404a(fwa));
    }

    /* renamed from: a */
    public final ilp mo405a() {
        return this.f10562c.mo405a();
    }

    /* renamed from: b */
    public final fuy mo407b() {
        return this.f10562c.mo407b();
    }

    /* renamed from: b */
    public final fux mo406b(fwa fwa) {
        fux b = this.f10562c.mo406b(fwa);
        if (b == null) {
            return null;
        }
        return new aze(this.f10560a, this.f10561b, b);
    }
}
