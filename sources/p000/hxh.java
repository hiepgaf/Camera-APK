package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: hxh */
public class hxh extends Binder implements hxg {
    public hxh() {
        attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1598968902:
                parcel2.writeString("com.google.android.gms.dynamic.IObjectWrapper");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
