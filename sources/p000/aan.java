package p000;

import android.graphics.SurfaceTexture;

/* compiled from: PG */
/* renamed from: aan */
final class aan implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ SurfaceTexture f26a;
    /* renamed from: b */
    private final /* synthetic */ aah f27b;

    aan(aah aah, SurfaceTexture surfaceTexture) {
        this.f27b = aah;
        this.f26a = surfaceTexture;
    }

    public final void run() {
        this.f27b.mo2563b().obtainMessage(101, this.f26a).sendToTarget();
    }
}
