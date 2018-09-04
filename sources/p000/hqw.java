package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hqw */
public final class hqw {
    /* renamed from: a */
    public final List f6460a = new ArrayList();
    /* renamed from: b */
    public final hqv f6461b;

    public hqw(Context context, hqq hqq) {
        this.f6461b = new hqx(context, this, hqq);
    }

    /* renamed from: a */
    final void m3298a() {
        for (hqu a : this.f6460a) {
            a.mo1773a(this.f6461b.mo3104d());
        }
        this.f6460a.clear();
    }

    /* renamed from: a */
    public final boolean m3299a(Bundle bundle) {
        Throwable e;
        hhz.m3157a();
        if (this.f6461b.mo3104d()) {
            hqg hqg = (hqg) ((ksa) ((krz) hqg.f23583c.mo3571a(go.bZ, null))).m17999a(hqe.LENS_SERVICE_IMAGE_INJECT.f18032h).m17813b();
            try {
                this.f6461b.mo3100a(hqg.m16620b(), new hqc(bundle));
                return true;
            } catch (RemoteException e2) {
                e = e2;
                Log.e("LensServiceBridge", "Failed to inject image.", e);
                return false;
            } catch (SecurityException e3) {
                e = e3;
                Log.e("LensServiceBridge", "Failed to inject image.", e);
                return false;
            }
        }
        Log.i("LensServiceBridge", "Lens session is not ready.");
        return false;
    }

    /* renamed from: b */
    public final boolean m3300b() {
        hhz.m3157a();
        if (!this.f6461b.mo3104d() || this.f6461b.mo3101b() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m3301c() {
        Throwable e;
        hhz.m3157a();
        if (this.f6461b.mo3104d()) {
            try {
                this.f6461b.mo3102b(((hqg) ((ksa) ((krz) hqg.f23583c.mo3571a(go.bZ, null))).m17999a(hqe.LENS_SERVICE_WARM_UP_ACTIVITY.f18032h).m17813b()).m16620b());
                return true;
            } catch (RemoteException e2) {
                e = e2;
                Log.e("LensServiceBridge", "Unable to send prewarm signal.", e);
                return false;
            } catch (SecurityException e3) {
                e = e3;
                Log.e("LensServiceBridge", "Unable to send prewarm signal.", e);
                return false;
            }
        }
        Log.i("LensServiceBridge", "Lens session is not ready for prewarm.");
        return false;
    }

    /* renamed from: d */
    public final boolean m3302d() {
        Throwable e;
        hhz.m3157a();
        if (this.f6461b.mo3104d()) {
            try {
                this.f6461b.mo3102b(((hqg) ((ksa) ((krz) hqg.f23583c.mo3571a(go.bZ, null))).m17999a(hqe.LENS_SERVICE_START_ACTIVITY.f18032h).m17813b()).m16620b());
                this.f6461b.mo3105e();
                return true;
            } catch (RemoteException e2) {
                e = e2;
                Log.e("LensServiceBridge", "Failed to start Lens", e);
                return false;
            } catch (SecurityException e3) {
                e = e3;
                Log.e("LensServiceBridge", "Failed to start Lens", e);
                return false;
            }
        }
        Log.i("LensServiceBridge", "Lens session is not ready.");
        return false;
    }
}
