package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.util.DynamiteApi;
import p000.htl;
import p000.hxg;
import p000.hxj;
import p000.hyc;
import p000.hyd;
import p000.hye;
import p000.hyf;
import p000.hyg;
import p000.iah;

@DynamiteApi
public class FlagProviderImpl extends iah {
    /* renamed from: a */
    private boolean f20578a = false;
    /* renamed from: b */
    private SharedPreferences f20579b;

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        return this.f20578a ? ((Boolean) htl.m3400a(new hyc(this.f20579b, str, Boolean.valueOf(z)))).booleanValue() : z;
    }

    public void init(hxg hxg) {
        Context context = (Context) hxj.m15950a(hxg);
        if (!this.f20578a) {
            try {
                this.f20579b = hyg.m3585a(context.createPackageContext("com.google.android.gms", 0));
                this.f20578a = true;
            } catch (NameNotFoundException e) {
            }
        }
    }

    public int getIntFlagValue(String str, int i, int i2) {
        return this.f20578a ? ((Integer) htl.m3400a(new hyd(this.f20579b, str, Integer.valueOf(i)))).intValue() : i;
    }

    public long getLongFlagValue(String str, long j, int i) {
        return this.f20578a ? ((Long) htl.m3400a(new hye(this.f20579b, str, Long.valueOf(j)))).longValue() : j;
    }

    public String getStringFlagValue(String str, String str2, int i) {
        return this.f20578a ? (String) htl.m3400a(new hyf(this.f20579b, str, str2)) : str2;
    }
}
