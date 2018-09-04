package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hxz;

public class LogOptions extends zza {
    public static final Creator CREATOR = new hxz();
    /* renamed from: a */
    private String f20574a;
    /* renamed from: b */
    private boolean f20575b;

    public LogOptions(String str, boolean z) {
        this.f20574a = str;
        this.f20575b = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3412a(parcel, 2, this.f20574a);
        htl.m3414a(parcel, 3, this.f20575b);
        htl.m3439c(parcel, b);
    }
}
