package p000;

/* renamed from: gao */
final /* synthetic */ class gao implements iqt {
    /* renamed from: a */
    private final gal f16677a;
    /* renamed from: b */
    private final kcx f16678b;
    /* renamed from: c */
    private final ilp f16679c;
    /* renamed from: d */
    private final fzm f16680d;

    gao(gal gal, kcx kcx, ilp ilp, fzm fzm) {
        this.f16677a = gal;
        this.f16678b = kcx;
        this.f16679c = ilp;
        this.f16680d = fzm;
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        gal gal = this.f16677a;
        kcx kcx = this.f16678b;
        ilp ilp = this.f16679c;
        fzm fzm = this.f16680d;
        fzp a = gal.m2453a(kcx, ilp, fzp.UNKNOWN);
        if (a == fzp.UNKNOWN) {
            String str = gal.f4957a;
            String valueOf = String.valueOf(obj);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
            stringBuilder.append("Property value ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" is not associated with a MenuOption.");
            bli.m873e(str, stringBuilder.toString());
        } else if (fzm != null) {
            gal.f4984b.m15078a(fzm, a);
            gal.f4984b.m15076a();
        }
    }
}
