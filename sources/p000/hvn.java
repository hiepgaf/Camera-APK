package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: hvn */
abstract class hvn extends hvr {
    /* renamed from: c */
    private final int f18119c;
    /* renamed from: d */
    private final Bundle f18120d;
    /* renamed from: e */
    private final /* synthetic */ hvm f18121e;

    protected hvn(hvm hvm, int i, Bundle bundle) {
        this.f18121e = hvm;
        super(hvm, Boolean.valueOf(true));
        this.f18119c = i;
        this.f18120d = bundle;
    }

    /* renamed from: a */
    protected final void mo1779a() {
    }

    /* renamed from: a */
    protected abstract void mo3109a(ConnectionResult connectionResult);

    /* renamed from: a */
    protected final /* synthetic */ void mo1780a(Object obj) {
        PendingIntent pendingIntent = null;
        if (((Boolean) obj) == null) {
            this.f18121e.m3506a(1, null);
            return;
        }
        switch (this.f18119c) {
            case 0:
                if (!mo3110b()) {
                    this.f18121e.m3506a(1, null);
                    mo3109a(new ConnectionResult(8, null));
                    return;
                }
                return;
            case 10:
                this.f18121e.m3506a(1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            default:
                this.f18121e.m3506a(1, null);
                Bundle bundle = this.f18120d;
                if (bundle != null) {
                    pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                }
                mo3109a(new ConnectionResult(this.f18119c, pendingIntent));
                return;
        }
    }

    /* renamed from: b */
    protected abstract boolean mo3110b();
}
