package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hvj;

public class zzad extends zza {
    public static final Creator CREATOR = new hvj();
    /* renamed from: a */
    private final int f20487a;
    /* renamed from: b */
    private final Account f20488b;
    /* renamed from: c */
    private final int f20489c;
    /* renamed from: d */
    private final GoogleSignInAccount f20490d;

    public zzad(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f20487a = i;
        this.f20488b = account;
        this.f20489c = i2;
        this.f20490d = googleSignInAccount;
    }

    public zzad(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20487a);
        htl.m3411a(parcel, 2, this.f20488b, i);
        htl.m3440c(parcel, 3, this.f20489c);
        htl.m3411a(parcel, 4, this.f20490d, i);
        htl.m3439c(parcel, b);
    }
}
