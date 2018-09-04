package p000;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: idv */
public final class idv implements Callback {
    /* renamed from: a */
    public static final Status f6945a = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* renamed from: b */
    public static final Status f6946b = new Status(4, "The user must be signed in to make this API call.");
    /* renamed from: c */
    public static final Object f6947c = new Object();
    /* renamed from: l */
    private static idv f6948l;
    /* renamed from: d */
    public final Context f6949d;
    /* renamed from: e */
    public final AtomicInteger f6950e = new AtomicInteger(1);
    /* renamed from: f */
    public final AtomicInteger f6951f = new AtomicInteger(0);
    /* renamed from: g */
    public final Map f6952g = new ConcurrentHashMap(5, 0.75f, 1);
    /* renamed from: h */
    public final Handler f6953h;
    /* renamed from: i */
    private long f6954i = 5000;
    /* renamed from: j */
    private long f6955j = 120000;
    /* renamed from: k */
    private long f6956k = 10000;
    /* renamed from: m */
    private final hua f6957m;
    /* renamed from: n */
    private int f6958n = -1;
    /* renamed from: o */
    private final Set f6959o = new hwv();
    /* renamed from: p */
    private final Set f6960p = new hwv();

    private idv(Context context, Looper looper, hua hua) {
        this.f6949d = context;
        this.f6953h = new Handler(looper, this);
        this.f6957m = hua;
        Handler handler = this.f6953h;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: b */
    public final void m3695b() {
        Handler handler = this.f6953h;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final boolean handleMessage(Message message) {
        boolean z = false;
        ief ief;
        ief ief2;
        switch (message.what) {
            case 1:
                this.f6956k = !((Boolean) message.obj).booleanValue() ? 300000 : 10000;
                this.f6953h.removeMessages(12);
                for (icd icd : this.f6952g.keySet()) {
                    Handler handler = this.f6953h;
                    handler.sendMessageDelayed(handler.obtainMessage(12, icd), this.f6956k);
                }
                break;
            case 2:
                ice ice = (ice) message.obj;
                for (icd icd2 : ice.f6926a.keySet()) {
                    ief ief3 = (ief) this.f6952g.get(icd2);
                    if (ief3 == null) {
                        ice.m3667a(icd2, new ConnectionResult(13));
                        break;
                    } else if (ief3.m16046b()) {
                        ice.m3667a(icd2, ConnectionResult.f20457a);
                    } else if (ief3.m16052h() == null) {
                        htl.m3405a(ief3.f21725h.f6953h);
                        ief3.f21720c.add(ice);
                    } else {
                        ice.m3667a(icd2, ief3.m16052h());
                    }
                }
                break;
            case 3:
                for (ief ief4 : this.f6952g.values()) {
                    ief4.m16051g();
                    ief4.m16039a();
                }
                break;
            case 4:
            case 8:
            case 13:
                hzp hzp = (hzp) message.obj;
                ief2 = (ief) this.f6952g.get(hzp.f6848c.f6701b);
                if (ief2 == null) {
                    m3686a(hzp.f6848c);
                    ief2 = (ief) this.f6952g.get(hzp.f6848c.f6701b);
                }
                if (ief2.m16048d() && this.f6951f.get() != hzp.f6847b) {
                    hzp.f6846a.mo1804a(f6945a);
                    ief2.m16047c();
                    break;
                }
                ief2.m16045a(hzp.f6846a);
                break;
                break;
            case 5:
                StringBuilder stringBuilder;
                String valueOf;
                String valueOf2;
                StringBuilder stringBuilder2;
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                for (ief ief22 : this.f6952g.values()) {
                    if (ief22.f21722e == i) {
                        if (ief22 != null) {
                            stringBuilder = new StringBuilder(76);
                            stringBuilder.append("Could not find API instance ");
                            stringBuilder.append(i);
                            stringBuilder.append(" while trying to fail enqueued calls.");
                            Log.wtf("GoogleApiManager", stringBuilder.toString(), new Exception());
                            break;
                        }
                        valueOf = String.valueOf(huc.m3456a(connectionResult.f20458b));
                        valueOf2 = String.valueOf(connectionResult.f20460d);
                        stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(valueOf2).length());
                        stringBuilder2.append("Error resolution was canceled by the user, original error message: ");
                        stringBuilder2.append(valueOf);
                        stringBuilder2.append(": ");
                        stringBuilder2.append(valueOf2);
                        ief22.m16044a(new Status(17, stringBuilder2.toString()));
                        break;
                    }
                }
                ief22 = null;
                if (ief22 != null) {
                    stringBuilder = new StringBuilder(76);
                    stringBuilder.append("Could not find API instance ");
                    stringBuilder.append(i);
                    stringBuilder.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", stringBuilder.toString(), new Exception());
                } else {
                    valueOf = String.valueOf(huc.m3456a(connectionResult.f20458b));
                    valueOf2 = String.valueOf(connectionResult.f20460d);
                    stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(valueOf2).length());
                    stringBuilder2.append("Error resolution was canceled by the user, original error message: ");
                    stringBuilder2.append(valueOf);
                    stringBuilder2.append(": ");
                    stringBuilder2.append(valueOf2);
                    ief22.m16044a(new Status(17, stringBuilder2.toString()));
                }
            case 6:
                if (this.f6949d.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f6949d.getApplicationContext();
                    synchronized (icf.f6930a) {
                        if (!icf.f6930a.f6934e) {
                            application.registerActivityLifecycleCallbacks(icf.f6930a);
                            application.registerComponentCallbacks(icf.f6930a);
                            icf.f6930a.f6934e = true;
                        }
                    }
                    icf icf = icf.f6930a;
                    icg icg = new icg(this);
                    synchronized (icf.f6930a) {
                        icf.f6933d.add(icg);
                    }
                    icf = icf.f6930a;
                    if (!icf.f6932c.get()) {
                        RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!icf.f6932c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            icf.f6931b.set(true);
                        }
                    }
                    if (!icf.f6931b.get()) {
                        this.f6956k = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m3686a((hva) message.obj);
                break;
            case 9:
                if (this.f6952g.containsKey(message.obj)) {
                    ief4 = (ief) this.f6952g.get(message.obj);
                    htl.m3405a(ief4.f21725h.f6953h);
                    if (ief4.f21724g) {
                        ief4.m16039a();
                        break;
                    }
                }
                break;
            case 10:
                for (icd icd3 : this.f6960p) {
                    ((ief) this.f6952g.remove(icd3)).m16047c();
                }
                this.f6960p.clear();
                break;
            case 11:
                if (this.f6952g.containsKey(message.obj)) {
                    ief4 = (ief) this.f6952g.get(message.obj);
                    htl.m3405a(ief4.f21725h.f6953h);
                    if (ief4.f21724g) {
                        ief4.m16053i();
                        ief4.m16044a(huc.m3453a(ief4.f21725h.f6949d) != 18 ? new Status(8, "API failed to connect while resuming due to an unknown error.") : new Status(8, "Connection timed out while waiting for Google Play services update to complete."));
                        ief4.f21718a.mo3574c();
                        break;
                    }
                }
                break;
            case 12:
                if (this.f6952g.containsKey(message.obj)) {
                    ief4 = (ief) this.f6952g.get(message.obj);
                    htl.m3405a(ief4.f21725h.f6953h);
                    if (ief4.f21718a.m11995d() && ief4.f21721d.size() == 0) {
                        icx icx = ief4.f21719b;
                        if (!icx.f6937a.isEmpty()) {
                            z = true;
                        } else if (!icx.f6938b.isEmpty()) {
                            z = true;
                        }
                        if (!z) {
                            ief4.f21718a.mo3574c();
                            break;
                        }
                        ief4.m16054j();
                        break;
                    }
                }
                break;
            default:
                int i2 = message.what;
                StringBuilder stringBuilder3 = new StringBuilder(31);
                stringBuilder3.append("Unknown message id: ");
                stringBuilder3.append(i2);
                Log.w("GoogleApiManager", stringBuilder3.toString());
                return false;
        }
        return true;
    }

    /* renamed from: a */
    public static idv m3685a(Context context) {
        idv idv;
        synchronized (f6947c) {
            if (f6948l == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f6948l = new idv(context.getApplicationContext(), handlerThread.getLooper(), hua.f18117a);
            }
            idv = f6948l;
        }
        return idv;
    }

    /* renamed from: a */
    public final boolean m3694a(ConnectionResult connectionResult, int i) {
        hua hua = this.f6957m;
        Context context = this.f6949d;
        Parcelable a = !connectionResult.m15093a() ? huc.m3454a(context, connectionResult.f20458b, 0, null) : connectionResult.f20459c;
        if (a == null) {
            return false;
        }
        int i2 = connectionResult.f20458b;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", a);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        hua.m11984a(context, i2, PendingIntent.getActivity(context, 0, intent, 134217728));
        return true;
    }

    /* renamed from: a */
    private final void m3686a(hva hva) {
        icd icd = hva.f6701b;
        ief ief = (ief) this.f6952g.get(icd);
        if (ief == null) {
            ief = new ief(this, hva);
            this.f6952g.put(icd, ief);
        }
        if (ief.m16048d()) {
            this.f6960p.add(icd);
        }
        ief.m16039a();
    }
}
