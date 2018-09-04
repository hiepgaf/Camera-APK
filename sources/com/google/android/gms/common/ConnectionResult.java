package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import p000.htl;
import p000.hwx;

public final class ConnectionResult extends zza {
    public static final Creator CREATOR = new hwx();
    /* renamed from: a */
    public static final ConnectionResult f20457a = new ConnectionResult(0);
    /* renamed from: b */
    public final int f20458b;
    /* renamed from: c */
    public final PendingIntent f20459c;
    /* renamed from: d */
    public final String f20460d;
    /* renamed from: e */
    private final int f20461e;

    public ConnectionResult(int i) {
        this(i, null, (byte) 0);
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f20461e = i;
        this.f20458b = i2;
        this.f20459c = pendingIntent;
        this.f20460d = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (byte) 0);
    }

    private ConnectionResult(int i, PendingIntent pendingIntent, byte b) {
        this(1, i, pendingIntent, null);
    }

    /* renamed from: a */
    public static String m15092a(int i) {
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            case 13:
                return "CANCELED";
            case 14:
                return "TIMEOUT";
            case 15:
                return "INTERRUPTED";
            case 16:
                return "API_UNAVAILABLE";
            case 17:
                return "SIGN_IN_FAILED";
            case 18:
                return "SERVICE_UPDATING";
            case 19:
                return "SERVICE_MISSING_PERMISSION";
            case 20:
                return "RESTRICTED_PROFILE";
            case 21:
                return "API_VERSION_UPDATE_REQUIRED";
            case 99:
                return "UNFINISHED";
            case 1500:
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            default:
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("UNKNOWN_ERROR_CODE(");
                stringBuilder.append(i);
                stringBuilder.append(")");
                return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public final boolean m15093a() {
        return (this.f20458b == 0 || this.f20459c == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean m15094b() {
        return this.f20458b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f20458b == connectionResult.f20458b && htl.m3426a(this.f20459c, connectionResult.f20459c) && htl.m3426a(this.f20460d, connectionResult.f20460d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20458b), this.f20459c, this.f20460d});
    }

    public final String toString() {
        return htl.m3398a((Object) this).m3500a("statusCode", m15092a(this.f20458b)).m3500a("resolution", this.f20459c).m3500a("message", this.f20460d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20461e);
        htl.m3440c(parcel, 2, this.f20458b);
        htl.m3411a(parcel, 3, this.f20459c, i);
        htl.m3412a(parcel, 4, this.f20460d);
        htl.m3439c(parcel, b);
    }
}
