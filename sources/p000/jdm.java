package p000;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jdm */
public final class jdm implements izi {
    /* renamed from: a */
    private final /* synthetic */ jhs f18736a;
    /* renamed from: b */
    private final /* synthetic */ izv f18737b;

    public jdm(jhs jhs, izv izv) {
        this.f18736a = jhs;
        this.f18737b = izv;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo711a(Object obj) {
        jeu jeu = (jeu) obj;
        jhs jhs = this.f18736a;
        izu izu = this.f18737b;
        int[] iArr = new int[]{12344};
        EGLDisplay f = jeu.mo3578f();
        jhs jht = new jht(new jfn(f, EGL14.eglCreateWindowSurface(f, jeu.mo3576d(), jhs.mo3495c(), iArr, 0)), Arrays.asList(new ize[]{jhs}));
        return new jex(jeu.mo3580h(), jeu.mo3578f(), (EGLSurface) jht.mo3495c(), jeu.mo3577e(), jeu.mo3576d(), (jdc) jcc.m4398a(jeu.mo3581j(), izu), jeu, jht);
    }

    public final String toString() {
        return "GLRawCanvases.createForSurface";
    }
}
