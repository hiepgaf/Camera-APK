package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: hwo */
public abstract class hwo extends Binder implements hwn {
    public hwo() {
        attachInterface(this, "com.google.android.gms.common.internal.ICertData");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.common.internal.ICertData");
                hxg a = mo3114a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a.asBinder());
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.common.internal.ICertData");
                int b = mo3115b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.common.internal.ICertData");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
