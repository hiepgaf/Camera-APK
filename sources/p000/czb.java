package p000;

/* compiled from: PG */
/* renamed from: czb */
public final class czb {
    /* renamed from: a */
    private final cvv f2848a;
    /* renamed from: b */
    private final iqz f2849b;

    czb(cvv cvv, ira ira) {
        this.f2848a = cvv;
        this.f2849b = ira.mo511a("CptModuleCfgBldr");
    }

    /* renamed from: a */
    public final cwc m1553a(iur iur) {
        cvv cvv = this.f2848a;
        jri.m13152b((Object) iur);
        cvv.f2808a.mo1903a("OneConfig#create");
        cvv.f2808a.mo1903a("OneConfig#oneCharacteristics");
        ffc b = cvv.f2809b.m10176b(iur);
        iut c = b.mo1921c();
        cvv.f2808a.mo1905b("OneConfig#pictureSize");
        iqp a = cvv.f2810c.m1724a(iur, c);
        cvv.f2808a.mo1905b("OneConfig#selectViewfinder");
        iqp a2 = cvv.f2811d.m3099a(b.mo1935q(), a, c);
        heo heo = new heo(c, a2, ipz.m4019b(a2));
        cvv.f2808a.mo1904b();
        cwc cwc = new cwc(iur, c, ipz.m4019b(a), a, heo);
        cvv.f2808a.mo1904b();
        iqz iqz = this.f2849b;
        String valueOf = String.valueOf(iur);
        String valueOf2 = String.valueOf(cwc);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(valueOf2).length());
        stringBuilder.append("Selected configuration for camera (");
        stringBuilder.append(valueOf);
        stringBuilder.append("): ");
        stringBuilder.append(valueOf2);
        iqz.mo518d(stringBuilder.toString());
        return cwc;
    }
}
