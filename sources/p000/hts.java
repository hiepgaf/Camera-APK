package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: hts */
public class hts extends Binder implements htr {
    public hts() {
        attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    hts(byte b) {
        this();
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                mo3108a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                if (parcel.readInt() != 0) {
                    Status.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 3:
                parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                if (parcel.readInt() != 0) {
                    Status.CREATOR.createFromParcel(parcel);
                }
                parcel.readLong();
                throw new UnsupportedOperationException();
            case 4:
                parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                if (parcel.readInt() != 0) {
                    Status.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 5:
                parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                if (parcel.readInt() != 0) {
                    Status.CREATOR.createFromParcel(parcel);
                }
                parcel.readLong();
                throw new UnsupportedOperationException();
            case 1598968902:
                parcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    /* renamed from: a */
    public void mo3108a(Status status) {
        throw new UnsupportedOperationException();
    }
}
