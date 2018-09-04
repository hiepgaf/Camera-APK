package com.google.android.apps.camera.legacy.app.app;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.apps.camera.contentprovider.HasCameraContentProviderComponent;
import p000.azt;
import p000.ban;
import p000.bao;
import p000.bbz;
import p000.bkx;
import p000.blb;
import p000.ble;
import p000.blj;
import p000.blw;
import p000.bsn;
import p000.cbw;
import p000.ccp;
import p000.ccs;
import p000.ccu;
import p000.cdp;
import p000.cgm;
import p000.cgn;
import p000.cgp;
import p000.cgt;
import p000.cgz;
import p000.enp;
import p000.eor;
import p000.fnr;
import p000.foi;
import p000.gcp;
import p000.gly;
import p000.grb;
import p000.hka;
import p000.ije;
import p000.irs;
import p000.iya;
import p000.jri;
import p000.ktm;
import p000.kwk;

@TargetApi(21)
/* compiled from: PG */
public class CameraApp extends eor implements ccs, cgt, HasCameraContentProviderComponent {
    /* renamed from: a */
    public blw f12222a;
    /* renamed from: b */
    public NotificationManager f12223b;
    /* renamed from: c */
    public cgz f12224c;
    /* renamed from: d */
    public kwk f12225d;
    /* renamed from: e */
    public irs f12226e;
    /* renamed from: g */
    private volatile cgm f12227g;

    public blb cameraContentProviderComponent(ccp ccp) {
        return mo751a().mo3385a(ccp);
    }

    /* renamed from: a */
    public final cgm mo751a() {
        if (this.f12227g == null) {
            synchronized (this) {
                if (this.f12227g == null) {
                    Trace.beginSection("GCA_App#initialize");
                    Trace.beginSection("GCA_App#buildComponent");
                    cgp a = cgn.m16921a();
                    a.f1949a = (cbw) ktm.m13962a(cbw.m1102a(this));
                    a.f1953e = (enp) ktm.m13962a(new enp(this.f3992f));
                    if (a.f1949a == null) {
                        throw new IllegalStateException(String.valueOf(cbw.class.getCanonicalName()).concat(" must be set"));
                    }
                    if (a.f1950b == null) {
                        a.f1950b = new ble();
                    }
                    if (a.f1951c == null) {
                        a.f1951c = new bbz();
                    }
                    if (a.f1952d == null) {
                        a.f1952d = new bkx();
                    }
                    if (a.f1953e == null) {
                        throw new IllegalStateException(String.valueOf(enp.class.getCanonicalName()).concat(" must be set"));
                    }
                    if (a.f1954f == null) {
                        a.f1954f = new azt();
                    }
                    if (a.f1955g == null) {
                        a.f1955g = new hka();
                    }
                    if (a.f1956h == null) {
                        a.f1956h = new gcp();
                    }
                    if (a.f1957i == null) {
                        a.f1957i = new foi();
                    }
                    if (a.f1958j == null) {
                        a.f1958j = new fnr();
                    }
                    this.f12227g = new cgn(a);
                    Trace.endSection();
                    Trace.beginSection("GCA_App#initialize");
                    cgm cgm = this.f12227g;
                    Trace.beginSection("GCA_App#inject");
                    cgm.mo3391a(this);
                    Trace.endSection();
                    Trace.beginSection("GCA_App#strictMode");
                    bsn bsn = this.f12222a.f1267a;
                    Trace.endSection();
                    Trace.beginSection("GCA_App#startAsync");
                    cgz cgz = this.f12224c;
                    if (cgz.f1970e.mo2084b()) {
                        cdp cdp = (cdp) cgz.f1970e.mo2081a();
                        if (!cdp.m1120b()) {
                            cdp.m1119a();
                        }
                        Trace.endSection();
                        Trace.beginSection("GCA_App#cancelNotifications");
                        this.f12223b.cancelAll();
                        Trace.endSection();
                        Trace.beginSection("GCA_App#setDefaultUncaughtExceptionHandler");
                        Thread.setDefaultUncaughtExceptionHandler(new bao(this.f12225d, new ban(getApplicationContext(), Thread.getDefaultUncaughtExceptionHandler()), this.f12226e));
                        Trace.endSection();
                        Trace.endSection();
                        Trace.endSection();
                    }
                    gly.m11184a(cgz.f1968c, cgz.f1966a);
                    gly.m11184a(cgz.f1967b, cgz.f1966a);
                    gly.m11184a(cgz.f1969d, cgz.f1966a);
                    Trace.endSection();
                    Trace.beginSection("GCA_App#cancelNotifications");
                    this.f12223b.cancelAll();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#setDefaultUncaughtExceptionHandler");
                    Thread.setDefaultUncaughtExceptionHandler(new bao(this.f12225d, new ban(getApplicationContext(), Thread.getDefaultUncaughtExceptionHandler()), this.f12226e));
                    Trace.endSection();
                    Trace.endSection();
                    Trace.endSection();
                }
            }
        }
        return this.f12227g;
    }

    /* renamed from: a */
    public final ccu mo750a(Class cls) {
        return (ccu) cls.cast(mo751a());
    }

    public void onCreate() {
        Trace.beginSection("GCA_App#onCreate");
        grb a = grb.m11380a();
        iya iya = a.m;
        a.f17231a = SystemClock.elapsedRealtimeNanos();
        Process.getStartElapsedRealtime();
        iya = a.m;
        SystemClock.elapsedRealtime();
        ContentResolver contentResolver = getContentResolver();
        jri.m13152b((Object) contentResolver);
        blj.f1265a = ije.m3772a(contentResolver, "camera:logging_override_level", 0);
        super.onCreate();
        iya = a.m;
        a.f17232b = SystemClock.elapsedRealtimeNanos();
        Trace.endSection();
    }
}
