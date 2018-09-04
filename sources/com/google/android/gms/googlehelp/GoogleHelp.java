package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;
import java.util.List;
import p000.htl;
import p000.hzi;

public final class GoogleHelp extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new hzi();
    /* renamed from: A */
    private int f20580A;
    /* renamed from: B */
    private PendingIntent f20581B;
    /* renamed from: a */
    public Bundle f20582a;
    /* renamed from: b */
    public Uri f20583b;
    /* renamed from: c */
    public TogglingData f20584c;
    /* renamed from: d */
    public int f20585d;
    /* renamed from: e */
    public boolean f20586e;
    /* renamed from: f */
    public boolean f20587f;
    /* renamed from: g */
    private final int f20588g;
    /* renamed from: h */
    private String f20589h;
    /* renamed from: i */
    private Account f20590i;
    /* renamed from: j */
    private String f20591j;
    /* renamed from: k */
    private String f20592k;
    /* renamed from: l */
    private Bitmap f20593l;
    /* renamed from: m */
    private boolean f20594m;
    /* renamed from: n */
    private boolean f20595n;
    /* renamed from: o */
    private List f20596o;
    @Deprecated
    /* renamed from: p */
    private Bundle f20597p;
    @Deprecated
    /* renamed from: q */
    private Bitmap f20598q;
    @Deprecated
    /* renamed from: r */
    private byte[] f20599r;
    @Deprecated
    /* renamed from: s */
    private int f20600s;
    @Deprecated
    /* renamed from: t */
    private int f20601t;
    /* renamed from: u */
    private String f20602u;
    /* renamed from: v */
    private List f20603v;
    /* renamed from: w */
    private ThemeSettings f20604w;
    /* renamed from: x */
    private List f20605x;
    /* renamed from: y */
    private boolean f20606y;
    /* renamed from: z */
    private ErrorReport f20607z;

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, ThemeSettings themeSettings, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5) {
        this.f20607z = new ErrorReport();
        this.f20588g = i;
        this.f20585d = i6;
        this.f20586e = z4;
        this.f20587f = z5;
        this.f20589h = str;
        this.f20590i = account;
        this.f20582a = bundle;
        this.f20591j = str2;
        this.f20592k = str3;
        this.f20593l = bitmap;
        this.f20594m = z;
        this.f20595n = z2;
        this.f20596o = list;
        this.f20581B = pendingIntent;
        this.f20597p = bundle2;
        this.f20598q = bitmap2;
        this.f20599r = bArr;
        this.f20600s = i2;
        this.f20601t = i3;
        this.f20602u = str4;
        this.f20583b = uri;
        this.f20603v = list2;
        if (this.f20588g < 4) {
            ThemeSettings themeSettings2 = new ThemeSettings();
            themeSettings2.f20576a = i4;
            this.f20604w = themeSettings2;
        } else {
            if (themeSettings == null) {
                themeSettings = new ThemeSettings();
            }
            this.f20604w = themeSettings;
        }
        this.f20605x = list3;
        this.f20606y = z3;
        this.f20607z = errorReport;
        ErrorReport errorReport2 = this.f20607z;
        if (errorReport2 != null) {
            errorReport2.f20548p = "GoogleHelp";
        }
        this.f20584c = togglingData;
        this.f20580A = i5;
    }

    public GoogleHelp(String str) {
        this(11, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 0, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false);
    }

    /* renamed from: a */
    public final GoogleHelp m15113a(int i, String str, Intent intent) {
        this.f20603v.add(new OverflowMenuItem(i, str, intent));
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20588g);
        htl.m3412a(parcel, 2, this.f20589h);
        htl.m3411a(parcel, 3, this.f20590i, i);
        htl.m3409a(parcel, 4, this.f20582a);
        htl.m3414a(parcel, 5, this.f20594m);
        htl.m3414a(parcel, 6, this.f20595n);
        List list = this.f20596o;
        if (list != null) {
            int b2 = htl.m3430b(parcel, 7);
            parcel.writeStringList(list);
            htl.m3439c(parcel, b2);
        }
        htl.m3409a(parcel, 10, this.f20597p);
        htl.m3411a(parcel, 11, this.f20598q, i);
        htl.m3412a(parcel, 14, this.f20602u);
        htl.m3411a(parcel, 15, this.f20583b, i);
        htl.m3413a(parcel, 16, this.f20603v);
        htl.m3440c(parcel, 17, 0);
        htl.m3413a(parcel, 18, this.f20605x);
        htl.m3415a(parcel, 19, this.f20599r);
        htl.m3440c(parcel, 20, this.f20600s);
        htl.m3440c(parcel, 21, this.f20601t);
        htl.m3414a(parcel, 22, this.f20606y);
        htl.m3411a(parcel, 23, this.f20607z, i);
        htl.m3411a(parcel, 25, this.f20604w, i);
        htl.m3412a(parcel, 28, this.f20591j);
        htl.m3411a(parcel, 31, this.f20584c, i);
        htl.m3440c(parcel, 32, this.f20580A);
        htl.m3411a(parcel, 33, this.f20581B, i);
        htl.m3412a(parcel, 34, this.f20592k);
        htl.m3411a(parcel, 35, this.f20593l, i);
        htl.m3440c(parcel, 36, this.f20585d);
        htl.m3414a(parcel, 37, this.f20586e);
        htl.m3414a(parcel, 38, this.f20587f);
        htl.m3439c(parcel, b);
    }
}
