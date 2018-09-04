package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.Channel;
import p000.htl;
import p000.iiz;

public class zzu extends zza implements Channel {
    public static final Creator CREATOR = new iiz();
    /* renamed from: a */
    private final String f20752a;
    /* renamed from: b */
    private final String f20753b;
    /* renamed from: c */
    private final String f20754c;

    public zzu(String str, String str2, String str3) {
        this.f20752a = (String) htl.m3431b((Object) str);
        this.f20753b = (String) htl.m3431b((Object) str2);
        this.f20754c = (String) htl.m3431b((Object) str3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzu)) {
            return false;
        }
        zzu zzu = (zzu) obj;
        return this.f20752a.equals(zzu.f20752a) && htl.m3426a(zzu.f20753b, this.f20753b) && htl.m3426a(zzu.f20754c, this.f20754c);
    }

    public int hashCode() {
        return this.f20752a.hashCode();
    }

    public String toString() {
        String str = this.f20752a;
        String str2 = this.f20753b;
        String str3 = this.f20754c;
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 43) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append("ChannelImpl{, token='");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(", nodeId='");
        stringBuilder.append(str2);
        stringBuilder.append("'");
        stringBuilder.append(", path='");
        stringBuilder.append(str3);
        stringBuilder.append("'");
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3412a(parcel, 2, this.f20752a);
        htl.m3412a(parcel, 3, this.f20753b);
        htl.m3412a(parcel, 4, this.f20754c);
        htl.m3439c(parcel, b);
    }
}
