package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.zzc;
import p000.htl;
import p000.huc;
import p000.hvh;
import p000.hwb;
import p000.hwl;

public class zzj extends zza {
    public static final Creator CREATOR = new hwb();
    /* renamed from: a */
    public String f20496a;
    /* renamed from: b */
    public IBinder f20497b;
    /* renamed from: c */
    public Scope[] f20498c;
    /* renamed from: d */
    public Bundle f20499d;
    /* renamed from: e */
    public Account f20500e;
    /* renamed from: f */
    public zzc[] f20501f;
    /* renamed from: g */
    private final int f20502g;
    /* renamed from: h */
    private final int f20503h;
    /* renamed from: i */
    private int f20504i;

    public zzj(int i) {
        this.f20502g = 3;
        this.f20504i = huc.f6667c;
        this.f20503h = i;
    }

    public zzj(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, zzc[] zzcArr) {
        this.f20502g = i;
        this.f20503h = i2;
        this.f20504i = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f20496a = "com.google.android.gms";
        } else {
            this.f20496a = str;
        }
        if (i >= 2) {
            this.f20497b = iBinder;
            this.f20500e = account;
        } else {
            this.f20500e = iBinder != null ? hvh.m15937a(hwl.m12012a(iBinder)) : null;
        }
        this.f20498c = scopeArr;
        this.f20499d = bundle;
        this.f20501f = zzcArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20502g);
        htl.m3440c(parcel, 2, this.f20503h);
        htl.m3440c(parcel, 3, this.f20504i);
        htl.m3412a(parcel, 4, this.f20496a);
        htl.m3410a(parcel, 5, this.f20497b);
        htl.m3417a(parcel, 6, this.f20498c, i);
        htl.m3409a(parcel, 7, this.f20499d);
        htl.m3411a(parcel, 8, this.f20500e, i);
        htl.m3417a(parcel, 10, this.f20501f, i);
        htl.m3439c(parcel, b);
    }
}
