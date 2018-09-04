package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: idb */
public final class idb implements idq {
    /* renamed from: a */
    public final idr f18226a;
    /* renamed from: b */
    public final Lock f18227b;
    /* renamed from: c */
    public final Context f18228c;
    /* renamed from: d */
    public iau f18229d;
    /* renamed from: e */
    public boolean f18230e;
    /* renamed from: f */
    public boolean f18231f;
    /* renamed from: g */
    public hwk f18232g;
    /* renamed from: h */
    public boolean f18233h;
    /* renamed from: i */
    public boolean f18234i;
    /* renamed from: j */
    public final hvx f18235j;
    /* renamed from: k */
    private final huc f18236k;
    /* renamed from: l */
    private ConnectionResult f18237l;
    /* renamed from: m */
    private int f18238m;
    /* renamed from: n */
    private int f18239n = 0;
    /* renamed from: o */
    private int f18240o;
    /* renamed from: p */
    private final Bundle f18241p = new Bundle();
    /* renamed from: q */
    private final Set f18242q = new HashSet();
    /* renamed from: r */
    private boolean f18243r;
    /* renamed from: s */
    private final Map f18244s;
    /* renamed from: t */
    private final huk f18245t;
    /* renamed from: u */
    private ArrayList f18246u = new ArrayList();

    public idb(idr idr, hvx hvx, Map map, huc huc, huk huk, Lock lock, Context context) {
        this.f18226a = idr;
        this.f18235j = hvx;
        this.f18244s = map;
        this.f18236k = huc;
        this.f18245t = huk;
        this.f18227b = lock;
        this.f18228c = context;
    }

    /* renamed from: a */
    private final void m12134a(boolean z) {
        iau iau = this.f18229d;
        if (iau != null) {
            if (iau.m11995d() && z) {
                this.f18229d.A_();
            }
            this.f18229d.mo3574c();
            this.f18232g = null;
        }
    }

    /* renamed from: c */
    private static String m12135c(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: h */
    private final void m12137h() {
        ArrayList arrayList = this.f18246u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((Future) arrayList.get(i)).cancel(true);
            i = i2;
        }
        this.f18246u.clear();
    }

    /* renamed from: a */
    public final ich mo1834a(ich ich) {
        this.f18226a.f21714m.f18263d.add(ich);
        return ich;
    }

    /* renamed from: a */
    public final void mo1835a() {
        this.f18226a.f21708g.clear();
        this.f18230e = false;
        this.f18237l = null;
        this.f18239n = 0;
        this.f18243r = true;
        this.f18231f = false;
        this.f18233h = false;
        Map hashMap = new HashMap();
        for (huh huh : this.f18244s.keySet()) {
            huo huo = (huo) this.f18226a.f21707f.get(huh.m3471b());
            boolean booleanValue = ((Boolean) this.f18244s.get(huh)).booleanValue();
            if (huo.mo3476f()) {
                this.f18230e = true;
                if (booleanValue) {
                    this.f18242q.add(huh.m3471b());
                } else {
                    this.f18243r = false;
                }
            }
            hashMap.put(huo, new idd(this, huh, booleanValue));
        }
        if (this.f18230e) {
            this.f18235j.f6752h = Integer.valueOf(System.identityHashCode(this.f18226a.f21714m));
            hus idk = new idk(this);
            huk huk = this.f18245t;
            Context context = this.f18228c;
            Looper looper = this.f18226a.f21714m.f18262c;
            hvx hvx = this.f18235j;
            this.f18229d = (iau) huk.mo3107a(context, looper, hvx, hvx.f6751g, idk, idk);
        }
        this.f18240o = this.f18226a.f21707f.size();
        this.f18246u.add(idu.f6944a.submit(new ide(this, hashMap)));
    }

    /* renamed from: a */
    public final void mo1836a(int i) {
        m12146b(new ConnectionResult(8, null));
    }

    /* renamed from: a */
    public final void mo1837a(Bundle bundle) {
        if (m12148b(1)) {
            if (bundle != null) {
                this.f18241p.putAll(bundle);
            }
            if (m12150d()) {
                m12136g();
            }
        }
    }

    /* renamed from: a */
    public final void mo1838a(ConnectionResult connectionResult, huh huh, boolean z) {
        if (m12148b(1)) {
            m12147b(connectionResult, huh, z);
            if (m12150d()) {
                m12136g();
            }
        }
    }

    /* renamed from: a */
    final boolean m12143a(ConnectionResult connectionResult) {
        return this.f18243r && !connectionResult.m15093a();
    }

    /* renamed from: b */
    public final ich mo1839b(ich ich) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: b */
    public final void mo1840b() {
    }

    /* renamed from: b */
    final void m12146b(ConnectionResult connectionResult) {
        m12137h();
        m12134a(connectionResult.m15093a() ^ 1);
        this.f18226a.m16026a(connectionResult);
        this.f18226a.f21715n.mo1817a(connectionResult);
    }

    /* renamed from: b */
    final boolean m12148b(int i) {
        if (this.f18239n == i) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.f18226a.f21714m.m12193g());
        String valueOf = String.valueOf(this);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
        stringBuilder.append("Unexpected callback in ");
        stringBuilder.append(valueOf);
        Log.w("GoogleApiClientConnecting", stringBuilder.toString());
        int i2 = this.f18240o;
        StringBuilder stringBuilder2 = new StringBuilder(33);
        stringBuilder2.append("mRemainingConnections=");
        stringBuilder2.append(i2);
        Log.w("GoogleApiClientConnecting", stringBuilder2.toString());
        valueOf = String.valueOf(idb.m12135c(this.f18239n));
        String valueOf2 = String.valueOf(idb.m12135c(i));
        StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length());
        stringBuilder3.append("GoogleApiClient connecting is in step ");
        stringBuilder3.append(valueOf);
        stringBuilder3.append(" but received callback for step ");
        stringBuilder3.append(valueOf2);
        Log.wtf("GoogleApiClientConnecting", stringBuilder3.toString(), new Exception());
        m12146b(new ConnectionResult(8, null));
        return false;
    }

    /* renamed from: c */
    public final boolean mo1841c() {
        m12137h();
        m12134a(true);
        this.f18226a.m16026a(null);
        return true;
    }

    /* renamed from: d */
    final boolean m12150d() {
        this.f18240o--;
        int i = this.f18240o;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GoogleApiClientConnecting", this.f18226a.f21714m.m12193g());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m12146b(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f18237l;
        if (connectionResult == null) {
            return true;
        }
        this.f18226a.f21713l = this.f18238m;
        m12146b(connectionResult);
        return false;
    }

    /* renamed from: f */
    final void m12152f() {
        this.f18230e = false;
        this.f18226a.f21714m.f18265f = Collections.emptySet();
        for (hum hum : this.f18242q) {
            if (!this.f18226a.f21708g.containsKey(hum)) {
                this.f18226a.f21708g.put(hum, new ConnectionResult(17, null));
            }
        }
    }

    /* renamed from: b */
    final void m12147b(ConnectionResult connectionResult, huh huh, boolean z) {
        Object obj = null;
        if (z) {
            Object obj2;
            int i;
            if (connectionResult.m15093a()) {
                i = 1;
            } else if (huc.m3455a(null, connectionResult.f20458b, null) == null) {
                obj2 = null;
            } else {
                i = 1;
            }
            if (obj2 == null) {
                if (obj != null) {
                    this.f18237l = connectionResult;
                    this.f18238m = LfuScheduler.MAX_PRIORITY;
                }
                this.f18226a.f21708g.put(huh.m3471b(), connectionResult);
            }
        }
        int i2;
        if (this.f18237l == null) {
            i2 = 1;
        } else if (this.f18238m > LfuScheduler.MAX_PRIORITY) {
            i2 = 1;
        }
        if (obj != null) {
            this.f18237l = connectionResult;
            this.f18238m = LfuScheduler.MAX_PRIORITY;
        }
        this.f18226a.f21708g.put(huh.m3471b(), connectionResult);
    }

    /* renamed from: e */
    final void m12151e() {
        if (this.f18240o == 0) {
            if (this.f18230e) {
                if (!this.f18231f) {
                    return;
                }
            }
            ArrayList arrayList = new ArrayList();
            this.f18239n = 1;
            this.f18240o = this.f18226a.f21707f.size();
            for (hum hum : this.f18226a.f21707f.keySet()) {
                if (!this.f18226a.f21708g.containsKey(hum)) {
                    arrayList.add((huo) this.f18226a.f21707f.get(hum));
                } else if (m12150d()) {
                    m12136g();
                }
            }
            if (!arrayList.isEmpty()) {
                this.f18246u.add(idu.f6944a.submit(new idh(this, arrayList)));
            }
        }
    }

    /* renamed from: g */
    private final void m12136g() {
        idr idr = this.f18226a;
        idr.f21702a.lock();
        try {
            idr.f21714m.m12192f();
            idr.f21712k = new icz(idr);
            idr.f21712k.mo1835a();
            idr.f21703b.signalAll();
            idu.f6944a.execute(new idc(this));
            iau iau = this.f18229d;
            if (iau != null) {
                if (this.f18233h) {
                    iau.mo3474a(this.f18232g, this.f18234i);
                }
                m12134a(false);
            }
            for (hum hum : this.f18226a.f21708g.keySet()) {
                ((huo) this.f18226a.f21707f.get(hum)).mo3574c();
            }
            this.f18226a.f21715n.mo1816a(!this.f18241p.isEmpty() ? this.f18241p : null);
        } finally {
            idr.f21702a.unlock();
        }
    }
}
