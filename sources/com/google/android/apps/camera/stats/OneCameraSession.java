package com.google.android.apps.camera.stats;

import com.google.android.apps.common.proguard.UsedByReflection;
import p000.grv;
import p000.iya;
import p000.kwk;

@UsedByReflection
/* compiled from: PG */
public class OneCameraSession extends InstrumentationSession {
    /* renamed from: a */
    public long f12328a;
    /* renamed from: b */
    public long f12329b;
    /* renamed from: c */
    public long f12330c;
    /* renamed from: d */
    public long f12331d;
    /* renamed from: e */
    public long f12332e;

    public OneCameraSession(iya iya) {
        super(iya, "OneCameraSession");
    }

    @UsedByReflection
    public long getOneCameraCreateNs() {
        return this.f12329b;
    }

    @UsedByReflection
    public long getOneCameraCreatedNs() {
        return this.f12330c;
    }

    @UsedByReflection
    public long getOneCameraStartNs() {
        return this.f12331d;
    }

    @UsedByReflection
    public long getOneCameraStartedNs() {
        return this.f12332e;
    }

    /* renamed from: a */
    public static kwk m8427a() {
        return new grv();
    }
}
