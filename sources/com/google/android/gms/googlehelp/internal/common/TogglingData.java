package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hza;

public class TogglingData extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new hza();
    /* renamed from: a */
    public String f20615a;
    /* renamed from: b */
    private String f20616b;
    /* renamed from: c */
    private String f20617c;

    private TogglingData() {
    }

    public TogglingData(String str, String str2, String str3) {
        this.f20616b = str;
        this.f20617c = str2;
        this.f20615a = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3412a(parcel, 2, this.f20616b);
        htl.m3412a(parcel, 3, this.f20617c);
        htl.m3412a(parcel, 4, this.f20615a);
        htl.m3439c(parcel, b);
    }
}
