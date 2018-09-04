package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzbge;
import com.google.android.gms.internal.zzbgq;

/* renamed from: iaz */
public class iaz extends Binder implements iay {
    public iaz() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public iaz(byte b) {
        this();
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                if (parcel.readInt() != 0) {
                    ConnectionResult.CREATOR.createFromParcel(parcel);
                }
                if (parcel.readInt() != 0) {
                    zzbge.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                if (parcel.readInt() != 0) {
                    Status.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                if (parcel.readInt() != 0) {
                    Status.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                if (parcel.readInt() != 0) {
                    Status.CREATOR.createFromParcel(parcel);
                }
                if (parcel.readInt() != 0) {
                    GoogleSignInAccount.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                mo1799a(parcel.readInt() != 0 ? (zzbgq) zzbgq.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    /* renamed from: a */
    public void mo1799a(zzbgq zzbgq) {
    }
}
