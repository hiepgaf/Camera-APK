package p000;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* compiled from: PG */
/* renamed from: aox */
public final class aox implements aou {
    /* renamed from: a */
    public final aov f19802a;
    /* renamed from: b */
    public boolean f19803b;
    /* renamed from: c */
    private final Context f19804c;
    /* renamed from: d */
    private boolean f19805d;
    /* renamed from: e */
    private final BroadcastReceiver f19806e = new aoy(this);

    public aox(Context context, aov aov) {
        this.f19804c = context.getApplicationContext();
        this.f19802a = aov;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    static boolean m14684a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) aqe.m585a((ConnectivityManager) context.getSystemService("connectivity"), "Argument must not be null")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (Throwable e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo8b() {
    }

    /* renamed from: c */
    public final void mo9c() {
        if (!this.f19805d) {
            this.f19803b = aox.m14684a(this.f19804c);
            try {
                this.f19804c.registerReceiver(this.f19806e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f19805d = true;
            } catch (Throwable e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo10d() {
        if (this.f19805d) {
            this.f19804c.unregisterReceiver(this.f19806e);
            this.f19805d = false;
        }
    }
}
