package p000;

/* compiled from: PG */
/* renamed from: dhc */
public final class dhc implements dhs {
    /* renamed from: c */
    private static final String f13219c = bli.m862a("CdrSlowMoDevOp");
    /* renamed from: a */
    public final asu f13220a;
    /* renamed from: b */
    public final dim f13221b;
    /* renamed from: d */
    private final ipv f13222d;
    /* renamed from: e */
    private final bfk f13223e;
    /* renamed from: f */
    private final dzh f13224f;
    /* renamed from: g */
    private final hjw f13225g;
    /* renamed from: h */
    private final ilp f13226h;
    /* renamed from: i */
    private final fbn f13227i;
    /* renamed from: j */
    private final gci f13228j;
    /* renamed from: k */
    private final djq f13229k;
    /* renamed from: l */
    private final dkb f13230l;
    /* renamed from: m */
    private final heq f13231m;
    /* renamed from: n */
    private final ilp f13232n;
    /* renamed from: o */
    private final ipz f13233o = ipz.f7304b;
    /* renamed from: p */
    private final how f13234p;
    /* renamed from: q */
    private final hjf f13235q;

    public dhc(hjf hjf, bfk bfk, dzh dzh, hjw hjw, ilb ilb, fbn fbn, gci gci, djq djq, dkb dkb, heq heq, asu asu, dim dim, ilp ilp, ipv ipv, how how) {
        this.f13222d = ipv;
        this.f13223e = bfk;
        this.f13224f = dzh;
        this.f13225g = hjw;
        this.f13226h = ilb;
        this.f13227i = fbn;
        this.f13228j = gci;
        this.f13229k = djq;
        this.f13230l = dkb;
        this.f13231m = heq;
        this.f13232n = ilp;
        this.f13221b = dim;
        this.f13220a = asu;
        this.f13234p = how;
        this.f13235q = hjf;
    }

    /* renamed from: a */
    public final kpk mo1145a() {
        bli.m863a(f13219c, "openCamcorderDevice");
        this.f13234p.mo1760e();
        this.f13234p.mo1764i();
        iut b = this.f13224f.m1696b();
        iur b2 = this.f13227i.mo1346b(b);
        if (b2 == null) {
            String valueOf = String.valueOf(b);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
            stringBuilder.append("Fail to find camera for facing ");
            stringBuilder.append(valueOf);
            return kow.m13618a(new IllegalStateException(stringBuilder.toString()));
        }
        kbg b3 = this.f13223e.mo2670b(b2);
        if (!b3.mo2084b()) {
            return kow.m13618a(new IllegalStateException("CamcorderCharacteristics is not available."));
        }
        boolean z;
        bez bez = (bez) b3.mo2081a();
        ffc ffc = bez.f1113a;
        inc inc = (inc) this.f13226h.mo2860b();
        ine a = this.f13230l.m1640a(b, bez, inc, false);
        String str = f13219c;
        String valueOf2 = String.valueOf(a);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
        stringBuilder2.append("Video Resolution: ");
        stringBuilder2.append(valueOf2);
        bli.m869c(str, stringBuilder2.toString());
        jri.m13153b(bez.m805a(inc, a));
        jri.m13153b(inc.m3876d());
        String str2 = f13219c;
        str = String.valueOf(inc);
        StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(str).length() + 14);
        stringBuilder3.append("Capture Rate: ");
        stringBuilder3.append(str);
        bli.m869c(str2, stringBuilder3.toString());
        iqp a2 = new heh(ffc, this.f13231m).m3094a(this.f13233o, inc, a);
        str = f13219c;
        valueOf2 = String.valueOf(a2);
        stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
        stringBuilder2.append("Preview Size: ");
        stringBuilder2.append(valueOf2);
        bli.m869c(str, stringBuilder2.toString());
        kbg kbg = kau.f19138a;
        djz djz = new djz(b, ffc, this.f13228j);
        boolean a3 = this.f13230l.m1642a(inc, a, this.f13229k.f13496a);
        str = f13219c;
        stringBuilder3 = new StringBuilder(20);
        stringBuilder3.append("Torch Enabled: ");
        stringBuilder3.append(a3);
        bli.m869c(str, stringBuilder3.toString());
        ilb ilb = new ilb(Boolean.valueOf(a3));
        kbg kbg2 = kau.f19138a;
        if (this.f13230l.m1646c()) {
            kbg2 = kbg.m4745c(this.f13225g);
        }
        valueOf = f13219c;
        stringBuilder3 = new StringBuilder(20);
        stringBuilder3.append("H.265 enabled: ");
        stringBuilder3.append(false);
        bli.m869c(valueOf, stringBuilder3.toString());
        int a4 = this.f13230l.m1639a(inc, a);
        valueOf = f13219c;
        stringBuilder3 = new StringBuilder(45);
        stringBuilder3.append("Max Recording Duration (Seconds): ");
        stringBuilder3.append(a4);
        bli.m869c(valueOf, stringBuilder3.toString());
        int b4 = this.f13230l.m1643b(inc, a);
        valueOf = f13219c;
        stringBuilder3 = new StringBuilder(51);
        stringBuilder3.append("Max Torch Recording Duration (Seconds): ");
        stringBuilder3.append(b4);
        bli.m869c(valueOf, stringBuilder3.toString());
        if (this.f13235q.m3195c()) {
            z = true;
        } else if (this.f13235q.m3194b()) {
            z = true;
        } else {
            z = false;
        }
        bli.m863a(f13219c, "issue an openCamcorder request.");
        jri.m13143a(inc.m3876d());
        return kny.m18045a(this.f13223e.mo2667a(inc, this.f13222d, a, b2, kau.f19138a, ilb, djz.f13499a, kbg2, z, false, a4, b4, kau.f19138a), new dhd(this, b3, ilb, b, djz, inc, a, new heo(b, a2, ipz.m4019b(a2)), b2, kbg), kpq.f8410a);
    }
}
