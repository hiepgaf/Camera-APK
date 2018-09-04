package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* compiled from: PG */
/* renamed from: boh */
final class boh implements ServiceConnection {
    /* renamed from: a */
    private final /* synthetic */ bog f1365a;

    boh(bog bog) {
        this.f1365a = bog;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f1365a.f1358b) {
            kaq kaq;
            bog bog = this.f1365a;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.systemui.elmyra.IElmyraService");
                if (queryLocalInterface instanceof kaq) {
                    kaq = (kaq) queryLocalInterface;
                } else {
                    kaq = new kar(iBinder);
                }
            } else {
                kaq = null;
            }
            bog.f1361e = kaq;
            bog bog2 = this.f1365a;
            if (bog2.f1362f != null) {
                try {
                    bog2.f1361e.mo2080a(bog2.f1363g, (IBinder) bog2.f1360d);
                } catch (Throwable e) {
                    Log.e("ElmyraClient", "registerSettingsListener()", e);
                }
            }
            Log.i("ElmyraClient", "Elmyra service connected.");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f1365a.f1358b) {
            this.f1365a.f1361e = null;
        }
    }
}
