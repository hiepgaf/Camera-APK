package p000;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES30;

/* compiled from: PG */
/* renamed from: jey */
final class jey extends jem {
    /* renamed from: e */
    private final /* synthetic */ jeu f23596e;
    /* renamed from: f */
    private final /* synthetic */ int f23597f = 0;
    /* renamed from: g */
    private final /* synthetic */ int f23598g;
    /* renamed from: h */
    private final /* synthetic */ jhs f23599h;

    jey(jfj jfj, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, int i, jdc jdc, jeu jeu, int i2, jhs jhs) {
        this.f23596e = jeu;
        this.f23598g = i2;
        this.f23599h = jhs;
        super(jfj, eGLDisplay, eGLSurface, eGLContext, eGLConfig, i, jdc);
    }

    /* renamed from: c */
    public final jas mo3488c() {
        try {
            this.f23596e.mo3579g();
            GLES30.glDeleteRenderbuffers(1, new int[]{0}, 0);
            GLES30.glDeleteFramebuffers(1, new int[]{this.f23598g}, 0);
            return this.f23599h.mo3162a();
        } catch (Throwable th) {
            return jas.m12715a(this.f23599h.mo3162a().mo1973a(kpq.f8410a, ion.m3959b(th)));
        }
    }
}
