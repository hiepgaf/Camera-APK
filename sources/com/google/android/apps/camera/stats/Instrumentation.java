package com.google.android.apps.camera.stats;

import com.google.android.apps.common.proguard.UsedByReflection;
import p000.grd;
import p000.grr;
import p000.grt;
import p000.gsg;
import p000.jri;

@UsedByReflection
/* compiled from: PG */
public class Instrumentation {
    /* renamed from: a */
    private static Instrumentation f2398a;
    /* renamed from: b */
    private final InstrumentationSessionRecorder f2399b;
    /* renamed from: c */
    private final InstrumentationSessionRecorder f2400c;
    /* renamed from: d */
    private final InstrumentationSessionRecorder f2401d;
    /* renamed from: e */
    private final InstrumentationSessionRecorder f2402e;
    /* renamed from: f */
    private final InstrumentationSessionRecorder f2403f;
    /* renamed from: g */
    private final InstrumentationSessionRecorder f2404g;
    /* renamed from: h */
    private final InstrumentationSessionRecorder f2405h;
    /* renamed from: i */
    private final InstrumentationSessionRecorder f2406i;
    /* renamed from: j */
    private final InstrumentationSessionRecorder f2407j;
    /* renamed from: k */
    private final InstrumentationSessionRecorder f2408k;

    private Instrumentation(InstrumentationSessionRecorder instrumentationSessionRecorder, InstrumentationSessionRecorder instrumentationSessionRecorder2, InstrumentationSessionRecorder instrumentationSessionRecorder3, InstrumentationSessionRecorder instrumentationSessionRecorder4, InstrumentationSessionRecorder instrumentationSessionRecorder5, InstrumentationSessionRecorder instrumentationSessionRecorder6, InstrumentationSessionRecorder instrumentationSessionRecorder7, InstrumentationSessionRecorder instrumentationSessionRecorder8, InstrumentationSessionRecorder instrumentationSessionRecorder9, InstrumentationSessionRecorder instrumentationSessionRecorder10) {
        jri.m13143a(true);
        jri.m13143a(true);
        jri.m13143a(true);
        jri.m13143a(true);
        jri.m13143a(true);
        jri.m13143a(true);
        jri.m13143a(true);
        jri.m13143a(true);
        jri.m13143a(true);
        this.f2399b = instrumentationSessionRecorder;
        this.f2400c = instrumentationSessionRecorder2;
        this.f2401d = instrumentationSessionRecorder3;
        this.f2402e = instrumentationSessionRecorder4;
        this.f2403f = instrumentationSessionRecorder5;
        this.f2404g = instrumentationSessionRecorder6;
        this.f2405h = instrumentationSessionRecorder7;
        this.f2406i = instrumentationSessionRecorder8;
        this.f2408k = instrumentationSessionRecorder10;
        this.f2407j = instrumentationSessionRecorder9;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder burstStats() {
        return this.f2407j;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder cameraActivity() {
        return this.f2399b;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder cameraChange() {
        return this.f2402e;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder cameraDevice() {
        return this.f2400c;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder captureSession() {
        return this.f2401d;
    }

    @UsedByReflection
    public static Instrumentation instance() {
        if (f2398a == null) {
            f2398a = new Instrumentation(new InstrumentationSessionRecorder(CameraActivitySession.m8420a()), new InstrumentationSessionRecorder(CameraDeviceInstrumentationSession.m8423a()), new InstrumentationSessionRecorder(CameraCaptureSessionInstrumentationSession.m8421a()), new InstrumentationSessionRecorder(grd.m11382a()), new InstrumentationSessionRecorder(grt.m11409a()), new InstrumentationSessionRecorder(ViewfinderJankSession.m8429a()), new InstrumentationSessionRecorder(gsg.m11468a()), new InstrumentationSessionRecorder(OneCameraSession.m8427a()), new InstrumentationSessionRecorder(BurstSessionStatistics.m8409a()), new InstrumentationSessionRecorder(grr.m11406a()));
        }
        return f2398a;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder jankStats() {
        return this.f2404g;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder mediaRecorderStats() {
        return this.f2408k;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder modeSwitch() {
        return this.f2403f;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder oneCamera() {
        return this.f2406i;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder viewfinder() {
        return this.f2405h;
    }
}
