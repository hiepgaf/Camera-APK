package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: hyq */
final class hyq extends hyw {
    /* renamed from: a */
    private final /* synthetic */ Bundle f23532a;
    /* renamed from: b */
    private final /* synthetic */ long f23533b;
    /* renamed from: c */
    private final /* synthetic */ GoogleHelp f23534c;

    hyq(huq huq, Bundle bundle, long j, GoogleHelp googleHelp) {
        this.f23532a = bundle;
        this.f23533b = j;
        this.f23534c = googleHelp;
        super(huq, (byte) 0);
    }

    /* renamed from: a */
    protected final void mo3573a(hyy hyy) {
        Parcel obtain;
        try {
            Bundle bundle = this.f23532a;
            long j = this.f23533b;
            GoogleHelp googleHelp = this.f23534c;
            hyl hyr = new hyr(this);
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (bundle == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            }
            obtain.writeLong(j);
            if (googleHelp == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                googleHelp.writeToParcel(obtain, 0);
            }
            obtain.writeStrongBinder(hyr.asBinder());
            hyy.f6826a.transact(8, obtain, null, 1);
            obtain.recycle();
        } catch (Throwable e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async help psd failed!", e);
            m12069c(hyn.f18139a);
        } catch (Throwable th) {
            obtain.recycle();
        }
    }
}
