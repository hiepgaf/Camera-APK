package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.List;

/* compiled from: PG */
/* renamed from: dos */
final class dos implements kaw {
    /* renamed from: a */
    private final /* synthetic */ bkw f13653a;
    /* renamed from: b */
    private final /* synthetic */ hjf f13654b;

    dos(bkw bkw, hjf hjf) {
        this.f13653a = bkw;
        this.f13654b = hjf;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        ffc ffc = (ffc) obj;
        kbg a = dor.m1663a(ffc, this.f13653a);
        String valueOf;
        if (a.mo2084b()) {
            String str = dor.f3174a;
            valueOf = String.valueOf(((fhd) a.mo2081a()).name());
            String str2 = "Camera support level override: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m869c(str, valueOf);
            return (fhd) a.mo2081a();
        }
        hjf hjf = this.f13654b;
        ivy ivy = hjf.f6267b;
        if (ivy.f7508d || ivy.f7509e || hjf.m3195c()) {
            return fhd.NEXUS_2015;
        }
        if (!this.f13654b.m3196d()) {
            Integer num = (Integer) ffc.mo1913a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num == null) {
                bli.m866b(dor.f3174a, "Device does not report supported hardware level.");
                return fhd.LIMITED_JPEG;
            } else if (num.intValue() == 2) {
                return fhd.LEGACY_JPEG;
            } else {
                if (num.intValue() == 1) {
                    List b = ffc.mo1920b(35);
                    List a2 = ffc.mo1916a(35);
                    if (b.size() <= 0 || a2.size() <= 0) {
                        return fhd.ZSL;
                    }
                    return fhd.ZSL_REPROCESSING;
                } else if (num.intValue() == 0) {
                    return fhd.LIMITED_JPEG;
                } else {
                    String str3 = dor.f3174a;
                    valueOf = String.valueOf(num);
                    str = Build.DEVICE;
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 36) + String.valueOf(str).length());
                    stringBuilder.append("Unknown device or support level: ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" / ");
                    stringBuilder.append(str);
                    bli.m866b(str3, stringBuilder.toString());
                    return fhd.LIMITED_JPEG;
                }
            }
        } else if (ffc.mo1944z()) {
            return fhd.ZSL;
        } else {
            return fhd.NEXUS_2015;
        }
    }
}
