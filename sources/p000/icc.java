package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: icc */
public final class icc extends ica {
    /* renamed from: b */
    private final iei f21698b;

    public icc(iei iei, ifw ifw) {
        super(ifw);
        this.f21698b = iei;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1804a(Status status) {
        super.mo1804a(status);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1805a(icx icx, boolean z) {
    }

    /* renamed from: b */
    public final void mo3122b(ief ief) {
        hzq hzq = (hzq) ief.f21721d.remove(this.f21698b);
        if (hzq == null) {
            Log.wtf("UnregisterListenerTask", "Received call to unregister a listener without a matching registration call.", new Exception());
            this.a.m3736a(new bpm(Status.f20465b));
            return;
        }
        hzq.f6850b.m7127i();
        throw new NoSuchMethodError();
    }
}
