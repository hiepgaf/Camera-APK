package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzad;
import p000.htl;
import p000.ibc;

public class zzbgo extends zza {
    public static final Creator CREATOR = new ibc();
    /* renamed from: a */
    private final int f20621a;
    /* renamed from: b */
    private final zzad f20622b;

    public zzbgo(int i, zzad zzad) {
        this.f20621a = i;
        this.f20622b = zzad;
    }

    public zzbgo(zzad zzad) {
        this(1, zzad);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20621a);
        htl.m3411a(parcel, 2, this.f20622b, i);
        htl.m3439c(parcel, b);
    }
}
