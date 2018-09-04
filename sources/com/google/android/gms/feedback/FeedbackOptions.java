package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;
import p000.htl;
import p000.hxx;

public class FeedbackOptions extends zza {
    public static final Creator CREATOR = new hxx();
    /* renamed from: a */
    public String f20559a;
    /* renamed from: b */
    public Bundle f20560b;
    /* renamed from: c */
    public String f20561c;
    /* renamed from: d */
    public ApplicationErrorReport f20562d;
    /* renamed from: e */
    public String f20563e;
    /* renamed from: f */
    public BitmapTeleporter f20564f;
    /* renamed from: g */
    public String f20565g;
    /* renamed from: h */
    public List f20566h;
    /* renamed from: i */
    public boolean f20567i;
    /* renamed from: j */
    public ThemeSettings f20568j;
    /* renamed from: k */
    public LogOptions f20569k;

    public FeedbackOptions(ApplicationErrorReport applicationErrorReport) {
        this(null, null, null, applicationErrorReport, null, null, null, null, true, null, null);
    }

    public FeedbackOptions(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, ThemeSettings themeSettings, LogOptions logOptions) {
        this.f20559a = str;
        this.f20560b = bundle;
        this.f20561c = str2;
        this.f20562d = applicationErrorReport;
        this.f20563e = str3;
        this.f20564f = bitmapTeleporter;
        this.f20565g = str4;
        this.f20566h = list;
        this.f20567i = z;
        this.f20568j = themeSettings;
        this.f20569k = logOptions;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3412a(parcel, 2, this.f20559a);
        htl.m3409a(parcel, 3, this.f20560b);
        htl.m3412a(parcel, 5, this.f20561c);
        htl.m3411a(parcel, 6, this.f20562d, i);
        htl.m3412a(parcel, 7, this.f20563e);
        htl.m3411a(parcel, 8, this.f20564f, i);
        htl.m3412a(parcel, 9, this.f20565g);
        htl.m3413a(parcel, 10, this.f20566h);
        htl.m3414a(parcel, 11, this.f20567i);
        htl.m3411a(parcel, 12, this.f20568j, i);
        htl.m3411a(parcel, 13, this.f20569k, i);
        htl.m3439c(parcel, b);
    }

    /* renamed from: a */
    public static /* synthetic */ FeedbackOptions m15100a(FeedbackOptions feedbackOptions) {
        return feedbackOptions;
    }
}
