package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import p000.htl;
import p000.ijb;

public class Asset extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new ijb();
    /* renamed from: a */
    public byte[] f20649a;
    /* renamed from: b */
    public String f20650b;
    /* renamed from: c */
    public ParcelFileDescriptor f20651c;
    /* renamed from: d */
    public Uri f20652d;

    public Asset(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.f20649a = bArr;
        this.f20650b = str;
        this.f20651c = parcelFileDescriptor;
        this.f20652d = uri;
    }

    /* renamed from: a */
    public static Asset m15120a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            return new Asset(null, null, parcelFileDescriptor, null);
        }
        throw new IllegalArgumentException("Asset fd cannot be null");
    }

    /* renamed from: a */
    public static Asset m15121a(byte[] bArr) {
        if (bArr != null) {
            return new Asset(bArr, null, null, null);
        }
        throw new IllegalArgumentException("Asset data cannot be null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.f20649a, asset.f20649a) && htl.m3426a(this.f20650b, asset.f20650b) && htl.m3426a(this.f20651c, asset.f20651c) && htl.m3426a(this.f20652d, asset.f20652d);
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.f20649a, this.f20650b, this.f20651c, this.f20652d});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Asset[@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        if (this.f20650b != null) {
            stringBuilder.append(", ");
            stringBuilder.append(this.f20650b);
        } else {
            stringBuilder.append(", nodigest");
        }
        if (this.f20649a != null) {
            stringBuilder.append(", size=");
            stringBuilder.append(this.f20649a.length);
        }
        if (this.f20651c != null) {
            stringBuilder.append(", fd=");
            stringBuilder.append(this.f20651c);
        }
        if (this.f20652d != null) {
            stringBuilder.append(", uri=");
            stringBuilder.append(this.f20652d);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i | 1;
        int b = htl.m3430b(parcel, 20293);
        htl.m3415a(parcel, 2, this.f20649a);
        htl.m3412a(parcel, 3, this.f20650b);
        htl.m3411a(parcel, 4, this.f20651c, i2);
        htl.m3411a(parcel, 5, this.f20652d, i2);
        htl.m3439c(parcel, b);
    }
}
