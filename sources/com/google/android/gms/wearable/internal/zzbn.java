package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihl;

public class zzbn extends zza {
    public static final Creator CREATOR = new ihl();
    /* renamed from: a */
    private final int f20703a;
    /* renamed from: b */
    private final zzao f20704b;

    public zzbn(int i, zzao zzao) {
        this.f20703a = i;
        this.f20704b = zzao;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20703a);
        htl.m3411a(parcel, 3, this.f20704b, i);
        htl.m3439c(parcel, b);
    }
}
