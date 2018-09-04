package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihh;

public class zzbg extends zza {
    public static final Creator CREATOR = new ihh();
    /* renamed from: a */
    private final int f20695a;
    /* renamed from: b */
    private final boolean f20696b;

    public zzbg(int i, boolean z) {
        this.f20695a = i;
        this.f20696b = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20695a);
        htl.m3414a(parcel, 3, this.f20696b);
        htl.m3439c(parcel, b);
    }
}
