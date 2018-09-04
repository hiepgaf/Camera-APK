package com.google.android.apps.camera.stats;

import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.ArrayList;
import java.util.List;
import p000.gsf;
import p000.iwp;
import p000.iya;
import p000.kke;
import p000.kwk;

@UsedByReflection
/* compiled from: PG */
public class ViewfinderJankSession extends InstrumentationSession {
    /* renamed from: a */
    public final Object f12333a = new Object();
    /* renamed from: b */
    public final List f12334b = new ArrayList(30);
    /* renamed from: c */
    public final List f12335c = new ArrayList();
    /* renamed from: d */
    public int f12336d = 0;
    /* renamed from: e */
    public int f12337e = 0;
    /* renamed from: f */
    public int f12338f = 0;
    /* renamed from: g */
    public kke f12339g;
    /* renamed from: h */
    public kke f12340h;

    public ViewfinderJankSession(iya iya) {
        super(iya, "PreviewSmoothness");
    }

    /* renamed from: a */
    public static kke m8428a(iwp iwp, double d, double d2) {
        kke kke = new kke();
        kke.f22185a = SystemClock.elapsedRealtimeNanos();
        kke.f22186b = ((Long) iwp.mo3143a(CaptureResult.SENSOR_TIMESTAMP)).longValue();
        kke.f22187c = iwp.mo3144b();
        Long l = (Long) iwp.mo3143a(CaptureResult.SENSOR_FRAME_DURATION);
        Long l2 = (Long) iwp.mo3143a(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            kke.f22188d = (int) (l.longValue() / 1000);
        }
        if (l2 != null) {
            kke.f22189e = (int) (l2.longValue() / 1000);
        }
        if (d > 0.0d) {
            kke.f22191g = (int) (1000.0d * d);
        }
        if (d2 > 0.0d) {
            kke.f22190f = (int) (1000.0d * d2);
        }
        return kke;
    }

    @UsedByReflection
    public int getDelay150PctCount() {
        return this.f12337e;
    }

    @UsedByReflection
    public int getDelay500PctCount() {
        return this.f12338f;
    }

    @UsedByReflection
    public int getDelay50PctCount() {
        return this.f12336d;
    }

    /* renamed from: a */
    public static kwk m8429a() {
        return new gsf();
    }

    /* renamed from: a */
    public final void m8430a(kke kke) {
        if (this.f12339g == null) {
            this.f12339g = kke;
        }
        this.f12340h = kke;
    }
}
