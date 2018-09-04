package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: htq */
public final class htq extends hwc {
    public htq(Context context, Looper looper, hvx hvx, hus hus, hut hut) {
        super(context, looper, 40, hvx, hus, hut);
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo3467a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof htt)) ? new htt(iBinder) : (htt) queryLocalInterface;
    }

    /* renamed from: a */
    protected final String mo3468a() {
        return "com.google.android.gms.clearcut.service.START";
    }

    /* renamed from: b */
    protected final String mo3469b() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }
}
