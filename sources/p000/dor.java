package p000;

import android.hardware.camera2.CameraCharacteristics;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: dor */
public final class dor {
    /* renamed from: a */
    public static final String f3174a = bli.m862a("OneCamFtrCnfgCrtr");

    /* renamed from: a */
    static kbg m1663a(ffc ffc, bkw bkw) {
        Integer num = (Integer) ffc.mo1913a(CameraCharacteristics.LENS_FACING);
        if (num == null) {
            bli.m866b(f3174a, "Camera not facing anywhere.");
            return kau.f19138a;
        }
        switch (num.intValue()) {
            case 0:
                return fhd.m2290a(ije.m3772a(bkw.f1255a, "camera:capture_support_level_override_front", -1));
            case 1:
                return fhd.m2290a(ije.m3772a(bkw.f1255a, "camera:capture_support_level_override_back", -1));
            default:
                bli.m866b(f3174a, "Not sure where camera is facing to.");
                return kau.f19138a;
        }
    }

    /* renamed from: a */
    public static fhc m1662a(bkw bkw, bmp bmp, hjf hjf, ird ird) {
        Throwable e;
        ird.mo1903a("OneFeatureConfig#provide");
        try {
            if (((Boolean) bmp.m890a().get()).booleanValue()) {
                int i;
                ird.mo1903a("HdrPlus#getSupportLevel");
                if (bkw.m853e()) {
                    i = go.aw;
                } else {
                    i = go.av;
                }
                ird.mo1905b("CaptureModuleDetector#new");
                kaw dos = new dos(bkw, hjf);
                ird.mo1905b("OneFeatureConfig#new");
                int c = bkw.m851c();
                bkw.m852d();
                fhc fhc = new fhc(dos, i, c, bkw.m850b());
                ird.mo1904b();
                ird.mo1904b();
                return fhc;
            }
            throw new IllegalStateException("No Cameras are currently available.");
        } catch (InterruptedException e2) {
            e = e2;
            throw new IllegalStateException("No Cameras are currently available.", e);
        } catch (ExecutionException e3) {
            e = e3;
            throw new IllegalStateException("No Cameras are currently available.", e);
        }
    }

    /* renamed from: a */
    public static fgw m1661a() {
        return fgw.m2279f();
    }
}
