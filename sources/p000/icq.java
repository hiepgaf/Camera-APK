package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: icq */
final class icq implements ied {
    /* renamed from: a */
    public final idr f18178a;
    /* renamed from: b */
    public final idr f18179b;
    /* renamed from: c */
    public Bundle f18180c;
    /* renamed from: d */
    public ConnectionResult f18181d = null;
    /* renamed from: e */
    public ConnectionResult f18182e = null;
    /* renamed from: f */
    public boolean f18183f = false;
    /* renamed from: g */
    public final Lock f18184g;
    /* renamed from: h */
    private final Context f18185h;
    /* renamed from: i */
    private final idn f18186i;
    /* renamed from: j */
    private final Map f18187j;
    /* renamed from: k */
    private final Set f18188k = Collections.newSetFromMap(new WeakHashMap());
    /* renamed from: l */
    private final huo f18189l;
    /* renamed from: m */
    private int f18190m = 0;

    icq(Context context, idn idn, Lock lock, Looper looper, huc huc, Map map, Map map2, hvx hvx, huk huk, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f18185h = context;
        this.f18186i = idn;
        this.f18184g = lock;
        this.f18189l = null;
        this.f18178a = new idr(context, this.f18186i, lock, looper, huc, map2, null, map4, null, arrayList2, new icr(this));
        this.f18179b = new idr(context, this.f18186i, lock, looper, huc, map, hvx, map3, huk, arrayList, new ics(this));
        Map ihVar = new ih();
        for (hum put : map2.keySet()) {
            ihVar.put(put, this.f18178a);
        }
        for (hum put2 : map.keySet()) {
            ihVar.put(put2, this.f18179b);
        }
        this.f18187j = Collections.unmodifiableMap(ihVar);
    }

    /* renamed from: a */
    private final void m12077a(ConnectionResult connectionResult) {
        switch (this.f18190m) {
            case 1:
                break;
            case 2:
                this.f18186i.mo1817a(connectionResult);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        m12082e();
        this.f18190m = 0;
    }

    /* renamed from: b */
    private static boolean m12080b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.m15094b();
    }

    /* renamed from: e */
    private final void m12082e() {
        for (hzr a : this.f18188k) {
            a.m3595a();
        }
        this.f18188k.clear();
    }

    /* renamed from: a */
    public final ConnectionResult mo1808a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo1810a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f18179b.mo1810a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f18178a.mo1810a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: c */
    public final void mo1813c() {
        this.f18182e = null;
        this.f18181d = null;
        this.f18190m = 0;
        this.f18178a.mo1813c();
        this.f18179b.mo1813c();
        m12082e();
    }

    /* renamed from: b */
    public final void mo1812b() {
        this.f18190m = 2;
        this.f18183f = false;
        this.f18182e = null;
        this.f18181d = null;
        this.f18178a.mo1812b();
        this.f18179b.mo1812b();
    }

    /* renamed from: d */
    public final boolean mo1814d() {
        boolean z = true;
        this.f18184g.lock();
        try {
            if (!this.f18178a.mo1814d()) {
                z = false;
            } else if (!(this.f18179b.mo1814d() || m12083f() || this.f18190m == 1)) {
                z = false;
            }
            this.f18184g.unlock();
            return z;
        } catch (Throwable th) {
            this.f18184g.unlock();
        }
    }

    /* renamed from: a */
    public final ich mo1809a(ich ich) {
        if (!m12081c(ich)) {
            return this.f18178a.mo1809a(ich);
        }
        if (!m12083f()) {
            return this.f18179b.mo1809a(ich);
        }
        ich.m16019b(new Status(4, null, null));
        return ich;
    }

    /* renamed from: a */
    static /* synthetic */ void m12079a(icq icq, int i, boolean z) {
        icq.f18186i.mo1815a(i, z);
        icq.f18182e = null;
        icq.f18181d = null;
    }

    /* renamed from: b */
    public final ich mo1811b(ich ich) {
        if (!m12081c(ich)) {
            return this.f18178a.mo1811b(ich);
        }
        if (!m12083f()) {
            return this.f18179b.mo1811b(ich);
        }
        ich.m16019b(new Status(4, null, null));
        return ich;
    }

    /* renamed from: a */
    static /* synthetic */ void m12078a(icq icq) {
        ConnectionResult connectionResult;
        if (icq.m12080b(icq.f18181d)) {
            if (icq.m12080b(icq.f18182e) || icq.m12083f()) {
                switch (icq.f18190m) {
                    case 1:
                        break;
                    case 2:
                        icq.f18186i.mo1816a(icq.f18180c);
                        break;
                    default:
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        break;
                }
                icq.m12082e();
                icq.f18190m = 0;
                return;
            }
            connectionResult = icq.f18182e;
            if (connectionResult == null) {
                return;
            }
            if (icq.f18190m != 1) {
                icq.m12077a(connectionResult);
                icq.f18178a.mo1813c();
                return;
            }
            icq.m12082e();
        } else if (icq.f18181d != null && icq.m12080b(icq.f18182e)) {
            icq.f18179b.mo1813c();
            icq.m12077a(icq.f18181d);
        } else {
            ConnectionResult connectionResult2 = icq.f18181d;
            if (connectionResult2 != null) {
                connectionResult = icq.f18182e;
                if (connectionResult != null) {
                    if (icq.f18179b.f21713l >= icq.f18178a.f21713l) {
                        connectionResult = connectionResult2;
                    }
                    icq.m12077a(connectionResult);
                }
            }
        }
    }

    /* renamed from: c */
    private final boolean m12081c(ich ich) {
        hum hum = ich.f21699e;
        htl.m3436b(this.f18187j.containsKey(hum), (Object) "GoogleApiClient is not configured to use the API required for this call.");
        return ((idr) this.f18187j.get(hum)).equals(this.f18179b);
    }

    /* renamed from: f */
    private final boolean m12083f() {
        ConnectionResult connectionResult = this.f18182e;
        return connectionResult != null && connectionResult.f20458b == 4;
    }
}
