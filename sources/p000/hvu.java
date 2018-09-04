package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: hvu */
public final class hvu implements hvs {
    /* renamed from: a */
    private final /* synthetic */ hvm f18122a;

    public hvu(hvm hvm) {
        this.f18122a = hvm;
    }

    /* renamed from: a */
    public final void mo1781a(ConnectionResult connectionResult) {
        if (connectionResult.m15094b()) {
            hvm hvm = this.f18122a;
            hvm.m3510a(null, hvm.mo3113q());
            return;
        }
        hvp hvp = this.f18122a.f6725j;
        if (hvp != null) {
            hvp.m3528a(connectionResult);
        }
    }
}
