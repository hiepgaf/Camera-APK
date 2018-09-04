package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;
import p000.htl;
import p000.iij;

public class StorageInfoResponse extends zza {
    public static final Creator CREATOR = new iij();
    /* renamed from: a */
    private final int f20672a;
    /* renamed from: b */
    private final long f20673b;
    /* renamed from: c */
    private final List f20674c;

    public StorageInfoResponse(int i, long j, List list) {
        this.f20672a = i;
        this.f20673b = j;
        this.f20674c = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20672a);
        htl.m3408a(parcel, 3, this.f20673b);
        htl.m3413a(parcel, 4, this.f20674c);
        htl.m3439c(parcel, b);
    }
}
