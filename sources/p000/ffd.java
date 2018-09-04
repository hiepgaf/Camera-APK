package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: ffd */
public final class ffd extends iuu implements ffc {
    public ffd(iun iun) {
        super(iun);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return kbf.m16436b(mo1922d(), ((ffd) obj).mo1922d());
    }

    /* renamed from: a */
    public final List mo3034a(iqp iqp) {
        return a_(iqp);
    }

    public final List u_() {
        List arrayList = new ArrayList();
        for (iqp iqp : mo1926h()) {
            ine ine = (ine) ine.f7159i.get(iqp);
            if (ine != null) {
                arrayList.add(ine);
            }
        }
        return arrayList;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo1922d()});
    }

    public final boolean v_() {
        return khx.m4942a((int[]) mo1914a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, a), 5);
    }

    public final boolean w_() {
        return true;
    }
}
