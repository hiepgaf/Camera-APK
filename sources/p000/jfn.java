package p000;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: PG */
/* renamed from: jfn */
public final class jfn extends jhr {
    /* renamed from: a */
    private final EGLDisplay f23570a;

    public jfn(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        super(eGLSurface);
        this.f23570a = eGLDisplay;
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo3588a(Object obj) {
        EGL14.eglDestroySurface(this.f23570a, (EGLSurface) obj);
    }
}
