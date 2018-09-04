package com.google.android.libraries.smartburst.filterfw;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.os.ConditionVariable;
import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

@TargetApi(18)
/* compiled from: PG */
public class SurfaceFrameDistributor {
    public static final AtomicReference mCurrentOwner = new AtomicReference();
    public static final Object mSurfaceTextureAccessLock = new Object();
    public boolean mConsumersStopped;
    public final OnFrameAvailableListener mFrameListener;
    public boolean mFramePending;
    public final Handler mHandler;
    public boolean mIsReleased;
    public boolean mIsSetup;
    public final Listener mListener;
    public RenderTarget mServerTarget;
    public SurfaceTexture mSurfaceTexture;
    public final SurfaceTextureManager mSurfaceTextureManager;
    public final float[] mSurfaceTransform;
    public int mTexture;

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.SurfaceFrameDistributor$2 */
    class C00752 implements OnFrameAvailableListener {

        /* compiled from: PG */
        /* renamed from: com.google.android.libraries.smartburst.filterfw.SurfaceFrameDistributor$2$1 */
        class C00741 implements Runnable {
            C00741() {
            }

            public void run() {
                if (SurfaceFrameDistributor.this.mIsSetup) {
                    SurfaceFrameDistributor.this.onUpdateSurfaceTexture();
                } else {
                    SurfaceFrameDistributor.this.mFramePending = true;
                }
            }
        }

        C00752() {
        }

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            SurfaceFrameDistributor.this.mHandler.post(new C00741());
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.SurfaceFrameDistributor$3 */
    class C00763 implements Runnable {
        C00763() {
        }

        public void run() {
            SurfaceFrameDistributor.this.onSetup();
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.SurfaceFrameDistributor$4 */
    class C00774 implements Runnable {
        C00774() {
        }

        public void run() {
            SurfaceFrameDistributor.this.onRelease();
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.SurfaceFrameDistributor$6 */
    class C00806 implements OnFrameAvailableListener {

        /* compiled from: PG */
        /* renamed from: com.google.android.libraries.smartburst.filterfw.SurfaceFrameDistributor$6$1 */
        class C00791 implements Runnable {
            C00791() {
            }

            public void run() {
                SurfaceFrameDistributor.this.onUpdateSurfaceTexture();
            }
        }

        C00806() {
        }

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            SurfaceFrameDistributor.this.mHandler.post(new C00791());
        }
    }

    /* compiled from: PG */
    public interface Listener {
        void onFrameAvailable(long j);
    }

    /* compiled from: PG */
    public interface SurfaceTextureManager {
        SurfaceTexture createSurfaceTexture();

        void releaseSurfaceTexture(SurfaceTexture surfaceTexture);
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.SurfaceFrameDistributor$1 */
    class C01431 implements SurfaceTextureManager {
        public final /* synthetic */ SurfaceTexture val$surfaceTexture;

        C01431(SurfaceTexture surfaceTexture) {
            this.val$surfaceTexture = surfaceTexture;
        }

        public SurfaceTexture createSurfaceTexture() {
            return this.val$surfaceTexture;
        }

        public void releaseSurfaceTexture(SurfaceTexture surfaceTexture) {
        }
    }

    public SurfaceFrameDistributor(Listener listener, SurfaceTexture surfaceTexture, Handler handler) {
        this(listener, new C01431(surfaceTexture), handler);
        setOnFrameAvailableListener(surfaceTexture, new C00752(), handler);
    }

    public SurfaceFrameDistributor(Listener listener, SurfaceTextureManager surfaceTextureManager, Handler handler) {
        this.mSurfaceTransform = new float[16];
        this.mFramePending = false;
        this.mIsSetup = false;
        this.mIsReleased = false;
        this.mConsumersStopped = false;
        this.mFrameListener = new C00806();
        this.mListener = listener;
        this.mHandler = handler;
        this.mSurfaceTextureManager = surfaceTextureManager;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean grabFrame(com.google.android.libraries.smartburst.filterfw.FrameImage2D r9, int r10, int r11, com.google.android.libraries.smartburst.filterfw.SurfaceTexTransform r12, com.google.android.libraries.smartburst.filterfw.geometry.Scaler r13) {
        /*
        r8 = this;
        r0 = 1;
        r1 = 0;
        r2 = com.google.android.libraries.smartburst.filterfw.TextureSource.newExternalTexture();
        r3 = com.google.android.libraries.smartburst.filterfw.RenderTarget.currentTarget();
        r3 = r3.getExternalIdentityShader();
        if (r3 != 0) goto L_0x003e;
    L_0x0010:
        r0 = new java.lang.RuntimeException;
        r1 = java.lang.Thread.currentThread();
        r1 = java.lang.String.valueOf(r1);
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 47;
        r3.<init>(r2);
        r2 = "Attempting to grab frame from unknown thread: ";
        r3.append(r2);
        r3.append(r1);
        r1 = "!";
        r3.append(r1);
        r1 = r3.toString();
        r0.<init>(r1);
        throw r0;
    L_0x003e:
        r4 = mSurfaceTextureAccessLock;
        monitor-enter(r4);
        r5 = r8.mIsReleased;	 Catch:{ all -> 0x00ab }
        if (r5 != 0) goto L_0x0049;
    L_0x0045:
        r5 = r8.mConsumersStopped;	 Catch:{ all -> 0x00ab }
        if (r5 == 0) goto L_0x004c;
    L_0x0049:
        monitor-exit(r4);	 Catch:{ all -> 0x00ab }
        r0 = r1;
    L_0x004b:
        return r0;
    L_0x004c:
        r1 = r8.mSurfaceTexture;	 Catch:{ all -> 0x00ab }
        r5 = r2.getTextureId();	 Catch:{ all -> 0x00ab }
        r1.attachToGLContext(r5);	 Catch:{ all -> 0x00ab }
        r1 = r8.mSurfaceTexture;	 Catch:{ all -> 0x00ab }
        r5 = r8.mSurfaceTransform;	 Catch:{ all -> 0x00ab }
        r1.getTransformMatrix(r5);	 Catch:{ all -> 0x00ab }
        r1 = r8.mSurfaceTexture;	 Catch:{ all -> 0x00ab }
        r1 = r12.applyOn(r1);	 Catch:{ all -> 0x00ab }
        r5 = r1.matrix();	 Catch:{ all -> 0x00ab }
        r3.setSourceTransform(r5);	 Catch:{ all -> 0x00ab }
        r5 = 2;
        r5 = new int[r5];	 Catch:{ all -> 0x00ab }
        r6 = 0;
        r5[r6] = r10;	 Catch:{ all -> 0x00ab }
        r6 = 1;
        r5[r6] = r11;	 Catch:{ all -> 0x00ab }
        r1 = r1.requiresSwappingDimensions();	 Catch:{ all -> 0x00ab }
        if (r1 == 0) goto L_0x007b;
    L_0x0078:
        swap(r5);	 Catch:{ all -> 0x00ab }
    L_0x007b:
        r1 = 0;
        r1 = r5[r1];	 Catch:{ all -> 0x00ab }
        r6 = 1;
        r5 = r5[r6];	 Catch:{ all -> 0x00ab }
        r1 = r13.scale(r1, r5);	 Catch:{ all -> 0x00ab }
        r9.resize(r1);	 Catch:{ all -> 0x00ab }
        r5 = r9.lockRenderTarget();	 Catch:{ all -> 0x00ab }
        r6 = 0;
        r6 = r1[r6];	 Catch:{ all -> 0x00ab }
        r7 = 1;
        r1 = r1[r7];	 Catch:{ all -> 0x00ab }
        r3.process(r2, r5, r6, r1);	 Catch:{ all -> 0x00ab }
        r1 = r8.mSurfaceTexture;	 Catch:{ all -> 0x00ab }
        r6 = r1.getTimestamp();	 Catch:{ all -> 0x00ab }
        r9.setTimestamp(r6);	 Catch:{ all -> 0x00ab }
        r9.unlock();	 Catch:{ all -> 0x00ab }
        r1 = r8.mSurfaceTexture;	 Catch:{ all -> 0x00ab }
        r1.detachFromGLContext();	 Catch:{ all -> 0x00ab }
        monitor-exit(r4);	 Catch:{ all -> 0x00ab }
        r2.release();
        goto L_0x004b;
    L_0x00ab:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00ab }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.smartburst.filterfw.SurfaceFrameDistributor.grabFrame(com.google.android.libraries.smartburst.filterfw.FrameImage2D, int, int, com.google.android.libraries.smartburst.filterfw.SurfaceTexTransform, com.google.android.libraries.smartburst.filterfw.geometry.Scaler):boolean");
    }

    private void informListenersOfNewFrame(long j) {
        this.mListener.onFrameAvailable(j);
    }

    private void onRelease() {
        if (this.mIsSetup) {
            synchronized (mSurfaceTextureAccessLock) {
                if (mCurrentOwner.get() == this && !this.mIsReleased) {
                    this.mSurfaceTexture.setOnFrameAvailableListener(null);
                    this.mSurfaceTextureManager.releaseSurfaceTexture(this.mSurfaceTexture);
                }
            }
            this.mServerTarget.release();
            this.mServerTarget = null;
            GLToolbox.deleteTexture(this.mTexture);
            RenderTarget.focusNone();
            this.mIsSetup = false;
        }
    }

    private void onSetup() {
        if (!this.mIsSetup) {
            mCurrentOwner.set(this);
            this.mServerTarget = RenderTarget.newTarget(1, 1);
            this.mServerTarget.focus();
            this.mSurfaceTexture = this.mSurfaceTextureManager.createSurfaceTexture();
            setOnFrameAvailableListener(this.mSurfaceTexture, this.mFrameListener, this.mHandler);
            this.mTexture = GLToolbox.generateTexture();
            this.mIsSetup = true;
            if (this.mFramePending) {
                onUpdateSurfaceTexture();
            }
        }
    }

    private void onUpdateSurfaceTexture() {
        if (this.mIsSetup) {
            synchronized (mSurfaceTextureAccessLock) {
                if (this.mIsReleased) {
                    return;
                }
                if (mCurrentOwner.get() == this) {
                    this.mSurfaceTexture.attachToGLContext(this.mTexture);
                    this.mSurfaceTexture.updateTexImage();
                    this.mSurfaceTexture.detachFromGLContext();
                }
                if (this.mConsumersStopped) {
                    return;
                }
                informListenersOfNewFrame(this.mSurfaceTexture.getTimestamp());
            }
        }
    }

    private void post(Runnable runnable) {
        if (!this.mHandler.post(runnable)) {
            throw new IllegalStateException("Attempting to execute command on torn down thread!");
        }
    }

    public void release() {
        synchronized (mSurfaceTextureAccessLock) {
            this.mIsReleased = true;
            this.mConsumersStopped = true;
        }
        post(new C00774());
    }

    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        Throwable e;
        synchronized (mSurfaceTextureAccessLock) {
            try {
                SurfaceTexture.class.getDeclaredMethod("setOnFrameAvailableListener", new Class[]{OnFrameAvailableListener.class, Handler.class}).invoke(surfaceTexture, new Object[]{onFrameAvailableListener, handler});
            } catch (InvocationTargetException e2) {
                e = e2;
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e3) {
                e = e3;
                throw new RuntimeException(e);
            } catch (IllegalArgumentException e4) {
                e = e4;
                throw new RuntimeException(e);
            } catch (IllegalAccessException e5) {
                e = e5;
                throw new RuntimeException(e);
            }
        }
    }

    public void setup() {
        synchronized (mSurfaceTextureAccessLock) {
            this.mConsumersStopped = false;
        }
        post(new C00763());
    }

    public void start() {
        synchronized (mSurfaceTextureAccessLock) {
            this.mConsumersStopped = false;
        }
    }

    public void stop() {
        synchronized (mSurfaceTextureAccessLock) {
            this.mConsumersStopped = true;
        }
    }

    private static void swap(int[] iArr) {
        int i = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i;
    }

    public void waitForCommand() {
        final ConditionVariable conditionVariable = new ConditionVariable(false);
        if (this.mHandler.post(new Runnable(this) {
            public void run() {
                conditionVariable.open();
            }
        })) {
            conditionVariable.block();
        }
    }
}
