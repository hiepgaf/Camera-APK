package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.zzc;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hvm */
public abstract class hvm {
    /* renamed from: a */
    public int f6716a;
    /* renamed from: b */
    public long f6717b;
    /* renamed from: c */
    public final Context f6718c;
    /* renamed from: d */
    public final Handler f6719d;
    /* renamed from: e */
    public final Object f6720e = new Object();
    /* renamed from: f */
    public hwr f6721f;
    /* renamed from: g */
    public hvs f6722g;
    /* renamed from: h */
    public final ArrayList f6723h = new ArrayList();
    /* renamed from: i */
    public final hvo f6724i;
    /* renamed from: j */
    public final hvp f6725j;
    /* renamed from: k */
    public AtomicInteger f6726k = new AtomicInteger(0);
    /* renamed from: l */
    private long f6727l;
    /* renamed from: m */
    private int f6728m;
    /* renamed from: n */
    private long f6729n;
    /* renamed from: o */
    private final hwf f6730o;
    /* renamed from: p */
    private final Object f6731p = new Object();
    /* renamed from: q */
    private IInterface f6732q;
    /* renamed from: r */
    private hvt f6733r;
    /* renamed from: s */
    private int f6734s = 1;
    /* renamed from: t */
    private final int f6735t;
    /* renamed from: u */
    private final String f6736u;

    protected hvm(Context context, Looper looper, hwf hwf, huc huc, int i, hvo hvo, hvp hvp, String str) {
        this.f6718c = (Context) htl.m3432b((Object) context, (Object) "Context must not be null");
        htl.m3432b((Object) looper, (Object) "Looper must not be null");
        this.f6730o = (hwf) htl.m3432b((Object) hwf, (Object) "Supervisor must not be null");
        htl.m3432b((Object) huc, (Object) "API availability must not be null");
        this.f6719d = new hvq(this, looper);
        this.f6735t = i;
        this.f6724i = hvo;
        this.f6725j = hvp;
        this.f6736u = str;
    }

    /* renamed from: i */
    private final String mo3477i() {
        String str = this.f6736u;
        return str == null ? this.f6718c.getClass().getName() : str;
    }

    /* renamed from: a */
    public abstract IInterface mo3467a(IBinder iBinder);

    /* renamed from: a */
    public abstract String mo3468a();

    /* renamed from: a */
    protected final void m3504a(int i, int i2) {
        Handler handler = this.f6719d;
        handler.sendMessage(handler.obtainMessage(5, i2, -1, new hvw(this, i)));
    }

    /* renamed from: a */
    public void mo3480a(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f6719d;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new hvv(this, i, iBinder, bundle)));
    }

    /* renamed from: a */
    protected final void m3507a(ConnectionResult connectionResult) {
        this.f6728m = connectionResult.f20458b;
        this.f6729n = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo3481a(hvs hvs) {
        this.f6722g = (hvs) htl.m3432b((Object) hvs, (Object) "Connection progress callbacks cannot be null.");
        m3506a(2, null);
    }

    /* renamed from: a */
    public final void m3509a(hvs hvs, int i, PendingIntent pendingIntent) {
        this.f6722g = (hvs) htl.m3432b((Object) hvs, (Object) "Connection progress callbacks cannot be null.");
        Handler handler = this.f6719d;
        handler.sendMessage(handler.obtainMessage(3, this.f6726k.get(), i, pendingIntent));
    }

    /* renamed from: a */
    public final void m3511a(String str, PrintWriter printWriter) {
        synchronized (this.f6731p) {
            int i = this.f6734s;
            IInterface iInterface = this.f6732q;
        }
        synchronized (this.f6720e) {
            hwr hwr = this.f6721f;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("CONNECTING");
                break;
            case 3:
                printWriter.print("CONNECTED");
                break;
            case 4:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (iInterface != null) {
            printWriter.append(mo3469b()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        } else {
            printWriter.append("null");
        }
        printWriter.append(" mServiceBroker=");
        if (hwr != null) {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(hwr.asBinder())));
        } else {
            printWriter.println("null");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f6727l > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f6727l;
            String valueOf = String.valueOf(simpleDateFormat.format(new Date(j)));
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
            stringBuilder.append(j);
            stringBuilder.append(" ");
            stringBuilder.append(valueOf);
            append.println(stringBuilder.toString());
        }
        if (this.f6717b > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f6716a;
            switch (i2) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(String.valueOf(i2));
                    break;
            }
            append = printWriter.append(" lastSuspendedTime=");
            j = this.f6717b;
            valueOf = String.valueOf(simpleDateFormat.format(new Date(j)));
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
            stringBuilder.append(j);
            stringBuilder.append(" ");
            stringBuilder.append(valueOf);
            append.println(stringBuilder.toString());
        }
        if (this.f6729n > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(htl.m3401a(this.f6728m));
            append = printWriter.append(" lastFailedTime=");
            j = this.f6729n;
            String valueOf2 = String.valueOf(simpleDateFormat.format(new Date(j)));
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
            stringBuilder2.append(j);
            stringBuilder2.append(" ");
            stringBuilder2.append(valueOf2);
            append.println(stringBuilder2.toString());
        }
    }

    /* renamed from: a */
    final boolean m3512a(int i, int i2, IInterface iInterface) {
        synchronized (this.f6731p) {
            if (this.f6734s == i) {
                m3506a(i2, iInterface);
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    public abstract String mo3469b();

    /* renamed from: c */
    public void mo3574c() {
        this.f6726k.incrementAndGet();
        synchronized (this.f6723h) {
            int size = this.f6723h.size();
            for (int i = 0; i < size; i++) {
                ((hvr) this.f6723h.get(i)).m3534d();
            }
            this.f6723h.clear();
        }
        synchronized (this.f6720e) {
            this.f6721f = null;
        }
        m3506a(1, null);
    }

    /* renamed from: d */
    public final boolean m3515d() {
        boolean z;
        synchronized (this.f6731p) {
            z = this.f6734s == 3;
        }
        return z;
    }

    /* renamed from: e */
    public final boolean m3516e() {
        boolean z;
        synchronized (this.f6731p) {
            z = this.f6734s == 2;
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo3476f() {
        return false;
    }

    /* renamed from: g */
    public final boolean m3518g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3482h() {
        return true;
    }

    /* renamed from: j */
    public Account mo3111j() {
        return null;
    }

    /* renamed from: k */
    public Bundle mo3478k() {
        return new Bundle();
    }

    /* renamed from: l */
    public final Bundle m3522l() {
        return null;
    }

    /* renamed from: m */
    public String mo3483m() {
        return "com.google.android.gms";
    }

    /* renamed from: n */
    public zzc[] mo3112n() {
        return new zzc[0];
    }

    /* renamed from: o */
    public final void m3525o() {
        if (!m3515d()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: p */
    public final IInterface m3526p() {
        IInterface iInterface;
        synchronized (this.f6731p) {
            if (this.f6734s == 4) {
                throw new DeadObjectException();
            }
            m3525o();
            htl.m3422a(this.f6732q != null, (Object) "Client is connected but service is null");
            iInterface = this.f6732q;
        }
        return iInterface;
    }

    /* renamed from: q */
    protected Set mo3113q() {
        return Collections.EMPTY_SET;
    }

    /* renamed from: a */
    final void m3506a(int i, IInterface iInterface) {
        boolean z = true;
        if ((i == 3) != (iInterface != null)) {
            z = false;
        }
        htl.m3435b(z);
        synchronized (this.f6731p) {
            this.f6734s = i;
            this.f6732q = iInterface;
            hwf hwf;
            String a;
            String m;
            ServiceConnection serviceConnection;
            switch (i) {
                case 1:
                    if (this.f6733r != null) {
                        hwf = this.f6730o;
                        a = mo3468a();
                        m = mo3483m();
                        serviceConnection = this.f6733r;
                        mo3477i();
                        hwf.m3552a(a, m, serviceConnection);
                        this.f6733r = null;
                        break;
                    }
                    break;
                case 2:
                    String valueOf;
                    StringBuilder stringBuilder;
                    if (this.f6733r != null) {
                        valueOf = String.valueOf(mo3468a());
                        a = String.valueOf(mo3483m());
                        stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(a).length());
                        stringBuilder.append("Calling connect() while still connected, missing disconnect() for ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(" on ");
                        stringBuilder.append(a);
                        Log.e("GmsClient", stringBuilder.toString());
                        hwf = this.f6730o;
                        a = mo3468a();
                        m = mo3483m();
                        serviceConnection = this.f6733r;
                        mo3477i();
                        hwf.m3552a(a, m, serviceConnection);
                        this.f6726k.incrementAndGet();
                    }
                    this.f6733r = new hvt(this, this.f6726k.get());
                    hwf = this.f6730o;
                    a = mo3468a();
                    m = mo3483m();
                    serviceConnection = this.f6733r;
                    mo3477i();
                    if (!hwf.mo1782a(new hwg(a, m), serviceConnection)) {
                        valueOf = String.valueOf(mo3468a());
                        a = String.valueOf(mo3483m());
                        stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(a).length());
                        stringBuilder.append("unable to connect to service: ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(" on ");
                        stringBuilder.append(a);
                        Log.e("GmsClient", stringBuilder.toString());
                        m3504a(16, this.f6726k.get());
                        break;
                    }
                    break;
                case 3:
                    this.f6727l = System.currentTimeMillis();
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void m3510a(hwk hwk, Set set) {
        Throwable e;
        Bundle k = mo3478k();
        zzj zzj = new zzj(this.f6735t);
        zzj.f20496a = this.f6718c.getPackageName();
        zzj.f20499d = k;
        if (set != null) {
            zzj.f20498c = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo3476f()) {
            zzj.f20500e = mo3111j() == null ? new Account("<<default account>>", "com.google") : mo3111j();
            if (hwk != null) {
                zzj.f20497b = hwk.asBinder();
            }
        }
        zzj.f20501f = mo3112n();
        Parcel obtain;
        Parcel obtain2;
        try {
            synchronized (this.f6720e) {
                hwr hwr = this.f6721f;
                if (hwr == null) {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                } else {
                    hwp hwq = new hwq(this, this.f6726k.get());
                    obtain = Parcel.obtain();
                    obtain2 = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(hwq.asBinder());
                    obtain.writeInt(1);
                    zzj.writeToParcel(obtain, 0);
                    hwr.f6783a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        } catch (Throwable e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            Handler handler = this.f6719d;
            handler.sendMessage(handler.obtainMessage(4, this.f6726k.get(), 1));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException e4) {
            e2 = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            mo3480a(8, null, null, this.f6726k.get());
        } catch (RuntimeException e5) {
            e2 = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            mo3480a(8, null, null, this.f6726k.get());
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
