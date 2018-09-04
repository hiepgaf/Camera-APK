package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;
import p000.htl;
import p000.iix;

public class zzo extends zza {
    public static final Creator CREATOR = new iix();
    /* renamed from: a */
    private final String f20746a;
    /* renamed from: b */
    private final List f20747b;

    public zzo(String str, List list) {
        Object obj = new Object();
        this.f20746a = str;
        this.f20747b = list;
        htl.m3431b(this.f20746a);
        htl.m3431b(this.f20747b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzo zzo = (zzo) obj;
        String str = this.f20746a;
        if (!str == null ? str.equals(zzo.f20746a) : zzo.f20746a == null) {
            return false;
        }
        List list = this.f20747b;
        if (list != null) {
            if (list.equals(zzo.f20747b)) {
                return true;
            }
        } else if (zzo.f20747b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        String str = this.f20746a;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List list = this.f20747b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f20746a;
        String valueOf = String.valueOf(this.f20747b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 18) + String.valueOf(valueOf).length());
        stringBuilder.append("CapabilityInfo{");
        stringBuilder.append(str);
        stringBuilder.append(", ");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3412a(parcel, 2, this.f20746a);
        htl.m3413a(parcel, 3, this.f20747b);
        htl.m3439c(parcel, b);
    }
}
