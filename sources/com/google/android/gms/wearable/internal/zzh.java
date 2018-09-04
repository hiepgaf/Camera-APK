package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iiu;

public class zzh extends zza {
    public static final Creator CREATOR = new iiu();
    /* renamed from: a */
    private byte f20731a;
    /* renamed from: b */
    private final byte f20732b;
    /* renamed from: c */
    private final String f20733c;

    public zzh(byte b, byte b2, String str) {
        this.f20731a = b;
        this.f20732b = b2;
        this.f20733c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzh zzh = (zzh) obj;
        return this.f20731a == zzh.f20731a ? this.f20732b == zzh.f20732b ? this.f20733c.equals(zzh.f20733c) : false : false;
    }

    public int hashCode() {
        return ((((this.f20731a + 31) * 31) + this.f20732b) * 31) + this.f20733c.hashCode();
    }

    public String toString() {
        byte b = this.f20731a;
        byte b2 = this.f20732b;
        String str = this.f20733c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 73);
        stringBuilder.append("AmsEntityUpdateParcelable{, mEntityId=");
        stringBuilder.append(b);
        stringBuilder.append(", mAttributeId=");
        stringBuilder.append(b2);
        stringBuilder.append(", mValue='");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3406a(parcel, 2, this.f20731a);
        htl.m3406a(parcel, 3, this.f20732b);
        htl.m3412a(parcel, 4, this.f20733c);
        htl.m3439c(parcel, b);
    }
}
