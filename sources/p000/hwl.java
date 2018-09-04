package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: hwl */
public abstract class hwl extends Binder implements hwk {
    /* renamed from: a */
    public static hwk m12012a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hwk)) ? new hwm(iBinder) : (hwk) queryLocalInterface;
    }

    public IBinder asBinder() {
        throw new NoSuchMethodError();
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw new NoSuchMethodError();
    }
}
