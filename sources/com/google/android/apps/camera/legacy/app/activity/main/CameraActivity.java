package com.google.android.apps.camera.legacy.app.activity.main;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import com.google.android.apps.camera.stats.CameraActivitySession;
import com.google.android.apps.camera.stats.Instrumentation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.bli;
import p000.blr;
import p000.bls;
import p000.blx;
import p000.bsa;
import p000.bsn;
import p000.cbk;
import p000.cbm;
import p000.cct;
import p000.ccu;
import p000.cef;
import p000.ceo;
import p000.cey;
import p000.cfa;
import p000.cfb;
import p000.cfd;
import p000.cgm;
import p000.epf;
import p000.eph;
import p000.gqr;
import p000.het;
import p000.heu;
import p000.hev;
import p000.hkg;
import p000.hkh;
import p000.hki;
import p000.ikd;
import p000.iya;
import p000.jqk;
import p000.jri;
import p000.kvl;

/* compiled from: PG */
public class CameraActivity extends cef implements cct, cfd {
    /* renamed from: g */
    private static final String f20367g = bli.m862a("CameraActivity");
    /* renamed from: d */
    public bsn f20368d;
    /* renamed from: e */
    public bls f20369e;
    /* renamed from: f */
    public blx f20370f;
    /* renamed from: h */
    private ceo f20371h;
    /* renamed from: i */
    private cfa f20372i;
    /* renamed from: j */
    private Instrumentation f20373j;

    static {
        bsa bsa = new bsa("camera.exp.activity");
    }

    /* renamed from: a */
    public final ccu mo2796a(Class cls) {
        return (ccu) cls.cast(this.f20371h);
    }

    /* renamed from: d */
    public final cfa mo2797d() {
        return (cfa) jqk.m13102c(this.f20372i);
    }

    protected void onCreate(Bundle bundle) {
        boolean z;
        iya iya;
        epf a = epf.m1944a();
        if (a.f4007g.m1945a(eph.f4010d)) {
            a.f4001a = SystemClock.elapsedRealtimeNanos();
        }
        m8068c().mo1903a("CameraActivity#onCreate");
        this.f20373j = Instrumentation.instance();
        CameraActivitySession cameraActivitySession = (CameraActivitySession) this.f20373j.cameraActivity().create();
        cameraActivitySession.recordActivityOnCreateStart();
        super.onCreate(bundle);
        cgm a2 = ((CameraApp) getApplicationContext()).mo751a();
        a2.mo3390a(this);
        m8068c().mo1903a("setupDefaultActivity#init");
        Object b = mo658b();
        Object a3 = mo657a();
        gqr gqr = new gqr(cameraActivitySession);
        jri.m13152b(b);
        jri.m13152b(a3);
        this.f20371h = a2.mo3386a(b, a3, gqr);
        m8068c().mo1905b("activityInitializer#get");
        cey cey = (cey) this.f20371h.f20190D.mo345a();
        m8068c().mo1905b("activityInitializer#start");
        cey.mo385a();
        m8068c().mo1905b("#cameraUiModule#inflate");
        ceo ceo = this.f20371h;
        heu heu = new heu(cbk.m7954a(ceo.f20213a), new hkh(cbk.m7954a(ceo.f20213a)), cbm.m7957a(ceo.f20213a));
        ikd.m12259a();
        Window window = heu.f6130b;
        bli.m869c(heu.f6129a, "Initializing Window Flags");
        LayoutParams attributes = window.getAttributes();
        attributes.rotationAnimation = 3;
        window.setAttributes(attributes);
        window.requestFeature(8);
        bli.m871d(heu.f6129a, "Requesting ActionBar");
        window.addFlags(kvl.UNSET_ENUM_VALUE);
        bli.m871d(heu.f6129a, "Setting window flags for drawing system bar backgrounds.");
        window.setBackgroundDrawable(null);
        window.getDecorView().setPadding(0, 0, 0, 0);
        heu.m3100a(heu.f6130b);
        hki hki = heu.f6131c;
        bli.m869c(heu.f6129a, "Initializing Camera Ui");
        hki.f17919a.setContentView(R.layout.activity_main);
        het het = new het(hkg.m3222a(hki));
        Activity activity = heu.f6132d;
        bli.m869c(heu.f6129a, "Initializing Action Bar");
        Object actionBar = activity.getActionBar();
        jri.m13152b(actionBar);
        actionBar.setBackgroundDrawable(new ColorDrawable(0));
        actionBar.hide();
        hev hev = new hev(actionBar, heu.f6133e, het);
        m8068c().mo1905b("activityUiInitializer#get");
        this.f20372i = new cfa(this.f20371h, hev);
        cfb cfb = (cfb) this.f20372i.f1894d.mo345a();
        m8068c().mo1905b("#activityUiInitializer#start");
        cfb.mo385a();
        m8068c().mo1904b();
        m8068c().mo1903a("CameraActivity#disablePreviewScreenshots");
        try {
            Method method = Activity.class.getMethod("setDisablePreviewScreenshots", new Class[]{Boolean.TYPE});
            method.setAccessible(true);
            method.invoke(this, new Object[]{Boolean.valueOf(true)});
        } catch (InvocationTargetException e) {
            bli.m873e(f20367g, "Could not find method: setDisablePreviewScreenshots");
            m8068c().mo1904b();
            if (this.f20369e.mo564b()) {
                throw new blr();
            }
            if (cameraActivitySession.f12306c != 0) {
                z = false;
            } else {
                z = true;
            }
            jri.m13154b(z, (Object) "Accidental session reuse.");
            iya = cameraActivitySession.m;
            cameraActivitySession.f12306c = SystemClock.elapsedRealtimeNanos();
            cameraActivitySession.m1327a("OnCreate", cameraActivitySession.f12305b, cameraActivitySession.f12306c);
            m8068c().mo1904b();
            return;
        } catch (NoSuchMethodException e2) {
            bli.m873e(f20367g, "Could not find method: setDisablePreviewScreenshots");
            m8068c().mo1904b();
            if (this.f20369e.mo564b()) {
                if (cameraActivitySession.f12306c != 0) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13154b(z, (Object) "Accidental session reuse.");
                iya = cameraActivitySession.m;
                cameraActivitySession.f12306c = SystemClock.elapsedRealtimeNanos();
                cameraActivitySession.m1327a("OnCreate", cameraActivitySession.f12305b, cameraActivitySession.f12306c);
                m8068c().mo1904b();
                return;
            }
            throw new blr();
        } catch (IllegalAccessException e3) {
            bli.m873e(f20367g, "Could not find method: setDisablePreviewScreenshots");
            m8068c().mo1904b();
            if (this.f20369e.mo564b()) {
                throw new blr();
            }
            if (cameraActivitySession.f12306c != 0) {
                z = false;
            } else {
                z = true;
            }
            jri.m13154b(z, (Object) "Accidental session reuse.");
            iya = cameraActivitySession.m;
            cameraActivitySession.f12306c = SystemClock.elapsedRealtimeNanos();
            cameraActivitySession.m1327a("OnCreate", cameraActivitySession.f12305b, cameraActivitySession.f12306c);
            m8068c().mo1904b();
            return;
        }
        m8068c().mo1904b();
        if (this.f20369e.mo564b()) {
            if (cameraActivitySession.f12306c != 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13154b(z, (Object) "Accidental session reuse.");
            iya = cameraActivitySession.m;
            cameraActivitySession.f12306c = SystemClock.elapsedRealtimeNanos();
            cameraActivitySession.m1327a("OnCreate", cameraActivitySession.f12305b, cameraActivitySession.f12306c);
            m8068c().mo1904b();
            return;
        }
        throw new blr();
    }

    protected void onResume() {
        CameraActivitySession cameraActivitySession = (CameraActivitySession) this.f20373j.cameraActivity().getCurrentSession();
        if (cameraActivitySession.f12308e == 0) {
            iya iya = cameraActivitySession.m;
            cameraActivitySession.f12308e = SystemClock.elapsedRealtimeNanos();
            cameraActivitySession.m1328a("OnCreate End", cameraActivitySession.f12306c, "OnResume Start", cameraActivitySession.f12308e);
        }
        super.onResume();
        cameraActivitySession = (CameraActivitySession) this.f20373j.cameraActivity().getCurrentSession();
        if (cameraActivitySession.f12309f == 0) {
            iya = cameraActivitySession.m;
            cameraActivitySession.f12309f = SystemClock.elapsedRealtimeNanos();
            cameraActivitySession.m1327a("OnResume", cameraActivitySession.f12308e, cameraActivitySession.f12309f);
        }
    }

    protected void onStart() {
        CameraActivitySession cameraActivitySession = (CameraActivitySession) this.f20373j.cameraActivity().getCurrentSession();
        if (cameraActivitySession.f12307d == 0) {
            iya iya = cameraActivitySession.m;
            cameraActivitySession.f12307d = SystemClock.elapsedRealtimeNanos();
            cameraActivitySession.m1326a("OnStart", cameraActivitySession.f12307d);
        }
        epf a = epf.m1944a();
        if (a.f4007g.m1945a(eph.f4011e)) {
            a.f4002b = SystemClock.elapsedRealtimeNanos();
        }
        super.onStart();
    }
}
