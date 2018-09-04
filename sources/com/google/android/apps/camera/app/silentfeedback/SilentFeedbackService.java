package com.google.android.apps.camera.app.silentfeedback;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import p000.baq;
import p000.bli;
import p000.hji;
import p000.hur;
import p000.hxp;
import p000.kow;
import p000.kpq;

/* compiled from: PG */
public final class SilentFeedbackService extends Service {
    /* renamed from: a */
    public static final String f2238a = bli.m862a("SilentFdbkService");
    /* renamed from: b */
    private final Object f2239b = new Object();
    /* renamed from: c */
    private int f2240c = 0;
    /* renamed from: d */
    private int f2241d = 0;

    /* renamed from: b */
    private final boolean m1217b() {
        int i;
        bli.m871d(f2238a, "Checking valid GmsCoreVersion.");
        try {
            i = getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException e) {
            i = 0;
        }
        if (i >= 6577000) {
            return true;
        }
        return false;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f2239b) {
            this.f2240c++;
            this.f2241d = i2;
        }
        bli.m871d(f2238a, "Starting silent feedback service.");
        if (m1217b()) {
            kow.m13622a(new hji(new hur(getApplicationContext()).m3486a(hxp.f6792a).m3485a()).m11858a(), new baq(this, intent), kpq.f8410a);
        } else {
            bli.m863a(f2238a, "Not sending silent feedback. GMS version too low.");
            m1218a();
        }
        return 2;
    }

    /* renamed from: a */
    public final void m1218a() {
        Integer valueOf;
        bli.m871d(f2238a, "Trying to stop self.");
        synchronized (this.f2239b) {
            int i = this.f2240c - 1;
            this.f2240c = i;
            if (i == 0) {
                valueOf = Integer.valueOf(this.f2241d);
            } else {
                valueOf = null;
            }
        }
        if (valueOf != null) {
            stopSelf(valueOf.intValue());
        }
    }
}
