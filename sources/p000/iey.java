package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.internal.zzf;

/* renamed from: iey */
public final class iey extends Binder implements iex {
    /* renamed from: a */
    private final ici f18286a;

    public iey() {
        attachInterface(this, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public iey(ici ici) {
        this();
        this.f18286a = ici;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zzf zzf;
                parcel.enforceInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                if (parcel.readInt() != 0) {
                    zzf = (zzf) zzf.CREATOR.createFromParcel(parcel);
                } else {
                    zzf = null;
                }
                this.f18286a.mo3123a(zzf.f20636a);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
