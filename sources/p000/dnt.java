package p000;

/* compiled from: PG */
/* renamed from: dnt */
public final class dnt extends doc {
    /* renamed from: c */
    public static final String f21141c = bli.m862a("VidIntStartPreview");
    /* renamed from: d */
    public final ffc f21142d;
    /* renamed from: e */
    public final iur f21143e;
    /* renamed from: f */
    public final bfe f21144f;
    /* renamed from: g */
    public final iwl f21145g;
    /* renamed from: h */
    public djz f21146h;
    /* renamed from: i */
    private final iut f21147i;

    public dnt(doc doc, bfe bfe, iur iur, iut iut, ffc ffc, djz djz, iwl iwl) {
        super((bug) doc);
        this.f21142d = ffc;
        this.f21143e = iur;
        this.f21147i = iut;
        this.f21144f = bfe;
        this.f21146h = djz;
        this.f21145g = iwl;
        m988a(dbd.class, new dnv(this));
        m988a(dlp.class, new dnw(this));
        m988a(dax.class, new dny(this));
    }

    /* renamed from: b */
    public final /* synthetic */ bug mo1134b() {
        return mo2971e();
    }

    /* renamed from: e */
    public final doc mo2971e() {
        boolean z;
        boolean z2;
        boolean b;
        boolean z3;
        boolean z4 = false;
        ine a = ((doa) m991d()).f13617j.m1640a(this.f21147i, (bez) ((doa) m991d()).f13625r.mo2670b(this.f21143e).mo2081a(), inc.FPS_30, false);
        iqp a2 = new heh(this.f21142d, ((doa) m991d()).f13619l).m3094a(ipz.f7304b, inc.FPS_30, a);
        ((doa) m991d()).f13623p.mo348a(ipz.m4019b(a2));
        jri.m13152b((Object) a2);
        kpk a3 = ((doa) m991d()).f13618k.m3096a(new heo(this.f21147i, a2, ipz.m4019b(a2)));
        ilb ilb = new ilb(this.f21142d.mo1932n());
        fze fze = new fze(((doa) m991d()).f13596A, this.f21142d);
        imy imy = ((doa) m991d()).f13601F;
        iut iut = this.f21147i;
        iun iun = this.f21142d;
        inc a4 = ((doa) m991d()).f13602G.m17080a();
        if (!imy.f7105a.m3194b()) {
            z = false;
        } else if (iut == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        if (imy.f7105a.m3195c()) {
            z = true;
        } else if (imy.f7105a.m3196d()) {
            z = true;
        }
        hjf hjf = imy.f7105a;
        ivy ivy = hjf.f6267b;
        if (ivy.f7508d) {
            z2 = true;
        } else if (ivy.f7509e) {
            z2 = true;
        } else if (hjf.m3195c()) {
            z2 = true;
        } else if (imy.f7105a.m3196d()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (iun.mo1911A()) {
            b = imy.f7106b.m1644b();
        } else {
            b = false;
        }
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("Video Stabilization Enabled: ");
        stringBuilder.append(b);
        bli.m869c("LightCycle-debug", stringBuilder.toString());
        if (!imy.f7105a.m3195c()) {
            z3 = false;
        } else if (a4 != inc.FPS_30) {
            z3 = false;
        } else if (a != ine.RES_2160P) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((imy.f7105a.m3194b() || imy.f7105a.m3195c() || imy.f7105a.m3196d()) && iut == iut.BACK) {
            z4 = true;
        }
        kow.m13622a(kny.m18046a(a3, new dnu(this, fze, ilb, imw.m3846h().m3856b(z2).m3858d(z4).m3857c(z).m3859e(b).m3861g(imy.f7106b.m1647d()).m3860f(z3).m3854a()), kpq.f8410a), new dnz(this), kpq.f8410a);
        return null;
    }
}
