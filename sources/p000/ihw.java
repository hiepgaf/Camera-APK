package p000;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.zzc;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ihw */
final class ihw {
    /* renamed from: a */
    public final Map f7005a = new HashMap();

    ihw() {
    }

    /* renamed from: a */
    public final void m3757a(IBinder iBinder) {
        synchronized (this.f7005a) {
            iht a = ihu.m12227a(iBinder);
            iho iil = new iil();
            for (Entry entry : this.f7005a.entrySet()) {
                iip iip = (iip) entry.getValue();
                try {
                    a.mo1868a(iil, new zzc(iip));
                    if (Log.isLoggable("WearableClient", 2)) {
                        String valueOf = String.valueOf(entry.getKey());
                        String valueOf2 = String.valueOf(iip);
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 27) + String.valueOf(valueOf2).length());
                        stringBuilder.append("onPostInitHandler: added: ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append("/");
                        stringBuilder.append(valueOf2);
                        Log.d("WearableClient", stringBuilder.toString());
                    }
                } catch (RemoteException e) {
                    String valueOf3 = String.valueOf(entry.getKey());
                    String valueOf4 = String.valueOf(iip);
                    StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf3).length() + 32) + String.valueOf(valueOf4).length());
                    stringBuilder2.append("onPostInitHandler: Didn't add: ");
                    stringBuilder2.append(valueOf3);
                    stringBuilder2.append("/");
                    stringBuilder2.append(valueOf4);
                    Log.d("WearableClient", stringBuilder2.toString());
                }
            }
        }
    }
}
