package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* renamed from: hwq */
public final class hwq extends Binder implements hwp {
    /* renamed from: a */
    private hvm f18130a;
    /* renamed from: b */
    private final int f18131b;

    public hwq() {
        attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public hwq(hvm hvm, int i) {
        this();
        this.f18130a = hvm;
        this.f18131b = i;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                Bundle bundle;
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                htl.m3432b(this.f18130a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
                this.f18130a.mo3480a(readInt, readStrongBinder, bundle, this.f18131b);
                this.f18130a = null;
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    Bundle.CREATOR.createFromParcel(parcel);
                }
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.common.internal.IGmsCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
