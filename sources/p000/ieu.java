package p000;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.zzo;
import com.google.android.gms.location.internal.zzq;

/* renamed from: ieu */
public final class ieu extends ieq {
    /* renamed from: a */
    private final /* synthetic */ LocationRequest f23542a;
    /* renamed from: b */
    private final /* synthetic */ ien f23543b;

    public ieu(huq huq, LocationRequest locationRequest, ien ien) {
        this.f23542a = locationRequest;
        this.f23543b = ien;
        super(huq, (byte) 0);
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo3466a(hul hul) {
        boolean z = true;
        iff iff = (iff) hul;
        iex iey = new iey(this);
        LocationRequest locationRequest = this.f23542a;
        ien ien = this.f23543b;
        if (Looper.myLooper() == null) {
            z = false;
        }
        htl.m3422a(z, (Object) "Can't create handler inside thread that has not called Looper.prepare()");
        ieg a = iek.m3711a(ien, Looper.myLooper(), ien.class.getSimpleName());
        synchronized (iff.f23545m) {
            ifb ifb = iff.f23545m;
            ifb.f6981a.f6985a.m3525o();
            ifm a2 = ifb.m3730a(a);
            ((ifa) ifb.f6981a.f6985a.m3526p()).m3728a(new zzq(1, new zzo(locationRequest, zzo.f20637a, null, false, false), a2.asBinder(), null, null, iey.asBinder()));
        }
    }
}
