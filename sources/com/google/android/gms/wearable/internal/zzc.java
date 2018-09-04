package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihq;
import p000.ihr;
import p000.iip;
import p000.iis;

public class zzc extends zza {
    public static final Creator CREATOR = new iis();
    /* renamed from: a */
    private final ihq f20713a;
    /* renamed from: b */
    private final IntentFilter[] f20714b;
    /* renamed from: c */
    private final String f20715c;
    /* renamed from: d */
    private final String f20716d;

    public zzc(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        if (iBinder != null) {
            this.f20713a = ihr.m12217a(iBinder);
        } else {
            this.f20713a = null;
        }
        this.f20714b = intentFilterArr;
        this.f20715c = str;
        this.f20716d = str2;
    }

    public zzc(iip iip) {
        this.f20713a = iip;
        this.f20714b = iip.f21731b;
        this.f20715c = null;
        this.f20716d = null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        ihq ihq = this.f20713a;
        htl.m3410a(parcel, 2, ihq != null ? ihq.asBinder() : null);
        htl.m3417a(parcel, 3, this.f20714b, i);
        htl.m3412a(parcel, 4, this.f20715c);
        htl.m3412a(parcel, 5, this.f20716d);
        htl.m3439c(parcel, b);
    }
}
