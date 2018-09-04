package p000;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* renamed from: hzu */
public class hzu implements hvs {
    /* renamed from: a */
    public final huo f18151a;
    /* renamed from: b */
    public final icd f18152b;
    /* renamed from: c */
    public hwk f18153c;
    /* renamed from: d */
    public Set f18154d;
    /* renamed from: e */
    public boolean f18155e;
    /* renamed from: f */
    public final /* synthetic */ idv f18156f;

    /* renamed from: a */
    public void m12044a(hwk hwk, Set set) {
        if (hwk == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            m12045b(new ConnectionResult(4));
            return;
        }
        this.f18153c = hwk;
        this.f18154d = set;
        m12042a();
    }

    /* renamed from: b */
    public void m12045b(ConnectionResult connectionResult) {
        ief ief = (ief) this.f18156f.f6952g.get(this.f18152b);
        htl.m3405a(ief.f21725h.f6953h);
        ief.f21718a.mo3574c();
        ief.mo1226a(connectionResult);
    }

    public hzu(idv idv, huo huo, icd icd) {
        this.f18156f = idv;
        this.f18153c = null;
        this.f18154d = null;
        this.f18155e = false;
        this.f18151a = huo;
        this.f18152b = icd;
    }

    /* renamed from: a */
    public void mo1781a(ConnectionResult connectionResult) {
        this.f18156f.f6953h.post(new idz(this, connectionResult));
    }

    /* renamed from: a */
    public void m12042a() {
        if (this.f18155e) {
            hwk hwk = this.f18153c;
            if (hwk != null) {
                this.f18151a.m11992a(hwk, this.f18154d);
            }
        }
    }
}
