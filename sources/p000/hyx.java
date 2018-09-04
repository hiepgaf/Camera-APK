package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: hyx */
public final class hyx extends hwc {
    public hyx(Context context, Looper looper, hvx hvx, hus hus, hut hut) {
        super(context, looper, 63, hvx, hus, hut);
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo3467a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hyy)) ? new hyy(iBinder) : (hyy) queryLocalInterface;
    }

    /* renamed from: a */
    protected final String mo3468a() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }

    /* renamed from: b */
    protected final String mo3469b() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }
}
