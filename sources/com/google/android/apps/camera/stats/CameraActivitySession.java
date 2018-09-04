package com.google.android.apps.camera.stats;

import android.os.SystemClock;
import com.google.android.apps.common.proguard.UsedByReflection;
import p000.bli;
import p000.gra;
import p000.grb;
import p000.iya;
import p000.jri;
import p000.kwk;

@UsedByReflection
/* compiled from: PG */
public class CameraActivitySession extends InstrumentationSession {
    /* renamed from: a */
    public static final String f12304a = bli.m862a("CamActivitySession");
    /* renamed from: b */
    public long f12305b;
    /* renamed from: c */
    public long f12306c;
    /* renamed from: d */
    public long f12307d;
    /* renamed from: e */
    public long f12308e;
    /* renamed from: f */
    public long f12309f;
    /* renamed from: g */
    public long f12310g;
    /* renamed from: h */
    public long f12311h;
    /* renamed from: i */
    public long f12312i;
    /* renamed from: j */
    public long f12313j;
    /* renamed from: n */
    private final grb f12314n;
    /* renamed from: o */
    private boolean f12315o;

    public CameraActivitySession(grb grb, iya iya) {
        super(iya, "CameraActivity");
        this.f12314n = grb;
    }

    @UsedByReflection
    public long getActivityOnCreateEndNs() {
        return this.f12306c;
    }

    @UsedByReflection
    public long getActivityOnCreateStartNs() {
        return this.f12305b;
    }

    @UsedByReflection
    public long getActivityOnResumeEndNs() {
        return this.f12309f;
    }

    @UsedByReflection
    public long getActivityOnResumeStartNs() {
        return this.f12308e;
    }

    @UsedByReflection
    public long getActivityOnStartStartNs() {
        return this.f12307d;
    }

    @UsedByReflection
    public boolean getIsColdStart() {
        return this.f12315o;
    }

    @UsedByReflection
    public long getShutterButtonFirstDrawNs() {
        return this.f12312i;
    }

    @UsedByReflection
    public long getShutterButtonFirstEnabledNs() {
        return this.f12313j;
    }

    /* renamed from: a */
    public static kwk m8420a() {
        return new gra();
    }

    @UsedByReflection
    public void recordActivityOnCreateStart() {
        boolean z = true;
        this.f12315o = true;
        if (this.f12305b != 0) {
            z = false;
        }
        jri.m13154b(z, (Object) "Accidental session reuse.");
        this.f12305b = SystemClock.elapsedRealtimeNanos();
        grb grb = this.f12314n;
        m1327a("App OnCreate", grb.f17231a, grb.f17232b);
        m1328a("App OnCreate End", this.f12314n.f17232b, "Activity OnCreate Start", this.f12305b);
    }
}
