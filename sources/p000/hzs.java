package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.internal.zzbgq;
import java.util.Set;

/* renamed from: hzs */
public final class hzs extends iaz implements hus, hut {
    /* renamed from: i */
    private static huk f21633i = iaq.f6875a;
    /* renamed from: a */
    public final Context f21634a;
    /* renamed from: b */
    public final Handler f21635b;
    /* renamed from: c */
    public final huk f21636c = f21633i;
    /* renamed from: d */
    public final boolean f21637d = true;
    /* renamed from: e */
    public Set f21638e;
    /* renamed from: f */
    public hvx f21639f;
    /* renamed from: g */
    public iau f21640g;
    /* renamed from: h */
    public hzu f21641h;

    public hzs(Context context, Handler handler) {
        super((byte) 0);
        this.f21634a = context;
        this.f21635b = handler;
    }

    /* renamed from: a */
    static /* synthetic */ void m15957a(hzs hzs, zzbgq zzbgq) {
        ConnectionResult connectionResult = zzbgq.f20623a;
        if (connectionResult.m15094b()) {
            zzaf zzaf = zzbgq.f20624b;
            ConnectionResult connectionResult2 = zzaf.f20492b;
            if (connectionResult2.m15094b()) {
                hzs.f21641h.m12044a(hwl.m12012a(zzaf.f20491a), hzs.f21638e);
            } else {
                String valueOf = String.valueOf(connectionResult2);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 48);
                stringBuilder.append("Sign-in succeeded with resolve account failure: ");
                stringBuilder.append(valueOf);
                Log.wtf("SignInCoordinator", stringBuilder.toString(), new Exception());
                hzs.f21641h.m12045b(connectionResult2);
                hzs.f21640g.mo3574c();
                return;
            }
        }
        hzs.f21641h.m12045b(connectionResult);
        hzs.f21640g.mo3574c();
    }

    /* renamed from: a */
    public final void mo1224a(int i) {
        this.f21640g.mo3574c();
    }

    /* renamed from: a */
    public final void mo1225a(Bundle bundle) {
        this.f21640g.mo3475a(this);
    }

    /* renamed from: a */
    public final void mo1226a(ConnectionResult connectionResult) {
        this.f21641h.m12045b(connectionResult);
    }

    /* renamed from: a */
    public final void mo1799a(zzbgq zzbgq) {
        this.f21635b.post(new hzt(this, zzbgq));
    }
}
