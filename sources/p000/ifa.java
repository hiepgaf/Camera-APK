package p000;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.internal.zzq;

/* renamed from: ifa */
public final class ifa implements IInterface {
    /* renamed from: a */
    private IBinder f6980a;

    ifa(IBinder iBinder) {
        this.f6980a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f6980a;
    }

    /* renamed from: a */
    public final void m3728a(zzq zzq) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (zzq != null) {
                obtain.writeInt(1);
                zzq.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6980a.transact(59, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final Location m3727a(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeString(str);
            this.f6980a.transact(21, obtain, obtain2, 0);
            obtain2.readException();
            Location location = obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return location;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
