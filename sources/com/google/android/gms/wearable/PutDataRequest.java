package com.google.android.gms.wearable;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p000.htl;
import p000.ijd;

public class PutDataRequest extends zza {
    public static final Creator CREATOR = new ijd();
    /* renamed from: d */
    private static final long f20662d = TimeUnit.MINUTES.toMillis(30);
    /* renamed from: a */
    public final Uri f20663a;
    /* renamed from: b */
    public byte[] f20664b;
    /* renamed from: c */
    public long f20665c;
    /* renamed from: e */
    private final Bundle f20666e;

    static {
        SecureRandom secureRandom = new SecureRandom();
    }

    private PutDataRequest(Uri uri) {
        this(uri, new Bundle(), null, f20662d);
    }

    public PutDataRequest(Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.f20663a = uri;
        this.f20666e = bundle;
        this.f20666e.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        this.f20664b = bArr;
        this.f20665c = j;
    }

    /* renamed from: a */
    public static PutDataRequest m15122a(Uri uri) {
        return new PutDataRequest(uri);
    }

    /* renamed from: a */
    public static PutDataRequest m15123a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        } else if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        } else if (!str.startsWith("//")) {
            return m15122a(new Builder().scheme("wear").path(str).build());
        } else {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
    }

    /* renamed from: a */
    public final PutDataRequest m15124a(String str, Asset asset) {
        htl.m3431b((Object) str);
        htl.m3431b((Object) asset);
        this.f20666e.putParcelable(str, asset);
        return this;
    }

    /* renamed from: a */
    public final Map m15125a() {
        Map hashMap = new HashMap();
        for (String str : this.f20666e.keySet()) {
            hashMap.put(str, (Asset) this.f20666e.getParcelable(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public String toString() {
        boolean isLoggable = Log.isLoggable("DataMap", 3);
        StringBuilder stringBuilder = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.f20664b;
        String valueOf = String.valueOf(bArr != null ? Integer.valueOf(bArr.length) : "null");
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 7);
        stringBuilder2.append("dataSz=");
        stringBuilder2.append(valueOf);
        stringBuilder.append(stringBuilder2.toString());
        int size = this.f20666e.size();
        StringBuilder stringBuilder3 = new StringBuilder(23);
        stringBuilder3.append(", numAssets=");
        stringBuilder3.append(size);
        stringBuilder.append(stringBuilder3.toString());
        valueOf = String.valueOf(this.f20663a);
        stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 6);
        stringBuilder2.append(", uri=");
        stringBuilder2.append(valueOf);
        stringBuilder.append(stringBuilder2.toString());
        long j = this.f20665c;
        StringBuilder stringBuilder4 = new StringBuilder(35);
        stringBuilder4.append(", syncDeadline=");
        stringBuilder4.append(j);
        stringBuilder.append(stringBuilder4.toString());
        if (isLoggable) {
            stringBuilder.append("]\n  assets: ");
            for (String valueOf2 : this.f20666e.keySet()) {
                String valueOf3 = String.valueOf(this.f20666e.getParcelable(valueOf2));
                StringBuilder stringBuilder5 = new StringBuilder((String.valueOf(valueOf2).length() + 7) + String.valueOf(valueOf3).length());
                stringBuilder5.append("\n    ");
                stringBuilder5.append(valueOf2);
                stringBuilder5.append(": ");
                stringBuilder5.append(valueOf3);
                stringBuilder.append(stringBuilder5.toString());
            }
            stringBuilder.append("\n  ]");
            return stringBuilder.toString();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3411a(parcel, 2, this.f20663a, i);
        htl.m3409a(parcel, 4, this.f20666e);
        htl.m3415a(parcel, 5, this.f20664b);
        htl.m3408a(parcel, 6, this.f20665c);
        htl.m3439c(parcel, b);
    }
}
