package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iiv;

public final class zzk extends zza {
    public static final Creator CREATOR = new iiv();
    /* renamed from: a */
    private int f20734a;
    /* renamed from: b */
    private final String f20735b;
    /* renamed from: c */
    private final String f20736c;
    /* renamed from: d */
    private final String f20737d;
    /* renamed from: e */
    private final String f20738e;
    /* renamed from: f */
    private final String f20739f;
    /* renamed from: g */
    private final String f20740g;
    /* renamed from: h */
    private final byte f20741h;
    /* renamed from: i */
    private final byte f20742i;
    /* renamed from: j */
    private final byte f20743j;
    /* renamed from: k */
    private final byte f20744k;
    /* renamed from: l */
    private final String f20745l;

    public zzk(int i, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.f20734a = i;
        this.f20735b = str;
        this.f20736c = str2;
        this.f20737d = str3;
        this.f20738e = str4;
        this.f20739f = str5;
        this.f20740g = str6;
        this.f20741h = b;
        this.f20742i = b2;
        this.f20743j = b3;
        this.f20744k = b4;
        this.f20745l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzk zzk = (zzk) obj;
        if (this.f20734a != zzk.f20734a || this.f20741h != zzk.f20741h || this.f20742i != zzk.f20742i || this.f20743j != zzk.f20743j || this.f20744k != zzk.f20744k || !this.f20735b.equals(zzk.f20735b)) {
            return false;
        }
        String str = this.f20736c;
        if (str != null) {
            if (!str.equals(zzk.f20736c)) {
                return false;
            }
        } else if (zzk.f20736c != null) {
            return false;
        }
        if (!this.f20737d.equals(zzk.f20737d) || !this.f20738e.equals(zzk.f20738e) || !this.f20739f.equals(zzk.f20739f)) {
            return false;
        }
        str = this.f20740g;
        if (str != null) {
            if (!str.equals(zzk.f20740g)) {
                return false;
            }
        } else if (zzk.f20740g != null) {
            return false;
        }
        str = this.f20745l;
        return str != null ? str.equals(zzk.f20745l) : zzk.f20745l == null;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((this.f20734a + 31) * 31) + this.f20735b.hashCode()) * 31;
        String str = this.f20736c;
        hashCode = ((((((((str != null ? str.hashCode() : 0) + hashCode) * 31) + this.f20737d.hashCode()) * 31) + this.f20738e.hashCode()) * 31) + this.f20739f.hashCode()) * 31;
        str = this.f20740g;
        int hashCode2 = ((((((((((str != null ? str.hashCode() : 0) + hashCode) * 31) + this.f20741h) * 31) + this.f20742i) * 31) + this.f20743j) * 31) + this.f20744k) * 31;
        String str2 = this.f20745l;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        int i = this.f20734a;
        String str = this.f20735b;
        String str2 = this.f20736c;
        String str3 = this.f20737d;
        String str4 = this.f20738e;
        String str5 = this.f20739f;
        String str6 = this.f20740g;
        byte b = this.f20741h;
        byte b2 = this.f20742i;
        byte b3 = this.f20743j;
        byte b4 = this.f20744k;
        String str7 = this.f20745l;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        StringBuilder stringBuilder = new StringBuilder(((((((length + 211) + length2) + length3) + length4) + length5) + String.valueOf(str6).length()) + String.valueOf(str7).length());
        stringBuilder.append("AncsNotificationParcelable{, id=");
        stringBuilder.append(i);
        stringBuilder.append(", appId='");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(", dateTime='");
        stringBuilder.append(str2);
        stringBuilder.append("'");
        stringBuilder.append(", notificationText='");
        stringBuilder.append(str3);
        stringBuilder.append("'");
        stringBuilder.append(", title='");
        stringBuilder.append(str4);
        stringBuilder.append("'");
        stringBuilder.append(", subtitle='");
        stringBuilder.append(str5);
        stringBuilder.append("'");
        stringBuilder.append(", displayName='");
        stringBuilder.append(str6);
        stringBuilder.append("'");
        stringBuilder.append(", eventId=");
        stringBuilder.append(b);
        stringBuilder.append(", eventFlags=");
        stringBuilder.append(b2);
        stringBuilder.append(", categoryId=");
        stringBuilder.append(b3);
        stringBuilder.append(", categoryCount=");
        stringBuilder.append(b4);
        stringBuilder.append(", packageName='");
        stringBuilder.append(str7);
        stringBuilder.append("'");
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 2, this.f20734a);
        htl.m3412a(parcel, 3, this.f20735b);
        htl.m3412a(parcel, 4, this.f20736c);
        htl.m3412a(parcel, 5, this.f20737d);
        htl.m3412a(parcel, 6, this.f20738e);
        htl.m3412a(parcel, 7, this.f20739f);
        String str = this.f20740g;
        if (str == null) {
            str = this.f20735b;
        }
        htl.m3412a(parcel, 8, str);
        htl.m3406a(parcel, 9, this.f20741h);
        htl.m3406a(parcel, 10, this.f20742i);
        htl.m3406a(parcel, 11, this.f20743j);
        htl.m3406a(parcel, 12, this.f20744k);
        htl.m3412a(parcel, 13, this.f20745l);
        htl.m3439c(parcel, b);
    }
}
