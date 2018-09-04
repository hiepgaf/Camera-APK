package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: hwh */
final class hwh extends hwf implements Callback {
    /* renamed from: a */
    private final HashMap f18123a = new HashMap();
    /* renamed from: b */
    private final Context f18124b;
    /* renamed from: c */
    private final Handler f18125c;
    /* renamed from: d */
    private final hwt f18126d;
    /* renamed from: e */
    private final long f18127e;
    /* renamed from: f */
    private final long f18128f;

    hwh(Context context) {
        this.f18124b = context.getApplicationContext();
        this.f18125c = new Handler(context.getMainLooper(), this);
        this.f18126d = hwt.m3567a();
        this.f18127e = 5000;
        this.f18128f = 300000;
    }

    public final boolean handleMessage(Message message) {
        hwg hwg;
        switch (message.what) {
            case 0:
                synchronized (this.f18123a) {
                    hwg = (hwg) message.obj;
                    ServiceConnection serviceConnection = (hwi) this.f18123a.get(hwg);
                    if (serviceConnection != null && serviceConnection.m3559b()) {
                        if (serviceConnection.f6778c) {
                            serviceConnection.f6782g.f18125c.removeMessages(1, serviceConnection.f6780e);
                            hwt.m3568a(serviceConnection.f6782g.f18124b, serviceConnection);
                            serviceConnection.f6778c = false;
                            serviceConnection.f6777b = 2;
                        }
                        this.f18123a.remove(hwg);
                    }
                }
                return true;
            case 1:
                synchronized (this.f18123a) {
                    hwg = (hwg) message.obj;
                    hwi hwi = (hwi) this.f18123a.get(hwg);
                    if (hwi != null && hwi.f6777b == 3) {
                        String valueOf = String.valueOf(hwg);
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
                        stringBuilder.append("Timeout waiting for ServiceConnection callback ");
                        stringBuilder.append(valueOf);
                        Log.wtf("GmsClientSupervisor", stringBuilder.toString(), new Exception());
                        ComponentName componentName = hwi.f6781f;
                        if (componentName == null) {
                            componentName = null;
                        }
                        if (componentName == null) {
                            componentName = new ComponentName(hwg.f6774a, "unknown");
                        }
                        hwi.onServiceDisconnected(componentName);
                    }
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    protected final boolean mo1782a(hwg hwg, ServiceConnection serviceConnection) {
        boolean z;
        htl.m3432b((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f18123a) {
            hwi hwi = (hwi) this.f18123a.get(hwg);
            if (hwi != null) {
                this.f18125c.removeMessages(0, hwg);
                if (!hwi.m3557a(serviceConnection)) {
                    hwi.m3558b(serviceConnection);
                    switch (hwi.f6777b) {
                        case 1:
                            serviceConnection.onServiceConnected(hwi.f6781f, hwi.f6779d);
                            break;
                        case 2:
                            hwi.m3556a();
                            break;
                    }
                }
                String valueOf = String.valueOf(hwg);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 81);
                stringBuilder.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
            hwi = new hwi(this, hwg);
            hwi.m3558b(serviceConnection);
            hwi.m3556a();
            this.f18123a.put(hwg, hwi);
            z = hwi.f6778c;
        }
        return z;
    }

    /* renamed from: b */
    protected final void mo1783b(hwg hwg, ServiceConnection serviceConnection) {
        htl.m3432b((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f18123a) {
            hwi hwi = (hwi) this.f18123a.get(hwg);
            String valueOf;
            StringBuilder stringBuilder;
            if (hwi == null) {
                valueOf = String.valueOf(hwg);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 50);
                stringBuilder.append("Nonexistent connection status for service config: ");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (hwi.m3557a(serviceConnection)) {
                hwt.m3571c();
                hwi.f6776a.remove(serviceConnection);
                if (hwi.m3559b()) {
                    this.f18125c.sendMessageDelayed(this.f18125c.obtainMessage(0, hwg), this.f18127e);
                }
            } else {
                valueOf = String.valueOf(hwg);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 76);
                stringBuilder.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }
}
