package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ija;

public class zzy extends zza {
    public static final Creator CREATOR = new ija();
    /* renamed from: a */
    private final int f20755a;

    public zzy(int i) {
        this.f20755a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20755a);
        htl.m3439c(parcel, b);
    }
}
