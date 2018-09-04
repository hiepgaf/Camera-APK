package p000;

import javax.microedition.khronos.egl.EGL10;

/* compiled from: PG */
/* renamed from: bwd */
public final class bwd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bwb f1653a;

    public bwd(bwb bwb) {
        this.f1653a = bwb;
    }

    public final void run() {
        bwb bwb = this.f1653a;
        bwb.f1645f.eglDestroySurface(bwb.f1642c, bwb.f1644e);
        bwb = this.f1653a;
        bwb.f1645f.eglDestroyContext(bwb.f1642c, bwb.f1643d);
        bwb = this.f1653a;
        bwb.f1645f.eglMakeCurrent(bwb.f1642c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        bwb = this.f1653a;
        bwb.f1645f.eglTerminate(bwb.f1642c);
        bwb = this.f1653a;
        bwb.f1644e = null;
        bwb.f1643d = null;
        bwb.f1642c = null;
    }
}
