package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hya;

public class ThemeSettings extends zza {
    public static final Creator CREATOR = new hya();
    /* renamed from: a */
    public int f20576a;
    /* renamed from: b */
    private int f20577b;

    public ThemeSettings() {
        this(0, 0);
    }

    public ThemeSettings(int i, int i2) {
        this.f20576a = i;
        this.f20577b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20576a);
        htl.m3440c(parcel, 3, this.f20577b);
        htl.m3439c(parcel, b);
    }
}
