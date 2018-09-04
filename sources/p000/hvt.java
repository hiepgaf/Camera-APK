package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: hvt */
public final class hvt implements ServiceConnection {
    /* renamed from: a */
    private final int f6743a;
    /* renamed from: b */
    private final /* synthetic */ hvm f6744b;

    public hvt(hvm hvm, int i) {
        this.f6744b = hvm;
        this.f6743a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            synchronized (this.f6744b.f6720e) {
                hwr hwr;
                hvm hvm = this.f6744b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    hwr = (queryLocalInterface != null && (queryLocalInterface instanceof hwr)) ? (hwr) queryLocalInterface : new hwr(iBinder);
                } else {
                    hwr = null;
                }
                hvm.f6721f = hwr;
            }
            this.f6744b.m3504a(0, this.f6743a);
            return;
        }
        this.f6744b.m3504a(8, this.f6743a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6744b.f6720e) {
            this.f6744b.f6721f = null;
        }
        Handler handler = this.f6744b.f6719d;
        handler.sendMessage(handler.obtainMessage(4, this.f6743a, 1));
    }
}
