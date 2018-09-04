package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hux;
import p000.iax;

public class zzbge extends zza implements hux {
    public static final Creator CREATOR = new iax();
    /* renamed from: a */
    private final int f20618a;
    /* renamed from: b */
    private int f20619b;
    /* renamed from: c */
    private Intent f20620c;

    public zzbge() {
        this((byte) 0);
    }

    private zzbge(byte b) {
        this(2, 0, null);
    }

    public zzbge(int i, int i2, Intent intent) {
        this.f20618a = i;
        this.f20619b = i2;
        this.f20620c = intent;
    }

    /* renamed from: a */
    public final Status mo1854a() {
        return this.f20619b != 0 ? Status.f20467d : Status.f20464a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20618a);
        htl.m3440c(parcel, 2, this.f20619b);
        htl.m3411a(parcel, 3, this.f20620c, i);
        htl.m3439c(parcel, b);
    }
}
