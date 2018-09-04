package p000;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: icz */
public final class icz implements idq {
    /* renamed from: a */
    public final idr f18221a;
    /* renamed from: b */
    private boolean f18222b = false;

    public icz(idr idr) {
        this.f18221a = idr;
    }

    /* renamed from: a */
    public final ich mo1834a(ich ich) {
        return mo1839b(ich);
    }

    /* renamed from: a */
    public final void mo1835a() {
    }

    /* renamed from: a */
    public final void mo1836a(int i) {
        this.f18221a.m16026a(null);
        this.f18221a.f21715n.mo1815a(i, false);
    }

    /* renamed from: a */
    public final void mo1837a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo1838a(ConnectionResult connectionResult, huh huh, boolean z) {
    }

    /* renamed from: b */
    public final void mo1840b() {
    }

    /* renamed from: c */
    public final boolean mo1841c() {
        idn idn = this.f18221a.f21714m;
        idn.f18261b.lock();
        idn.f18261b.unlock();
        this.f18221a.m16026a(null);
        return true;
    }

    /* renamed from: b */
    public final ich mo1839b(ich ich) {
        try {
            this.f18221a.f21714m.f18266g.m3596a(ich);
            idn idn = this.f18221a.f21714m;
            hul hul = (huo) idn.f18264e.get(ich.f21699e);
            htl.m3432b((Object) hul, (Object) "Appropriate Api was not requested.");
            if (hul.m11995d() || !this.f18221a.f21708g.containsKey(ich.f21699e)) {
                if (hul instanceof hvl) {
                    hul = hvl.m17538i();
                }
                ich.m16020b(hul);
                return ich;
            }
            ich.m16019b(new Status(17));
            return ich;
        } catch (DeadObjectException e) {
            this.f18221a.m16028a(new ida(this, this));
        }
    }
}
