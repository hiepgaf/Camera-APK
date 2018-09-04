package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.hta;
import p000.htf;
import p000.htl;

public class GoogleSignInAccount extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new htf();
    /* renamed from: m */
    private static Comparator f20410m = new hta();
    /* renamed from: a */
    private final int f20411a;
    /* renamed from: b */
    private String f20412b;
    /* renamed from: c */
    private String f20413c;
    /* renamed from: d */
    private String f20414d;
    /* renamed from: e */
    private String f20415e;
    /* renamed from: f */
    private Uri f20416f;
    /* renamed from: g */
    private String f20417g;
    /* renamed from: h */
    private long f20418h;
    /* renamed from: i */
    private String f20419i;
    /* renamed from: j */
    private List f20420j;
    /* renamed from: k */
    private String f20421k;
    /* renamed from: l */
    private String f20422l;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.f20411a = i;
        this.f20412b = str;
        this.f20413c = str2;
        this.f20414d = str3;
        this.f20415e = str4;
        this.f20416f = uri;
        this.f20417g = str5;
        this.f20418h = j;
        this.f20419i = str6;
        this.f20420j = list;
        this.f20421k = str7;
        this.f20422l = str8;
    }

    public boolean equals(Object obj) {
        return obj instanceof GoogleSignInAccount ? ((GoogleSignInAccount) obj).m15089a().toString().equals(m15089a().toString()) : false;
    }

    public int hashCode() {
        return m15089a().toString().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20411a);
        htl.m3412a(parcel, 2, this.f20412b);
        htl.m3412a(parcel, 3, this.f20413c);
        htl.m3412a(parcel, 4, this.f20414d);
        htl.m3412a(parcel, 5, this.f20415e);
        htl.m3411a(parcel, 6, this.f20416f, i);
        htl.m3412a(parcel, 7, this.f20417g);
        htl.m3408a(parcel, 8, this.f20418h);
        htl.m3412a(parcel, 9, this.f20419i);
        htl.m3413a(parcel, 10, this.f20420j);
        htl.m3412a(parcel, 11, this.f20421k);
        htl.m3412a(parcel, 12, this.f20422l);
        htl.m3439c(parcel, b);
    }

    /* renamed from: a */
    public static GoogleSignInAccount m15088a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Object optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        Object hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, null), jSONObject.optString("displayName", null), parse, null, Long.valueOf(parseLong).longValue(), htl.m3403a(jSONObject.getString("obfuscatedIdentifier")), new ArrayList((Collection) htl.m3431b(hashSet)), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null));
        googleSignInAccount.f20417g = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount;
    }

    /* renamed from: a */
    private final JSONObject m15089a() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f20412b;
            if (str != null) {
                jSONObject.put("id", str);
            }
            str = this.f20413c;
            if (str != null) {
                jSONObject.put("tokenId", str);
            }
            str = this.f20414d;
            if (str != null) {
                jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str);
            }
            str = this.f20415e;
            if (str != null) {
                jSONObject.put("displayName", str);
            }
            str = this.f20421k;
            if (str != null) {
                jSONObject.put("givenName", str);
            }
            str = this.f20422l;
            if (str != null) {
                jSONObject.put("familyName", str);
            }
            Uri uri = this.f20416f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            str = this.f20417g;
            if (str != null) {
                jSONObject.put("serverAuthCode", str);
            }
            jSONObject.put("expirationTime", this.f20418h);
            jSONObject.put("obfuscatedIdentifier", this.f20419i);
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f20420j, f20410m);
            for (Scope scope : this.f20420j) {
                jSONArray.put(scope.f20462a);
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
