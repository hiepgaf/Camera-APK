package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.igi;
import p000.igy;

@KeepName
public class DataItemAssetParcelable extends zza implements ReflectedParcelable, igi {
    public static final Creator CREATOR = new igy();
    /* renamed from: a */
    private final String f20667a;
    /* renamed from: b */
    private final String f20668b;

    public DataItemAssetParcelable(igi igi) {
        this.f20667a = (String) htl.m3431b(igi.mo2804b());
        this.f20668b = (String) htl.m3431b(igi.mo2803a());
    }

    public DataItemAssetParcelable(String str, String str2) {
        this.f20667a = str;
        this.f20668b = str2;
    }

    /* renamed from: a */
    public final String mo2803a() {
        return this.f20668b;
    }

    /* renamed from: b */
    public final String mo2804b() {
        return this.f20667a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataItemAssetParcelable[");
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        if (this.f20667a != null) {
            stringBuilder.append(",");
            stringBuilder.append(this.f20667a);
        } else {
            stringBuilder.append(",noid");
        }
        stringBuilder.append(", key=");
        stringBuilder.append(this.f20668b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3412a(parcel, 2, this.f20667a);
        htl.m3412a(parcel, 3, this.f20668b);
        htl.m3439c(parcel, b);
    }
}
