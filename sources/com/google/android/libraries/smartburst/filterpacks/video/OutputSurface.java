package com.google.android.libraries.smartburst.filterpacks.video;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.util.Log;
import android.view.Surface;
import com.google.android.libraries.smartburst.filterfw.RenderTarget;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
class OutputSurface implements OnFrameAvailableListener {
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final String TAG = "OutputSurface";
    public static final boolean VERBOSE = false;
    public EGL10 mEGL;
    public EGLContext mEGLContext;
    public EGLDisplay mEGLDisplay;
    public EGLSurface mEGLSurface;
    public boolean mFrameAvailable;
    public Object mFrameSyncObject = new Object();
    public Surface mSurface;
    public SurfaceTexture mSurfaceTexture;
    public TextureRender mTextureRender;

    public OutputSurface() {
        setup();
    }

    public OutputSurface(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        eglSetup(i, i2);
        makeCurrent();
        setup();
    }

    public void awaitNewImage() {
        synchronized (this.mFrameSyncObject) {
            do {
                if (this.mFrameAvailable) {
                    this.mFrameAvailable = false;
                } else {
                    try {
                        this.mFrameSyncObject.wait(500);
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }
            } while (this.mFrameAvailable);
            throw new RuntimeException("Surface frame wait timed out");
        }
        this.mTextureRender.checkGlError("before updateTexImage");
        this.mSurfaceTexture.updateTexImage();
    }

    private void checkEglError(String str) {
        Object obj = null;
        while (true) {
            int eglGetError = this.mEGL.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            String toHexString = Integer.toHexString(eglGetError);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 15) + String.valueOf(toHexString).length());
            stringBuilder.append(str);
            stringBuilder.append(": EGL error: 0x");
            stringBuilder.append(toHexString);
            Log.e(TAG, stringBuilder.toString());
            obj = 1;
        }
        if (obj != null) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    public void drawImage() {
        this.mTextureRender.updateTransformFrom(this.mSurfaceTexture);
        this.mTextureRender.drawFrame();
    }

    private void eglSetup(int i, int i2) {
        this.mEGL = (EGL10) EGLContext.getEGL();
        this.mEGLDisplay = this.mEGL.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.mEGL.eglInitialize(this.mEGLDisplay, null)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (this.mEGL.eglChooseConfig(this.mEGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
                this.mEGLContext = this.mEGL.eglCreateContext(this.mEGLDisplay, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{RenderTarget.EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
                checkEglError("eglCreateContext");
                if (this.mEGLContext == null) {
                    throw new RuntimeException("null context");
                }
                this.mEGLSurface = this.mEGL.eglCreatePbufferSurface(this.mEGLDisplay, eGLConfigArr[0], new int[]{12375, i, 12374, i2, 12344});
                checkEglError("eglCreatePbufferSurface");
                if (this.mEGLSurface == null) {
                    throw new RuntimeException("surface was null");
                }
                return;
            }
            throw new RuntimeException("unable to find RGB888+pbuffer EGL config");
        }
        throw new RuntimeException("unable to initialize EGL10");
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTexture;
    }

    public void makeCurrent() {
        if (this.mEGL == null) {
            throw new RuntimeException("not configured for makeCurrent");
        }
        checkEglError("before makeCurrent");
        EGL10 egl10 = this.mEGL;
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        EGLSurface eGLSurface = this.mEGLSurface;
        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.mFrameSyncObject) {
            if (this.mFrameAvailable) {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
            this.mFrameAvailable = true;
            this.mFrameSyncObject.notifyAll();
        }
    }

    public void release() {
        EGL10 egl10 = this.mEGL;
        if (egl10 != null) {
            if (egl10.eglGetCurrentContext().equals(this.mEGLContext)) {
                this.mEGL.eglMakeCurrent(this.mEGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            }
            this.mEGL.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
            this.mEGL.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
        }
        this.mSurface.release();
        this.mEGLDisplay = null;
        this.mEGLContext = null;
        this.mEGLSurface = null;
        this.mEGL = null;
        this.mTextureRender = null;
        this.mSurface = null;
        this.mSurfaceTexture = null;
    }

    private void setup() {
        this.mTextureRender = new TextureRender(true);
        int createSourceTexture = this.mTextureRender.createSourceTexture();
        this.mTextureRender.initialize();
        this.mSurfaceTexture = new SurfaceTexture(createSourceTexture);
        this.mSurfaceTexture.setOnFrameAvailableListener(this);
        this.mSurface = new Surface(this.mSurfaceTexture);
    }
}
