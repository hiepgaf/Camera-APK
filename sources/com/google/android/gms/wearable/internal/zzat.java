package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;
import p000.htl;
import p000.ihb;

public class zzat extends zza {
    public static final Creator CREATOR = new ihb();
    /* renamed from: a */
    private final int f20682a;
    /* renamed from: b */
    private final List f20683b;

    public zzat(int i, List list) {
        this.f20682a = i;
        this.f20683b = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20682a);
        htl.m3413a(parcel, 3, this.f20683b);
        htl.m3439c(parcel, b);
    }
}
