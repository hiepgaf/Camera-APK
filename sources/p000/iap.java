package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: iap */
public final class iap extends hwc {
    public iap(Context context, Looper looper, hvx hvx, hus hus, hut hut) {
        super(context, looper, 3, hvx, hus, hut);
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo3467a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ial)) ? new ial(iBinder) : (ial) queryLocalInterface;
    }

    /* renamed from: a */
    protected final String mo3468a() {
        return "com.google.android.gms.panorama.service.START";
    }

    /* renamed from: b */
    protected final String mo3469b() {
        return "com.google.android.gms.panorama.internal.IPanoramaService";
    }
}
