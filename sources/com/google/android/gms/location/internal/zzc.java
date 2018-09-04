package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iet;

public class zzc extends zza {
    public static final Creator CREATOR = new iet();
    /* renamed from: a */
    private final int f20634a;
    /* renamed from: b */
    private final String f20635b;

    public zzc(int i, String str) {
        this.f20634a = i;
        this.f20635b = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof zzc)) {
            return false;
        }
        zzc zzc = (zzc) obj;
        return zzc.f20634a == this.f20634a && htl.m3426a(zzc.f20635b, this.f20635b);
    }

    public int hashCode() {
        return this.f20634a;
    }

    public String toString() {
        return String.format("%d:%s", new Object[]{Integer.valueOf(this.f20634a), this.f20635b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20634a);
        htl.m3412a(parcel, 2, this.f20635b);
        htl.m3439c(parcel, b);
    }
}
