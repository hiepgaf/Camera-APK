package p000;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback2;

/* compiled from: PG */
/* renamed from: hmv */
final class hmv implements Callback2 {
    /* renamed from: a */
    private final /* synthetic */ hmu f6374a;

    hmv(hmu hmu) {
        this.f6374a = hmu;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        this.f6374a.m3250a(runnable);
    }
}
