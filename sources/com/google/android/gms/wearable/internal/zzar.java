package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iha;

public class zzar extends zza {
    public static final Creator CREATOR = new iha();
    /* renamed from: a */
    private final int f20680a;
    /* renamed from: b */
    private final int f20681b;

    public zzar(int i, int i2) {
        this.f20680a = i;
        this.f20681b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20680a);
        htl.m3440c(parcel, 3, this.f20681b);
        htl.m3439c(parcel, b);
    }
}
