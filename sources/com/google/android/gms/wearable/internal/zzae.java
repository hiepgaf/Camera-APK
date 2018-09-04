package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.igw;

public class zzae extends zza {
    public static final Creator CREATOR = new igw();
    /* renamed from: a */
    private final int f20676a;

    public zzae(int i) {
        this.f20676a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20676a);
        htl.m3439c(parcel, b);
    }
}
