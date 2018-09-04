package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: ief */
public final class ief implements hus, hut, icp {
    /* renamed from: a */
    public final huo f21718a;
    /* renamed from: b */
    public final icx f21719b;
    /* renamed from: c */
    public final Set f21720c = new HashSet();
    /* renamed from: d */
    public final Map f21721d = new HashMap();
    /* renamed from: e */
    public final int f21722e;
    /* renamed from: f */
    public final hzs f21723f;
    /* renamed from: g */
    public boolean f21724g;
    /* renamed from: h */
    public final /* synthetic */ idv f21725h;
    /* renamed from: i */
    private final Queue f21726i = new LinkedList();
    /* renamed from: j */
    private final icd f21727j;
    /* renamed from: k */
    private ConnectionResult f21728k = null;

    public ief(idv idv, hva hva) {
        this.f21725h = idv;
        this.f21718a = hva.mo1818a(idv.f6953h.getLooper(), this);
        if (this.f21718a instanceof hvl) {
            hvl.m17538i();
        }
        this.f21727j = hva.f6701b;
        this.f21719b = new icx();
        this.f21722e = hva.f6703d;
        if (this.f21718a.mo3476f()) {
            this.f21723f = hva.mo1819a(idv.f6949d, idv.f6953h);
        } else {
            this.f21723f = null;
        }
    }

    /* renamed from: a */
    public final void m16039a() {
        htl.m3405a(this.f21725h.f6953h);
        if (!this.f21718a.m11995d() && !this.f21718a.m11996e()) {
            if (this.f21718a.mo3482h() && this.f21725h.f6958n != 0) {
                idv idv = this.f21725h;
                idv.f6957m;
                idv.f6958n = huc.m3453a(this.f21725h.f6949d);
                if (this.f21725h.f6958n != 0) {
                    mo1226a(new ConnectionResult(this.f21725h.f6958n, null));
                    return;
                }
            }
            hvs hzu = new hzu(this.f21725h, this.f21718a, this.f21727j);
            if (this.f21718a.mo3476f()) {
                hzs hzs = this.f21723f;
                iau iau = hzs.f21640g;
                if (iau != null) {
                    iau.mo3574c();
                }
                if (hzs.f21637d) {
                    hte a = hte.m3369a(hzs.f21634a);
                    GoogleSignInOptions b = a.m3372b(a.m3373c("defaultGoogleSignInAccount"));
                    hzs.f21638e = b != null ? new HashSet(b.m15091a()) : new HashSet();
                    hzs.f21639f = new hvx(null, hzs.f21638e, null, null, null, iav.f6882a);
                }
                huk huk = hzs.f21636c;
                Context context = hzs.f21634a;
                Looper looper = hzs.f21635b.getLooper();
                hvx hvx = hzs.f21639f;
                hzs.f21640g = (iau) huk.mo3107a(context, looper, hvx, hvx.f6751g, hzs, hzs);
                hzs.f21641h = hzu;
                hzs.f21640g.mo3477i();
            }
            this.f21718a.mo3481a(hzu);
        }
    }

    /* renamed from: b */
    final boolean m16046b() {
        return this.f21718a.m11995d();
    }

    /* renamed from: a */
    public final void mo1225a(Bundle bundle) {
        if (Looper.myLooper() != this.f21725h.f6953h.getLooper()) {
            this.f21725h.f6953h.post(new idw(this));
        } else {
            m16049e();
        }
    }

    /* renamed from: a */
    public final void mo1226a(ConnectionResult connectionResult) {
        htl.m3405a(this.f21725h.f6953h);
        hzs hzs = this.f21723f;
        if (hzs != null) {
            hzs.f21640g.mo3574c();
        }
        m16051g();
        this.f21725h.f6958n = -1;
        m16037b(connectionResult);
        if (connectionResult.f20458b == 4) {
            m16044a(idv.f6946b);
        } else if (this.f21726i.isEmpty()) {
            this.f21728k = connectionResult;
        } else {
            synchronized (idv.f6947c) {
                null;
            }
            if (!this.f21725h.m3694a(connectionResult, this.f21722e)) {
                if (connectionResult.f20458b == 18) {
                    this.f21724g = true;
                }
                if (this.f21724g) {
                    this.f21725h.f6953h.sendMessageDelayed(Message.obtain(this.f21725h.f6953h, 9, this.f21727j), this.f21725h.f6954i);
                    return;
                }
                String valueOf = String.valueOf(this.f21727j.f6922a.f6675a);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
                stringBuilder.append("API: ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is not available on this device.");
                m16044a(new Status(17, stringBuilder.toString()));
            }
        }
    }

    /* renamed from: a */
    public final void mo1224a(int i) {
        if (Looper.myLooper() != this.f21725h.f6953h.getLooper()) {
            this.f21725h.f6953h.post(new idx(this));
        } else {
            m16050f();
        }
    }

    /* renamed from: c */
    public final void m16047c() {
        htl.m3405a(this.f21725h.f6953h);
        m16044a(idv.f6945a);
        this.f21719b.m3671a(false, idv.f6945a);
        for (iei icc : this.f21721d.keySet()) {
            m16045a(new icc(icc, new ifw()));
        }
        m16037b(new ConnectionResult(4));
        this.f21718a.mo3574c();
    }

    /* renamed from: a */
    public final void m16044a(Status status) {
        htl.m3405a(this.f21725h.f6953h);
        for (ibz a : this.f21726i) {
            a.mo1804a(status);
        }
        this.f21726i.clear();
    }

    /* renamed from: a */
    public final void mo3124a(ConnectionResult connectionResult, huh huh, boolean z) {
        if (Looper.myLooper() != this.f21725h.f6953h.getLooper()) {
            this.f21725h.f6953h.post(new idy(this, connectionResult));
        } else {
            mo1226a(connectionResult);
        }
    }

    /* renamed from: a */
    public final void m16045a(ibz ibz) {
        htl.m3405a(this.f21725h.f6953h);
        if (this.f21718a.m11995d()) {
            m16038b(ibz);
            m16054j();
            return;
        }
        this.f21726i.add(ibz);
        ConnectionResult connectionResult = this.f21728k;
        if (connectionResult == null || !connectionResult.m15093a()) {
            m16039a();
        } else {
            mo1226a(this.f21728k);
        }
    }

    /* renamed from: b */
    private final void m16038b(ibz ibz) {
        ibz.mo1805a(this.f21719b, m16048d());
        try {
            ibz.mo1806a(this);
        } catch (DeadObjectException e) {
            mo1224a(1);
            this.f21718a.mo3574c();
        }
    }

    /* renamed from: b */
    private final void m16037b(ConnectionResult connectionResult) {
        for (ice a : this.f21720c) {
            a.m3667a(this.f21727j, connectionResult);
        }
        this.f21720c.clear();
    }

    /* renamed from: d */
    public final boolean m16048d() {
        return this.f21718a.mo3476f();
    }

    /* renamed from: e */
    final void m16049e() {
        m16051g();
        m16037b(ConnectionResult.f20457a);
        m16053i();
        for (hzq hzq : this.f21721d.values()) {
            try {
                ax axVar = hzq.f6849a;
                ifw ifw = new ifw();
                axVar.m7126h();
            } catch (DeadObjectException e) {
                mo1224a(1);
                this.f21718a.mo3574c();
            } catch (RemoteException e2) {
            }
        }
        while (this.f21718a.m11995d() && !this.f21726i.isEmpty()) {
            m16038b((ibz) this.f21726i.remove());
        }
        m16054j();
    }

    /* renamed from: f */
    final void m16050f() {
        m16051g();
        this.f21724g = true;
        this.f21719b.m3671a(true, hzx.f6853a);
        this.f21725h.f6953h.sendMessageDelayed(Message.obtain(this.f21725h.f6953h, 9, this.f21727j), this.f21725h.f6954i);
        this.f21725h.f6953h.sendMessageDelayed(Message.obtain(this.f21725h.f6953h, 11, this.f21727j), this.f21725h.f6955j);
        this.f21725h.f6958n = -1;
    }

    /* renamed from: g */
    public final void m16051g() {
        htl.m3405a(this.f21725h.f6953h);
        this.f21728k = null;
    }

    /* renamed from: h */
    public final ConnectionResult m16052h() {
        htl.m3405a(this.f21725h.f6953h);
        return this.f21728k;
    }

    /* renamed from: i */
    final void m16053i() {
        if (this.f21724g) {
            this.f21725h.f6953h.removeMessages(11, this.f21727j);
            this.f21725h.f6953h.removeMessages(9, this.f21727j);
            this.f21724g = false;
        }
    }

    /* renamed from: j */
    final void m16054j() {
        this.f21725h.f6953h.removeMessages(12, this.f21727j);
        this.f21725h.f6953h.sendMessageDelayed(this.f21725h.f6953h.obtainMessage(12, this.f21727j), this.f21725h.f6956k);
    }
}
