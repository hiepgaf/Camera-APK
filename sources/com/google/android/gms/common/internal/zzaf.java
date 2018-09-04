package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hvk;
import p000.hwl;

public class zzaf extends zza {
    public static final Creator CREATOR = new hvk();
    /* renamed from: a */
    public IBinder f20491a;
    /* renamed from: b */
    public ConnectionResult f20492b;
    /* renamed from: c */
    public boolean f20493c;
    /* renamed from: d */
    public boolean f20494d;
    /* renamed from: e */
    private final int f20495e;

    public zzaf(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f20495e = i;
        this.f20491a = iBinder;
        this.f20492b = connectionResult;
        this.f20493c = z;
        this.f20494d = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaf)) {
            return false;
        }
        zzaf zzaf = (zzaf) obj;
        return this.f20492b.equals(zzaf.f20492b) && hwl.m12012a(this.f20491a).equals(hwl.m12012a(zzaf.f20491a));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20495e);
        htl.m3410a(parcel, 2, this.f20491a);
        htl.m3411a(parcel, 3, this.f20492b, i);
        htl.m3414a(parcel, 4, this.f20493c);
        htl.m3414a(parcel, 5, this.f20494d);
        htl.m3439c(parcel, b);
    }
}
