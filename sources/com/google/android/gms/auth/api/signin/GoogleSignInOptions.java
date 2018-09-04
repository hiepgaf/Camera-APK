package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.htb;
import p000.htd;
import p000.htg;
import p000.htl;
import p000.iat;

public class GoogleSignInOptions extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new htg();
    /* renamed from: a */
    private static final Scope f20423a = new Scope("profile");
    /* renamed from: b */
    private static final Scope f20424b = new Scope("openid");
    /* renamed from: c */
    private static final Scope f20425c = new Scope("https://www.googleapis.com/auth/games");
    /* renamed from: d */
    private final int f20426d;
    /* renamed from: e */
    private final ArrayList f20427e;
    /* renamed from: f */
    private Account f20428f;
    /* renamed from: g */
    private boolean f20429g;
    /* renamed from: h */
    private final boolean f20430h;
    /* renamed from: i */
    private final boolean f20431i;
    /* renamed from: j */
    private String f20432j;
    /* renamed from: k */
    private String f20433k;
    /* renamed from: l */
    private ArrayList f20434l;

    static {
        Scope scope = new Scope(NotificationCompat.CATEGORY_EMAIL);
        iat iat = new iat();
        iat.f6880a.add(f20424b);
        iat.f6880a.add(f20423a);
        iat.m3605a();
        iat = new iat();
        Scope[] scopeArr = new Scope[0];
        iat.f6880a.add(f20425c);
        iat.f6880a.addAll(Arrays.asList(scopeArr));
        iat.m3605a();
        htb htb = new htb();
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map) {
        this.f20426d = i;
        this.f20427e = arrayList;
        this.f20428f = account;
        this.f20429g = z;
        this.f20430h = z2;
        this.f20431i = z3;
        this.f20432j = str;
        this.f20433k = str2;
        this.f20434l = new ArrayList(map.values());
    }

    /* renamed from: a */
    public static GoogleSignInOptions m15090a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Collection hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        Object optString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap());
    }

    /* renamed from: a */
    public final ArrayList m15091a() {
        return new ArrayList(this.f20427e);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList arrayList2) {
        Map hashMap = new HashMap();
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                zzg zzg = (zzg) arrayList2.get(i2);
                hashMap.put(Integer.valueOf(zzg.f20435a), zzg);
                i2 = i3;
            }
        }
        this(i, arrayList, account, z, z2, z3, str, str2, hashMap);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f20434l.size() > 0 || googleSignInOptions.f20434l.size() > 0 || this.f20427e.size() != googleSignInOptions.m15091a().size() || !this.f20427e.containsAll(googleSignInOptions.m15091a())) {
                return false;
            }
            Account account = this.f20428f;
            if (account == null) {
                if (googleSignInOptions.f20428f != null) {
                    return false;
                }
            } else if (!account.equals(googleSignInOptions.f20428f)) {
                return false;
            }
            if (TextUtils.isEmpty(this.f20432j)) {
                if (!TextUtils.isEmpty(googleSignInOptions.f20432j)) {
                    return false;
                }
            } else if (!this.f20432j.equals(googleSignInOptions.f20432j)) {
                return false;
            }
            return this.f20431i == googleSignInOptions.f20431i && this.f20429g == googleSignInOptions.f20429g && this.f20430h == googleSignInOptions.f20430h;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public int hashCode() {
        Object arrayList = new ArrayList();
        ArrayList arrayList2 = this.f20427e;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            arrayList.add(((Scope) arrayList2.get(i)).f20462a);
            i = i2;
        }
        Collections.sort(arrayList);
        return new htd().m3367a(arrayList).m3367a(this.f20428f).m3367a(this.f20432j).m3368a(this.f20431i).m3368a(this.f20429g).m3368a(this.f20430h).f6635a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3440c(parcel, 1, this.f20426d);
        htl.m3413a(parcel, 2, m15091a());
        htl.m3411a(parcel, 3, this.f20428f, i);
        htl.m3414a(parcel, 4, this.f20429g);
        htl.m3414a(parcel, 5, this.f20430h);
        htl.m3414a(parcel, 6, this.f20431i);
        htl.m3412a(parcel, 7, this.f20432j);
        htl.m3412a(parcel, 8, this.f20433k);
        htl.m3413a(parcel, 9, this.f20434l);
        htl.m3439c(parcel, b);
    }
}
