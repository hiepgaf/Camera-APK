package p000;

/* compiled from: PG */
/* renamed from: ayy */
public final class ayy implements ayx {
    /* renamed from: b */
    private static final ayv f10551b = new axy();
    /* renamed from: a */
    public ayv f10552a;
    /* renamed from: c */
    private final ikd f10553c;
    /* renamed from: d */
    private final ayw f10554d;

    public ayy(ikd ikd, ayw ayw) {
        this.f10553c = ikd;
        this.f10554d = ayw;
    }

    /* renamed from: a */
    public final ayv mo403a(axp axp) {
        ayv ayv = this.f10552a;
        if (ayv != null && ayv.mo389b() != go.f5581s) {
            return f10551b;
        }
        this.f10552a = this.f10554d.mo391a(axp);
        this.f10553c.execute(new ayz(this));
        return this.f10552a;
    }
}
