package com.google.android.apps.camera.stats;

import android.os.SystemClock;
import com.google.android.apps.common.proguard.UsedByReflection;
import p000.bli;
import p000.grc;
import p000.iya;
import p000.kwk;

@UsedByReflection
/* compiled from: PG */
public class CameraCaptureSessionInstrumentationSession extends InstrumentationSession {
    /* renamed from: a */
    public int f12316a = 0;
    /* renamed from: b */
    public long f12317b;
    /* renamed from: c */
    public long f12318c;
    /* renamed from: d */
    public long f12319d;
    /* renamed from: e */
    public long f12320e;
    /* renamed from: f */
    private boolean f12321f = false;

    static {
        bli.m862a("CamCpSssSession");
    }

    public CameraCaptureSessionInstrumentationSession(iya iya) {
        super(iya, "CameraCaptureSession");
    }

    @UsedByReflection
    public long getCameraDeviceSessionCreateNs() {
        return this.f2411k;
    }

    @UsedByReflection
    public long getCameraDeviceSessionCreatedNs() {
        return this.f12317b;
    }

    @UsedByReflection
    public long getCaptureSessionFirstCaptureResultReceivedNs() {
        return this.f12319d;
    }

    @UsedByReflection
    public long getCaptureSessionRequestSentNs() {
        return this.f12318c;
    }

    @UsedByReflection
    public long getCaptureSessionSecondCaptureResultReceivedNs() {
        return this.f12320e;
    }

    /* renamed from: a */
    public static kwk m8421a() {
        return new grc();
    }

    /* renamed from: b */
    public final void m8422b() {
        if (!this.f12321f) {
            this.f12321f = true;
            this.f12318c = SystemClock.elapsedRealtimeNanos();
            m1326a("First capture request sent", this.f12318c);
        }
    }
}
