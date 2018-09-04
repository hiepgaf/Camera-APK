package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihd;

public class zzax extends zza {
    public static final Creator CREATOR = new ihd();
    /* renamed from: a */
    private final int f20686a;
    /* renamed from: b */
    private final ParcelFileDescriptor f20687b;

    public zzax(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f20686a = i;
        this.f20687b = parcelFileDescriptor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20686a);
        htl.m3411a(parcel, 3, this.f20687b, i);
        htl.m3439c(parcel, b);
    }
}
