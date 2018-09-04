package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: hvw */
public final class hvw extends hvn {
    /* renamed from: c */
    private final /* synthetic */ hvm f21624c;

    public hvw(hvm hvm, int i) {
        this.f21624c = hvm;
        super(hvm, i, null);
    }

    /* renamed from: a */
    protected final void mo3109a(ConnectionResult connectionResult) {
        this.f21624c.f6722g.mo1781a(connectionResult);
        this.f21624c.m3507a(connectionResult);
    }

    /* renamed from: b */
    protected final boolean mo3110b() {
        this.f21624c.f6722g.mo1781a(ConnectionResult.f20457a);
        return true;
    }
}
