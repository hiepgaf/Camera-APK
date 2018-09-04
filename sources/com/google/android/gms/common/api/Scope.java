package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hvd;

public final class Scope extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new hvd();
    /* renamed from: a */
    public final String f20462a;
    /* renamed from: b */
    private final int f20463b;

    public Scope(int i, String str) {
        htl.m3404a(str, (Object) "scopeUri must not be null or empty");
        this.f20463b = i;
        this.f20462a = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        return this != obj ? obj instanceof Scope ? this.f20462a.equals(((Scope) obj).f20462a) : false : true;
    }

    public final int hashCode() {
        return this.f20462a.hashCode();
    }

    public final String toString() {
        return this.f20462a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20463b);
        htl.m3412a(parcel, 2, this.f20462a);
        htl.m3439c(parcel, b);
    }
}
