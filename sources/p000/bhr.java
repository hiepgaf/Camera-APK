package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Range;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bhr */
public final class bhr {
    /* renamed from: a */
    public static final String f1159a = bli.m862a("CdrCamReqBdrFty");
    /* renamed from: b */
    public final bgt f1160b;
    /* renamed from: c */
    public final ilp f1161c;
    /* renamed from: d */
    public final imw f1162d;
    /* renamed from: e */
    private final ilp f1163e;
    /* renamed from: f */
    private final ilp f1164f;
    /* renamed from: g */
    private final ilp f1165g;
    /* renamed from: h */
    private final ilp f1166h;
    /* renamed from: i */
    private final ilp f1167i;
    /* renamed from: j */
    private final ilp f1168j;
    /* renamed from: k */
    private final ilp f1169k;

    public bhr(bgt bgt, ilp ilp, ilp ilp2, ilp ilp3, ilp ilp4, ilp ilp5, ilp ilp6, ilp ilp7, ilp ilp8, imw imw) {
        this.f1160b = bgt;
        this.f1163e = ilp;
        this.f1164f = ilp2;
        this.f1165g = ilp3;
        this.f1166h = ilp4;
        this.f1161c = ilp5;
        this.f1167i = ilp6;
        this.f1168j = ilp7;
        this.f1169k = ilp8;
        this.f1162d = imw;
    }

    /* renamed from: a */
    public final void m821a(iwn iwn) {
        int i;
        int i2 = 1;
        if (this.f1162d.mo1886c()) {
            i = 2;
        } else {
            i = 1;
        }
        String str = f1159a;
        StringBuilder stringBuilder = new StringBuilder(24);
        stringBuilder.append("CONTROL_MODE=");
        stringBuilder.append(i);
        bli.m871d(str, stringBuilder.toString());
        iwn.m4292a(CaptureRequest.CONTROL_MODE, Integer.valueOf(i));
        boolean c = this.f1162d.mo1886c();
        String str2 = f1159a;
        StringBuilder stringBuilder2 = new StringBuilder(30);
        stringBuilder2.append("CONTROL_SCENE_MODE=");
        stringBuilder2.append(i);
        bli.m871d(str2, stringBuilder2.toString());
        iwn.m4292a(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(c));
        iwn.m4292a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
        String str3 = f1159a;
        str = String.valueOf(this.f1166h.mo2860b());
        stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 16);
        stringBuilder2.append("CONTROL_AE_LOCK=");
        stringBuilder2.append(str);
        bli.m871d(str3, stringBuilder2.toString());
        iwn.m4292a(CaptureRequest.CONTROL_AE_LOCK, (Boolean) this.f1166h.mo2860b());
        str = f1159a;
        str3 = String.valueOf(((MeteringRectangle[]) this.f1163e.mo2860b())[0]);
        stringBuilder2 = new StringBuilder(String.valueOf(str3).length() + 19);
        stringBuilder2.append("CONTROL_AE_REGIONS=");
        stringBuilder2.append(str3);
        bli.m871d(str, stringBuilder2.toString());
        iwn.m4292a(CaptureRequest.CONTROL_AE_REGIONS, (MeteringRectangle[]) this.f1163e.mo2860b());
        str3 = f1159a;
        str = String.valueOf(this.f1165g.mo2860b());
        stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 33);
        stringBuilder2.append("CONTROL_AE_EXPOSURE_COMPENSATION=");
        stringBuilder2.append(str);
        bli.m871d(str3, stringBuilder2.toString());
        iwn.m4292a(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, (Integer) this.f1165g.mo2860b());
        str = f1159a;
        str3 = String.valueOf(((MeteringRectangle[]) this.f1164f.mo2860b())[0]);
        stringBuilder2 = new StringBuilder(String.valueOf(str3).length() + 19);
        stringBuilder2.append("CONTROL_AF_REGIONS=");
        stringBuilder2.append(str3);
        bli.m871d(str, stringBuilder2.toString());
        iwn.m4292a(CaptureRequest.CONTROL_AF_REGIONS, (MeteringRectangle[]) this.f1164f.mo2860b());
        iwn.m4292a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(0));
        iwn.m4292a(CaptureRequest.CONTROL_AWB_MODE, (Integer) this.f1167i.mo2860b());
        fzd fzd = (fzd) this.f1169k.mo2860b();
        iwn.m4292a(CaptureRequest.SCALER_CROP_REGION, fzd.f4837a);
        iwn.m4292a(CaptureRequest.LENS_FOCAL_LENGTH, Float.valueOf(fzd.f4838b));
        iwn.m4292a(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(this.f1162d.mo1886c()));
        if (((Boolean) this.f1168j.mo2860b()).booleanValue()) {
            i = 2;
        } else {
            i = 0;
        }
        String str4 = f1159a;
        StringBuilder stringBuilder3 = new StringBuilder(22);
        stringBuilder3.append("FLASH_MODE=");
        stringBuilder3.append(i);
        bli.m871d(str4, stringBuilder3.toString());
        iwn.m4292a(CaptureRequest.FLASH_MODE, Integer.valueOf(i));
        boolean e = this.f1162d.mo1888e();
        str4 = f1159a;
        stringBuilder3 = new StringBuilder(44);
        stringBuilder3.append("CONTROL_VIDEO_STABILIZATION_MODE=");
        stringBuilder3.append(e);
        bli.m871d(str4, stringBuilder3.toString());
        iwn.m4292a(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(e));
        e = this.f1162d.mo1890g();
        str4 = f1159a;
        stringBuilder3 = new StringBuilder(43);
        stringBuilder3.append("LENS_OPTICAL_STABILIZATION_MODE=");
        stringBuilder3.append(e);
        bli.m871d(str4, stringBuilder3.toString());
        iwn.m4292a(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(e));
        if (this.f1162d.mo1889f()) {
            i2 = 2;
        }
        str3 = f1159a;
        StringBuilder stringBuilder4 = new StringBuilder(32);
        stringBuilder4.append("NOISE_REDUCTION_MODE=");
        stringBuilder4.append(i2);
        bli.m871d(str3, stringBuilder4.toString());
        iwn.m4292a(CaptureRequest.NOISE_REDUCTION_MODE, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public final iwn m820a(bhj bhj) {
        int i;
        iwn a = bhj.m7380a(3);
        m821a(a);
        Range a2 = this.f1160b.mo436a();
        a.m4292a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, a2);
        String str = f1159a;
        String valueOf = String.valueOf(a2);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("CONTROL_AE_TARGET_FPS_RANGE=");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        boolean booleanValue = ((Boolean) this.f1161c.mo2860b()).booleanValue();
        if (booleanValue) {
            i = 4;
        } else {
            i = 1;
        }
        a.m4292a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i));
        valueOf = f1159a;
        StringBuilder stringBuilder2 = new StringBuilder(40);
        stringBuilder2.append("CONTROL_AF_MODE=CONTINUOUS_PICTURE?");
        stringBuilder2.append(booleanValue);
        bli.m871d(valueOf, stringBuilder2.toString());
        return a;
    }

    /* renamed from: b */
    public final iwn m822b(bhj bhj) {
        Object obj;
        int i;
        iwn a = bhj.m7380a(3);
        m821a(a);
        Range b = this.f1160b.mo437b();
        a.m4292a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, b);
        String str = f1159a;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("CONTROL_AE_TARGET_FPS_RANGE=");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        if (!this.f1162d.mo1885b()) {
            obj = null;
        } else if (((Boolean) this.f1161c.mo2860b()).booleanValue()) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            i = 1;
        } else {
            i = 3;
        }
        a.m4292a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i));
        String str2 = f1159a;
        StringBuilder stringBuilder2 = new StringBuilder(27);
        stringBuilder2.append("CONTROL_AF_MODE=");
        stringBuilder2.append(i);
        bli.m871d(str2, stringBuilder2.toString());
        return a;
    }
}
