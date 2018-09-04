package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: hvv */
public final class hvv extends hvn {
    /* renamed from: c */
    private final IBinder f21622c;
    /* renamed from: d */
    private final /* synthetic */ hvm f21623d;

    public hvv(hvm hvm, int i, IBinder iBinder, Bundle bundle) {
        this.f21623d = hvm;
        super(hvm, i, bundle);
        this.f21622c = iBinder;
    }

    /* renamed from: a */
    protected final void mo3109a(ConnectionResult connectionResult) {
        hvp hvp = this.f21623d.f6725j;
        if (hvp != null) {
            hvp.m3528a(connectionResult);
        }
        this.f21623d.m3507a(connectionResult);
    }

    /* renamed from: b */
    protected final boolean mo3110b() {
        try {
            String interfaceDescriptor = this.f21622c.getInterfaceDescriptor();
            if (this.f21623d.mo3469b().equals(interfaceDescriptor)) {
                IInterface a = this.f21623d.mo3467a(this.f21622c);
                if (a == null || !this.f21623d.m3512a(2, 3, a)) {
                    return false;
                }
                hvo hvo = this.f21623d.f6724i;
                if (hvo != null) {
                    hvo.f6737a.mo1225a(null);
                }
                return true;
            }
            String valueOf = String.valueOf(this.f21623d.mo3469b());
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(interfaceDescriptor).length());
            stringBuilder.append("service descriptor mismatch: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" vs. ");
            stringBuilder.append(interfaceDescriptor);
            Log.e("GmsClient", stringBuilder.toString());
            return false;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
