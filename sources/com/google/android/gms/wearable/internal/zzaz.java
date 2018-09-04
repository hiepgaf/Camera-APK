package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihe;

public class zzaz extends zza {
    public static final Creator CREATOR = new ihe();
    /* renamed from: a */
    private final int f20688a;
    /* renamed from: b */
    private final ParcelFileDescriptor f20689b;

    public zzaz(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f20688a = i;
        this.f20689b = parcelFileDescriptor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20688a);
        htl.m3411a(parcel, 3, this.f20689b, i);
        htl.m3439c(parcel, b);
    }
}
