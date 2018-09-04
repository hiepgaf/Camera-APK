package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;
import p000.htl;
import p000.ihk;

public class zzbl extends zza {
    public static final Creator CREATOR = new ihk();
    /* renamed from: a */
    private final int f20701a;
    /* renamed from: b */
    private final List f20702b;

    public zzbl(int i, List list) {
        this.f20701a = i;
        this.f20702b = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20701a);
        htl.m3413a(parcel, 3, this.f20702b);
        htl.m3439c(parcel, b);
    }
}
