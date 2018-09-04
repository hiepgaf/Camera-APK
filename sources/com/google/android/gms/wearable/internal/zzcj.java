package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihq;
import p000.ihr;
import p000.iig;

public class zzcj extends zza {
    public static final Creator CREATOR = new iig();
    /* renamed from: a */
    private final int f20725a;
    /* renamed from: b */
    private final ihq f20726b;

    public zzcj(int i, IBinder iBinder) {
        this.f20725a = i;
        if (iBinder != null) {
            this.f20726b = ihr.m12217a(iBinder);
        } else {
            this.f20726b = null;
        }
    }

    public zzcj(ihq ihq) {
        this.f20725a = 1;
        this.f20726b = ihq;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20725a);
        ihq ihq = this.f20726b;
        htl.m3410a(parcel, 2, ihq != null ? ihq.asBinder() : null);
        htl.m3439c(parcel, b);
    }
}
