package com.google.android.apps.camera.stats;

import android.os.SystemClock;
import com.google.android.apps.common.proguard.UsedByReflection;
import p000.bli;
import p000.grf;
import p000.iya;
import p000.kwk;

@UsedByReflection
/* compiled from: PG */
public class CameraDeviceInstrumentationSession extends InstrumentationSession {
    /* renamed from: a */
    private long f12322a;
    /* renamed from: b */
    private long f12323b;

    static {
        bli.m862a("CameraDevSession");
    }

    public CameraDeviceInstrumentationSession(iya iya) {
        super(iya, "CameraDevice");
    }

    @UsedByReflection
    public long getCameraDeviceOpenNs() {
        return this.f12322a;
    }

    @UsedByReflection
    public long getCameraDeviceOpenedNs() {
        return this.f12323b;
    }

    /* renamed from: a */
    public static kwk m8423a() {
        return new grf();
    }

    /* renamed from: b */
    public final void m8424b() {
        if (this.f12322a == 0) {
            this.f12322a = SystemClock.elapsedRealtimeNanos();
        }
    }

    /* renamed from: c */
    public final void m8425c() {
        if (this.f12322a != 0 && this.f12323b == 0) {
            this.f12323b = SystemClock.elapsedRealtimeNanos();
            m1327a("Open", this.f12322a, this.f12323b);
        }
    }
}
