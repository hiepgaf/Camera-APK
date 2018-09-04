package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iif;

public class zzch extends zza {
    public static final Creator CREATOR = new iif();
    /* renamed from: a */
    public final int f20723a;
    /* renamed from: b */
    public final zzao f20724b;

    public zzch(int i, zzao zzao) {
        this.f20723a = i;
        this.f20724b = zzao;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20723a);
        htl.m3411a(parcel, 3, this.f20724b, i);
        htl.m3439c(parcel, b);
    }
}
