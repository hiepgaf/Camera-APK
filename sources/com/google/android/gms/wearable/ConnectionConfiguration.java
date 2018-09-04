package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import p000.htl;
import p000.ijc;

public class ConnectionConfiguration extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new ijc();
    /* renamed from: a */
    private final String f20653a;
    /* renamed from: b */
    private final String f20654b;
    /* renamed from: c */
    private final int f20655c;
    /* renamed from: d */
    private final int f20656d;
    /* renamed from: e */
    private final boolean f20657e;
    /* renamed from: f */
    private boolean f20658f;
    /* renamed from: g */
    private String f20659g;
    /* renamed from: h */
    private boolean f20660h;
    /* renamed from: i */
    private String f20661i;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4) {
        this.f20653a = str;
        this.f20654b = str2;
        this.f20655c = i;
        this.f20656d = i2;
        this.f20657e = z;
        this.f20658f = z2;
        this.f20659g = str3;
        this.f20660h = z3;
        this.f20661i = str4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return htl.m3426a(this.f20653a, connectionConfiguration.f20653a) && htl.m3426a(this.f20654b, connectionConfiguration.f20654b) && htl.m3426a(Integer.valueOf(this.f20655c), Integer.valueOf(connectionConfiguration.f20655c)) && htl.m3426a(Integer.valueOf(this.f20656d), Integer.valueOf(connectionConfiguration.f20656d)) && htl.m3426a(Boolean.valueOf(this.f20657e), Boolean.valueOf(connectionConfiguration.f20657e)) && htl.m3426a(Boolean.valueOf(this.f20660h), Boolean.valueOf(connectionConfiguration.f20660h));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20653a, this.f20654b, Integer.valueOf(this.f20655c), Integer.valueOf(this.f20656d), Boolean.valueOf(this.f20657e), Boolean.valueOf(this.f20660h)});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConnectionConfiguration[ ");
        String valueOf = String.valueOf(this.f20653a);
        String str = "mName=";
        stringBuilder.append(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        valueOf = String.valueOf(this.f20654b);
        str = ", mAddress=";
        stringBuilder.append(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        int i = this.f20655c;
        StringBuilder stringBuilder2 = new StringBuilder(19);
        stringBuilder2.append(", mType=");
        stringBuilder2.append(i);
        stringBuilder.append(stringBuilder2.toString());
        i = this.f20656d;
        stringBuilder2 = new StringBuilder(19);
        stringBuilder2.append(", mRole=");
        stringBuilder2.append(i);
        stringBuilder.append(stringBuilder2.toString());
        boolean z = this.f20657e;
        stringBuilder2 = new StringBuilder(16);
        stringBuilder2.append(", mEnabled=");
        stringBuilder2.append(z);
        stringBuilder.append(stringBuilder2.toString());
        z = this.f20658f;
        stringBuilder2 = new StringBuilder(20);
        stringBuilder2.append(", mIsConnected=");
        stringBuilder2.append(z);
        stringBuilder.append(stringBuilder2.toString());
        valueOf = String.valueOf(this.f20659g);
        str = ", mPeerNodeId=";
        stringBuilder.append(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        z = this.f20660h;
        stringBuilder2 = new StringBuilder(21);
        stringBuilder2.append(", mBtlePriority=");
        stringBuilder2.append(z);
        stringBuilder.append(stringBuilder2.toString());
        valueOf = String.valueOf(this.f20661i);
        str = ", mNodeId=";
        stringBuilder.append(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3412a(parcel, 2, this.f20653a);
        htl.m3412a(parcel, 3, this.f20654b);
        htl.m3440c(parcel, 4, this.f20655c);
        htl.m3440c(parcel, 5, this.f20656d);
        htl.m3414a(parcel, 6, this.f20657e);
        htl.m3414a(parcel, 7, this.f20658f);
        htl.m3412a(parcel, 8, this.f20659g);
        htl.m3414a(parcel, 9, this.f20660h);
        htl.m3412a(parcel, 10, this.f20661i);
        htl.m3439c(parcel, b);
    }
}
