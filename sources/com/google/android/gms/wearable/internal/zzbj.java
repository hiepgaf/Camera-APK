package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.ConnectionConfiguration;
import p000.htl;
import p000.ihj;

public class zzbj extends zza {
    public static final Creator CREATOR = new ihj();
    /* renamed from: a */
    private final int f20699a;
    /* renamed from: b */
    private final ConnectionConfiguration[] f20700b;

    public zzbj(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f20699a = i;
        this.f20700b = connectionConfigurationArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20699a);
        htl.m3417a(parcel, 3, this.f20700b, i);
        htl.m3439c(parcel, b);
    }
}
