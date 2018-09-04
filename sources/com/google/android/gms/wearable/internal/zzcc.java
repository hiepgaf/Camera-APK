package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iic;

public class zzcc extends zza {
    public static final Creator CREATOR = new iic();
    /* renamed from: a */
    private final String f20717a;
    /* renamed from: b */
    private final String f20718b;
    /* renamed from: c */
    private final int f20719c;
    /* renamed from: d */
    private final boolean f20720d;

    public zzcc(String str, String str2, int i, boolean z) {
        this.f20717a = str;
        this.f20718b = str2;
        this.f20719c = i;
        this.f20720d = z;
    }

    public boolean equals(Object obj) {
        return obj instanceof zzcc ? ((zzcc) obj).f20717a.equals(this.f20717a) : false;
    }

    public int hashCode() {
        return this.f20717a.hashCode();
    }

    public String toString() {
        String str = this.f20718b;
        String str2 = this.f20717a;
        int i = this.f20719c;
        boolean z = this.f20720d;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 45) + String.valueOf(str2).length());
        stringBuilder.append("Node{");
        stringBuilder.append(str);
        stringBuilder.append(", id=");
        stringBuilder.append(str2);
        stringBuilder.append(", hops=");
        stringBuilder.append(i);
        stringBuilder.append(", isNearby=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3412a(parcel, 2, this.f20717a);
        htl.m3412a(parcel, 3, this.f20718b);
        htl.m3440c(parcel, 4, this.f20719c);
        htl.m3414a(parcel, 5, this.f20720d);
        htl.m3439c(parcel, b);
    }
}
