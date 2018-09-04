package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: dkb */
public final class dkb {
    /* renamed from: b */
    private static final String f3113b = bli.m862a("CdrVideoSettings");
    /* renamed from: a */
    public final bsn f3114a;
    /* renamed from: c */
    private final bkw f3115c;
    /* renamed from: d */
    private final gos f3116d;
    /* renamed from: e */
    private final hjf f3117e;

    public dkb(bsn bsn, bkw bkw, gos gos, hjf hjf) {
        this.f3114a = bsn;
        this.f3115c = bkw;
        this.f3116d = gos;
        this.f3117e = hjf;
    }

    /* renamed from: a */
    public final boolean m1641a() {
        return this.f3116d.mo1535a("default_scope", "pref_camera_grid_lines");
    }

    /* renamed from: a */
    public final int m1639a(inc inc, ine ine) {
        if (inc.m3875c()) {
            if (ine == ine.RES_2160P) {
                return ije.m3772a(this.f3115c.f1255a, "camera:max_2160p_video_duration_seconds", 0);
            }
            if (ine == ine.RES_1080P) {
                return ije.m3772a(this.f3115c.f1255a, "camera:max_1080p_video_duration_seconds", 0);
            }
        }
        if (inc.m3876d()) {
            return ije.m3772a(this.f3115c.f1255a, "camera:max_hfr_video_duration_seconds", 0);
        }
        return 0;
    }

    /* renamed from: b */
    public final int m1643b(inc inc, ine ine) {
        if (inc.m3875c()) {
            if (ine == ine.RES_2160P) {
                return ije.m3772a(this.f3115c.f1255a, "camera:max_2160p_torch_video_duration_seconds", 0);
            }
            if (ine == ine.RES_1080P) {
                return ije.m3772a(this.f3115c.f1255a, "camera:max_1080p_torch_video_duration_seconds", 0);
            }
        }
        if (inc.m3876d()) {
            return ije.m3772a(this.f3115c.f1255a, "camera:max_hfr_torch_video_duration_seconds", 0);
        }
        return 0;
    }

    /* renamed from: a */
    public final ine m1640a(iut iut, bez bez, inc inc, boolean z) {
        if (inc.m3875c()) {
            bst bst;
            if (iut == iut.FRONT) {
                bst = bin.f1192d;
            } else {
                bst = bin.f1193e;
            }
            kbg a = this.f3114a.m952a(bst);
            String str;
            String d;
            if (a == null || !a.mo2084b()) {
                Object obj;
                if (iut == iut.FRONT) {
                    str = "pref_video_quality_front_key";
                } else {
                    str = "pref_video_quality_back_key";
                }
                d = this.f3116d.mo1543d("default_scope", str);
                List arrayList = new ArrayList(bez.m803a(inc.FPS_30));
                eap eap = new eap();
                if (!arrayList.isEmpty()) {
                    eap.f3466a = (ine) arrayList.get(0);
                    arrayList.remove(0);
                }
                if (!arrayList.isEmpty()) {
                    eap.f3467b = (ine) arrayList.get(0);
                    arrayList.remove(0);
                }
                if (!arrayList.isEmpty()) {
                    eap.f3468c = (ine) arrayList.get(0);
                    arrayList.remove(0);
                }
                String str2 = f3113b;
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 24) + String.valueOf(d).length());
                stringBuilder.append("video quality setting: ");
                stringBuilder.append(str);
                stringBuilder.append("=");
                stringBuilder.append(d);
                bli.m863a(str2, stringBuilder.toString());
                if ("small".equals(d)) {
                    str2 = d;
                } else if ("medium".equals(d)) {
                    str2 = d;
                } else {
                    obj = "large";
                }
                if ("large".equals(obj)) {
                    return eap.f3466a;
                }
                if ("medium".equals(obj)) {
                    return eap.f3467b;
                }
                return eap.f3468c;
            }
            switch (((Integer) a.mo2081a()).intValue()) {
                case 144:
                    return ine.RES_QCIF;
                case 240:
                    return ine.RES_QVGA;
                case 288:
                    return ine.RES_CIF;
                case 480:
                    return ine.RES_480P;
                case 720:
                    return ine.RES_720P;
                case 1080:
                    return ine.RES_1080P;
                case 2160:
                    return ine.RES_2160P;
                default:
                    d = String.valueOf(a.mo2081a());
                    str = String.valueOf(bst);
                    StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(d).length() + 35) + String.valueOf(str).length());
                    stringBuilder2.append("Value ");
                    stringBuilder2.append(d);
                    stringBuilder2.append(" for ADB flag ");
                    stringBuilder2.append(str);
                    stringBuilder2.append(" not supported.");
                    throw new IllegalArgumentException(stringBuilder2.toString());
            }
        }
        List a2 = bez.m803a(inc);
        jri.m13153b(a2.isEmpty() ^ 1);
        if (z) {
            return (ine) a2.get(a2.size() - 1);
        }
        return (ine) a2.get(0);
    }

    /* renamed from: a */
    public final boolean m1642a(inc inc, ine ine, boolean z) {
        if (m1645b(inc, ine, z) && this.f3116d.mo1537b("default_scope", "pref_camera_video_flashmode_key") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m1645b(inc inc, ine ine, boolean z) {
        bkw bkw;
        if (inc.m3875c()) {
            if (ine == ine.RES_2160P) {
                bkw = this.f3115c;
                if (!bkw.m849a(bkw.f1255a, "camera:torch_2160p_video_enabled", true)) {
                    return false;
                }
            }
            if (ine == ine.RES_1080P) {
                bkw = this.f3115c;
                if (!bkw.m849a(bkw.f1255a, "camera:torch_1080p_video_enabled", true)) {
                    return false;
                }
            }
        }
        if (!inc.m3876d()) {
            return z;
        }
        bkw = this.f3115c;
        if (bkw.m849a(bkw.f1255a, "camera:torch_hfr_video_enabled", true)) {
            return z;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m1644b() {
        return this.f3116d.mo1535a("default_scope", "pref_video_stabilization_key");
    }

    /* renamed from: c */
    public final boolean m1646c() {
        return this.f3116d.mo1535a("default_scope", "pref_camera_recordlocation_key");
    }

    /* renamed from: d */
    public final boolean m1647d() {
        return this.f3117e.m3195c() || this.f3117e.m3196d();
    }
}
