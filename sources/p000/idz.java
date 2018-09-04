package p000;

import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

/* renamed from: idz */
public final class idz implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f6965a;
    /* renamed from: b */
    private final /* synthetic */ hzu f6966b;

    public idz(hzu hzu, ConnectionResult connectionResult) {
        this.f6966b = hzu;
        this.f6965a = connectionResult;
    }

    public final void run() {
        if (this.f6965a.m15094b()) {
            hzu hzu = this.f6966b;
            hzu.f18155e = true;
            if (hzu.f18151a.mo3476f()) {
                this.f6966b.m12042a();
                return;
            } else {
                this.f6966b.f18151a.m11992a(null, Collections.emptySet());
                return;
            }
        }
        ((ief) this.f6966b.f18156f.f6952g.get(this.f6966b.f18152b)).mo1226a(this.f6965a);
    }
}
