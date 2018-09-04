package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: ica */
abstract class ica extends ibz {
    /* renamed from: a */
    public final ifw f18159a;

    public ica(ifw ifw) {
        this.f18159a = ifw;
    }

    /* renamed from: a */
    public void mo1804a(Status status) {
        this.f18159a.m3736a(new bpm(status));
    }

    /* renamed from: a */
    public void mo1805a(icx icx, boolean z) {
    }

    /* renamed from: a */
    public final void mo1806a(ief ief) {
        try {
            mo3122b(ief);
        } catch (RemoteException e) {
            mo1804a(ibz.m3661a(e));
            throw e;
        } catch (RemoteException e2) {
            mo1804a(ibz.m3661a(e2));
        }
    }

    /* renamed from: b */
    protected abstract void mo3122b(ief ief);
}
