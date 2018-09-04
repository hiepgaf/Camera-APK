package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iii;

public class zzcn extends zza {
    public static final Creator CREATOR = new iii();
    /* renamed from: a */
    private final int f20728a;
    /* renamed from: b */
    private final int f20729b;

    public zzcn(int i, int i2) {
        this.f20728a = i;
        this.f20729b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20728a);
        htl.m3440c(parcel, 3, this.f20729b);
        htl.m3439c(parcel, b);
    }
}
