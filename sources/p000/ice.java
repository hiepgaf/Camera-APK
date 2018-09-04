package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: ice */
public final class ice {
    /* renamed from: a */
    public final ih f6926a = new ih();
    /* renamed from: b */
    public final ifw f6927b = new ifw();
    /* renamed from: c */
    private int f6928c;
    /* renamed from: d */
    private boolean f6929d = false;

    public ice(Iterable iterable) {
        for (hva hva : iterable) {
            this.f6926a.put(hva.f6701b, null);
        }
        this.f6928c = this.f6926a.keySet().size();
    }

    /* renamed from: a */
    public final void m3667a(icd icd, ConnectionResult connectionResult) {
        this.f6926a.put(icd, connectionResult);
        this.f6928c--;
        if (!connectionResult.m15094b()) {
            this.f6929d = true;
        }
        if (this.f6928c != 0) {
            return;
        }
        if (this.f6929d) {
            Object huz = new huz(this.f6926a);
            ifv ifv = this.f6927b.f6990a;
            htl.m3432b(huz, (Object) "Exception must not be null");
            synchronized (ifv.f18295a) {
                ifv.m12212c();
                ifv.f18297c = true;
                ifv.f18298d = huz;
            }
            ifv.f18296b.m3737a(ifv);
            return;
        }
        this.f6927b.m3735a();
    }
}
