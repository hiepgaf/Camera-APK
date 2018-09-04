package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import p000.htl;
import p000.ifp;

public final class LocationRequest extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new ifp();
    /* renamed from: a */
    public int f20626a;
    /* renamed from: b */
    public long f20627b;
    /* renamed from: c */
    public long f20628c;
    /* renamed from: d */
    public boolean f20629d;
    /* renamed from: e */
    private long f20630e;
    /* renamed from: f */
    private int f20631f;
    /* renamed from: g */
    private float f20632g;
    /* renamed from: h */
    private long f20633h;

    public LocationRequest() {
        this.f20626a = 102;
        this.f20627b = 3600000;
        this.f20628c = 600000;
        this.f20629d = false;
        this.f20630e = Long.MAX_VALUE;
        this.f20631f = LfuScheduler.MAX_PRIORITY;
        this.f20632g = 0.0f;
        this.f20633h = 0;
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.f20626a = i;
        this.f20627b = j;
        this.f20628c = j2;
        this.f20629d = z;
        this.f20630e = j3;
        this.f20631f = i2;
        this.f20632g = f;
        this.f20633h = j4;
    }

    /* renamed from: a */
    public static void m15115a() {
    }

    /* renamed from: a */
    public static void m15116a(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder(38);
            stringBuilder.append("invalid interval: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private final long m15117b() {
        long j = this.f20633h;
        long j2 = this.f20627b;
        return j >= j2 ? j : j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f20626a == locationRequest.f20626a && this.f20627b == locationRequest.f20627b && this.f20628c == locationRequest.f20628c && this.f20629d == locationRequest.f20629d && this.f20630e == locationRequest.f20630e && this.f20631f == locationRequest.f20631f && this.f20632g == locationRequest.f20632g && m15117b() == locationRequest.m15117b();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20626a), Long.valueOf(this.f20627b), Float.valueOf(this.f20632g), Long.valueOf(this.f20633h)});
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request[");
        switch (this.f20626a) {
            case 100:
                str = "PRIORITY_HIGH_ACCURACY";
                break;
            case 102:
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
                break;
            case 104:
                str = "PRIORITY_LOW_POWER";
                break;
            case 105:
                str = "PRIORITY_NO_POWER";
                break;
            default:
                str = "???";
                break;
        }
        stringBuilder.append(str);
        if (this.f20626a != 105) {
            stringBuilder.append(" requested=");
            stringBuilder.append(this.f20627b);
            stringBuilder.append("ms");
        }
        stringBuilder.append(" fastest=");
        stringBuilder.append(this.f20628c);
        stringBuilder.append("ms");
        if (this.f20633h > this.f20627b) {
            stringBuilder.append(" maxWait=");
            stringBuilder.append(this.f20633h);
            stringBuilder.append("ms");
        }
        if (this.f20632g > 0.0f) {
            stringBuilder.append(" smallestDisplacement=");
            stringBuilder.append(this.f20632g);
            stringBuilder.append("m");
        }
        long j = this.f20630e;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            stringBuilder.append(" expireIn=");
            stringBuilder.append(j - elapsedRealtime);
            stringBuilder.append("ms");
        }
        if (this.f20631f != LfuScheduler.MAX_PRIORITY) {
            stringBuilder.append(" num=");
            stringBuilder.append(this.f20631f);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20626a);
        htl.m3408a(parcel, 2, this.f20627b);
        htl.m3408a(parcel, 3, this.f20628c);
        htl.m3414a(parcel, 4, this.f20629d);
        htl.m3408a(parcel, 5, this.f20630e);
        htl.m3440c(parcel, 6, this.f20631f);
        float f = this.f20632g;
        htl.m3434b(parcel, 7, 4);
        parcel.writeFloat(f);
        htl.m3408a(parcel, 8, this.f20633h);
        htl.m3439c(parcel, b);
    }
}
