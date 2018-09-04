package p000;

import android.view.SurfaceHolder;

/* compiled from: PG */
/* renamed from: has */
public abstract class has implements haq {
    public final boolean n_() {
        return false;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }
}
