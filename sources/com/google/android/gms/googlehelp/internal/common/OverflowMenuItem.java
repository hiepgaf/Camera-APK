package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hyz;

public final class OverflowMenuItem extends zza {
    public static final Creator CREATOR = new hyz();
    /* renamed from: a */
    private final int f20612a;
    /* renamed from: b */
    private final String f20613b;
    /* renamed from: c */
    private final Intent f20614c;

    public OverflowMenuItem(int i, String str, Intent intent) {
        this.f20612a = i;
        this.f20613b = str;
        this.f20614c = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20612a);
        htl.m3412a(parcel, 3, this.f20613b);
        htl.m3411a(parcel, 4, this.f20614c, i);
        htl.m3439c(parcel, b);
    }
}
