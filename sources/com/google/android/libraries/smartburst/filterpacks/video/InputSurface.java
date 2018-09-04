package com.google.android.libraries.smartburst.filterpacks.video;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.google.android.libraries.smartburst.filterfw.RenderTarget;

/* compiled from: PG */
class InputSurface {
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public EGLConfig[] mConfigs = new EGLConfig[1];
    public EGLContext mEGLContext = EGL14.EGL_NO_CONTEXT;
    public EGLDisplay mEGLDisplay = EGL14.EGL_NO_DISPLAY;
    public EGLSurface mEGLSurface = EGL14.EGL_NO_SURFACE;
    public Surface mSurface;

    public InputSurface(Surface surface, boolean z) {
        if (surface == null) {
            throw new NullPointerException();
        }
        this.mSurface = surface;
        eglSetup(z);
    }

    private void checkEglError(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            String toHexString = Integer.toHexString(eglGetError);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 15) + String.valueOf(toHexString).length());
            stringBuilder.append(str);
            stringBuilder.append(": EGL error: 0x");
            stringBuilder.append(toHexString);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private EGLConfig chooseConfig(EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        int[] iArr = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, EGL_RECORDABLE_ANDROID, 1, 12344};
        int[] iArr2 = new int[1];
        int length = eGLConfigArr.length;
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, length, iArr2, 0)) {
            iArr[14] = 12344;
            if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, length, iArr2, 0)) {
                throw new RuntimeException("unable to find RGB8888 ES2 EGL config");
            }
        }
        return eGLConfigArr[0];
    }

    private void createEGLSurface() {
        this.mEGLSurface = EGL14.eglCreateWindowSurface(this.mEGLDisplay, this.mConfigs[0], this.mSurface, new int[]{12344}, 0);
        checkEglError("eglCreateWindowSurface");
        if (this.mEGLSurface == null) {
            throw new RuntimeException("surface was null");
        }
    }

    private void eglSetup(boolean z) {
        this.mEGLDisplay = getEGLDisplay();
        if (this.mEGLDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        this.mEGLContext = getOrCreateNewEGLContext(this.mEGLDisplay, chooseConfig(this.mEGLDisplay, this.mConfigs));
        if (z) {
            createEGLSurface();
        }
    }

    EGLDisplay getEGLDisplay() {
        EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        if (eglGetCurrentDisplay == null || eglGetCurrentDisplay == EGL14.EGL_NO_DISPLAY) {
            eglGetCurrentDisplay = EGL14.eglGetDisplay(0);
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetCurrentDisplay, iArr, 0, iArr, 1)) {
                throw new RuntimeException("unable to initialize EGL14");
            }
        }
        return eglGetCurrentDisplay;
    }

    private EGLContext getOrCreateNewEGLContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        if (eglGetCurrentContext == null || eglGetCurrentContext == EGL14.EGL_NO_CONTEXT) {
            eglGetCurrentContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{RenderTarget.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
            checkEglError("eglCreateContext");
            if (eglGetCurrentContext == null) {
                throw new RuntimeException("null context");
            }
        }
        return eglGetCurrentContext;
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public void makeCurrent() {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        EGLSurface eGLSurface = this.mEGLSurface;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void release() {
        if (this.mEGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
            EGL14.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.mEGLDisplay);
        }
        this.mSurface.release();
        this.mEGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.mEGLSurface = EGL14.EGL_NO_SURFACE;
        this.mSurface = null;
    }

    public void setPresentationTime(long j) {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        if (eGLDisplay != null) {
            EGLSurface eGLSurface = this.mEGLSurface;
            if (eGLSurface != null) {
                EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j);
            }
        }
    }

    public boolean swapBuffers() {
        return EGL14.eglSwapBuffers(this.mEGLDisplay, this.mEGLSurface);
    }
}
