package p000;

/* compiled from: PG */
/* renamed from: dhu */
public final class dhu implements dhs {
    /* renamed from: c */
    private static final String f13313c = bli.m862a("CdrFastDevOp");
    /* renamed from: a */
    public final asu f13314a;
    /* renamed from: b */
    public final dim f13315b;
    /* renamed from: d */
    private final hjf f13316d;
    /* renamed from: e */
    private final ipv f13317e;
    /* renamed from: f */
    private final bfk f13318f;
    /* renamed from: g */
    private final dzh f13319g;
    /* renamed from: h */
    private final hjw f13320h;
    /* renamed from: i */
    private final ilp f13321i;
    /* renamed from: j */
    private final fbn f13322j;
    /* renamed from: k */
    private final gci f13323k;
    /* renamed from: l */
    private final djq f13324l;
    /* renamed from: m */
    private final dkb f13325m;
    /* renamed from: n */
    private final heq f13326n;
    /* renamed from: o */
    private final ilp f13327o;
    /* renamed from: p */
    private final ipz f13328p = ipz.f7304b;
    /* renamed from: q */
    private final bsn f13329q;
    /* renamed from: r */
    private final how f13330r;

    public dhu(hjf hjf, bfk bfk, dzh dzh, hjw hjw, div div, fbn fbn, gci gci, djq djq, dkb dkb, heq heq, asu asu, dim dim, how how, ilp ilp, ipv ipv, bsn bsn) {
        this.f13316d = hjf;
        this.f13317e = ipv;
        this.f13318f = bfk;
        this.f13319g = dzh;
        this.f13320h = hjw;
        this.f13321i = div;
        this.f13322j = fbn;
        this.f13323k = gci;
        this.f13324l = djq;
        this.f13325m = dkb;
        this.f13326n = heq;
        this.f13327o = ilp;
        this.f13315b = dim;
        this.f13314a = asu;
        this.f13329q = bsn;
        this.f13330r = how;
    }

    /* renamed from: a */
    public final kpk mo1145a() {
        bli.m863a(f13313c, "openCamcorderDevice");
        iut b = this.f13319g.m1696b();
        iur a = bmt.m894a(this.f13322j, this.f13316d, b);
        if (a == null) {
            String valueOf = String.valueOf(b);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
            stringBuilder.append("Fail to find camera for facing ");
            stringBuilder.append(valueOf);
            return kow.m13618a(new IllegalStateException(stringBuilder.toString()));
        }
        this.f13330r.mo1756b(bmt.m892a(this.f13322j.mo1343a(a)));
        kbg b2 = this.f13318f.mo2670b(a);
        if (!b2.mo2084b()) {
            return kow.m13618a(new IllegalStateException("CamcorderCharacteristics is not available."));
        }
        String str;
        bez bez = (bez) b2.mo2081a();
        ffc ffc = bez.f1113a;
        inc inc = (inc) this.f13321i.mo2860b();
        ine a2 = this.f13325m.m1640a(b, bez, inc, false);
        String str2 = f13313c;
        String valueOf2 = String.valueOf(a2);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
        stringBuilder2.append("Video Resolution: ");
        stringBuilder2.append(valueOf2);
        bli.m869c(str2, stringBuilder2.toString());
        if (!bez.m805a(inc, a2)) {
            str = f13313c;
            valueOf = String.valueOf(inc);
            str2 = String.valueOf(a2);
            stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + 41) + String.valueOf(str2).length());
            stringBuilder2.append("Fallback to 30 FPS. [");
            stringBuilder2.append(valueOf);
            stringBuilder2.append(",");
            stringBuilder2.append(str2);
            stringBuilder2.append("] is not supported.");
            bli.m869c(str, stringBuilder2.toString());
            inc = inc.FPS_30;
        }
        str = f13313c;
        str2 = String.valueOf(inc);
        StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(str2).length() + 14);
        stringBuilder3.append("Capture Rate: ");
        stringBuilder3.append(str2);
        bli.m869c(str, stringBuilder3.toString());
        iqp a3 = new heh(ffc, this.f13326n).m3094a(this.f13328p, inc, a2);
        str = f13313c;
        str2 = String.valueOf(a3);
        stringBuilder3 = new StringBuilder(String.valueOf(str2).length() + 14);
        stringBuilder3.append("Preview Size: ");
        stringBuilder3.append(str2);
        bli.m869c(str, stringBuilder3.toString());
        kbg kbg = kau.f19138a;
        if (inc.m3875c()) {
            kbg = dkt.m1652a(inc, a2, ffc.mo1920b(256));
            if (kbg.mo2084b()) {
                str = f13313c;
                str2 = String.valueOf(kbg.mo2081a());
                stringBuilder3 = new StringBuilder(String.valueOf(str2).length() + 15);
                stringBuilder3.append("Snapshot Size: ");
                stringBuilder3.append(str2);
                bli.m869c(str, stringBuilder3.toString());
            }
        }
        djz djz = new djz(b, ffc, this.f13323k);
        boolean a4 = this.f13325m.m1642a(inc, a2, this.f13324l.f13496a);
        String str3 = f13313c;
        StringBuilder stringBuilder4 = new StringBuilder(20);
        stringBuilder4.append("Torch Enabled: ");
        stringBuilder4.append(a4);
        bli.m869c(str3, stringBuilder4.toString());
        ilp ilb = new ilb(Boolean.valueOf(a4));
        kbg kbg2 = kau.f19138a;
        if (this.f13325m.m1646c()) {
            kbg2 = kbg.m4745c(this.f13320h);
        }
        str = f13313c;
        StringBuilder stringBuilder5 = new StringBuilder(20);
        stringBuilder5.append("H.265 enabled: ");
        stringBuilder5.append(false);
        bli.m869c(str, stringBuilder5.toString());
        int a5 = this.f13325m.m1639a(inc, a2);
        str = f13313c;
        stringBuilder5 = new StringBuilder(45);
        stringBuilder5.append("Max Recording Duration (Seconds): ");
        stringBuilder5.append(a5);
        bli.m869c(str, stringBuilder5.toString());
        int b3 = this.f13325m.m1643b(inc, a2);
        str = f13313c;
        stringBuilder5 = new StringBuilder(51);
        stringBuilder5.append("Max Torch Recording Duration (Seconds): ");
        stringBuilder5.append(b3);
        bli.m869c(str, stringBuilder5.toString());
        boolean z = inc.m3876d() ? !this.f13316d.m3195c() ? this.f13316d.m3194b() : true : true;
        bli.m863a(f13313c, "issue an openCamcorder request.");
        jri.m13143a(inc.m3875c());
        bsn bsn = this.f13325m.f3114a;
        kpk a6 = kny.m18045a(this.f13318f.mo2667a(inc, this.f13317e, a2, a, kau.f19138a, ilb, djz.f13499a, kbg2, z, false, a5, b3, kau.f19138a), new dhv(this, b2, ilb, b, djz, inc, a2, new heo(b, a3, ipz.m4019b(a3)), a, kbg), kpq.f8410a);
        kow.m13622a(a6, new dhw(djz), kpq.f8410a);
        return a6;
    }
}
