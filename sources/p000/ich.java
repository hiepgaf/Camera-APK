package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: ich */
public abstract class ich extends ick implements ici {
    /* renamed from: e */
    public final hum f21699e;
    /* renamed from: f */
    public final huh f21700f;

    public ich(huh huh, huq huq) {
        super((huq) htl.m3432b((Object) huq, (Object) "GoogleApiClient must not be null"));
        this.f21699e = huh.m3471b();
        this.f21700f = huh;
    }

    @Deprecated
    protected ich(hum hum, huq huq) {
        super((huq) htl.m3432b((Object) huq, (Object) "GoogleApiClient must not be null"));
        this.f21699e = (hum) htl.m3431b((Object) hum);
        this.f21700f = null;
    }

    /* renamed from: a */
    private final void m16016a(RemoteException remoteException) {
        m16019b(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    /* renamed from: a */
    public abstract void mo3466a(hul hul);

    /* renamed from: a */
    public /* synthetic */ void mo3123a(Object obj) {
        super.m12065a((hux) obj);
    }

    /* renamed from: b */
    public final void m16019b(Status status) {
        htl.m3436b(status.m15096b() ^ 1, (Object) "Failed result must not be success");
        m12065a(mo3119a(status));
    }

    /* renamed from: b */
    public final void m16020b(hul hul) {
        try {
            mo3466a(hul);
        } catch (RemoteException e) {
            m16016a(e);
            throw e;
        } catch (RemoteException e2) {
            m16016a(e2);
        }
    }
}
