package p000;

import android.hardware.Camera;
import android.hardware.Camera.Parameters;

/* compiled from: PG */
/* renamed from: zh */
final class zh {
    /* renamed from: a */
    private Parameters f9577a;
    /* renamed from: b */
    private Camera f9578b;

    public zh(Camera camera) {
        this.f9578b = camera;
    }

    /* renamed from: a */
    public final synchronized Parameters m6252a() {
        if (this.f9577a == null) {
            this.f9577a = this.f9578b.getParameters();
            if (this.f9577a == null) {
                abx.m87b(yo.f19743a, "Camera object returned null parameters!");
                throw new IllegalStateException("camera.getParameters returned null");
            }
        }
        return this.f9577a;
    }

    /* renamed from: b */
    public final synchronized void m6253b() {
        this.f9577a = null;
    }
}
