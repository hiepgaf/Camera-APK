package p000;

import android.hardware.camera2.CameraCharacteristics;
import java.util.List;

/* compiled from: PG */
/* renamed from: fgp */
public final class fgp extends imq {
    /* renamed from: b */
    private final ffc f23183b;

    fgp(ffc ffc, ilp ilp, ilp ilp2) {
        super(ilq.m3822a(ilp, ilp2));
        this.f23183b = ffc;
        jri.m13152b((int[]) ffc.mo1913a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES));
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo3397b(Object obj) {
        List list = (List) obj;
        if (!this.f23183b.mo1940v()) {
            return Integer.valueOf(1);
        }
        switch (((fxi) list.get(0)).ordinal()) {
            case 0:
                return Integer.valueOf(2);
            case 1:
                return Integer.valueOf(1);
            case 2:
                return Integer.valueOf(3);
            default:
                return Integer.valueOf(1);
        }
    }
}
