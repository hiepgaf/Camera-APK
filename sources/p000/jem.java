package p000;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES30;

/* compiled from: PG */
/* renamed from: jem */
abstract class jem extends izq implements jeu {
    /* renamed from: a */
    public final jfj f23551a;
    /* renamed from: b */
    public final EGLDisplay f23552b;
    /* renamed from: c */
    public final EGLSurface f23553c;
    /* renamed from: d */
    public final EGLContext f23554d;
    /* renamed from: e */
    private final EGLConfig f23555e;
    /* renamed from: f */
    private final int f23556f;
    /* renamed from: g */
    private final jdc f23557g;

    public jem(jfj jfj, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, int i, jdc jdc) {
        this.f23551a = jfj;
        this.f23552b = eGLDisplay;
        this.f23553c = eGLSurface;
        this.f23554d = eGLContext;
        this.f23555e = eGLConfig;
        this.f23556f = i;
        this.f23557g = jdc;
    }

    /* renamed from: d */
    public final EGLConfig mo3576d() {
        return this.f23555e;
    }

    /* renamed from: e */
    public final EGLContext mo3577e() {
        return this.f23554d;
    }

    /* renamed from: f */
    public final EGLDisplay mo3578f() {
        return this.f23552b;
    }

    /* renamed from: b */
    public final void mo3487b() {
        jli.m12951c(mo3488c());
    }

    /* renamed from: g */
    public final void mo3579g() {
        EGLDisplay eGLDisplay = this.f23552b;
        EGLSurface eGLSurface = this.f23553c;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f23554d)) {
            GLES30.glBindFramebuffer(36160, this.f23556f);
            izu izu = this.f23557g.f18732a;
            GLES30.glViewport(0, 0, izu.f7592a[0], izu.m4369b());
        }
    }

    /* renamed from: h */
    public final jfj mo3580h() {
        return this.f23551a;
    }

    /* renamed from: i */
    public final int mo3493i() {
        return this.f23556f;
    }

    /* renamed from: j */
    public final jdc mo3581j() {
        return this.f23557g;
    }

    /* renamed from: k */
    public final void mo3582k() {
        if (this.f23556f == 0) {
            EGL14.eglSwapBuffers(this.f23552b, this.f23553c);
        }
    }

    /* renamed from: l */
    public final EGLSurface mo3583l() {
        return this.f23553c;
    }
}
