package p000;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hwd */
public final class hwd implements Callback {
    /* renamed from: a */
    public final hwe f6763a;
    /* renamed from: b */
    public final ArrayList f6764b = new ArrayList();
    /* renamed from: c */
    public final ArrayList f6765c = new ArrayList();
    /* renamed from: d */
    public final ArrayList f6766d = new ArrayList();
    /* renamed from: e */
    public volatile boolean f6767e = false;
    /* renamed from: f */
    public final AtomicInteger f6768f = new AtomicInteger(0);
    /* renamed from: g */
    public boolean f6769g = false;
    /* renamed from: h */
    public final Handler f6770h;
    /* renamed from: i */
    public final Object f6771i = new Object();

    public hwd(Looper looper, hwe hwe) {
        this.f6763a = hwe;
        this.f6770h = new Handler(looper, this);
    }

    /* renamed from: a */
    public final void m3546a() {
        this.f6767e = false;
        this.f6768f.incrementAndGet();
    }

    /* renamed from: a */
    public final void m3547a(hus hus) {
        htl.m3431b((Object) hus);
        synchronized (this.f6771i) {
            if (this.f6764b.contains(hus)) {
                String valueOf = String.valueOf(hus);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 62);
                stringBuilder.append("registerConnectionCallbacks(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is already registered");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else {
                this.f6764b.add(hus);
            }
        }
        if (this.f6763a.mo1850d()) {
            Handler handler = this.f6770h;
            handler.sendMessage(handler.obtainMessage(1, hus));
        }
    }

    /* renamed from: a */
    public final void m3548a(hut hut) {
        htl.m3431b((Object) hut);
        synchronized (this.f6771i) {
            if (this.f6766d.contains(hut)) {
                String valueOf = String.valueOf(hut);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 67);
                stringBuilder.append("registerConnectionFailedListener(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is already registered");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else {
                this.f6766d.add(hut);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            hus hus = (hus) message.obj;
            synchronized (this.f6771i) {
                if (this.f6767e && this.f6763a.mo1850d() && this.f6764b.contains(hus)) {
                    this.f6763a.mo1851l();
                    hus.mo1225a(null);
                }
            }
            return true;
        }
        int i = message.what;
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("Don't know how to handle message: ");
        stringBuilder.append(i);
        Log.wtf("GmsClientEvents", stringBuilder.toString(), new Exception());
        return false;
    }
}
