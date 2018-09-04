package p000;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* renamed from: idd */
final class idd implements hvs {
    /* renamed from: a */
    public final boolean f18247a;
    /* renamed from: b */
    private final WeakReference f18248b;
    /* renamed from: c */
    private final huh f18249c;

    public idd(idb idb, huh huh, boolean z) {
        this.f18248b = new WeakReference(idb);
        this.f18249c = huh;
        this.f18247a = z;
    }

    /* renamed from: a */
    public final void mo1781a(ConnectionResult connectionResult) {
        boolean z = false;
        idb idb = (idb) this.f18248b.get();
        if (idb != null) {
            if (Looper.myLooper() == idb.f18226a.f21714m.f18262c) {
                z = true;
            }
            htl.m3422a(z, (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            idb.f18227b.lock();
            try {
                if (idb.m12148b(0)) {
                    if (!connectionResult.m15094b()) {
                        idb.m12147b(connectionResult, this.f18249c, this.f18247a);
                    }
                    if (idb.m12150d()) {
                        idb.m12151e();
                    }
                    idb.f18227b.unlock();
                    return;
                }
                idb.f18227b.unlock();
            } catch (Throwable th) {
                idb.f18227b.unlock();
            }
        }
    }
}
