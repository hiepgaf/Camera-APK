package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.zzbz;
import com.google.android.gms.wearable.internal.zzcc;
import com.google.android.gms.wearable.internal.zzh;
import com.google.android.gms.wearable.internal.zzk;
import com.google.android.gms.wearable.internal.zzo;
import com.google.android.gms.wearable.internal.zzs;

/* renamed from: ihr */
public abstract class ihr extends Binder implements ihq {
    public ihr() {
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
    }

    /* renamed from: a */
    public static ihq m12217a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ihq)) ? new ihs(iBinder) : (ihq) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzbz zzbz = null;
        zzcc zzcc;
        switch (i) {
            case 1:
                DataHolder dataHolder;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    dataHolder = (DataHolder) DataHolder.CREATOR.createFromParcel(parcel);
                }
                mo1858a(dataHolder);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    zzbz = (zzbz) zzbz.CREATOR.createFromParcel(parcel);
                }
                mo1859a(zzbz);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    zzcc = (zzcc) zzcc.CREATOR.createFromParcel(parcel);
                }
                mo1860a(zzcc);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    zzcc = (zzcc) zzcc.CREATOR.createFromParcel(parcel);
                }
                mo1866b(zzcc);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                mo1865a(parcel.createTypedArrayList(zzcc.CREATOR));
                return true;
            case 6:
                zzk zzk;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    zzk = (zzk) zzk.CREATOR.createFromParcel(parcel);
                }
                mo1862a(zzk);
                return true;
            case 7:
                zzs zzs;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    zzs = (zzs) zzs.CREATOR.createFromParcel(parcel);
                }
                mo1864a(zzs);
                return true;
            case 8:
                zzo zzo;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    zzo = (zzo) zzo.CREATOR.createFromParcel(parcel);
                }
                mo1863a(zzo);
                return true;
            case 9:
                zzh zzh;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    zzh = (zzh) zzh.CREATOR.createFromParcel(parcel);
                }
                mo1861a(zzh);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.wearable.internal.IWearableListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
