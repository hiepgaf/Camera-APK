package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hux;
import p000.iew;

public final class zzf extends zza implements hux {
    public static final Creator CREATOR = new iew();
    /* renamed from: a */
    public final Status f20636a;

    static {
        zzf zzf = new zzf(Status.f20464a);
    }

    public zzf(Status status) {
        this.f20636a = status;
    }

    /* renamed from: a */
    public final Status mo1854a() {
        return this.f20636a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3411a(parcel, 1, this.f20636a, i);
        htl.m3439c(parcel, b);
    }
}
