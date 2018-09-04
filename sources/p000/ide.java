package p000;

import com.google.android.gms.common.ConnectionResult;
import java.util.Map;

/* renamed from: ide */
final class ide extends idl {
    /* renamed from: a */
    public final /* synthetic */ idb f18250a;
    /* renamed from: b */
    private final Map f18251b;

    public ide(idb idb, Map map) {
        this.f18250a = idb;
        super(idb);
        this.f18251b = map;
    }

    /* renamed from: a */
    public final void mo1844a() {
        int i;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        for (huo huo : this.f18251b.keySet()) {
            if (huo.mo3482h()) {
                if (!((idd) this.f18251b.get(huo)).f18247a) {
                    i = 1;
                    break;
                } else {
                    i = i4;
                    i4 = 1;
                }
            } else {
                i = 0;
                i4 = i5;
            }
            i5 = i4;
            i4 = i;
        }
        i2 = i5;
        i = 0;
        if (i2 != 0) {
            i3 = huc.m3453a(this.f18250a.f18228c);
        }
        if (i3 == 0 || (r0 == 0 && i4 == 0)) {
            idb idb = this.f18250a;
            if (idb.f18230e) {
                idb.f18229d.mo3477i();
            }
            for (huo huo2 : this.f18251b.keySet()) {
                hvs hvs = (hvs) this.f18251b.get(huo2);
                if (huo2.mo3482h() && i3 != 0) {
                    idq idq = this.f18250a;
                    idq.f18226a.m16028a(new idg(idq, hvs));
                } else {
                    huo2.mo3481a(hvs);
                }
            }
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i3, null);
        idq idq2 = this.f18250a;
        idq2.f18226a.m16028a(new idf(this, idq2, connectionResult));
    }
}
