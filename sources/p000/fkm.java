package p000;

import android.hardware.camera2.CaptureResult;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fkm */
final class fkm implements iqo, iqt {
    /* renamed from: a */
    public final Map f16109a = new HashMap();
    /* renamed from: b */
    public final Object f16110b = new Object();

    fkm() {
    }

    public final void close() {
        synchronized (this.f16110b) {
            for (kpw a : this.f16109a.values()) {
                a.m17780a(new isr("Camera has been closed"));
            }
            this.f16109a.clear();
        }
    }

    /* renamed from: a */
    final kpw m10466a(Long l) {
        kpw kpw;
        synchronized (this.f16110b) {
            if (this.f16109a.containsKey(l)) {
                kpw = (kpw) this.f16109a.get(l);
            } else {
                kpw = kpw.m18056d();
                this.f16109a.put(l, kpw);
            }
        }
        return kpw;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        obj = (iwp) obj;
        m10466a((Long) jri.m13152b((Long) obj.mo3143a(CaptureResult.SENSOR_TIMESTAMP))).mo3557a(obj);
    }
}
