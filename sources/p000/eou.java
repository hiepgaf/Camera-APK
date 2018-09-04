package p000;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;

/* compiled from: PG */
/* renamed from: eou */
final class eou implements kov {
    /* renamed from: a */
    private final /* synthetic */ eot f15316a;

    eou(eot eot) {
        this.f15316a = eot;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        String str = eos.f15307a;
        String valueOf = String.valueOf(th.getMessage());
        String str2 = "fail to connect to GoogleApiClient: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m873e(str, valueOf);
        this.f15316a.f3994b.m9786d();
        this.f15316a.f3993a.mo3557a(Boolean.valueOf(false));
    }

    public final /* synthetic */ void b_(Object obj) {
        hjk hjk = (hjk) obj;
        bli.m863a(eos.f15307a, "onConnected.");
        eos eos = this.f15316a.f3994b;
        eos.f15311c = hjk;
        if (eos.f15313e) {
            bli.m869c(eos.f15307a, "Start location updates.");
            if (eos.f15311c != null) {
                LocationRequest locationRequest = new LocationRequest();
                long j = (long) eos.f15308g;
                LocationRequest.m15116a(j);
                locationRequest.f20627b = j;
                if (!locationRequest.f20629d) {
                    locationRequest.f20628c = (long) (((double) locationRequest.f20627b) / 6.0d);
                }
                LocationRequest.m15115a();
                locationRequest.f20626a = 100;
                try {
                    huq huq = eos.f15311c.f6271a.f17906a;
                    htl.m3432b(Looper.myLooper(), (Object) "Calling thread must be a prepared Looper thread.");
                    huq.mo1848b(new ieu(huq, locationRequest, eos));
                    eos.f15314f = true;
                } catch (Throwable e) {
                    bli.m874e(eos.f15307a, "requestLocationUpdates failed!", e);
                }
            }
            this.f15316a.f3993a.mo3557a(Boolean.valueOf(true));
            return;
        }
        eos.m9786d();
        this.f15316a.f3993a.mo3557a(Boolean.valueOf(false));
    }
}
