package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaf;
import p000.htl;
import p000.ibd;

public class zzbgq extends zza {
    public static final Creator CREATOR = new ibd();
    /* renamed from: a */
    public final ConnectionResult f20623a;
    /* renamed from: b */
    public final zzaf f20624b;
    /* renamed from: c */
    private final int f20625c;

    public zzbgq() {
        this(new ConnectionResult(8, null));
    }

    public zzbgq(int i, ConnectionResult connectionResult, zzaf zzaf) {
        this.f20625c = i;
        this.f20623a = connectionResult;
        this.f20624b = zzaf;
    }

    private zzbgq(ConnectionResult connectionResult) {
        this(1, connectionResult, null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20625c);
        htl.m3411a(parcel, 2, this.f20623a, i);
        htl.m3411a(parcel, 3, this.f20624b, i);
        htl.m3439c(parcel, b);
    }
}
