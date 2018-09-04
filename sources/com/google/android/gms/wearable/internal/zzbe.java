package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihg;

public class zzbe extends zza {
    public static final Creator CREATOR = new ihg();
    /* renamed from: a */
    private final int f20692a;
    /* renamed from: b */
    private final boolean f20693b;
    /* renamed from: c */
    private final boolean f20694c;

    public zzbe(int i, boolean z, boolean z2) {
        this.f20692a = i;
        this.f20693b = z;
        this.f20694c = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20692a);
        htl.m3414a(parcel, 3, this.f20693b);
        htl.m3414a(parcel, 4, this.f20694c);
        htl.m3439c(parcel, b);
    }
}
