package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihn;

public class zzbr extends zza {
    public static final Creator CREATOR = new ihn();
    /* renamed from: a */
    private final int f20707a;
    /* renamed from: b */
    private final zzcc f20708b;

    public zzbr(int i, zzcc zzcc) {
        this.f20707a = i;
        this.f20708b = zzcc;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20707a);
        htl.m3411a(parcel, 3, this.f20708b, i);
        htl.m3439c(parcel, b);
    }
}
