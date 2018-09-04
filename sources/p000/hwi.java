package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: hwi */
final class hwi implements ServiceConnection {
    /* renamed from: a */
    public final Set f6776a = new HashSet();
    /* renamed from: b */
    public int f6777b = 2;
    /* renamed from: c */
    public boolean f6778c;
    /* renamed from: d */
    public IBinder f6779d;
    /* renamed from: e */
    public final hwg f6780e;
    /* renamed from: f */
    public ComponentName f6781f;
    /* renamed from: g */
    public final /* synthetic */ hwh f6782g;

    public hwi(hwh hwh, hwg hwg) {
        this.f6782g = hwh;
        this.f6780e = hwg;
    }

    /* renamed from: a */
    public final void m3556a() {
        boolean z;
        this.f6777b = 3;
        this.f6782g.f18126d;
        Context c = this.f6782g.f18124b;
        Intent a = this.f6780e.m3555a();
        if (hwt.m3569a(c, a)) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            z = false;
        } else {
            z = c.bindService(a, this, ScriptIntrinsicBLAS.RsBlas_ctrmm);
        }
        this.f6778c = z;
        if (this.f6778c) {
            this.f6782g.f18125c.sendMessageDelayed(this.f6782g.f18125c.obtainMessage(1, this.f6780e), this.f6782g.f18128f);
            return;
        }
        this.f6777b = 2;
        try {
            this.f6782g.f18126d;
            hwt.m3568a(this.f6782g.f18124b, (ServiceConnection) this);
        } catch (IllegalArgumentException e) {
        }
    }

    /* renamed from: a */
    public final boolean m3557a(ServiceConnection serviceConnection) {
        return this.f6776a.contains(serviceConnection);
    }

    /* renamed from: b */
    public final void m3558b(ServiceConnection serviceConnection) {
        this.f6782g.f18126d;
        this.f6782g.f18124b;
        this.f6780e.m3555a();
        hwt.m3570b();
        this.f6776a.add(serviceConnection);
    }

    /* renamed from: b */
    public final boolean m3559b() {
        return this.f6776a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f6782g.f18123a) {
            this.f6782g.f18125c.removeMessages(1, this.f6780e);
            this.f6779d = iBinder;
            this.f6781f = componentName;
            for (ServiceConnection onServiceConnected : this.f6776a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f6777b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6782g.f18123a) {
            this.f6782g.f18125c.removeMessages(1, this.f6780e);
            this.f6779d = null;
            this.f6781f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f6776a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f6777b = 2;
        }
    }
}
