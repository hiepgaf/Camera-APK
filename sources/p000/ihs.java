package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.zzbz;
import com.google.android.gms.wearable.internal.zzcc;
import com.google.android.gms.wearable.internal.zzh;
import com.google.android.gms.wearable.internal.zzk;
import com.google.android.gms.wearable.internal.zzo;
import com.google.android.gms.wearable.internal.zzs;
import java.util.List;

/* renamed from: ihs */
final class ihs implements ihq {
    /* renamed from: a */
    private IBinder f18301a;

    ihs(IBinder iBinder) {
        this.f18301a = iBinder;
    }

    /* renamed from: a */
    public final void mo1858a(DataHolder dataHolder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (dataHolder == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                dataHolder.writeToParcel(obtain, 0);
            }
            this.f18301a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo1859a(zzbz zzbz) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (zzbz == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                zzbz.writeToParcel(obtain, 0);
            }
            this.f18301a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo1860a(zzcc zzcc) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (zzcc == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                zzcc.writeToParcel(obtain, 0);
            }
            this.f18301a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo1861a(zzh zzh) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (zzh == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                zzh.writeToParcel(obtain, 0);
            }
            this.f18301a.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo1862a(zzk zzk) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (zzk == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                zzk.writeToParcel(obtain, 0);
            }
            this.f18301a.transact(6, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo1863a(zzo zzo) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (zzo == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                zzo.writeToParcel(obtain, 0);
            }
            this.f18301a.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo1864a(zzs zzs) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (zzs == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                zzs.writeToParcel(obtain, 0);
            }
            this.f18301a.transact(7, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo1865a(List list) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            obtain.writeTypedList(list);
            this.f18301a.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f18301a;
    }

    /* renamed from: b */
    public final void mo1866b(zzcc zzcc) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (zzcc == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                zzcc.writeToParcel(obtain, 0);
            }
            this.f18301a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
