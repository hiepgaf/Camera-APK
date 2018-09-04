package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htc;
import p000.htl;

public class zzg extends zza {
    public static final Creator CREATOR = new htc();
    /* renamed from: a */
    public int f20435a;
    /* renamed from: b */
    private final int f20436b;
    /* renamed from: c */
    private Bundle f20437c;

    public zzg(int i, int i2, Bundle bundle) {
        this.f20436b = i;
        this.f20435a = i2;
        this.f20437c = bundle;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20436b);
        htl.m3440c(parcel, 2, this.f20435a);
        htl.m3409a(parcel, 3, this.f20437c);
        htl.m3439c(parcel, b);
    }
}
