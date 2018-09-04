package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hzo;

public final class OfflineSuggestion extends zza {
    public static final Creator CREATOR = new hzo();
    /* renamed from: a */
    private final String f20608a;
    /* renamed from: b */
    private final String f20609b;
    /* renamed from: c */
    private final String f20610c;
    /* renamed from: d */
    private final String f20611d;

    public OfflineSuggestion(String str, String str2, String str3, String str4) {
        this.f20608a = str;
        this.f20609b = str2;
        this.f20610c = str4;
        this.f20611d = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3412a(parcel, 2, this.f20608a);
        htl.m3412a(parcel, 3, this.f20609b);
        htl.m3412a(parcel, 4, this.f20610c);
        htl.m3412a(parcel, 5, this.f20611d);
        htl.m3439c(parcel, b);
    }
}
