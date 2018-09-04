package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihm;

public class zzbp extends zza {
    public static final Creator CREATOR = new ihm();
    /* renamed from: a */
    private final int f20705a;
    /* renamed from: b */
    private final ParcelFileDescriptor f20706b;

    public zzbp(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f20705a = i;
        this.f20706b = parcelFileDescriptor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20705a);
        htl.m3411a(parcel, 3, this.f20706b, i | 1);
        htl.m3439c(parcel, b);
    }
}
