package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hwy;

public class zzc extends zza {
    public static final Creator CREATOR = new hwy();
    /* renamed from: a */
    private final String f20505a;
    /* renamed from: b */
    private final int f20506b;

    public zzc(String str, int i) {
        this.f20505a = str;
        this.f20506b = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3412a(parcel, 1, this.f20505a);
        htl.m3440c(parcel, 2, this.f20506b);
        htl.m3439c(parcel, b);
    }
}
