package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

/* renamed from: hym */
public class hym extends Binder implements hyl {
    public hym() {
        attachInterface(this, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    public hym(byte b) {
        this();
    }

    public IBinder asBinder() {
        return this;
    }

    /* renamed from: a */
    public void mo3118a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo3117b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo3116a(GoogleHelp googleHelp) {
        throw new UnsupportedOperationException();
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                mo3116a(parcel.readInt() != 0 ? (GoogleHelp) GoogleHelp.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                if (parcel.readInt() != 0) {
                    TogglingData.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 3:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                throw new UnsupportedOperationException();
            case 4:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                throw new UnsupportedOperationException();
            case 5:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                throw new UnsupportedOperationException();
            case 6:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                throw new UnsupportedOperationException();
            case 7:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                mo3117b();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                mo3118a();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
