package p000;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.internal.zzbgq;

/* renamed from: idj */
final class idj extends ids {
    /* renamed from: b */
    private final /* synthetic */ idb f18257b;
    /* renamed from: c */
    private final /* synthetic */ zzbgq f18258c;

    idj(idq idq, idb idb, zzbgq zzbgq) {
        this.f18257b = idb;
        this.f18258c = zzbgq;
        super(idq);
    }

    /* renamed from: a */
    public final void mo1843a() {
        idb idb = this.f18257b;
        zzbgq zzbgq = this.f18258c;
        if (idb.m12148b(0)) {
            ConnectionResult connectionResult = zzbgq.f20623a;
            if (connectionResult.m15094b()) {
                zzaf zzaf = zzbgq.f20624b;
                connectionResult = zzaf.f20492b;
                if (connectionResult.m15094b()) {
                    idb.f18231f = true;
                    idb.f18232g = hwl.m12012a(zzaf.f20491a);
                    idb.f18233h = zzaf.f20493c;
                    idb.f18234i = zzaf.f20494d;
                    idb.m12151e();
                    return;
                }
                String valueOf = String.valueOf(connectionResult);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 48);
                stringBuilder.append("Sign-in succeeded with resolve account failure: ");
                stringBuilder.append(valueOf);
                Log.wtf("GoogleApiClientConnecting", stringBuilder.toString(), new Exception());
                idb.m12146b(connectionResult);
            } else if (idb.m12143a(connectionResult)) {
                idb.m12152f();
                idb.m12151e();
            } else {
                idb.m12146b(connectionResult);
            }
        }
    }
}
