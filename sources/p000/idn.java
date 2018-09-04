package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: idn */
public final class idn extends huq implements iee {
    /* renamed from: b */
    public final Lock f18261b;
    /* renamed from: c */
    public final Looper f18262c;
    /* renamed from: d */
    public final Queue f18263d = new LinkedList();
    /* renamed from: e */
    public final Map f18264e;
    /* renamed from: f */
    public Set f18265f = new HashSet();
    /* renamed from: g */
    public final hzx f18266g;
    /* renamed from: h */
    private final hwd f18267h;
    /* renamed from: i */
    private ied f18268i = null;
    /* renamed from: j */
    private final int f18269j;
    /* renamed from: k */
    private final Context f18270k;
    /* renamed from: l */
    private volatile boolean f18271l;
    /* renamed from: m */
    private long f18272m = 120000;
    /* renamed from: n */
    private long f18273n = 5000;
    /* renamed from: o */
    private final idp f18274o;
    /* renamed from: p */
    private final hua f18275p;
    /* renamed from: q */
    private ieb f18276q;
    /* renamed from: r */
    private final hvx f18277r;
    /* renamed from: s */
    private final Map f18278s;
    /* renamed from: t */
    private final huk f18279t;
    /* renamed from: u */
    private final iek f18280u = new iek();
    /* renamed from: v */
    private final ArrayList f18281v;
    /* renamed from: w */
    private Integer f18282w = null;
    /* renamed from: x */
    private final hwe f18283x = new ido(this);

    public idn(Context context, Lock lock, Looper looper, hvx hvx, hua hua, huk huk, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        this.f18270k = context;
        this.f18261b = lock;
        this.f18267h = new hwd(looper, this.f18283x);
        this.f18262c = looper;
        this.f18274o = new idp(this, looper);
        this.f18275p = hua;
        this.f18269j = i;
        if (this.f18269j >= 0) {
            this.f18282w = Integer.valueOf(i2);
        }
        this.f18278s = map;
        this.f18264e = map2;
        this.f18281v = arrayList;
        this.f18266g = new hzx();
        for (hus a : list) {
            this.f18267h.m3547a(a);
        }
        for (hut a2 : list2) {
            this.f18267h.m3548a(a2);
        }
        this.f18277r = hvx;
        this.f18279t = huk;
    }

    /* renamed from: a */
    public static int m12170a(Iterable iterable) {
        int i = 0;
        for (huo huo : iterable) {
            if (huo.mo3476f()) {
                i = 1;
            }
            huo.m11998g();
        }
        return i == 0 ? 3 : 1;
    }

    /* renamed from: b */
    private static String m12173b(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: a */
    public final ConnectionResult mo1826a() {
        boolean z = true;
        htl.m3422a(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.f18261b.lock();
        try {
            if (this.f18269j < 0) {
                Integer num = this.f18282w;
                if (num == null) {
                    this.f18282w = Integer.valueOf(idn.m12170a(this.f18264e.values()));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            if (this.f18282w == null) {
                z = false;
            }
            htl.m3422a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            m12171a(this.f18282w.intValue());
            this.f18267h.f6767e = true;
            ConnectionResult a = this.f18268i.mo1808a();
            return a;
        } finally {
            this.f18261b.unlock();
        }
    }

    /* renamed from: a */
    public final huo mo1845a(hum hum) {
        Object obj = (huo) this.f18264e.get(hum);
        htl.m3432b(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    /* renamed from: a */
    public final void mo1827a(hus hus) {
        this.f18267h.m3547a(hus);
    }

    /* renamed from: a */
    public final void mo1828a(hut hut) {
        this.f18267h.m3548a(hut);
    }

    /* renamed from: d */
    public final Looper mo1849d() {
        return this.f18262c;
    }

    /* renamed from: e */
    public final boolean mo1833e() {
        ied ied = this.f18268i;
        return ied != null && ied.mo1814d();
    }

    /* renamed from: b */
    public final void mo1829b() {
        boolean z = true;
        this.f18261b.lock();
        try {
            if (this.f18269j < 0) {
                Integer num = this.f18282w;
                if (num == null) {
                    this.f18282w = Integer.valueOf(idn.m12170a(this.f18264e.values()));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            htl.m3422a(this.f18282w != null, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            int intValue = this.f18282w.intValue();
            this.f18261b.lock();
            if (!(intValue == 3 || intValue == 1 || intValue == 2)) {
                z = false;
            }
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("Illegal sign-in mode: ");
            stringBuilder.append(intValue);
            htl.m3436b(z, stringBuilder.toString());
            m12171a(intValue);
            m12175h();
        } catch (Throwable th) {
        } finally {
            this.f18261b.unlock();
        }
        this.f18261b.unlock();
    }

    /* renamed from: c */
    public final void mo1832c() {
        this.f18261b.lock();
        try {
            hzx hzx = this.f18266g;
            for (ick ick : (ick[]) hzx.f6855c.toArray(hzx.f6854b)) {
                ick.m12067a(null);
                if (ick.m12070c()) {
                    hzx.f6855c.remove(ick);
                }
            }
            ied ied = this.f18268i;
            if (ied != null) {
                ied.mo1813c();
            }
            iek iek = this.f18280u;
            for (ieg ieg : iek.f6976a) {
                ieg.f6970a = null;
            }
            iek.f6976a.clear();
            for (ich ich : this.f18263d) {
                ich.m12067a(null);
                ich.m12064a();
            }
            this.f18263d.clear();
            if (this.f18268i != null) {
                m12192f();
                this.f18267h.m3546a();
                return;
            }
            this.f18261b.unlock();
        } finally {
            this.f18261b.unlock();
        }
    }

    /* renamed from: b */
    public final void mo1830b(hus hus) {
        hwd hwd = this.f18267h;
        htl.m3431b((Object) hus);
        synchronized (hwd.f6771i) {
            if (!hwd.f6764b.remove(hus)) {
                String valueOf = String.valueOf(hus);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
                stringBuilder.append("unregisterConnectionCallbacks(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" not found");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else if (hwd.f6769g) {
                hwd.f6765c.add(hus);
            }
        }
    }

    /* renamed from: b */
    public final void mo1831b(hut hut) {
        hwd hwd = this.f18267h;
        htl.m3431b((Object) hut);
        synchronized (hwd.f6771i) {
            if (!hwd.f6766d.remove(hut)) {
                String valueOf = String.valueOf(hut);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 57);
                stringBuilder.append("unregisterConnectionFailedListener(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" not found");
                Log.w("GmsClientEvents", stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    public final ich mo1846a(ich ich) {
        htl.m3436b(ich.f21699e != null, (Object) "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f18264e.containsKey(ich.f21699e);
        huh huh = ich.f21700f;
        String str = huh != null ? huh.f6675a : "the API";
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 65);
        stringBuilder.append("GoogleApiClient is not configured to use ");
        stringBuilder.append(str);
        stringBuilder.append(" required for this call.");
        htl.m3436b(containsKey, stringBuilder.toString());
        this.f18261b.lock();
        try {
            ied ied = this.f18268i;
            if (ied == null) {
                this.f18263d.add(ich);
            } else {
                ich = ied.mo1809a(ich);
                this.f18261b.unlock();
            }
            return ich;
        } finally {
            this.f18261b.unlock();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m12172a(idn idn) {
        idn.f18261b.lock();
        try {
            if (idn.f18271l) {
                idn.m12175h();
            }
            idn.f18261b.unlock();
        } catch (Throwable th) {
            idn.f18261b.unlock();
        }
    }

    /* renamed from: b */
    public final ich mo1848b(ich ich) {
        htl.m3436b(ich.f21699e != null, (Object) "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f18264e.containsKey(ich.f21699e);
        huh huh = ich.f21700f;
        String str = huh != null ? huh.f6675a : "the API";
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 65);
        stringBuilder.append("GoogleApiClient is not configured to use ");
        stringBuilder.append(str);
        stringBuilder.append(" required for this call.");
        htl.m3436b(containsKey, stringBuilder.toString());
        this.f18261b.lock();
        try {
            ied ied = this.f18268i;
            if (ied != null) {
                if (this.f18271l) {
                    this.f18263d.add(ich);
                    while (!this.f18263d.isEmpty()) {
                        ich ich2 = (ich) this.f18263d.remove();
                        this.f18266g.m3596a(ich2);
                        ich2.m16019b(Status.f20465b);
                    }
                    this.f18261b.unlock();
                } else {
                    ich = ied.mo1811b(ich);
                }
                return ich;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.f18261b.unlock();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m12174b(idn idn) {
        idn.f18261b.lock();
        try {
            if (idn.m12192f()) {
                idn.m12175h();
            }
            idn.f18261b.unlock();
        } catch (Throwable th) {
            idn.f18261b.unlock();
        }
    }

    /* renamed from: a */
    public final void mo1817a(ConnectionResult connectionResult) {
        if (!huc.m3458a(this.f18270k, connectionResult.f20458b)) {
            m12192f();
        }
        if (!this.f18271l) {
            hwd hwd = this.f18267h;
            htl.m3422a(Looper.myLooper() == hwd.f6770h.getLooper(), (Object) "onConnectionFailure must only be called on the Handler thread");
            hwd.f6770h.removeMessages(1);
            synchronized (hwd.f6771i) {
                ArrayList arrayList = new ArrayList(hwd.f6766d);
                int i = hwd.f6768f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hut hut = (hut) it.next();
                    if (!hwd.f6767e || hwd.f6768f.get() != i) {
                        break;
                    } else if (hwd.f6766d.contains(hut)) {
                        hut.mo1226a(connectionResult);
                    }
                }
            }
            this.f18267h.m3546a();
        }
    }

    /* renamed from: a */
    public final void mo1815a(int i, boolean z) {
        int i2 = 0;
        if (!(i != 1 || z || this.f18271l)) {
            this.f18271l = true;
            if (this.f18276q == null) {
                this.f18276q = hua.m11983a(this.f18270k.getApplicationContext(), new iec(this));
            }
            idp idp = this.f18274o;
            idp.sendMessageDelayed(idp.obtainMessage(1), this.f18272m);
            idp = this.f18274o;
            idp.sendMessageDelayed(idp.obtainMessage(2), this.f18273n);
        }
        for (ick c : (ick[]) this.f18266g.f6855c.toArray(hzx.f6854b)) {
            c.m12069c(hzx.f6853a);
        }
        hwd hwd = this.f18267h;
        htl.m3422a(Looper.myLooper() == hwd.f6770h.getLooper(), (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        hwd.f6770h.removeMessages(1);
        synchronized (hwd.f6771i) {
            hwd.f6769g = true;
            ArrayList arrayList = new ArrayList(hwd.f6764b);
            int i3 = hwd.f6768f.get();
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                hus hus = (hus) obj;
                if (!hwd.f6767e || hwd.f6768f.get() != i3) {
                    break;
                } else if (hwd.f6764b.contains(hus)) {
                    hus.mo1224a(i);
                }
            }
            hwd.f6765c.clear();
            hwd.f6769g = false;
        }
        this.f18267h.m3546a();
        if (i == 2) {
            m12175h();
        }
    }

    /* renamed from: a */
    private final void m12171a(int i) {
        Integer num = this.f18282w;
        if (num == null) {
            this.f18282w = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String valueOf = String.valueOf(idn.m12173b(i));
            String valueOf2 = String.valueOf(idn.m12173b(this.f18282w.intValue()));
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length());
            stringBuilder.append("Cannot use sign-in mode: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(". Mode was already set to ");
            stringBuilder.append(valueOf2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        if (this.f18268i == null) {
            Object obj = null;
            for (huo huo : this.f18264e.values()) {
                if (huo.mo3476f()) {
                    obj = 1;
                }
                huo.m11998g();
            }
            switch (this.f18282w.intValue()) {
                case 1:
                    if (obj == null) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    }
                    break;
                case 2:
                    if (obj != null) {
                        Context context = this.f18270k;
                        Lock lock = this.f18261b;
                        Looper looper = this.f18262c;
                        huc huc = this.f18275p;
                        Map map = this.f18264e;
                        hvx hvx = this.f18277r;
                        Map map2 = this.f18278s;
                        huk huk = this.f18279t;
                        ArrayList arrayList = this.f18281v;
                        Map ihVar = new ih();
                        Map ihVar2 = new ih();
                        for (Entry entry : map.entrySet()) {
                            huo huo2 = (huo) entry.getValue();
                            huo2.m11998g();
                            if (huo2.mo3476f()) {
                                ihVar.put((hum) entry.getKey(), huo2);
                            } else {
                                ihVar2.put((hum) entry.getKey(), huo2);
                            }
                        }
                        htl.m3422a(ihVar.isEmpty() ^ 1, (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                        Map ihVar3 = new ih();
                        Map ihVar4 = new ih();
                        for (huh huh : map2.keySet()) {
                            hum b = huh.m3471b();
                            if (ihVar.containsKey(b)) {
                                ihVar3.put(huh, (Boolean) map2.get(huh));
                            } else if (ihVar2.containsKey(b)) {
                                ihVar4.put(huh, (Boolean) map2.get(huh));
                            } else {
                                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            int i3 = i2 + 1;
                            ico ico = (ico) arrayList.get(i2);
                            if (ihVar3.containsKey(ico.f18175a)) {
                                arrayList2.add(ico);
                                i2 = i3;
                            } else if (ihVar4.containsKey(ico.f18175a)) {
                                arrayList3.add(ico);
                                i2 = i3;
                            } else {
                                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                            }
                        }
                        this.f18268i = new icq(context, this, lock, looper, huc, ihVar, ihVar2, hvx, huk, arrayList2, arrayList3, ihVar3, ihVar4);
                        return;
                    }
                    break;
            }
            this.f18268i = new idr(this.f18270k, this, this.f18261b, this.f18262c, this.f18275p, this.f18264e, this.f18277r, this.f18278s, this.f18279t, this.f18281v, this);
        }
    }

    /* renamed from: a */
    public final void mo1816a(Bundle bundle) {
        boolean z = true;
        int i = 0;
        while (!this.f18263d.isEmpty()) {
            mo1848b((ich) this.f18263d.remove());
        }
        hwd hwd = this.f18267h;
        htl.m3422a(Looper.myLooper() == hwd.f6770h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (hwd.f6771i) {
            htl.m3421a(hwd.f6769g ^ 1);
            hwd.f6770h.removeMessages(1);
            hwd.f6769g = true;
            if (hwd.f6765c.size() != 0) {
                z = false;
            }
            htl.m3421a(z);
            ArrayList arrayList = new ArrayList(hwd.f6764b);
            int i2 = hwd.f6768f.get();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                hus hus = (hus) obj;
                if (!hwd.f6767e || !hwd.f6763a.mo1850d() || hwd.f6768f.get() != i2) {
                    break;
                } else if (!hwd.f6765c.contains(hus)) {
                    hus.mo1225a(bundle);
                }
            }
            hwd.f6765c.clear();
            hwd.f6769g = false;
        }
    }

    /* renamed from: a */
    public final ieg mo1847a(Object obj) {
        this.f18261b.lock();
        ieg a;
        try {
            iek iek = this.f18280u;
            a = iek.m3711a(obj, this.f18262c, "NO_TYPE");
            iek.f6976a.add(a);
            return a;
        } finally {
            a = this.f18261b;
            a.unlock();
        }
    }

    /* renamed from: h */
    private final void m12175h() {
        this.f18267h.f6767e = true;
        this.f18268i.mo1812b();
    }

    /* renamed from: f */
    final boolean m12192f() {
        if (!this.f18271l) {
            return false;
        }
        this.f18271l = false;
        this.f18274o.removeMessages(2);
        this.f18274o.removeMessages(1);
        ieb ieb = this.f18276q;
        if (ieb == null) {
            return true;
        }
        ieb.m3696a();
        this.f18276q = null;
        return true;
    }

    /* renamed from: g */
    final String m12193g() {
        Writer stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        Object obj = "";
        printWriter.append(obj).append("mContext=").println(this.f18270k);
        printWriter.append(obj).append("mResuming=").print(this.f18271l);
        printWriter.append(" mWorkQueue.size()=").print(this.f18263d.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f18266g.f6855c.size());
        ied ied = this.f18268i;
        if (ied != null) {
            ied.mo1810a(obj, null, printWriter, null);
        }
        return stringWriter.toString();
    }
}
