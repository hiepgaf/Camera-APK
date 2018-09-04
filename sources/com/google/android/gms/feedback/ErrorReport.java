package com.google.android.gms.feedback;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;
import p000.htl;
import p000.hxw;

public class ErrorReport extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new hxw();
    /* renamed from: A */
    private int f20507A;
    /* renamed from: B */
    private String f20508B;
    /* renamed from: C */
    private String f20509C;
    /* renamed from: D */
    private String f20510D;
    /* renamed from: E */
    private String f20511E;
    /* renamed from: F */
    private String f20512F;
    /* renamed from: G */
    private String[] f20513G;
    /* renamed from: H */
    private String[] f20514H;
    /* renamed from: I */
    private String[] f20515I;
    /* renamed from: J */
    private String f20516J;
    /* renamed from: K */
    private String f20517K;
    /* renamed from: L */
    private byte[] f20518L;
    /* renamed from: M */
    private int f20519M;
    /* renamed from: N */
    private int f20520N;
    /* renamed from: O */
    private int f20521O;
    /* renamed from: P */
    private int f20522P;
    /* renamed from: Q */
    private String f20523Q;
    /* renamed from: R */
    private String f20524R;
    /* renamed from: S */
    private boolean f20525S;
    /* renamed from: T */
    private int f20526T;
    /* renamed from: U */
    private int f20527U;
    /* renamed from: V */
    private boolean f20528V;
    @Deprecated
    /* renamed from: W */
    private String f20529W;
    /* renamed from: X */
    private String f20530X;
    /* renamed from: Y */
    private String f20531Y;
    /* renamed from: Z */
    private String[] f20532Z;
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public ApplicationErrorReport f20533a = new ApplicationErrorReport();
    private String aa;
    private boolean ab;
    private Bundle ac;
    private List ad;
    /* renamed from: b */
    public String f20534b;
    /* renamed from: c */
    public String f20535c;
    /* renamed from: d */
    public Bundle f20536d;
    /* renamed from: e */
    public String f20537e;
    /* renamed from: f */
    public String f20538f;
    /* renamed from: g */
    public int f20539g;
    /* renamed from: h */
    public String f20540h;
    /* renamed from: i */
    public String f20541i;
    /* renamed from: j */
    public String f20542j;
    /* renamed from: k */
    public String f20543k;
    /* renamed from: l */
    public String f20544l;
    /* renamed from: m */
    public BitmapTeleporter f20545m;
    /* renamed from: n */
    public FileTeleporter[] f20546n;
    /* renamed from: o */
    public boolean f20547o;
    /* renamed from: p */
    public String f20548p;
    /* renamed from: q */
    public ThemeSettings f20549q;
    /* renamed from: r */
    public LogOptions f20550r;
    /* renamed from: s */
    private int f20551s;
    /* renamed from: t */
    private String f20552t;
    /* renamed from: u */
    private String f20553u;
    /* renamed from: v */
    private String f20554v;
    /* renamed from: w */
    private String f20555w;
    /* renamed from: x */
    private String f20556x;
    /* renamed from: y */
    private String f20557y;
    /* renamed from: z */
    private String f20558z;

    @TargetApi(14)
    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, FileTeleporter[] fileTeleporterArr, String[] strArr4, boolean z3, String str29, ThemeSettings themeSettings, LogOptions logOptions, String str30, boolean z4, Bundle bundle2, List list) {
        this.f20533a = applicationErrorReport;
        this.f20534b = str;
        this.f20551s = i;
        this.f20552t = str2;
        this.f20553u = str3;
        this.f20554v = str4;
        this.f20555w = str5;
        this.f20556x = str6;
        this.f20557y = str7;
        this.f20558z = str8;
        this.f20507A = i2;
        this.f20508B = str9;
        this.f20509C = str10;
        this.f20510D = str11;
        this.f20511E = str12;
        this.f20512F = str13;
        this.f20513G = strArr;
        this.f20514H = strArr2;
        this.f20515I = strArr3;
        this.f20516J = str14;
        this.f20517K = str15;
        this.f20518L = bArr;
        this.f20519M = i3;
        this.f20520N = i4;
        this.f20521O = i5;
        this.f20522P = i6;
        this.f20523Q = str16;
        this.f20535c = str17;
        this.f20524R = str18;
        this.f20536d = bundle;
        this.f20525S = z;
        this.f20526T = i7;
        this.f20527U = i8;
        this.f20528V = z2;
        this.f20537e = str19;
        this.f20538f = str20;
        this.f20539g = i9;
        this.f20540h = str21;
        this.f20541i = str22;
        this.f20542j = str23;
        this.f20543k = str24;
        this.f20544l = str25;
        this.f20529W = str26;
        this.f20530X = str27;
        this.f20545m = bitmapTeleporter;
        this.f20531Y = str28;
        this.f20546n = fileTeleporterArr;
        this.f20532Z = strArr4;
        this.f20547o = z3;
        this.f20548p = str29;
        this.f20549q = themeSettings;
        this.f20550r = logOptions;
        this.aa = str30;
        this.ab = z4;
        this.ac = bundle2;
        this.ad = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3411a(parcel, 2, this.f20533a, i);
        htl.m3412a(parcel, 3, this.f20534b);
        htl.m3440c(parcel, 4, this.f20551s);
        htl.m3412a(parcel, 5, this.f20552t);
        htl.m3412a(parcel, 6, this.f20553u);
        htl.m3412a(parcel, 7, this.f20554v);
        htl.m3412a(parcel, 8, this.f20555w);
        htl.m3412a(parcel, 9, this.f20556x);
        htl.m3412a(parcel, 10, this.f20557y);
        htl.m3412a(parcel, 11, this.f20558z);
        htl.m3440c(parcel, 12, this.f20507A);
        htl.m3412a(parcel, 13, this.f20508B);
        htl.m3412a(parcel, 14, this.f20509C);
        htl.m3412a(parcel, 15, this.f20510D);
        htl.m3412a(parcel, 16, this.f20511E);
        htl.m3412a(parcel, 17, this.f20512F);
        htl.m3418a(parcel, 18, this.f20513G);
        htl.m3418a(parcel, 19, this.f20514H);
        htl.m3418a(parcel, 20, this.f20515I);
        htl.m3412a(parcel, 21, this.f20516J);
        htl.m3412a(parcel, 22, this.f20517K);
        htl.m3415a(parcel, 23, this.f20518L);
        htl.m3440c(parcel, 24, this.f20519M);
        htl.m3440c(parcel, 25, this.f20520N);
        htl.m3440c(parcel, 26, this.f20521O);
        htl.m3440c(parcel, 27, this.f20522P);
        htl.m3412a(parcel, 28, this.f20523Q);
        htl.m3412a(parcel, 29, this.f20535c);
        htl.m3412a(parcel, 30, this.f20524R);
        htl.m3409a(parcel, 31, this.f20536d);
        htl.m3414a(parcel, 32, this.f20525S);
        htl.m3440c(parcel, 33, this.f20526T);
        htl.m3440c(parcel, 34, this.f20527U);
        htl.m3414a(parcel, 35, this.f20528V);
        htl.m3412a(parcel, 36, this.f20537e);
        htl.m3412a(parcel, 37, this.f20538f);
        htl.m3440c(parcel, 38, this.f20539g);
        htl.m3412a(parcel, 39, this.f20540h);
        htl.m3412a(parcel, 40, this.f20541i);
        htl.m3412a(parcel, 41, this.f20542j);
        htl.m3412a(parcel, 42, this.f20543k);
        htl.m3412a(parcel, 43, this.f20544l);
        htl.m3412a(parcel, 44, this.f20529W);
        htl.m3412a(parcel, 45, this.f20530X);
        htl.m3411a(parcel, 46, this.f20545m, i);
        htl.m3412a(parcel, 47, this.f20531Y);
        htl.m3417a(parcel, 48, this.f20546n, i);
        htl.m3418a(parcel, 49, this.f20532Z);
        htl.m3414a(parcel, 50, this.f20547o);
        htl.m3412a(parcel, 51, this.f20548p);
        htl.m3411a(parcel, 52, this.f20549q, i);
        htl.m3411a(parcel, 53, this.f20550r, i);
        htl.m3412a(parcel, 54, this.aa);
        htl.m3414a(parcel, 55, this.ab);
        htl.m3409a(parcel, 56, this.ac);
        htl.m3413a(parcel, 57, this.ad);
        htl.m3439c(parcel, b);
    }
}
