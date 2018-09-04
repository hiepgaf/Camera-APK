package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iid;

public class zzce extends zza {
    public static final Creator CREATOR = new iid();
    /* renamed from: a */
    private final int f20721a;
    /* renamed from: b */
    private final zzu f20722b;

    public zzce(int i, zzu zzu) {
        this.f20721a = i;
        this.f20722b = zzu;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20721a);
        htl.m3411a(parcel, 3, this.f20722b, i);
        htl.m3439c(parcel, b);
    }
}
