package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iex;
import p000.iez;
import p000.ifh;
import p000.ifj;
import p000.ifl;
import p000.ifm;
import p000.ifo;

public class zzq extends zza {
    public static final Creator CREATOR = new ifh();
    /* renamed from: a */
    private int f20643a;
    /* renamed from: b */
    private zzo f20644b;
    /* renamed from: c */
    private ifm f20645c;
    /* renamed from: d */
    private PendingIntent f20646d;
    /* renamed from: e */
    private ifj f20647e;
    /* renamed from: f */
    private iex f20648f;

    public zzq(int i, zzo zzo, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        ifm ifm;
        ifj ifj;
        iex iex;
        this.f20643a = i;
        this.f20644b = zzo;
        if (iBinder == null) {
            ifm = null;
        } else if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            ifm = (queryLocalInterface != null && (queryLocalInterface instanceof ifm)) ? (ifm) queryLocalInterface : new ifo(iBinder);
        } else {
            ifm = null;
        }
        this.f20645c = ifm;
        this.f20646d = pendingIntent;
        if (iBinder2 == null) {
            ifj = null;
        } else if (iBinder2 != null) {
            queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            ifj = (queryLocalInterface != null && (queryLocalInterface instanceof ifj)) ? (ifj) queryLocalInterface : new ifl(iBinder2);
        } else {
            ifj = null;
        }
        this.f20647e = ifj;
        if (iBinder3 == null) {
            iex = null;
        } else if (iBinder3 != null) {
            queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            iex = (queryLocalInterface != null && (queryLocalInterface instanceof iex)) ? (iex) queryLocalInterface : new iez(iBinder3);
        } else {
            iex = null;
        }
        this.f20648f = iex;
    }

    /* renamed from: a */
    public static zzq m15119a(ifm ifm, iex iex) {
        return new zzq(2, null, ifm.asBinder(), null, null, iex != null ? iex.asBinder() : null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder = null;
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20643a);
        htl.m3411a(parcel, 2, this.f20644b, i);
        ifm ifm = this.f20645c;
        htl.m3410a(parcel, 3, ifm != null ? ifm.asBinder() : null);
        htl.m3411a(parcel, 4, this.f20646d, i);
        ifj ifj = this.f20647e;
        htl.m3410a(parcel, 5, ifj != null ? ifj.asBinder() : null);
        iex iex = this.f20648f;
        if (iex != null) {
            iBinder = iex.asBinder();
        }
        htl.m3410a(parcel, 6, iBinder);
        htl.m3439c(parcel, b);
    }
}
