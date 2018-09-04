package p000;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: ihx */
final class ihx extends iik {
    /* renamed from: a */
    private WeakReference f23346a;
    /* renamed from: b */
    private WeakReference f23347b;

    ihx(Map map, Object obj, ici ici) {
        super(ici);
        this.f23346a = new WeakReference(map);
        this.f23347b = new WeakReference(obj);
    }

    /* renamed from: a */
    public final void mo3125a(Status status) {
        Map map = (Map) this.f23346a.get();
        Object obj = this.f23347b.get();
        if (!(status.m15096b() || map == null || obj == null)) {
            synchronized (map) {
                iip iip = (iip) map.remove(obj);
                if (iip != null) {
                    iip.m16061a();
                }
            }
        }
        m16058a(status);
    }
}
