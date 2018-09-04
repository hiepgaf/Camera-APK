package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: dch */
public final class dch extends dbx {
    /* renamed from: c */
    public static final String f20913c = bli.m862a("StateOpeningCamera");
    /* renamed from: d */
    public final iut f20914d;
    /* renamed from: e */
    public final iur f20915e;
    /* renamed from: f */
    public final ffc f20916f;
    /* renamed from: g */
    public iqp f20917g;
    /* renamed from: h */
    public boolean f20918h = false;
    /* renamed from: i */
    public fxg f20919i;
    /* renamed from: j */
    private final String f20920j = gos.m2669a(this.f20915e.f7482b);
    /* renamed from: k */
    private final ilp f20921k = ((dbu) m991d()).mo2924W();
    /* renamed from: l */
    private final ilp f20922l;
    /* renamed from: m */
    private final ilp f20923m;

    public dch(dbx dbx, iut iut, iur iur, ffc ffc) {
        super((bug) dbx);
        dci dci = new dci();
        this.f20914d = iut;
        this.f20915e = iur;
        this.f20916f = ffc;
        Object valueOf = Boolean.valueOf(false);
        this.f20922l = new ilb(valueOf);
        this.f20923m = new ilb(valueOf);
        m988a(daz.class, new dcj(this));
        m988a(daw.class, new dck(this));
        m988a(dav.class, new dcn(this));
    }

    /* renamed from: b */
    public final /* synthetic */ bug mo1134b() {
        return mo2952e();
    }

    /* renamed from: e */
    public final dbx mo2952e() {
        if (this.f20916f == null) {
            bli.m866b(f20913c, "mCameraCharacteristics is null");
            return new dca(this);
        }
        fha dcq = new dcq(this);
        ((dbu) m991d()).mo2904C().f2904a = dcq;
        this.f20917g = ((dbu) m991d()).mo2916O().m1724a(this.f20915e, this.f20914d);
        ilp fxd = new fxd(((dbu) m991d()).mo2950z(), this.f20916f, fxi.AUTO);
        this.f20919i = fxg.m2410a(this.f20917g, new dco(this, this.f20923m), ilq.m3818a(Boolean.valueOf(false)), fxd, dcq, this.f20922l);
        ((dbu) m991d()).mo2932h().m15518a(this.f20914d);
        List q = ((dbu) m991d()).mo2910I().mo1343a(this.f20915e).mo1935q();
        if (q.isEmpty()) {
            return new dca(this);
        }
        iqp a = ((dbu) m991d()).mo2916O().m1724a(this.f20915e, this.f20914d);
        iqp a2 = ((dbu) m991d()).mo2923V().m3099a(q, a, this.f20914d);
        heo heo = new heo(this.f20914d, a2, ipz.m4019b(a2));
        dof dof = new dof(a2, ((dbu) m991d()).mo2922U().m3096a(heo), new ciq(), new bnb(), ((dbu) m991d()).mo2941q(), ((dbu) m991d()).mo2917P(), new etg(false));
        dof dof2 = dof;
        ((dbu) m991d()).mo2908G().execute(new dcp(this, ((dbu) m991d()).mo2911J().mo1165a(this.f20915e, new bcl(), dof2, this.f20919i, ((dbu) m991d()).mo2912K()), new cwc(this.f20915e, this.f20914d, ipz.m4019b(a), a, heo)));
        return null;
    }
}
