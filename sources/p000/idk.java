package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: idk */
final class idk implements hus, hut {
    /* renamed from: a */
    private final /* synthetic */ idb f18259a;

    idk(idb idb) {
        this.f18259a = idb;
    }

    /* renamed from: a */
    public final void mo1224a(int i) {
    }

    /* renamed from: a */
    public final void mo1225a(Bundle bundle) {
        idb idb = this.f18259a;
        idb.f18229d.mo3475a(new idi(idb));
    }

    /* renamed from: a */
    public final void mo1226a(ConnectionResult connectionResult) {
        this.f18259a.f18227b.lock();
        try {
            if (this.f18259a.m12143a(connectionResult)) {
                this.f18259a.m12152f();
                this.f18259a.m12151e();
            } else {
                this.f18259a.m12146b(connectionResult);
            }
            this.f18259a.f18227b.unlock();
        } catch (Throwable th) {
            this.f18259a.f18227b.unlock();
        }
    }
}
