package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import p000.htl;
import p000.ifg;

public class zzo extends zza {
    public static final Creator CREATOR = new ifg();
    /* renamed from: a */
    public static final List f20637a = Collections.emptyList();
    /* renamed from: b */
    private LocationRequest f20638b;
    /* renamed from: c */
    private List f20639c;
    /* renamed from: d */
    private String f20640d;
    /* renamed from: e */
    private boolean f20641e;
    /* renamed from: f */
    private boolean f20642f;

    public zzo(LocationRequest locationRequest, List list, String str, boolean z, boolean z2) {
        this.f20638b = locationRequest;
        this.f20639c = list;
        this.f20640d = str;
        this.f20641e = z;
        this.f20642f = z2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzo = (zzo) obj;
        return htl.m3426a(this.f20638b, zzo.f20638b) && htl.m3426a(this.f20639c, zzo.f20639c) && htl.m3426a(this.f20640d, zzo.f20640d) && this.f20641e == zzo.f20641e && this.f20642f == zzo.f20642f;
    }

    public int hashCode() {
        return this.f20638b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f20638b.toString());
        if (this.f20640d != null) {
            stringBuilder.append(" tag=");
            stringBuilder.append(this.f20640d);
        }
        stringBuilder.append(" hideAppOps=");
        stringBuilder.append(this.f20641e);
        stringBuilder.append(" clients=");
        stringBuilder.append(this.f20639c);
        stringBuilder.append(" forceCoarseLocation=");
        stringBuilder.append(this.f20642f);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3411a(parcel, 1, this.f20638b, i);
        htl.m3413a(parcel, 5, this.f20639c);
        htl.m3412a(parcel, 6, this.f20640d);
        htl.m3414a(parcel, 7, this.f20641e);
        htl.m3414a(parcel, 8, this.f20642f);
        htl.m3439c(parcel, b);
    }
}
