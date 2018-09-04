package p000;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: PG */
/* renamed from: jew */
final class jew extends jem {
    /* renamed from: e */
    private final /* synthetic */ EGLDisplay f23593e;

    jew(jfj jfj, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, jdc jdc, EGLDisplay eGLDisplay2) {
        this.f23593e = eGLDisplay2;
        super(jfj, eGLDisplay, eGLSurface, eGLContext, eGLConfig, 0, jdc);
    }

    /* renamed from: c */
    public final jas mo3488c() {
        EGL14.eglMakeCurrent(this.f23593e, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroyContext(this.f23552b, this.f23554d);
        EGL14.eglDestroySurface(this.f23552b, this.f23553c);
        return jas.m12717d();
    }
}
