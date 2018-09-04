package p000;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: PG */
/* renamed from: jex */
final class jex extends jem {
    /* renamed from: e */
    private final /* synthetic */ jeu f23594e;
    /* renamed from: f */
    private final /* synthetic */ jhs f23595f;

    jex(jfj jfj, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, jdc jdc, jeu jeu, jhs jhs) {
        this.f23594e = jeu;
        this.f23595f = jhs;
        super(jfj, eGLDisplay, eGLSurface, eGLContext, eGLConfig, 0, jdc);
    }

    /* renamed from: c */
    public final jas mo3488c() {
        try {
            this.f23594e.mo3579g();
            return this.f23595f.mo3162a();
        } catch (Throwable th) {
            return jas.m12715a(this.f23595f.mo3162a().mo1973a(kpq.f8410a, ion.m3959b(th)));
        }
    }
}
