package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import p000.htl;
import p000.htx;

public class PlayLoggerContext extends zza {
    public static final Creator CREATOR = new htx();
    /* renamed from: a */
    public final int f20448a;
    /* renamed from: b */
    public final String f20449b;
    /* renamed from: c */
    private final String f20450c;
    /* renamed from: d */
    private final int f20451d;
    /* renamed from: e */
    private final String f20452e;
    /* renamed from: f */
    private final String f20453f;
    /* renamed from: g */
    private final boolean f20454g;
    /* renamed from: h */
    private final boolean f20455h;
    /* renamed from: i */
    private final int f20456i;

    public PlayLoggerContext(String str, int i, int i2, String str2, String str3, String str4, boolean z, int i3) {
        this.f20450c = (String) htl.m3431b((Object) str);
        this.f20451d = i;
        this.f20448a = i2;
        this.f20449b = str2;
        this.f20452e = str3;
        this.f20453f = str4;
        this.f20454g = z ^ 1;
        this.f20455h = z;
        this.f20456i = i3;
    }

    public PlayLoggerContext(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3) {
        this.f20450c = str;
        this.f20451d = i;
        this.f20448a = i2;
        this.f20452e = str2;
        this.f20453f = str3;
        this.f20454g = z;
        this.f20449b = str4;
        this.f20455h = z2;
        this.f20456i = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayLoggerContext)) {
            return false;
        }
        PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
        return this.f20450c.equals(playLoggerContext.f20450c) && this.f20451d == playLoggerContext.f20451d && this.f20448a == playLoggerContext.f20448a && htl.m3426a(this.f20449b, playLoggerContext.f20449b) && htl.m3426a(this.f20452e, playLoggerContext.f20452e) && htl.m3426a(this.f20453f, playLoggerContext.f20453f) && this.f20454g == playLoggerContext.f20454g && this.f20455h == playLoggerContext.f20455h && this.f20456i == playLoggerContext.f20456i;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20450c, Integer.valueOf(this.f20451d), Integer.valueOf(this.f20448a), this.f20449b, this.f20452e, this.f20453f, Boolean.valueOf(this.f20454g), Boolean.valueOf(this.f20455h), Integer.valueOf(this.f20456i)});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlayLoggerContext[");
        stringBuilder.append("package=");
        stringBuilder.append(this.f20450c);
        stringBuilder.append(',');
        stringBuilder.append("packageVersionCode=");
        stringBuilder.append(this.f20451d);
        stringBuilder.append(',');
        stringBuilder.append("logSource=");
        stringBuilder.append(this.f20448a);
        stringBuilder.append(',');
        stringBuilder.append("logSourceName=");
        stringBuilder.append(this.f20449b);
        stringBuilder.append(',');
        stringBuilder.append("uploadAccount=");
        stringBuilder.append(this.f20452e);
        stringBuilder.append(',');
        stringBuilder.append("loggingId=");
        stringBuilder.append(this.f20453f);
        stringBuilder.append(',');
        stringBuilder.append("logAndroidId=");
        stringBuilder.append(this.f20454g);
        stringBuilder.append(',');
        stringBuilder.append("isAnonymous=");
        stringBuilder.append(this.f20455h);
        stringBuilder.append(',');
        stringBuilder.append("qosTier=");
        stringBuilder.append(this.f20456i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3412a(parcel, 2, this.f20450c);
        htl.m3440c(parcel, 3, this.f20451d);
        htl.m3440c(parcel, 4, this.f20448a);
        htl.m3412a(parcel, 5, this.f20452e);
        htl.m3412a(parcel, 6, this.f20453f);
        htl.m3414a(parcel, 7, this.f20454g);
        htl.m3412a(parcel, 8, this.f20449b);
        htl.m3414a(parcel, 9, this.f20455h);
        htl.m3440c(parcel, 10, this.f20456i);
        htl.m3439c(parcel, b);
    }
}
