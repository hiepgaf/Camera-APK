package com.google.android.libraries.smartburst.filterfw;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.media.MediaRecorder;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.nio.ByteBuffer;
import java.util.HashMap;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
public final class RenderTarget {
    public static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static EGLDisplay mConfiguredDisplay;
    public static final ThreadLocal mCurrentTarget = new ThreadLocal();
    public static final HashMap mDisplaySurfaces = new HashMap();
    public static EGLConfig mEglConfig = null;
    public static final HashMap mExternalIdShaders = new HashMap();
    public static final HashMap mIdShaders = new HashMap();
    public static final HashMap mRefCounts = new HashMap();
    public static final Object mSharedResourceLock = new Object();
    public static boolean mSupportsMultipleDisplaySurfaces = true;
    public static final HashMap mSurfaceSources = new HashMap();
    public static int sAlphaSize = 8;
    public static int sBlueSize = 8;
    public static int sDepthSize = 0;
    public static int sGreenSize = 8;
    public static int sRedSize = 8;
    public static int sStencilSize = 0;
    public EGLContext mContext;
    public EGLDisplay mDisplay;
    public EGL10 mEgl = ((EGL10) EGLContext.getEGL());
    public int mFbo;
    public boolean mOwnsContext;
    public boolean mOwnsSurface;
    public EGLSurface mSurface;
    public Object mSurfaceSource = null;

    private RenderTarget(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, boolean z, boolean z2) {
        this.mDisplay = eGLDisplay;
        this.mContext = eGLContext;
        this.mSurface = eGLSurface;
        this.mFbo = i;
        this.mOwnsContext = z;
        this.mOwnsSurface = z2;
    }

    private final void addReferenceTo(Object obj) {
        synchronized (mRefCounts) {
            Integer num = (Integer) mRefCounts.get(obj);
            if (num != null) {
                mRefCounts.put(obj, Integer.valueOf(num.intValue() + 1));
            } else {
                mRefCounts.put(obj, Integer.valueOf(1));
            }
        }
    }

    private static void checkContext(EGL10 egl10, EGLContext eGLContext) {
        if (eGLContext == EGL10.EGL_NO_CONTEXT) {
            String valueOf = String.valueOf(getEGLErrorString(egl10));
            String str = "EGL Error: Bad context: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new RuntimeException(valueOf);
        }
    }

    private static void checkDisplay(EGL10 egl10, EGLDisplay eGLDisplay) {
        if (eGLDisplay == EGL10.EGL_NO_DISPLAY) {
            String valueOf = String.valueOf(getEGLErrorString(egl10));
            String str = "EGL Error: Bad display: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new RuntimeException(valueOf);
        }
    }

    private static void checkEglError(EGL10 egl10, String str) {
        int eglGetError = egl10.eglGetError();
        if (eglGetError != 12288) {
            String toHexString = Integer.toHexString(eglGetError);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(toHexString).length());
            stringBuilder.append("Error executing ");
            stringBuilder.append(str);
            stringBuilder.append("! EGL error = 0x");
            stringBuilder.append(toHexString);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void checkSurface(EGL10 egl10, EGLSurface eGLSurface) {
        if (eGLSurface == EGL10.EGL_NO_SURFACE) {
            String valueOf = String.valueOf(getEGLErrorString(egl10));
            String str = "EGL Error: Bad surface: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new RuntimeException(valueOf);
        }
    }

    private static EGLConfig chooseEglConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        if (mEglConfig == null || !eGLDisplay.equals(mConfiguredDisplay)) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!egl10.eglChooseConfig(eGLDisplay, getDesiredConfig(), eGLConfigArr, 1, iArr)) {
                String valueOf = String.valueOf(getEGLErrorString(egl10));
                String str = "EGL Error: eglChooseConfig failed ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                throw new IllegalArgumentException(valueOf);
            } else if (iArr[0] > 0) {
                mEglConfig = eGLConfigArr[0];
                mConfiguredDisplay = eGLDisplay;
            }
        }
        return mEglConfig;
    }

    private static EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
        checkContext(egl10, eglCreateContext);
        return eglCreateContext;
    }

    private static EGLDisplay createDefaultDisplay(EGL10 egl10) {
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        checkDisplay(egl10, eglGetDisplay);
        initEgl(egl10, eglGetDisplay);
        return eglGetDisplay;
    }

    private static EGLSurface createSurface(EGL10 egl10, EGLDisplay eGLDisplay, int i, int i2) {
        return egl10.eglCreatePbufferSurface(eGLDisplay, chooseEglConfig(egl10, eGLDisplay), new int[]{12375, i, 12374, i2, 12344});
    }

    public static EGLContext currentContext() {
        RenderTarget currentTarget = currentTarget();
        return currentTarget == null ? EGL10.EGL_NO_CONTEXT : currentTarget.getContext();
    }

    public static RenderTarget currentTarget() {
        return (RenderTarget) mCurrentTarget.get();
    }

    public final void focus() {
        RenderTarget renderTarget = (RenderTarget) mCurrentTarget.get();
        if (renderTarget != this) {
            if (!(renderTarget != null && renderTarget.mDisplay.equals(this.mDisplay) && renderTarget.surface().equals(surface()) && renderTarget.mContext.equals(this.mContext))) {
                this.mEgl.eglMakeCurrent(this.mDisplay, surface(), surface(), this.mContext);
            }
            int currentFbo = getCurrentFbo();
            int i = this.mFbo;
            if (currentFbo != i) {
                GLES20.glBindFramebuffer(36160, i);
                GLToolbox.checkGlError("glBindFramebuffer");
            }
            mCurrentTarget.set(this);
        }
    }

    public static void focusNone() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        if (egl10.eglGetCurrentDisplay() != EGL10.EGL_NO_DISPLAY) {
            egl10.eglMakeCurrent(egl10.eglGetCurrentDisplay(), EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            checkEglError(egl10, "eglMakeCurrent");
        }
        mCurrentTarget.set(null);
    }

    public static RenderTarget forMediaRecorder(MediaRecorder mediaRecorder) {
        throw new RuntimeException("Not yet implemented MediaRecorder -> RenderTarget!");
    }

    @TargetApi(11)
    public final RenderTarget forSurface(Surface surface) {
        EGLSurface eglCreateWindowSurface;
        EGLConfig chooseEglConfig = chooseEglConfig(this.mEgl, this.mDisplay);
        synchronized (mSurfaceSources) {
            EGLSurface eGLSurface = (EGLSurface) mSurfaceSources.get(surface);
            if (eGLSurface == null) {
                eglCreateWindowSurface = this.mEgl.eglCreateWindowSurface(this.mDisplay, chooseEglConfig, surface, null);
                mSurfaceSources.put(surface, eglCreateWindowSurface);
            } else {
                eglCreateWindowSurface = eGLSurface;
            }
        }
        checkEglError(this.mEgl, "eglCreateWindowSurface");
        checkSurface(this.mEgl, eglCreateWindowSurface);
        RenderTarget renderTarget = new RenderTarget(this.mDisplay, this.mContext, eglCreateWindowSurface, 0, false, true);
        renderTarget.setSurfaceSource(surface);
        renderTarget.addReferenceTo(eglCreateWindowSurface);
        return renderTarget;
    }

    public final RenderTarget forSurfaceHolder(SurfaceHolder surfaceHolder) {
        EGLSurface eglCreateWindowSurface;
        EGLConfig chooseEglConfig = chooseEglConfig(this.mEgl, this.mDisplay);
        synchronized (mSurfaceSources) {
            EGLSurface eGLSurface = (EGLSurface) mSurfaceSources.get(surfaceHolder);
            if (eGLSurface == null) {
                eglCreateWindowSurface = this.mEgl.eglCreateWindowSurface(this.mDisplay, chooseEglConfig, surfaceHolder, null);
                mSurfaceSources.put(surfaceHolder, eglCreateWindowSurface);
            } else {
                eglCreateWindowSurface = eGLSurface;
            }
        }
        checkEglError(this.mEgl, "eglCreateWindowSurface");
        checkSurface(this.mEgl, eglCreateWindowSurface);
        RenderTarget renderTarget = new RenderTarget(this.mDisplay, this.mContext, eglCreateWindowSurface, 0, false, true);
        renderTarget.addReferenceTo(eglCreateWindowSurface);
        renderTarget.setSurfaceSource(surfaceHolder);
        return renderTarget;
    }

    @TargetApi(11)
    public final RenderTarget forSurfaceTexture(SurfaceTexture surfaceTexture) {
        EGLSurface eglCreateWindowSurface;
        EGLConfig chooseEglConfig = chooseEglConfig(this.mEgl, this.mDisplay);
        synchronized (mSurfaceSources) {
            EGLSurface eGLSurface = (EGLSurface) mSurfaceSources.get(surfaceTexture);
            if (eGLSurface == null) {
                eglCreateWindowSurface = this.mEgl.eglCreateWindowSurface(this.mDisplay, chooseEglConfig, surfaceTexture, null);
                mSurfaceSources.put(surfaceTexture, eglCreateWindowSurface);
            } else {
                eglCreateWindowSurface = eGLSurface;
            }
        }
        checkEglError(this.mEgl, "eglCreateWindowSurface");
        checkSurface(this.mEgl, eglCreateWindowSurface);
        RenderTarget renderTarget = new RenderTarget(this.mDisplay, this.mContext, eglCreateWindowSurface, 0, false, true);
        renderTarget.setSurfaceSource(surfaceTexture);
        renderTarget.addReferenceTo(eglCreateWindowSurface);
        return renderTarget;
    }

    public final RenderTarget forTexture(TextureSource textureSource, int i, int i2) {
        int generateFbo = GLToolbox.generateFbo();
        GLES20.glBindFramebuffer(36160, generateFbo);
        GLToolbox.checkGlError("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, textureSource.getTarget(), textureSource.getTextureId(), 0);
        GLToolbox.checkGlError("glFramebufferTexture2D");
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            return new RenderTarget(this.mDisplay, this.mContext, surface(), generateFbo, false, false);
        }
        StringBuilder stringBuilder = new StringBuilder(58);
        stringBuilder.append("Framebuffer ");
        stringBuilder.append(generateFbo);
        stringBuilder.append(" is incomplete. Reason: ");
        stringBuilder.append(glCheckFramebufferStatus);
        throw new RuntimeException(stringBuilder.toString());
    }

    public final EGLContext getContext() {
        return this.mContext;
    }

    private static int getCurrentFbo() {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        return iArr[0];
    }

    private static int[] getDesiredConfig() {
        return new int[]{12352, 4, 12324, sRedSize, 12323, sGreenSize, 12322, sBlueSize, 12321, sAlphaSize, 12325, sDepthSize, 12326, sStencilSize, 12344};
    }

    private static String getEGLErrorString(EGL10 egl10) {
        return getEGLErrorStringICS(egl10.eglGetError());
    }

    @TargetApi(14)
    private static String getEGLErrorStringICS(int i) {
        return GLUtils.getEGLErrorString(i);
    }

    public final ImageShader getExternalIdentityShader() {
        ImageShader imageShader;
        synchronized (mSharedResourceLock) {
            imageShader = (ImageShader) mExternalIdShaders.get(this.mContext);
            if (imageShader == null) {
                imageShader = ImageShader.createExternalIdentity();
                mExternalIdShaders.put(this.mContext, imageShader);
            }
        }
        return imageShader;
    }

    public final ImageShader getIdentityShader() {
        ImageShader imageShader;
        synchronized (mSharedResourceLock) {
            imageShader = (ImageShader) mIdShaders.get(this.mContext);
            if (imageShader == null) {
                imageShader = ImageShader.createIdentity();
                mIdShaders.put(this.mContext, imageShader);
            }
        }
        return imageShader;
    }

    public final ByteBuffer getPixelData(int i, int i2) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i * i2) << 2);
        GLToolbox.readTarget(this, allocateDirect, i, i2);
        return allocateDirect;
    }

    private static void initEgl(EGL10 egl10, EGLDisplay eGLDisplay) {
        if (!egl10.eglInitialize(eGLDisplay, new int[2])) {
            String valueOf = String.valueOf(getEGLErrorString(egl10));
            String str = "EGL Error: eglInitialize failed ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new RuntimeException(valueOf);
        }
    }

    public static RenderTarget newTarget(int i, int i2) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay createDefaultDisplay = createDefaultDisplay(egl10);
        EGLContext createContext = createContext(egl10, createDefaultDisplay, chooseEglConfig(egl10, createDefaultDisplay));
        EGLSurface createSurface = createSurface(egl10, createDefaultDisplay, i, i2);
        RenderTarget renderTarget = new RenderTarget(createDefaultDisplay, createContext, createSurface, 0, true, true);
        renderTarget.addReferenceTo(createSurface);
        return renderTarget;
    }

    public final void readPixelData(ByteBuffer byteBuffer, int i, int i2) {
        GLToolbox.readTarget(this, byteBuffer, i, i2);
    }

    public final void registerAsDisplaySurface() {
        if (!mSupportsMultipleDisplaySurfaces) {
            synchronized (mSharedResourceLock) {
                EGLSurface eGLSurface = (EGLSurface) mDisplaySurfaces.get(this.mContext);
                if (eGLSurface == null || eGLSurface.equals(this.mSurface)) {
                    mDisplaySurfaces.put(this.mContext, this.mSurface);
                } else {
                    throw new RuntimeException("This device supports only a single display surface!");
                }
            }
        }
    }

    public final void release() {
        if (this.mOwnsContext) {
            if (currentContext().equals(this.mContext)) {
                synchronized (mSharedResourceLock) {
                    mDisplaySurfaces.remove(this.mContext);
                    mExternalIdShaders.remove(this.mContext);
                    mIdShaders.remove(this.mContext);
                    this.mEgl.eglDestroyContext(this.mDisplay, this.mContext);
                }
                this.mContext = EGL10.EGL_NO_CONTEXT;
                focusNone();
            } else {
                String valueOf = String.valueOf(currentContext());
                String valueOf2 = String.valueOf(this.mContext);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 128) + String.valueOf(valueOf2).length());
                stringBuilder.append("RenderTarget must be released from its own thread. This thread has the following context: ");
                stringBuilder.append(valueOf);
                stringBuilder.append(", but the context being destroyed is ");
                stringBuilder.append(valueOf2);
                stringBuilder.append(".");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        if (this.mOwnsSurface) {
            synchronized (mSurfaceSources) {
                if (removeReferenceTo(this.mSurface)) {
                    this.mEgl.eglDestroySurface(this.mDisplay, this.mSurface);
                    this.mSurface = EGL10.EGL_NO_SURFACE;
                    mSurfaceSources.remove(this.mSurfaceSource);
                }
            }
        }
        int i = this.mFbo;
        if (i != 0) {
            GLToolbox.deleteFbo(i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean removeReferenceTo(java.lang.Object r7) {
        /*
        r6 = this;
        r1 = 0;
        r2 = mRefCounts;
        monitor-enter(r2);
        r0 = mRefCounts;	 Catch:{ all -> 0x0065 }
        r0 = r0.get(r7);	 Catch:{ all -> 0x0065 }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x0065 }
        if (r0 == 0) goto L_0x0039;
    L_0x000e:
        r3 = r0.intValue();	 Catch:{ all -> 0x0065 }
        if (r3 <= 0) goto L_0x0039;
    L_0x0014:
        r0 = r0.intValue();	 Catch:{ all -> 0x0065 }
        r0 = r0 + -1;
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x0065 }
        r3 = mRefCounts;	 Catch:{ all -> 0x0065 }
        r3.put(r7, r0);	 Catch:{ all -> 0x0065 }
        r3 = r0.intValue();	 Catch:{ all -> 0x0065 }
        if (r3 != 0) goto L_0x002e;
    L_0x0029:
        r3 = mRefCounts;	 Catch:{ all -> 0x0065 }
        r3.remove(r7);	 Catch:{ all -> 0x0065 }
    L_0x002e:
        r0 = r0.intValue();	 Catch:{ all -> 0x0065 }
        if (r0 != 0) goto L_0x0037;
    L_0x0034:
        r0 = 1;
    L_0x0035:
        monitor-exit(r2);	 Catch:{ all -> 0x0065 }
    L_0x0036:
        return r0;
    L_0x0037:
        r0 = r1;
        goto L_0x0035;
    L_0x0039:
        r0 = "RenderTarget";
        r3 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x0065 }
        r4 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0065 }
        r4 = r4.length();	 Catch:{ all -> 0x0065 }
        r4 = r4 + 41;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0065 }
        r5.<init>(r4);	 Catch:{ all -> 0x0065 }
        r4 = "Removing reference of already released: ";
        r5.append(r4);	 Catch:{ all -> 0x0065 }
        r5.append(r3);	 Catch:{ all -> 0x0065 }
        r3 = "!";
        r5.append(r3);	 Catch:{ all -> 0x0065 }
        r3 = r5.toString();	 Catch:{ all -> 0x0065 }
        android.util.Log.e(r0, r3);	 Catch:{ all -> 0x0065 }
        monitor-exit(r2);	 Catch:{ all -> 0x0065 }
        r0 = r1;
        goto L_0x0036;
    L_0x0065:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0065 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.smartburst.filterfw.RenderTarget.removeReferenceTo(java.lang.Object):boolean");
    }

    public static void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
        sRedSize = i;
        sGreenSize = i2;
        sBlueSize = i3;
        sAlphaSize = i4;
        sDepthSize = i5;
        sStencilSize = i6;
    }

    private final void setSurfaceSource(Object obj) {
        this.mSurfaceSource = obj;
    }

    private final EGLSurface surface() {
        if (mSupportsMultipleDisplaySurfaces) {
            return this.mSurface;
        }
        EGLSurface eGLSurface;
        synchronized (mSharedResourceLock) {
            eGLSurface = (EGLSurface) mDisplaySurfaces.get(this.mContext);
            if (eGLSurface == null) {
                eGLSurface = this.mSurface;
            }
        }
        return eGLSurface;
    }

    public final void swapBuffers() {
        this.mEgl.eglSwapBuffers(this.mDisplay, surface());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.mDisplay);
        String valueOf2 = String.valueOf(this.mContext);
        String valueOf3 = String.valueOf(this.mSurface);
        int i = this.mFbo;
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 31) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("RenderTarget(");
        stringBuilder.append(valueOf);
        stringBuilder.append(", ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", ");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", ");
        stringBuilder.append(i);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void unregisterAsDisplaySurface() {
        if (!mSupportsMultipleDisplaySurfaces) {
            synchronized (mSharedResourceLock) {
                mDisplaySurfaces.put(this.mContext, null);
            }
        }
    }
}
