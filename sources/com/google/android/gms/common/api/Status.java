package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import p000.htl;
import p000.hux;
import p000.hve;
import p000.hvi;

public final class Status extends zza implements ReflectedParcelable, hux {
    public static final Creator CREATOR = new hve();
    /* renamed from: a */
    public static final Status f20464a = new Status(0);
    /* renamed from: b */
    public static final Status f20465b = new Status(8);
    /* renamed from: c */
    public static final Status f20466c = new Status(15);
    /* renamed from: d */
    public static final Status f20467d = new Status(16);
    /* renamed from: e */
    public final int f20468e;
    /* renamed from: f */
    public final String f20469f;
    /* renamed from: g */
    private final int f20470g;
    /* renamed from: h */
    private final PendingIntent f20471h;

    static {
        Status status = new Status(14);
        status = new Status(17);
        status = new Status(18);
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f20470g = i;
        this.f20468e = i2;
        this.f20469f = str;
        this.f20471h = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    /* renamed from: a */
    public final Status mo1854a() {
        return this;
    }

    /* renamed from: b */
    public final boolean m15096b() {
        return this.f20468e <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f20470g == status.f20470g && this.f20468e == status.f20468e && htl.m3426a(this.f20469f, status.f20469f) && htl.m3426a(this.f20471h, status.f20471h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20470g), Integer.valueOf(this.f20468e), this.f20469f, this.f20471h});
    }

    public final String toString() {
        hvi a = htl.m3398a((Object) this);
        Object obj = this.f20469f;
        if (obj == null) {
            obj = htl.m3401a(this.f20468e);
        }
        return a.m3500a("statusCode", obj).m3500a("resolution", this.f20471h).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20468e);
        htl.m3412a(parcel, 2, this.f20469f);
        htl.m3411a(parcel, 3, this.f20471h, i);
        htl.m3440c(parcel, 1000, this.f20470g);
        htl.m3439c(parcel, b);
    }
}
