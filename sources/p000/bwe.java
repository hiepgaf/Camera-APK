package p000;

import android.graphics.SurfaceTexture;
import com.google.android.libraries.smartburst.filterfw.RenderTarget;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* renamed from: bwe */
final class bwe implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ SurfaceTexture f1654a;
    /* renamed from: b */
    private final /* synthetic */ bwb f1655b;

    bwe(bwb bwb, SurfaceTexture surfaceTexture) {
        this.f1655b = bwb;
        this.f1654a = surfaceTexture;
    }

    public final void run() {
        this.f1655b.f1645f = (EGL10) EGLContext.getEGL();
        bwb bwb = this.f1655b;
        bwb.f1642c = bwb.f1645f.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.f1655b.f1642c == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        bwb bwb2 = this.f1655b;
        if (bwb2.f1645f.eglInitialize(bwb2.f1642c, iArr)) {
            String str = bwb.f1639a;
            int i = iArr[0];
            int i2 = iArr[1];
            StringBuilder stringBuilder = new StringBuilder(36);
            stringBuilder.append("EGL version: ");
            stringBuilder.append(i);
            stringBuilder.append('.');
            stringBuilder.append(i2);
            bli.m871d(str, stringBuilder.toString());
            iArr = new int[]{RenderTarget.EGL_CONTEXT_CLIENT_VERSION, 2, 12344};
            bwb2 = this.f1655b;
            bwb2.f1641b = bwb.m1018a(bwb2.f1645f, bwb2.f1642c);
            bwb2 = this.f1655b;
            bwb2.f1643d = bwb2.f1645f.eglCreateContext(bwb2.f1642c, bwb2.f1641b, EGL10.EGL_NO_CONTEXT, iArr);
            EGLContext eGLContext = this.f1655b.f1643d;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                throw new RuntimeException("failed to createContext");
            }
            bwb = this.f1655b;
            bwb.f1644e = bwb.f1645f.eglCreateWindowSurface(bwb.f1642c, bwb.f1641b, this.f1654a, null);
            EGLSurface eGLSurface = this.f1655b.f1644e;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                throw new RuntimeException("failed to createWindowSurface");
            }
            bwb = this.f1655b;
            EGL10 egl10 = bwb.f1645f;
            EGLDisplay eGLDisplay = bwb.f1642c;
            EGLSurface eGLSurface2 = bwb.f1644e;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, bwb.f1643d)) {
                bwb2 = this.f1655b;
                bwb2.f1646g = (GL10) bwb2.f1643d.getGL();
                return;
            }
            throw new RuntimeException("failed to eglMakeCurrent");
        }
        throw new RuntimeException("eglInitialize failed");
    }
}
