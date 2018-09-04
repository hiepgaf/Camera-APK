package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.StorageInfoResponse;
import com.google.android.gms.wearable.internal.zzaa;
import com.google.android.gms.wearable.internal.zzae;
import com.google.android.gms.wearable.internal.zzar;
import com.google.android.gms.wearable.internal.zzat;
import com.google.android.gms.wearable.internal.zzav;
import com.google.android.gms.wearable.internal.zzax;
import com.google.android.gms.wearable.internal.zzaz;
import com.google.android.gms.wearable.internal.zzbc;
import com.google.android.gms.wearable.internal.zzbe;
import com.google.android.gms.wearable.internal.zzbg;
import com.google.android.gms.wearable.internal.zzbh;
import com.google.android.gms.wearable.internal.zzbj;
import com.google.android.gms.wearable.internal.zzbl;
import com.google.android.gms.wearable.internal.zzbn;
import com.google.android.gms.wearable.internal.zzbp;
import com.google.android.gms.wearable.internal.zzbr;
import com.google.android.gms.wearable.internal.zzce;
import com.google.android.gms.wearable.internal.zzch;
import com.google.android.gms.wearable.internal.zzcl;
import com.google.android.gms.wearable.internal.zzcn;
import com.google.android.gms.wearable.internal.zze;
import com.google.android.gms.wearable.internal.zzy;

/* renamed from: ihp */
public class ihp extends Binder implements iho {
    public ihp() {
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    public ihp(byte b) {
        this();
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzch zzch = null;
        switch (i) {
            case 2:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzbh.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 3:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzch = (zzch) zzch.CREATOR.createFromParcel(parcel);
                }
                mo3479a(zzch);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzbn.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 5:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    DataHolder.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 6:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzar.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 7:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzcn.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 8:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzbp.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 9:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzbr.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 10:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzbl.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 11:
                Status status;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    status = (Status) Status.CREATOR.createFromParcel(parcel);
                }
                mo3125a(status);
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    StorageInfoResponse.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 13:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzbj.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 14:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzce.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 15:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzae.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 16:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzae.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 17:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzax.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 18:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzaz.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 19:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzy.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 20:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzaa.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 22:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzav.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 23:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzat.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 26:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zze.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 27:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzcl.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 28:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzbc.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 29:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzbg.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 30:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0) {
                    zzbe.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 1598968902:
                parcel2.writeString("com.google.android.gms.wearable.internal.IWearableCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    /* renamed from: a */
    public void mo3479a(zzch zzch) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo3125a(Status status) {
        throw new UnsupportedOperationException();
    }
}
