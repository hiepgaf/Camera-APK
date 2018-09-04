package p000;

import android.annotation.TargetApi;
import android.graphics.Rect;
import com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession;
import java.util.List;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: dpa */
public final class dpa implements doz {
    /* renamed from: a */
    private static final String f13662a = bli.m862a("OneCameraSelector");
    /* renamed from: b */
    private final doy f13663b;
    /* renamed from: c */
    private final fgw f13664c;
    /* renamed from: d */
    private final bkw f13665d;
    /* renamed from: e */
    private final hjf f13666e;
    /* renamed from: f */
    private final bmh f13667f;
    /* renamed from: g */
    private final ird f13668g;
    /* renamed from: h */
    private final bmb f13669h;
    /* renamed from: i */
    private final ilp f13670i;

    public dpa(doy doy, fgw fgw, bkw bkw, hjf hjf, bmh bmh, ird ird, bmb bmb, ilp ilp) {
        this.f13663b = doy;
        this.f13664c = fgw;
        this.f13665d = bkw;
        this.f13666e = hjf;
        this.f13667f = bmh;
        this.f13668g = ird;
        this.f13669h = bmb;
        this.f13670i = ilp;
    }

    /* renamed from: a */
    private static fyz m9209a(fhd fhd, ffc ffc, fxg fxg) {
        try {
            fyy a;
            String str;
            switch (fhd.ordinal()) {
                case 0:
                    a = fyy.m2423a(ffc, fxg.f4777a, 35);
                    break;
                case 1:
                case 2:
                    a = fyy.m2423a(ffc, fxg.f4777a, 256);
                    break;
                case 3:
                case 4:
                    Object str2;
                    iqp iqp = fxg.f4777a;
                    List a2 = ffc.mo1916a(35);
                    boolean isEmpty = a2.isEmpty() ^ 1;
                    String valueOf = String.valueOf(ion.m3961b(35));
                    str = "No reprocessing input sizes supported for ImageFormat: ";
                    if (valueOf.length() == 0) {
                        str2 = new String(str);
                    } else {
                        str2 = str.concat(valueOf);
                    }
                    jri.m13154b(isEmpty, str2);
                    jri.m13154b(r0.contains(iqp), String.format("TargetSize (%s) is not supported for ImageFormat (%s).  SupportedSizes = %s", new Object[]{iqp.toString(), ion.m3961b(256), ffc.mo1920b(256)}));
                    ive ive = new ive(35, ion.m3940a(a2));
                    a = new fyy(ive, ive, kbg.m4745c(new ive(256, iqp)), iqp, new Rect(0, 0, iqp.f7329a, iqp.f7330b));
                    break;
                default:
                    throw new UnsupportedOperationException("Unknown capture support level");
            }
            String str3 = f13662a;
            String valueOf2 = String.valueOf(a.toString());
            str = "Selected picture configuration: ";
            if (valueOf2.length() == 0) {
                valueOf2 = new String(str);
            } else {
                valueOf2 = str.concat(valueOf2);
            }
            bli.m869c(str3, valueOf2);
            return new fyz(a);
        } catch (fyx e) {
            throw new IllegalStateException("Unable to access OneCamera.");
        }
    }

    /* renamed from: a */
    private static C0120for m9208a(fhc fhc, ffc ffc) {
        Object a = dpa.m9210a(ffc, 37, 38, 32);
        jri.m13152b(a);
        return new C0120for((fhc.f4554c + 3) + 2, a.f7495b, a.f7494a);
    }

    /* renamed from: a */
    private final dul m9207a() {
        int a = this.f13664c.m2280a("persist.gcam.sm.denom");
        bli.m863a(f13662a, String.format(null, "Smart metering configuration for auto-HDR+ decision:period = %d, max image count = %d", new Object[]{Integer.valueOf(a), Integer.valueOf(2)}));
        return new dul(a);
    }

    /* renamed from: a */
    private static ive m9210a(ffc ffc, int... iArr) {
        for (int i : iArr) {
            List b = ffc.mo1920b(i);
            if (!b.isEmpty()) {
                return new ive(i, ion.m3940a(b));
            }
        }
        return null;
    }

    /* renamed from: b */
    private final boolean m9211b() {
        return this.f13670i.mo2860b() == hhx.IMAGE_INTENT ? false : false;
    }

    /* renamed from: a */
    public final dox mo1166a(kpk kpk, ffc ffc, dof dof, fhc fhc, fxg fxg, CameraDeviceInstrumentationSession cameraDeviceInstrumentationSession) {
        hjf hjf;
        ivy ivy;
        String str;
        String valueOf;
        StringBuilder stringBuilder;
        jri.m13152b((Object) kpk);
        jri.m13152b((Object) ffc);
        jri.m13152b((Object) dof);
        jri.m13152b((Object) fhc);
        jri.m13152b((Object) fxg);
        this.f13668g.mo1903a("OneCameraDependencies#new");
        fxh fxh = new fxh(fxg);
        fjf fjf = new fjf(kny.m18045a(kpk, new dpb(cameraDeviceInstrumentationSession), kpq.f8410a), ffc);
        fhd a = fhc.m2289a(ffc);
        dpl a2 = this.f13663b.mo3387a(fjf, dof, fxh, dpa.m9209a(a, ffc, fxg));
        fof fof = new fof(fhc.f4553b);
        fnk fnk = new fnk(fhc.f4553b);
        fpn fpn = new fpn(new ixf());
        fnu fnu = new fnu();
        this.f13668g.mo1904b();
        fgw.m2277d();
        fgw.m2278e();
        ivy ivy2 = this.f13666e.f6267b;
        if (!ivy2.f7509e) {
            if (ivy2.f7508d) {
            }
            hjf = this.f13666e;
            ivy = hjf.f6267b;
            if (!(ivy.f7509e || ivy.f7508d || hjf.m3195c())) {
                if (this.f13666e.m3196d()) {
                }
                ivy2 = this.f13666e.f6267b;
                if (!ivy2.f7509e) {
                    if (ivy2.f7508d) {
                    }
                    if (this.f13666e.m3195c() && ffc.mo1941w()) {
                        m9211b();
                    }
                    if (this.f13666e.m3195c()) {
                        if (ffc.mo1941w()) {
                            m9211b();
                        }
                        if (this.f13665d.m853e() && a.equals(fhd.NEXUS_2015)) {
                            bli.m869c(f13662a, "Selected Pixel 2017 Zsl Hdr+ OneCamera configuration.");
                            return new dpn(a2, fof, dpa.m9208a(fhc, ffc), fpn, fnu, m9207a());
                        }
                    }
                    switch (a.ordinal()) {
                        case 0:
                            bli.m869c(f13662a, "Selected zslYuvSoftwareJpeg OneCamera configuration.");
                            return new dpt(a2, fof);
                        case 1:
                            bli.m869c(f13662a, "Selected legacyJpeg OneCamera configuration.");
                            return new dpq(a2, fof);
                        case 2:
                            bli.m869c(f13662a, "Selected limitedJpeg OneCamera configuration.");
                            return new dpr(a2, fof);
                        case 3:
                        case 4:
                            bli.m869c(f13662a, "Selected zslYuvReprocessing OneCamera configuration.");
                            return new dps(a2, fof, fpn, fnu);
                        default:
                            str = f13662a;
                            valueOf = String.valueOf(a);
                            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
                            stringBuilder.append("No camera configuration was available! ");
                            stringBuilder.append(valueOf);
                            bli.m866b(str, stringBuilder.toString());
                            throw new UnsupportedOperationException("Unknown capture support level");
                    }
                }
                if (this.f13665d.m853e() && a.equals(fhd.NEXUS_2015)) {
                    bli.m869c(f13662a, "Selected Pixel 2016 Zsl Hdr OneCamera configuration.");
                    return new dpm(a2, fof, dpa.m9208a(fhc, ffc), fpn, fnu, m9207a());
                }
                m9211b();
                if (this.f13666e.m3195c()) {
                    if (ffc.mo1941w()) {
                        m9211b();
                    }
                    bli.m869c(f13662a, "Selected Pixel 2017 Zsl Hdr+ OneCamera configuration.");
                    return new dpn(a2, fof, dpa.m9208a(fhc, ffc), fpn, fnu, m9207a());
                }
                switch (a.ordinal()) {
                    case 0:
                        bli.m869c(f13662a, "Selected zslYuvSoftwareJpeg OneCamera configuration.");
                        return new dpt(a2, fof);
                    case 1:
                        bli.m869c(f13662a, "Selected legacyJpeg OneCamera configuration.");
                        return new dpq(a2, fof);
                    case 2:
                        bli.m869c(f13662a, "Selected limitedJpeg OneCamera configuration.");
                        return new dpr(a2, fof);
                    case 3:
                    case 4:
                        bli.m869c(f13662a, "Selected zslYuvReprocessing OneCamera configuration.");
                        return new dps(a2, fof, fpn, fnu);
                    default:
                        str = f13662a;
                        valueOf = String.valueOf(a);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
                        stringBuilder.append("No camera configuration was available! ");
                        stringBuilder.append(valueOf);
                        bli.m866b(str, stringBuilder.toString());
                        throw new UnsupportedOperationException("Unknown capture support level");
                }
            }
            if (this.f13664c.m2282a("persist.camera.cam_component", "experimental_features")) {
                this.f13667f.m888a("EXPERIMENTAL CONFIG: Experimental Features (Pixel)", 1);
                bli.m869c(f13662a, "Selected pixelExperimentalFeatures OneCamera configuration.");
                return new dpg(a2, fof, dpa.m9208a(fhc, ffc), fpn, fnu, m9207a());
            }
            ivy2 = this.f13666e.f6267b;
            if (ivy2.f7509e) {
                if (ivy2.f7508d) {
                }
                m9211b();
                if (this.f13666e.m3195c()) {
                    if (ffc.mo1941w()) {
                        m9211b();
                    }
                    bli.m869c(f13662a, "Selected Pixel 2017 Zsl Hdr+ OneCamera configuration.");
                    return new dpn(a2, fof, dpa.m9208a(fhc, ffc), fpn, fnu, m9207a());
                }
                switch (a.ordinal()) {
                    case 0:
                        bli.m869c(f13662a, "Selected zslYuvSoftwareJpeg OneCamera configuration.");
                        return new dpt(a2, fof);
                    case 1:
                        bli.m869c(f13662a, "Selected legacyJpeg OneCamera configuration.");
                        return new dpq(a2, fof);
                    case 2:
                        bli.m869c(f13662a, "Selected limitedJpeg OneCamera configuration.");
                        return new dpr(a2, fof);
                    case 3:
                    case 4:
                        bli.m869c(f13662a, "Selected zslYuvReprocessing OneCamera configuration.");
                        return new dps(a2, fof, fpn, fnu);
                    default:
                        str = f13662a;
                        valueOf = String.valueOf(a);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
                        stringBuilder.append("No camera configuration was available! ");
                        stringBuilder.append(valueOf);
                        bli.m866b(str, stringBuilder.toString());
                        throw new UnsupportedOperationException("Unknown capture support level");
                }
            }
            bli.m869c(f13662a, "Selected Pixel 2016 Zsl Hdr OneCamera configuration.");
            return new dpm(a2, fof, dpa.m9208a(fhc, ffc), fpn, fnu, m9207a());
        }
        if (this.f13664c.m2282a("persist.camera.cam_component", "nexus2016_tuning")) {
            this.f13667f.m888a("EXPERIMENTAL CONFIG: Pixel2016 Tuning", 1);
            bli.m869c(f13662a, "Selected nexus2016Tuning OneCamera configuration.");
            Object a3 = dpa.m9210a(ffc, 37, 38, 32);
            jri.m13152b(a3);
            return new dph(a2, fof, new C0120for(fhc.f4553b, a3.f7495b, a3.f7494a), fpn, fnu, m9207a());
        }
        hjf = this.f13666e;
        ivy = hjf.f6267b;
        if (this.f13666e.m3196d()) {
            if (this.f13664c.m2282a("persist.camera.cam_component", "experimental_features")) {
                this.f13667f.m888a("EXPERIMENTAL CONFIG: Experimental Features (Pixel)", 1);
                bli.m869c(f13662a, "Selected pixelExperimentalFeatures OneCamera configuration.");
                return new dpg(a2, fof, dpa.m9208a(fhc, ffc), fpn, fnu, m9207a());
            }
        }
        ivy2 = this.f13666e.f6267b;
        if (ivy2.f7509e) {
            if (ivy2.f7508d) {
            }
            m9211b();
            if (this.f13666e.m3195c()) {
                if (ffc.mo1941w()) {
                    m9211b();
                }
                bli.m869c(f13662a, "Selected Pixel 2017 Zsl Hdr+ OneCamera configuration.");
                return new dpn(a2, fof, dpa.m9208a(fhc, ffc), fpn, fnu, m9207a());
            }
            switch (a.ordinal()) {
                case 0:
                    bli.m869c(f13662a, "Selected zslYuvSoftwareJpeg OneCamera configuration.");
                    return new dpt(a2, fof);
                case 1:
                    bli.m869c(f13662a, "Selected legacyJpeg OneCamera configuration.");
                    return new dpq(a2, fof);
                case 2:
                    bli.m869c(f13662a, "Selected limitedJpeg OneCamera configuration.");
                    return new dpr(a2, fof);
                case 3:
                case 4:
                    bli.m869c(f13662a, "Selected zslYuvReprocessing OneCamera configuration.");
                    return new dps(a2, fof, fpn, fnu);
                default:
                    str = f13662a;
                    valueOf = String.valueOf(a);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
                    stringBuilder.append("No camera configuration was available! ");
                    stringBuilder.append(valueOf);
                    bli.m866b(str, stringBuilder.toString());
                    throw new UnsupportedOperationException("Unknown capture support level");
            }
        }
        bli.m869c(f13662a, "Selected Pixel 2016 Zsl Hdr OneCamera configuration.");
        return new dpm(a2, fof, dpa.m9208a(fhc, ffc), fpn, fnu, m9207a());
    }
}
