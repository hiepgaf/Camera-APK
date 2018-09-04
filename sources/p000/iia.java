package p000;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.zzc;

/* renamed from: iia */
public final class iia extends iiw {
    /* renamed from: a */
    private igl f23548a;
    /* renamed from: b */
    private ieg f23549b;
    /* renamed from: c */
    private IntentFilter[] f23550c;

    public iia(huq huq, igl igl, ieg ieg, IntentFilter[] intentFilterArr) {
        super(huq);
        this.f23548a = (igl) htl.m3431b((Object) igl);
        this.f23549b = (ieg) htl.m3431b((Object) ieg);
        this.f23550c = (IntentFilter[]) htl.m3431b((Object) intentFilterArr);
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo3466a(hul hul) {
        iin iin = (iin) hul;
        igl igl = this.f23548a;
        Object obj = this.f23549b;
        IntentFilter[] intentFilterArr = this.f23550c;
        ihw ihw = iin.f23352m;
        iip iip = new iip(intentFilterArr);
        iip.f21730a = (ieg) htl.m3431b(obj);
        synchronized (ihw.f7005a) {
            if (ihw.f7005a.get(igl) == null) {
                ihw.f7005a.put(igl, iip);
                try {
                    ((iht) iin.m3526p()).mo1868a(new ihx(ihw.f7005a, igl, this), new zzc(iip));
                } catch (RemoteException e) {
                    ihw.f7005a.remove(igl);
                    throw e;
                }
            }
            mo3123a(new Status(4001));
        }
        this.f23548a = null;
        this.f23549b = null;
        this.f23550c = null;
    }

    /* renamed from: a */
    public final /* synthetic */ hux mo3119a(Status status) {
        this.f23548a = null;
        this.f23549b = null;
        this.f23550c = null;
        return status;
    }
}
