package p000;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ifn */
public final class ifn extends Binder implements ifm {
    /* renamed from: a */
    private final ieg f18291a;

    public ifn() {
        attachInterface(this, "com.google.android.gms.location.ILocationListener");
    }

    public ifn(ieg ieg) {
        this();
        this.f18291a = ieg;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.location.ILocationListener");
                m12206a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.location.ILocationListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    /* renamed from: a */
    public final synchronized void m12206a(Location location) {
        this.f18291a.m3708a(new ife());
    }

    /* renamed from: a */
    public final synchronized void m12205a() {
        this.f18291a.f6970a = null;
    }
}
