package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihf;

public class zzbc extends zza {
    public static final Creator CREATOR = new ihf();
    /* renamed from: a */
    private final int f20690a;
    /* renamed from: b */
    private final boolean f20691b;

    public zzbc(int i, boolean z) {
        this.f20690a = i;
        this.f20691b = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20690a);
        htl.m3414a(parcel, 3, this.f20691b);
        htl.m3439c(parcel, b);
    }
}
