package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.zzcj;

/* renamed from: ihz */
public final class ihz extends iiw {
    /* renamed from: a */
    private final /* synthetic */ igl f23547a;

    public ihz(huq huq, igl igl) {
        this.f23547a = igl;
        super(huq);
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo3466a(hul hul) {
        iin iin = (iin) hul;
        igl igl = this.f23547a;
        ihw ihw = iin.f23352m;
        synchronized (ihw.f7005a) {
            iip iip = (iip) ihw.f7005a.remove(igl);
            if (iip == null) {
                mo3123a(new Status(4002));
                return;
            }
            iip.m16061a();
            ((iht) iin.m3526p()).mo1869a(new ihy(ihw.f7005a, igl, this), new zzcj(iip));
        }
    }

    /* renamed from: a */
    public final /* synthetic */ hux mo3119a(Status status) {
        return status;
    }
}
