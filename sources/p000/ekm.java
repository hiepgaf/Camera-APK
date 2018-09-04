package p000;

import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;

/* compiled from: PG */
/* renamed from: ekm */
public final class ekm {
    /* renamed from: a */
    public float f3807a = 0.0f;
    /* renamed from: b */
    public double f3808b = -1.0d;
    /* renamed from: c */
    public boolean f3809c = false;

    /* renamed from: a */
    final void m1839a() {
        boolean z;
        float f = 0.16000001f;
        double d = this.f3808b;
        if (d > 0.0d) {
            if (d > 0.025d) {
                f = 0.0025000002f;
            } else if (d < 0.01d) {
                f = !this.f3809c ? 1.0f : 0.010000001f;
            }
        }
        if (this.f3807a > f) {
            z = true;
        } else {
            z = false;
        }
        LightCycle.m1295a(z);
    }
}
