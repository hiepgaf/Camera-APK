package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iie;

public class PackageStorageInfo extends zza {
    public static final Creator CREATOR = new iie();
    /* renamed from: a */
    private final String f20669a;
    /* renamed from: b */
    private final String f20670b;
    /* renamed from: c */
    private final long f20671c;

    public PackageStorageInfo(String str, String str2, long j) {
        this.f20669a = str;
        this.f20670b = str2;
        this.f20671c = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3412a(parcel, 2, this.f20669a);
        htl.m3412a(parcel, 3, this.f20670b);
        htl.m3408a(parcel, 4, this.f20671c);
        htl.m3439c(parcel, b);
    }
}
