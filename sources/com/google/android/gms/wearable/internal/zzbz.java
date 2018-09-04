package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.igm;
import p000.iib;

public class zzbz extends zza implements igm {
    public static final Creator CREATOR = new iib();
    /* renamed from: a */
    private final int f20709a;
    /* renamed from: b */
    private final String f20710b;
    /* renamed from: c */
    private final byte[] f20711c;
    /* renamed from: d */
    private final String f20712d;

    public zzbz(int i, String str, byte[] bArr, String str2) {
        this.f20709a = i;
        this.f20710b = str;
        this.f20711c = bArr;
        this.f20712d = str2;
    }

    /* renamed from: a */
    public final String mo2805a() {
        return this.f20710b;
    }

    public String toString() {
        int i = this.f20709a;
        String str = this.f20710b;
        byte[] bArr = this.f20711c;
        String valueOf = String.valueOf(bArr != null ? Integer.valueOf(bArr.length) : "null");
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 43) + String.valueOf(valueOf).length());
        stringBuilder.append("MessageEventParcelable[");
        stringBuilder.append(i);
        stringBuilder.append(",");
        stringBuilder.append(str);
        stringBuilder.append(", size=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20709a);
        htl.m3412a(parcel, 3, this.f20710b);
        htl.m3415a(parcel, 4, this.f20711c);
        htl.m3412a(parcel, 5, this.f20712d);
        htl.m3439c(parcel, b);
    }
}
