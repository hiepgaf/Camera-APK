package p000;

import com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession;
import java.util.List;

/* compiled from: PG */
/* renamed from: dpd */
public final class dpd implements doz {
    /* renamed from: a */
    private static final String f13680a = bli.m862a("Port1CameraSelector");
    /* renamed from: b */
    private final doy f13681b;
    /* renamed from: c */
    private final fgw f13682c;
    /* renamed from: d */
    private final bkw f13683d;
    /* renamed from: e */
    private final hjf f13684e;
    /* renamed from: f */
    private final ird f13685f;
    /* renamed from: g */
    private final bmb f13686g;
    /* renamed from: h */
    private final int f13687h;

    public dpd(doy doy, fgw fgw, bkw bkw, hjf hjf, ird ird, bmb bmb, int i) {
        this.f13681b = doy;
        this.f13682c = fgw;
        this.f13683d = bkw;
        this.f13684e = hjf;
        this.f13685f = ird;
        this.f13686g = bmb;
        this.f13687h = i;
    }

    /* renamed from: a */
    private static fyz m9218a(ffc ffc, fxg fxg) {
        try {
            fyy a = fyy.m2423a(ffc, fxg.f4777a, 37);
            String str = f13680a;
            String valueOf = String.valueOf(a.toString());
            String str2 = "Selected picture configuration: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m869c(str, valueOf);
            return new fyz(a);
        } catch (fyx e) {
            throw new IllegalStateException("Unable to access OneCamera.");
        }
    }

    /* renamed from: a */
    private static C0120for m9217a(fhc fhc, ffc ffc) {
        Object a = dpd.m9219a(ffc, 37, 38, 32);
        jri.m13152b(a);
        return new C0120for(dpd.m9215a(fhc), a.f7495b, a.f7494a);
    }

    /* renamed from: a */
    private final dul m9216a() {
        int a = this.f13682c.m2280a("persist.gcam.sm.denom");
        bli.m863a(f13680a, String.format("Smart metering configuration for auto-HDR+ decision:period = %d, max image count = %d", new Object[]{Integer.valueOf(a), Integer.valueOf(2)}));
        return new dul(a);
    }

    /* renamed from: a */
    private static int m9215a(fhc fhc) {
        return (fhc.f4554c + 3) + 2;
    }

    /* renamed from: a */
    private static ive m9219a(ffc ffc, int... iArr) {
        for (int i : iArr) {
            List b = ffc.mo1920b(i);
            if (!b.isEmpty()) {
                return new ive(i, ion.m3940a(b));
            }
        }
        return null;
    }

    /* renamed from: a */
    public final dox mo1166a(kpk kpk, ffc ffc, dof dof, fhc fhc, fxg fxg, CameraDeviceInstrumentationSession cameraDeviceInstrumentationSession) {
        String str;
        String valueOf;
        StringBuilder stringBuilder;
        jri.m13152b((Object) kpk);
        jri.m13152b((Object) ffc);
        jri.m13152b((Object) dof);
        jri.m13152b((Object) fhc);
        jri.m13152b((Object) fxg);
        this.f13685f.mo1903a("OneCameraDependencies#new");
        fxh fxh = new fxh(fxg);
        fjf fjf = new fjf(kny.m18045a(kpk, new dpe(cameraDeviceInstrumentationSession), kpq.f8410a), ffc);
        fhd a = fhc.m2289a(ffc);
        dpl a2 = this.f13681b.mo3387a(fjf, dof, fxh, dpd.m9218a(ffc, fxg));
        this.f13685f.mo1904b();
        if (!this.f13684e.m3195c()) {
            if (this.f13684e.m3196d()) {
            }
            if ((this.f13684e.m3195c() || this.f13684e.m3196d()) && ffc.mo1921c() == iut.FRONT && this.f13683d.m853e()) {
                bli.m869c(f13680a, "Selected Pixel Portrait Zsl Hdr No PD OneCamera configuration.");
                return new dpo(a2, dpd.m9217a(fhc, ffc), m9216a());
            }
            str = f13680a;
            valueOf = String.valueOf(a);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
            stringBuilder.append("No camera configuration was available! ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
            throw new UnsupportedOperationException("Unknown capture support level");
        }
        if (this.f13683d.m853e() && a.equals(fhd.NEXUS_2015) && ffc.mo1921c() == iut.BACK) {
            bli.m869c(f13680a, "Selected Pixel Portrait Zsl Hdr PD OneCamera configuration.");
            C0120for a3 = dpd.m9217a(fhc, ffc);
            Object a4 = dpd.m9219a(ffc, this.f13687h);
            jri.m13152b(a4);
            return new dpp(a2, a3, new fok(dpd.m9215a(fhc), a4.f7495b), m9216a());
        }
        if (this.f13684e.m3195c()) {
            str = f13680a;
            valueOf = String.valueOf(a);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
            stringBuilder.append("No camera configuration was available! ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
            throw new UnsupportedOperationException("Unknown capture support level");
        }
        str = f13680a;
        valueOf = String.valueOf(a);
        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
        stringBuilder.append("No camera configuration was available! ");
        stringBuilder.append(valueOf);
        bli.m866b(str, stringBuilder.toString());
        throw new UnsupportedOperationException("Unknown capture support level");
    }
}
