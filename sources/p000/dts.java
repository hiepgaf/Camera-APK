package p000;

import android.hardware.camera2.CaptureResult;
import java.util.List;

/* compiled from: PG */
/* renamed from: dts */
public final class dts implements dty {
    /* renamed from: a */
    private final dty f14522a;
    /* renamed from: b */
    private final fdg f14523b;

    public dts(dty dty, fdg fdg) {
        this.f14522a = dty;
        this.f14523b = fdg;
    }

    public dts(fdg fdg) {
        this.f14522a = new dtr();
        this.f14523b = fdg;
    }

    /* renamed from: a */
    public final List mo1173a(List list) {
        boolean z;
        List a = this.f14522a.mo1173a(list);
        if (a.size() == list.size()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        for (int i = 0; i < a.size(); i++) {
            Integer num;
            int i2;
            int i3;
            boolean booleanValue = ((Boolean) a.get(i)).booleanValue();
            iwp iwp = (iwp) list.get(i);
            if (this.f14523b.f4478b == fdh.CONVERGED || this.f14523b.f4478b == fdh.LOCKED) {
                num = (Integer) iwp.mo3143a(CaptureResult.LENS_STATE);
                if (num != null) {
                    switch (num.intValue()) {
                        case 0:
                            i2 = 1;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                }
                i2 = 1;
                num = (Integer) iwp.mo3143a(CaptureResult.CONTROL_AF_STATE);
                if (num != null) {
                    switch (num.intValue()) {
                        case 2:
                        case 4:
                        case 5:
                        case 6:
                            i3 = 1;
                            break;
                        default:
                            i3 = 0;
                            break;
                    }
                }
                i3 = 1;
                i2 = i3 & i2;
            } else {
                i2 = 1;
            }
            if (this.f14523b.f4477a == fdh.CONVERGED || this.f14523b.f4477a == fdh.LOCKED) {
                num = (Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_STATE);
                if (num != null) {
                    switch (num.intValue()) {
                        case 0:
                        case 2:
                        case 3:
                            i3 = 1;
                            break;
                        default:
                            i3 = 0;
                            break;
                    }
                }
                i3 = 1;
                i2 &= i3;
            }
            if (this.f14523b.f4479c == fdh.CONVERGED || this.f14523b.f4479c == fdh.LOCKED) {
                int i4;
                Integer num2 = (Integer) iwp.mo3143a(CaptureResult.CONTROL_AWB_STATE);
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 0:
                        case 2:
                        case 3:
                            i4 = 1;
                            break;
                        default:
                            i4 = 0;
                            break;
                    }
                }
                i4 = 1;
                i2 &= i4;
            }
            a.set(i, Boolean.valueOf(booleanValue & i2));
        }
        return a;
    }
}
