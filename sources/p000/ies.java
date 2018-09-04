package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ies */
public class ies extends hwc {
    /* renamed from: l */
    public final ifi f23344l = new ifi(this);
    /* renamed from: m */
    private final String f23345m;

    public ies(Context context, Looper looper, hus hus, hut hut, String str, hvx hvx) {
        super(context, looper, 23, hvx, hus, hut);
        this.f23345m = str;
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo3467a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ifa)) ? new ifa(iBinder) : (ifa) queryLocalInterface;
    }

    /* renamed from: a */
    protected final String mo3468a() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* renamed from: b */
    protected final String mo3469b() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* renamed from: k */
    protected final Bundle mo3478k() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f23345m);
        return bundle;
    }
}
