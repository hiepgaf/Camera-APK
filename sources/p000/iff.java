package p000;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.internal.zzq;

/* renamed from: iff */
public final class iff extends ies {
    /* renamed from: m */
    public final ifb f23545m;

    public iff(Context context, Looper looper, hus hus, hut hut, String str, hvx hvx) {
        super(context, looper, hus, hut, str, hvx);
        this.f23545m = new ifb(context, this.l);
    }

    /* renamed from: c */
    public final void mo3574c() {
        synchronized (this.f23545m) {
            if (m3515d()) {
                try {
                    ifb ifb = this.f23545m;
                    try {
                        synchronized (ifb.f6982b) {
                            for (ifn ifn : ifb.f6982b.values()) {
                                if (ifn != null) {
                                    ((ifa) ifb.f6981a.f6985a.m3526p()).m3728a(zzq.m15119a(ifn, null));
                                }
                            }
                            ifb.f6982b.clear();
                        }
                        synchronized (ifb.f6983c) {
                            for (ifk ifk : ifb.f6983c.values()) {
                                if (ifk != null) {
                                    ((ifa) ifb.f6981a.f6985a.m3526p()).m3728a(new zzq(2, null, null, null, ifk.asBinder(), null));
                                }
                            }
                            ifb.f6983c.clear();
                        }
                    } catch (Throwable e) {
                        throw new IllegalStateException(e);
                    }
                } catch (Throwable e2) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e2);
                }
            }
            super.mo3574c();
        }
    }
}
