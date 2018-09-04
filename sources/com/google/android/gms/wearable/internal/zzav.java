package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihc;

public class zzav extends zza {
    public static final Creator CREATOR = new ihc();
    /* renamed from: a */
    private final int f20684a;
    /* renamed from: b */
    private final zzo f20685b;

    public zzav(int i, zzo zzo) {
        this.f20684a = i;
        this.f20685b = zzo;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20684a);
        htl.m3411a(parcel, 3, this.f20685b, i);
        htl.m3439c(parcel, b);
    }
}
