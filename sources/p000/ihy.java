package p000;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: ihy */
final class ihy extends iik {
    /* renamed from: a */
    private WeakReference f23348a;
    /* renamed from: b */
    private WeakReference f23349b;

    ihy(Map map, Object obj, ici ici) {
        super(ici);
        this.f23348a = new WeakReference(map);
        this.f23349b = new WeakReference(obj);
    }

    /* renamed from: a */
    public final void mo3125a(Status status) {
        Map map = (Map) this.f23348a.get();
        Object obj = this.f23349b.get();
        if (!(status.f20468e != 4002 || map == null || obj == null)) {
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
