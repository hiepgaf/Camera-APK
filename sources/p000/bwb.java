package p000;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* renamed from: bwb */
public final class bwb {
    /* renamed from: a */
    public static final String f1639a = bli.m862a("SurfTexRenderer");
    /* renamed from: m */
    private static final int[] f1640m = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344};
    /* renamed from: b */
    public EGLConfig f1641b;
    /* renamed from: c */
    public EGLDisplay f1642c;
    /* renamed from: d */
    public EGLContext f1643d;
    /* renamed from: e */
    public EGLSurface f1644e;
    /* renamed from: f */
    public EGL10 f1645f;
    /* renamed from: g */
    public GL10 f1646g;
    /* renamed from: h */
    public volatile boolean f1647h = false;
    /* renamed from: i */
    public final Handler f1648i;
    /* renamed from: j */
    public final bwg f1649j;
    /* renamed from: k */
    public final Object f1650k = new Object();
    /* renamed from: l */
    public final Runnable f1651l = new bwc(this);

    public bwb(SurfaceTexture surfaceTexture, Handler handler, bwg bwg) {
        this.f1648i = handler;
        this.f1649j = bwg;
        this.f1648i.post(new bwe(this, surfaceTexture));
        Object obj = new Object();
        synchronized (obj) {
            this.f1648i.post(new bwf(obj));
            try {
                obj.wait();
            } catch (InterruptedException e) {
                bli.m871d(f1639a, "waitDone() interrupted");
            }
        }
    }

    /* renamed from: a */
    static EGLConfig m1018a(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        if (egl10.eglChooseConfig(eGLDisplay, f1640m, null, 0, iArr)) {
            int i = iArr[0];
            if (i <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (egl10.eglChooseConfig(eGLDisplay, f1640m, eGLConfigArr, i, iArr)) {
                return eGLConfigArr[0];
            }
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        throw new IllegalArgumentException("eglChooseConfig failed");
    }
}
