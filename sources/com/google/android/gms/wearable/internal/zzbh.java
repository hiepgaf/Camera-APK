package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.ConnectionConfiguration;
import p000.htl;
import p000.ihi;

@Deprecated
public class zzbh extends zza {
    public static final Creator CREATOR = new ihi();
    /* renamed from: a */
    private final int f20697a;
    /* renamed from: b */
    private final ConnectionConfiguration f20698b;

    public zzbh(int i, ConnectionConfiguration connectionConfiguration) {
        this.f20697a = i;
        this.f20698b = connectionConfiguration;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20697a);
        htl.m3411a(parcel, 3, this.f20698b, i);
        htl.m3439c(parcel, b);
    }
}
