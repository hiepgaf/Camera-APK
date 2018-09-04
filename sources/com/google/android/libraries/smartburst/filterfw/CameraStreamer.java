package com.google.android.libraries.smartburst.filterfw;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceView;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import com.google.android.libraries.smartburst.filterfw.decoder.VideoFrameInfo;
import com.google.android.libraries.smartburst.filterfw.decoder.VideoStreamProvider;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.FilterModes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: PG */
public class CameraStreamer implements VideoStreamProvider {
    public static final int FACING_BACK = 2;
    public static final int FACING_DONTCARE = 0;
    public static final int FACING_FRONT = 1;
    public static final long MAX_CAMERA_WAIT_TIME = 5;
    public static ReentrantLock mCameraLock = new ReentrantLock();
    public CameraRunnable mCameraRunner = null;
    public final AtomicBoolean mIsClosed = new AtomicBoolean(false);

    /* compiled from: PG */
    abstract class CamFrameHandler {
        public int mCameraHeight;
        public int mCameraWidth;
        public final Vector mClients;
        public HashMap mContextClients;
        public int mOutHeight;
        public int mOutWidth;
        public CameraRunnable mRunner;
        public HashMap mTargetShaders;
        public HashMap mTargetTextures;

        private CamFrameHandler(CameraStreamer cameraStreamer) {
            this.mTargetShaders = new HashMap();
            this.mTargetTextures = new HashMap();
            this.mContextClients = new HashMap();
            this.mClients = new Vector();
        }

        public abstract void grabFrame(FrameImage2D frameImage2D, Scaler scaler);

        public abstract void release();

        public abstract void setupServerFrame();

        public abstract void updateServerFrame();

        protected Set clientsForContext(EGLContext eGLContext) {
            Set set = (Set) this.mContextClients.get(eGLContext);
            if (set != null) {
                return set;
            }
            set = new HashSet();
            this.mContextClients.put(eGLContext, set);
            return set;
        }

        protected ImageShader createClientShader() {
            return null;
        }

        protected TextureSource createClientTexture() {
            return null;
        }

        public void initWithRunner(CameraRunnable cameraRunnable) {
            this.mRunner = cameraRunnable;
        }

        public boolean isFrontMirrored() {
            return true;
        }

        protected void onCleanupContext(EGLContext eGLContext) {
            TextureSource textureSource = (TextureSource) this.mTargetTextures.get(eGLContext);
            ImageShader imageShader = (ImageShader) this.mTargetShaders.get(eGLContext);
            if (textureSource != null) {
                textureSource.release();
                this.mTargetTextures.remove(eGLContext);
            }
            if (imageShader != null) {
                this.mTargetShaders.remove(eGLContext);
            }
        }

        protected void onRegisterClient(VideoFrameConsumer videoFrameConsumer, EGLContext eGLContext) {
        }

        public void onUpdateCameraOrientation(int i) {
            if (i % MediaDecoder.ROTATE_180 != 0) {
                this.mOutWidth = this.mCameraHeight;
                this.mOutHeight = this.mCameraWidth;
                return;
            }
            this.mOutWidth = this.mCameraWidth;
            this.mOutHeight = this.mCameraHeight;
        }

        public void registerClient(VideoFrameConsumer videoFrameConsumer) {
            EGLContext currentContext = RenderTarget.currentContext();
            clientsForContext(currentContext).add(videoFrameConsumer);
            this.mClients.add(videoFrameConsumer);
            onRegisterClient(videoFrameConsumer, currentContext);
        }

        public void setCameraSize(int i, int i2) {
            this.mCameraWidth = i;
            this.mCameraHeight = i2;
        }

        protected ImageShader shaderForContext(EGLContext eGLContext) {
            ImageShader imageShader = (ImageShader) this.mTargetShaders.get(eGLContext);
            if (imageShader != null) {
                return imageShader;
            }
            imageShader = createClientShader();
            this.mTargetShaders.put(eGLContext, imageShader);
            return imageShader;
        }

        protected TextureSource textureForContext(EGLContext eGLContext) {
            TextureSource textureSource = (TextureSource) this.mTargetTextures.get(eGLContext);
            if (textureSource != null) {
                return textureSource;
            }
            textureSource = createClientTexture();
            this.mTargetTextures.put(eGLContext, textureSource);
            return textureSource;
        }

        public void unregisterClient(VideoFrameConsumer videoFrameConsumer) {
            EGLContext currentContext = RenderTarget.currentContext();
            Set clientsForContext = clientsForContext(currentContext);
            clientsForContext.remove(videoFrameConsumer);
            if (clientsForContext.isEmpty()) {
                onCleanupContext(currentContext);
            }
            this.mClients.remove(videoFrameConsumer);
        }
    }

    /* compiled from: PG */
    public interface CameraListener {
        void onCameraClosed(CameraStreamer cameraStreamer);

        void onCameraOpened(CameraStreamer cameraStreamer);
    }

    /* compiled from: PG */
    final class CameraRunnable implements Runnable {
        public static final int MAX_EVENTS = 32;
        public int[] mActualDims = null;
        public int mActualFacing = 0;
        public int mActualFramesPerSec = 0;
        public CamFrameHandler mCamFrameHandler = null;
        public int mCamId = 0;
        public final Set mCamListeners = new HashSet();
        public int mCamOrientation = 0;
        public int mCamRotation = 0;
        public Camera mCamera = null;
        public Condition mCameraReady = this.mCameraReadyLock.newCondition();
        public ReentrantLock mCameraReadyLock = new ReentrantLock(true);
        public MffContext mContext;
        public Display mDisplay = null;
        public LinkedBlockingQueue mEventQueue = new LinkedBlockingQueue(32);
        public ExternalCameraLock mExternalCameraLock = new ExternalCameraLock();
        public String mFlashMode = "off";
        public boolean mFlipFront = true;
        public int mOrientation = -1;
        public MediaRecorder mRecorder = null;
        public RenderTarget mRenderTarget;
        public int mRequestedFacing = 0;
        public int mRequestedFramesPerSec = 30;
        public int mRequestedPictureHeight = 480;
        public int mRequestedPictureWidth = 640;
        public int mRequestedPreviewHeight = 480;
        public int mRequestedPreviewWidth = 640;
        public final State mState = new State();

        /* compiled from: PG */
        class ExternalCameraLock {
            public static final int IDLE = 0;
            public static final int IN_USE = 1;
            public final Condition mInUseLockCondition;
            public final ReentrantLock mLock;
            public Object mLockContext;
            public int mLockState;

            private ExternalCameraLock(CameraRunnable cameraRunnable) {
                this.mLockState = 0;
                this.mLock = new ReentrantLock(true);
                this.mInUseLockCondition = this.mLock.newCondition();
            }

            public boolean lock(Object obj) {
                if (obj == null) {
                    throw new RuntimeException("Null context when locking");
                }
                this.mLock.lock();
                if (this.mLockState == 1) {
                    try {
                        this.mInUseLockCondition.await();
                    } catch (InterruptedException e) {
                        return false;
                    }
                }
                this.mLockState = 1;
                this.mLockContext = obj;
                this.mLock.unlock();
                return true;
            }

            public void unlock(Object obj) {
                this.mLock.lock();
                if (this.mLockState != 1) {
                    throw new RuntimeException("Not in IN_USE state");
                } else if (obj != this.mLockContext) {
                    throw new RuntimeException("Lock is not owned by this context");
                } else {
                    this.mLockState = 0;
                    this.mLockContext = null;
                    this.mInUseLockCondition.signal();
                    this.mLock.unlock();
                }
            }
        }

        public CameraRunnable(MffContext mffContext) {
            this.mContext = mffContext;
            createCamFrameHandler();
            this.mCamFrameHandler.initWithRunner(this);
            launchThread();
        }

        public final void addListener(CameraListener cameraListener) {
            synchronized (this.mCamListeners) {
                this.mCamListeners.add(cameraListener);
            }
        }

        public final synchronized void bindToDisplay(Display display) {
            this.mDisplay = display;
        }

        public final synchronized boolean canStart() {
            boolean z;
            try {
                getCameraId();
                z = true;
            } catch (RuntimeException e) {
                z = false;
            }
            return z;
        }

        private final void closeCamera() {
            Object obj = new Object();
            this.mExternalCameraLock.lock(obj);
            Camera camera = this.mCamera;
            if (camera != null) {
                camera.stopPreview();
                this.mCamera.release();
                this.mCamera = null;
            }
            CameraStreamer.mCameraLock.unlock();
            this.mCamFrameHandler.release();
            this.mExternalCameraLock.unlock(obj);
            synchronized (this.mCamListeners) {
                for (CameraListener onCameraClosed : this.mCamListeners) {
                    onCameraClosed.onCameraClosed(CameraStreamer.this);
                }
            }
        }

        private final void createCamFrameHandler() {
            getContext().assertOpenGLSupported();
            this.mCamFrameHandler = new CamFrameHandlerJB();
        }

        public final void createRecorder(String str, CamcorderProfile camcorderProfile) {
            lockCamera(this);
            this.mCamera.unlock();
            MediaRecorder mediaRecorder = this.mRecorder;
            if (mediaRecorder != null) {
                mediaRecorder.release();
            }
            this.mRecorder = new MediaRecorder();
            this.mRecorder.setCamera(this.mCamera);
            this.mRecorder.setAudioSource(5);
            this.mRecorder.setVideoSource(1);
            this.mRecorder.setProfile(camcorderProfile);
            this.mRecorder.setOutputFile(str);
            try {
                this.mRecorder.prepare();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        private final int[] findClosestFpsRange(int i, Parameters parameters) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            int[] iArr = (int[]) supportedPreviewFpsRange.get(0);
            int i2 = i * 1000;
            int i3 = FrameMetricsApi24Impl.NANOS_PER_MS;
            int[] iArr2 = iArr;
            for (int[] iArr3 : supportedPreviewFpsRange) {
                int i4;
                int[] iArr4;
                int i5 = iArr3[0];
                int i6 = iArr3[1];
                if (i5 > i2) {
                    i4 = i3;
                    iArr4 = iArr2;
                } else if (i6 >= i2) {
                    i5 = (i2 - i5) + (i6 - i2);
                    if (i5 < i3) {
                        int i7 = i5;
                        iArr4 = iArr3;
                        i4 = i7;
                    } else {
                        i4 = i3;
                        iArr4 = iArr2;
                    }
                } else {
                    i4 = i3;
                    iArr4 = iArr2;
                }
                i3 = i4;
                iArr2 = iArr4;
            }
            this.mActualFramesPerSec = iArr2[1] / 1000;
            return iArr2;
        }

        private final int[] findClosestPictureSize(int i, int i2, Parameters parameters) {
            return findClosestSizeFromList(i, i2, parameters.getSupportedPictureSizes());
        }

        private final int[] findClosestPreviewSize(int i, int i2, Parameters parameters) {
            return findClosestSizeFromList(i, i2, parameters.getSupportedPreviewSizes());
        }

        private final int[] findClosestSizeFromList(int i, int i2, List list) {
            int i3 = ((Size) list.get(0)).width;
            int i4 = ((Size) list.get(0)).height;
            int i5 = i3;
            int i6 = -1;
            int i7 = -1;
            i3 = i4;
            for (Size size : list) {
                if (size.width <= i && size.height <= i2 && size.width >= i7 && size.height >= i6) {
                    i7 = size.width;
                    i6 = size.height;
                }
                if (size.width >= i5) {
                    i4 = i3;
                    i3 = i5;
                } else if (size.height < i3) {
                    i5 = size.width;
                    i4 = size.height;
                    i3 = i5;
                } else {
                    i4 = i3;
                    i3 = i5;
                }
                i5 = i3;
                i3 = i4;
            }
            if (i7 != -1) {
                i3 = i6;
            }
            if (i7 != -1) {
                i5 = i7;
            }
            return new int[]{i5, i3};
        }

        public final CamFrameHandler getCamFrameHandler() {
            return this.mCamFrameHandler;
        }

        @Deprecated
        public final Camera getCamera() {
            Camera camera;
            synchronized (this.mState) {
                camera = this.mCamera;
            }
            return camera;
        }

        public final synchronized int getCameraFacing() {
            return this.mActualFacing;
        }

        public final synchronized int getCameraFrameRate() {
            return this.mActualFramesPerSec;
        }

        public final synchronized int getCameraHeight() {
            int[] iArr;
            iArr = this.mActualDims;
            return iArr != null ? iArr[1] : 0;
        }

        private final int getCameraId() {
            int numberOfCameras = Camera.getNumberOfCameras();
            if (numberOfCameras == 0) {
                throw new RuntimeException("Device does not have any cameras!");
            }
            int i = this.mRequestedFacing;
            if (i == 0) {
                return 0;
            }
            if (i != 1) {
                i = 0;
            } else {
                i = 1;
            }
            CameraInfo cameraInfo = new CameraInfo();
            for (int i2 = 0; i2 < numberOfCameras; i2++) {
                int i3;
                Camera.getCameraInfo(i2, cameraInfo);
                if (cameraInfo.facing != 1) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                if (i3 == i) {
                    return i2;
                }
            }
            int i4 = this.mRequestedFacing;
            StringBuilder stringBuilder = new StringBuilder(45);
            stringBuilder.append("Could not find a camera facing (");
            stringBuilder.append(i4);
            stringBuilder.append(")!");
            throw new RuntimeException(stringBuilder.toString());
        }

        public final synchronized int getCameraRotation() {
            return this.mCamRotation;
        }

        public final synchronized int getCameraWidth() {
            int i = 0;
            synchronized (this) {
                int[] iArr = this.mActualDims;
                if (iArr != null) {
                    i = iArr[0];
                }
            }
            return i;
        }

        public final MffContext getContext() {
            return this.mContext;
        }

        public final int getCurrentCameraId() {
            int i;
            synchronized (this.mState) {
                i = this.mCamId;
            }
            return i;
        }

        public final synchronized String getFlashMode() {
            return this.mCamera.getParameters().getFlashMode();
        }

        private final RenderTarget getRenderTarget() {
            if (this.mRenderTarget == null) {
                this.mRenderTarget = RenderTarget.newTarget(1, 1);
            }
            return this.mRenderTarget;
        }

        public final boolean grabFrame(FrameImage2D frameImage2D, Scaler scaler) {
            synchronized (this.mState) {
                if (this.mState.current() != 1) {
                    return false;
                } else if (this.mCamera == null) {
                    return false;
                } else {
                    this.mCamFrameHandler.grabFrame(frameImage2D, scaler);
                    return true;
                }
            }
        }

        private final void initCameraParameters() {
            Parameters parameters = this.mCamera.getParameters();
            this.mActualDims = findClosestPreviewSize(this.mRequestedPreviewWidth, this.mRequestedPreviewHeight, parameters);
            CamFrameHandler camFrameHandler = this.mCamFrameHandler;
            int[] iArr = this.mActualDims;
            camFrameHandler.setCameraSize(iArr[0], iArr[1]);
            int[] iArr2 = this.mActualDims;
            parameters.setPreviewSize(iArr2[0], iArr2[1]);
            iArr2 = findClosestPictureSize(this.mRequestedPictureWidth, this.mRequestedPictureHeight, parameters);
            parameters.setPictureSize(iArr2[0], iArr2[1]);
            iArr2 = findClosestFpsRange(this.mRequestedFramesPerSec, parameters);
            parameters.setPreviewFpsRange(iArr2[0], iArr2[1]);
            if (parameters.getFlashMode() != null) {
                parameters.setFlashMode(this.mFlashMode);
            }
            this.mCamera.setParameters(parameters);
        }

        public final boolean isRunning() {
            return this.mState.current() != 2;
        }

        public final void launchThread() {
            new Thread(this).start();
        }

        public final Camera lockCamera(Object obj) {
            this.mExternalCameraLock.lock(obj);
            while (true) {
                Camera camera = this.mCamera;
                if (camera != null) {
                    return camera;
                }
                this.mExternalCameraLock.unlock(obj);
                this.mCameraReadyLock.lock();
                try {
                    this.mCameraReady.await();
                    this.mCameraReadyLock.unlock();
                    this.mExternalCameraLock.lock(obj);
                } catch (Throwable e) {
                    throw new RuntimeException("Condition interrupted", e);
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void loop() {
            /*
            r2 = this;
        L_0x0000:
            r0 = r2.nextEvent();	 Catch:{ Exception -> 0x0010 }
            if (r0 == 0) goto L_0x0000;
        L_0x0006:
            r0 = r0.code;	 Catch:{ Exception -> 0x0010 }
            switch(r0) {
                case 1: goto L_0x000c;
                case 2: goto L_0x002b;
                case 3: goto L_0x0027;
                case 4: goto L_0x0023;
                case 5: goto L_0x001f;
                case 6: goto L_0x001b;
                case 7: goto L_0x0017;
                default: goto L_0x000b;
            };	 Catch:{ Exception -> 0x0010 }
        L_0x000b:
            goto L_0x0000;
        L_0x000c:
            r2.onStart();	 Catch:{ Exception -> 0x0010 }
            goto L_0x0000;
        L_0x0010:
            r0 = move-exception;
            r1 = p000.kqg.f8420a;
            r1.mo2210b(r0);
            goto L_0x0000;
        L_0x0017:
            r2.onTearDown();	 Catch:{ Exception -> 0x0010 }
            goto L_0x0000;
        L_0x001b:
            r2.onUpdate();	 Catch:{ Exception -> 0x0010 }
            goto L_0x0000;
        L_0x001f:
            r2.onRestart();	 Catch:{ Exception -> 0x0010 }
            goto L_0x0000;
        L_0x0023:
            r2.onHalt();	 Catch:{ Exception -> 0x0010 }
            goto L_0x0000;
        L_0x0027:
            r2.onStop();	 Catch:{ Exception -> 0x0010 }
            goto L_0x0000;
        L_0x002b:
            r2.onFrame();	 Catch:{ Exception -> 0x0010 }
            goto L_0x0000;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.smartburst.filterfw.CameraStreamer.CameraRunnable.loop():void");
        }

        private final Event nextEvent() {
            try {
                return (Event) this.mEventQueue.take();
            } catch (InterruptedException e) {
                Log.w("GraphRunner", "Event queue processing was interrupted.");
                return null;
            }
        }

        private final void onFrame() {
            if (this.mState.current() == 1) {
                updateRotation();
                this.mCamFrameHandler.updateServerFrame();
            }
        }

        private final void onHalt() {
            if (this.mState.current() == 1) {
                closeCamera();
                RenderTarget.focusNone();
                this.mState.set(3);
            }
        }

        private final void onParamsUpdated() {
            pushEvent(6, true);
        }

        private final void onRestart() {
            if (this.mState.current() == 3) {
                this.mState.set(1);
                getRenderTarget().focus();
                openCamera();
            }
        }

        private final void onStart() {
            if (this.mState.current() == 2) {
                this.mState.set(1);
                getRenderTarget().focus();
                openCamera();
                Iterator it = this.mCamFrameHandler.mClients.iterator();
                while (it.hasNext()) {
                    ((VideoFrameConsumer) it.next()).onVideoStreamStarted();
                }
            }
        }

        private final void onStop() {
            if (this.mState.current() == 1) {
                closeCamera();
                RenderTarget.focusNone();
            }
            this.mState.set(2);
            ArrayList arrayList = new ArrayList(this.mCamFrameHandler.mClients);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ((VideoFrameConsumer) arrayList.get(i)).onVideoStreamStopped();
                i = i2;
            }
        }

        private final void onTearDown() {
            if (this.mState.current() == 2) {
                for (CameraListener removeListener : this.mCamListeners) {
                    removeListener(removeListener);
                }
                this.mCamListeners.clear();
                return;
            }
            Log.e("CameraStreamer", "Could not tear-down CameraStreamer as camera still seems to be running!");
        }

        private final void onUpdate() {
            if (this.mState.current() == 1) {
                pushEvent(3, true);
                pushEvent(1, true);
            }
        }

        private final void onUpdateOrientation(int i) {
            int i2;
            if (this.mActualFacing == 1) {
                i2 = (this.mCamOrientation + i) % 360;
            } else {
                i2 = ((this.mCamOrientation - i) + 360) % 360;
            }
            if (i2 != this.mCamRotation) {
                synchronized (this) {
                    this.mCamRotation = i2;
                }
            }
            if (this.mActualFacing == 1 && this.mCamFrameHandler.isFrontMirrored()) {
                i2 = (360 - i2) % 360;
            }
            if (this.mOrientation != i2) {
                this.mOrientation = i2;
                this.mCamFrameHandler.onUpdateCameraOrientation(this.mOrientation);
            }
        }

        private final void openCamera() {
            try {
                if (CameraStreamer.mCameraLock.tryLock(5, TimeUnit.SECONDS)) {
                    Object obj = new Object();
                    this.mExternalCameraLock.lock(obj);
                    synchronized (this) {
                        updateCamera();
                        updateRotation();
                        this.mCamFrameHandler.setupServerFrame();
                    }
                    this.mCamera.startPreview();
                    synchronized (this.mCamListeners) {
                        for (CameraListener onCameraOpened : this.mCamListeners) {
                            onCameraOpened.onCameraOpened(CameraStreamer.this);
                        }
                    }
                    this.mExternalCameraLock.unlock(obj);
                    this.mCameraReadyLock.lock();
                    this.mCameraReady.signal();
                    this.mCameraReadyLock.unlock();
                    return;
                }
                throw new RuntimeException("Timed out while waiting to acquire camera!");
            } catch (InterruptedException e) {
                throw new RuntimeException("Interrupted while waiting to acquire camera!");
            }
        }

        public final void pushEvent(int i, boolean z) {
            if (z) {
                try {
                    this.mEventQueue.put(new Event(i));
                    return;
                } catch (InterruptedException e) {
                    StringBuilder stringBuilder = new StringBuilder(27);
                    stringBuilder.append("Dropping event ");
                    stringBuilder.append(i);
                    stringBuilder.append("!");
                    Log.e("CameraStreamer", stringBuilder.toString());
                    return;
                }
            }
            this.mEventQueue.offer(new Event(i));
        }

        public final void releaseRecorder() {
            MediaRecorder mediaRecorder = this.mRecorder;
            if (mediaRecorder == null) {
                throw new RuntimeException("No recorder created");
            }
            mediaRecorder.release();
            this.mRecorder = null;
            this.mCamera.lock();
            unlockCamera(this);
        }

        public final void removeListener(CameraListener cameraListener) {
            synchronized (this.mCamListeners) {
                this.mCamListeners.remove(cameraListener);
            }
        }

        public final void run() {
            loop();
        }

        public final synchronized void setDesiredFrameRate(int i) {
            if (i != this.mRequestedFramesPerSec) {
                this.mRequestedFramesPerSec = i;
                onParamsUpdated();
            }
        }

        public final synchronized void setDesiredPictureSize(int i, int i2) {
            if (!(i == this.mRequestedPictureWidth && i2 == this.mRequestedPictureHeight)) {
                this.mRequestedPictureWidth = i;
                this.mRequestedPictureHeight = i2;
                onParamsUpdated();
            }
        }

        public final synchronized void setDesiredPreviewSize(int i, int i2) {
            if (!(i == this.mRequestedPreviewWidth && i2 == this.mRequestedPreviewHeight)) {
                this.mRequestedPreviewWidth = i;
                this.mRequestedPreviewHeight = i2;
                onParamsUpdated();
            }
        }

        public final synchronized void setFacing(int i) {
            if (i != this.mRequestedFacing) {
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                        this.mRequestedFacing = i;
                        onParamsUpdated();
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder(55);
                        stringBuilder.append("Unknown facing value '");
                        stringBuilder.append(i);
                        stringBuilder.append("' passed to setFacing!");
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }

        public final synchronized void setFlashMode(String str) {
            if (!str.equals(this.mFlashMode)) {
                this.mFlashMode = str;
                onParamsUpdated();
            }
        }

        public final synchronized void setFlipFrontCamera(boolean z) {
            if (this.mFlipFront != z) {
                this.mFlipFront = z;
            }
        }

        public final void signalNewFrame() {
            pushEvent(2, false);
        }

        public final void startRecording() {
            MediaRecorder mediaRecorder = this.mRecorder;
            if (mediaRecorder == null) {
                throw new RuntimeException("No recorder created");
            }
            mediaRecorder.start();
        }

        public final void stopRecording() {
            MediaRecorder mediaRecorder = this.mRecorder;
            if (mediaRecorder == null) {
                throw new RuntimeException("No recorder created");
            }
            mediaRecorder.stop();
        }

        public final synchronized boolean supportsHardwareFaceDetection() {
            return true;
        }

        public final void unlockCamera(Object obj) {
            this.mExternalCameraLock.unlock(obj);
        }

        private final void updateCamera() {
            synchronized (this.mState) {
                this.mCamId = getCameraId();
                updateCameraOrientation(this.mCamId);
                this.mCamera = Camera.open(this.mCamId);
                initCameraParameters();
            }
        }

        private final void updateCameraOrientation(int i) {
            int i2 = 1;
            CameraInfo cameraInfo = new CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            this.mCamOrientation = cameraInfo.orientation;
            this.mOrientation = -1;
            if (cameraInfo.facing != 1) {
                i2 = 2;
            }
            this.mActualFacing = i2;
        }

        private final synchronized void updateDisplayRotation(int i) {
            switch (i) {
                case 0:
                    onUpdateOrientation(0);
                    break;
                case 1:
                    onUpdateOrientation(90);
                    break;
                case 2:
                    onUpdateOrientation(MediaDecoder.ROTATE_180);
                    break;
                case 3:
                    onUpdateOrientation(MediaDecoder.ROTATE_90_LEFT);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported display rotation constant! Use one of the Surface.ROTATION_ constants!");
            }
        }

        private final void updateRotation() {
            Display display = this.mDisplay;
            if (display != null) {
                updateDisplayRotation(display.getRotation());
            }
        }
    }

    /* compiled from: PG */
    class Event {
        public static final int FRAME = 2;
        public static final int HALT = 4;
        public static final int RESTART = 5;
        public static final int START = 1;
        public static final int STOP = 3;
        public static final int TEARDOWN = 7;
        public static final int UPDATE = 6;
        public int code;

        public Event(int i) {
            this.code = i;
        }
    }

    /* compiled from: PG */
    class State {
        public static final int STATE_HALTED = 3;
        public static final int STATE_RUNNING = 1;
        public static final int STATE_STOPPED = 2;
        public AtomicInteger mCurrent;

        private State() {
            this.mCurrent = new AtomicInteger(2);
        }

        public int current() {
            return this.mCurrent.get();
        }

        public void set(int i) {
            this.mCurrent.set(i);
        }
    }

    @TargetApi(9)
    /* compiled from: PG */
    final class CamFrameHandlerGB extends CamFrameHandler {
        public final Object mBufferLock;
        public byte[] mFrameBufferBack;
        public byte[] mFrameBufferFront;
        public String mNV21ToRGBAFragment;
        public String mNV21ToRGBAVertex;
        public PreviewCallback mPreviewCallback;
        public SurfaceView mSurfaceView;
        public float[] mTargetCoords;
        public boolean mWriteToBack;

        /* compiled from: PG */
        /* renamed from: com.google.android.libraries.smartburst.filterfw.CameraStreamer$CamFrameHandlerGB$1 */
        class C00581 implements PreviewCallback {
            C00581() {
            }

            public void onPreviewFrame(byte[] bArr, Camera camera) {
                CamFrameHandlerGB.this.swapBuffers();
                camera.addCallbackBuffer(CamFrameHandlerGB.this.writeBuffer());
                CamFrameHandlerGB.this.mRunner.signalNewFrame();
            }
        }

        private CamFrameHandlerGB() {
            super();
            this.mWriteToBack = true;
            this.mTargetCoords = new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
            this.mBufferLock = new Object();
            this.mNV21ToRGBAFragment = "precision mediump float;\n\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_y_texcoord;\nvarying vec2 v_vu_texcoord;\nvarying vec2 v_pixcoord;\n\nvec3 select(vec4 yyyy, vec4 vuvu, int s) {\n  if (s == 0) {\n    return vec3(yyyy.r, vuvu.g, vuvu.r);\n  } else if (s == 1) {\n    return vec3(yyyy.g, vuvu.g, vuvu.r);\n } else if (s == 2) {\n    return vec3(yyyy.b, vuvu.a, vuvu.b);\n  } else  {\n    return vec3(yyyy.a, vuvu.a, vuvu.b);\n  }\n}\n\nvec3 yuv2rgb(vec3 yuv) {\n  mat4 conversion = mat4(1.0,  0.0,    1.402, -0.701,\n                         1.0, -0.344, -0.714,  0.529,\n                         1.0,  1.772,  0.0,   -0.886,\n                         0, 0, 0, 0);  return (vec4(yuv, 1.0) * conversion).rgb;\n}\n\nvoid main() {\n  vec4 yyyy = texture2D(tex_sampler_0, v_y_texcoord);\n  vec4 vuvu = texture2D(tex_sampler_0, v_vu_texcoord);\n  int s = int(mod(floor(v_pixcoord.x), 4.0));\n  vec3 yuv = select(yyyy, vuvu, s);\n  vec3 rgb = yuv2rgb(yuv);\n  gl_FragColor = vec4(rgb, 1.0);\n}";
            this.mNV21ToRGBAVertex = "attribute vec4 a_position;\nattribute vec2 a_y_texcoord;\nattribute vec2 a_vu_texcoord;\nattribute vec2 a_pixcoord;\nvarying vec2 v_y_texcoord;\nvarying vec2 v_vu_texcoord;\nvarying vec2 v_pixcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_y_texcoord = a_y_texcoord;\n  v_vu_texcoord = a_vu_texcoord;\n  v_pixcoord = a_pixcoord;\n}\n";
            this.mPreviewCallback = new C00581();
        }

        private final void checkCameraDimensions() {
            if (this.mCameraWidth % 4 != 0) {
                throw new RuntimeException("Camera width must be a multiple of 4!");
            } else if (this.mCameraHeight % 2 != 0) {
                throw new RuntimeException("Camera height must be a multiple of 2!");
            }
        }

        protected final ImageShader createClientShader() {
            ImageShader imageShader = new ImageShader(this.mNV21ToRGBAVertex, this.mNV21ToRGBAFragment);
            float[] fArr = new float[]{0.0f, 0.6666667f, 1.0f, 0.6666667f, 0.0f, 1.0f, 1.0f, 1.0f};
            imageShader.setAttributeValues("a_y_texcoord", new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.6666667f, 1.0f, 0.6666667f}, 2);
            imageShader.setAttributeValues("a_vu_texcoord", fArr, 2);
            return imageShader;
        }

        protected final TextureSource createClientTexture() {
            TextureSource newTexture = TextureSource.newTexture();
            newTexture.setParameter(10240, FilterModes.NEAREST);
            newTexture.setParameter(10241, FilterModes.NEAREST);
            return newTexture;
        }

        private final SurfaceView getPreviewDisplay() {
            if (this.mSurfaceView == null) {
                this.mSurfaceView = this.mRunner.getContext().getDummySurfaceView();
            }
            return this.mSurfaceView;
        }

        public final void grabFrame(FrameImage2D frameImage2D, Scaler scaler) {
            EGLContext currentContext = RenderTarget.currentContext();
            TextureSource textureForContext = textureForContext(currentContext);
            int i = this.mCameraWidth / 4;
            int i2 = this.mCameraHeight + (this.mCameraHeight / 2);
            synchronized (this.mBufferLock) {
                textureForContext.allocateWithPixels(ByteBuffer.wrap(readBuffer()), i, i2);
            }
            textureForContext.setParameter(10240, FilterModes.NEAREST);
            textureForContext.setParameter(10241, FilterModes.NEAREST);
            ImageShader shaderForContext = shaderForContext(currentContext);
            shaderForContext.setTargetCoords(this.mTargetCoords);
            updateShaderPixelSize(shaderForContext);
            frameImage2D.resize(new int[]{this.mOutWidth, this.mOutHeight});
            shaderForContext.process(textureForContext, frameImage2D.lockRenderTarget(), this.mOutWidth, this.mOutHeight);
            frameImage2D.unlock();
        }

        private final void informClients() {
            synchronized (this.mClients) {
                Iterator it = this.mClients.iterator();
                while (it.hasNext()) {
                    ((VideoFrameConsumer) it.next()).onVideoFrameAvailable(CameraStreamer.this, 0);
                }
            }
        }

        public final boolean isFrontMirrored() {
            return false;
        }

        public final void onUpdateCameraOrientation(int i) {
            super.onUpdateCameraOrientation(i);
            if (this.mRunner.mActualFacing == 1 && this.mRunner.mFlipFront) {
                switch (i) {
                    case 0:
                        this.mTargetCoords = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
                        return;
                    case 90:
                        this.mTargetCoords = new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
                        return;
                    case MediaDecoder.ROTATE_180 /*180*/:
                        this.mTargetCoords = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
                        return;
                    case MediaDecoder.ROTATE_90_LEFT /*270*/:
                        this.mTargetCoords = new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};
                        return;
                    default:
                        return;
                }
            }
            switch (i) {
                case 0:
                    this.mTargetCoords = new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
                    return;
                case 90:
                    this.mTargetCoords = new float[]{1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
                    return;
                case MediaDecoder.ROTATE_180 /*180*/:
                    this.mTargetCoords = new float[]{1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};
                    return;
                case MediaDecoder.ROTATE_90_LEFT /*270*/:
                    this.mTargetCoords = new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
                    return;
                default:
                    return;
            }
        }

        private final byte[] readBuffer() {
            byte[] bArr;
            synchronized (this.mBufferLock) {
                bArr = !this.mWriteToBack ? this.mFrameBufferBack : this.mFrameBufferFront;
            }
            return bArr;
        }

        public final void release() {
            this.mFrameBufferBack = null;
            this.mFrameBufferFront = null;
        }

        public final void setupServerFrame() {
            checkCameraDimensions();
            Camera access$100 = this.mRunner.mCamera;
            int i = this.mCameraWidth * (this.mCameraHeight + (this.mCameraHeight / 2));
            this.mFrameBufferFront = new byte[i];
            this.mFrameBufferBack = new byte[i];
            access$100.addCallbackBuffer(writeBuffer());
            access$100.setPreviewCallbackWithBuffer(this.mPreviewCallback);
            SurfaceView previewDisplay = getPreviewDisplay();
            if (previewDisplay != null) {
                try {
                    access$100.setPreviewDisplay(previewDisplay.getHolder());
                } catch (IOException e) {
                    throw new RuntimeException("Could not start camera with given preview display!");
                }
            }
        }

        private final synchronized void swapBuffers() {
            synchronized (this.mBufferLock) {
                this.mWriteToBack ^= 1;
            }
        }

        public final void updateServerFrame() {
            informClients();
        }

        private final void updateShaderPixelSize(ImageShader imageShader) {
            imageShader.setAttributeValues("a_pixcoord", new float[]{0.0f, 0.0f, (float) this.mCameraWidth, 0.0f, 0.0f, (float) this.mCameraHeight, (float) this.mCameraWidth, (float) this.mCameraHeight}, 2);
        }

        private final byte[] writeBuffer() {
            byte[] bArr;
            synchronized (this.mBufferLock) {
                bArr = !this.mWriteToBack ? this.mFrameBufferFront : this.mFrameBufferBack;
            }
            return bArr;
        }
    }

    @TargetApi(15)
    /* compiled from: PG */
    class CamFrameHandlerICS extends CamFrameHandler {
        public static final String mCopyShaderSource = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n";
        public float[] mCameraTransform;
        public HashMap mClientRenderTargets;
        public ImageShader mCopyShader;
        public OnFrameAvailableListener mOnCameraFrameListener;
        public SurfaceTexture mPreviewSurfaceTexture;
        public TextureSource mPreviewTexture;
        public HashMap mTargetSurfaceTextures;

        /* compiled from: PG */
        /* renamed from: com.google.android.libraries.smartburst.filterfw.CameraStreamer$CamFrameHandlerICS$2 */
        class C00602 implements OnFrameAvailableListener {
            C00602() {
            }

            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                CamFrameHandlerICS.this.mRunner.signalNewFrame();
            }
        }

        private CamFrameHandlerICS() {
            super();
            this.mCameraTransform = new float[16];
            this.mPreviewTexture = null;
            this.mPreviewSurfaceTexture = null;
            this.mTargetSurfaceTextures = new HashMap();
            this.mClientRenderTargets = new HashMap();
            this.mCopyShader = null;
            this.mOnCameraFrameListener = new C00602();
        }

        protected ImageShader createClientShader() {
            return new ImageShader("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n");
        }

        protected TextureSource createClientTexture() {
            return TextureSource.newExternalTexture();
        }

        protected void distributeFrames() {
            updateTransform(getCopyShader());
            updateShaderTargetRect(getCopyShader());
            for (SurfaceTexture renderTargetFor : this.mTargetSurfaceTextures.values()) {
                RenderTarget renderTargetFor2 = renderTargetFor(renderTargetFor);
                renderTargetFor2.focus();
                getCopyShader().process(this.mPreviewTexture, renderTargetFor2, this.mOutWidth, this.mOutHeight);
                GLToolbox.checkGlError("distribute frames");
                renderTargetFor2.swapBuffers();
            }
        }

        protected ImageShader getCopyShader() {
            if (this.mCopyShader == null) {
                this.mCopyShader = new ImageShader("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n");
            }
            return this.mCopyShader;
        }

        public synchronized void grabFrame(FrameImage2D frameImage2D, Scaler scaler) {
            EGLContext currentContext = RenderTarget.currentContext();
            TextureSource textureForContext = textureForContext(currentContext);
            ImageShader shaderForContext = shaderForContext(currentContext);
            SurfaceTexture surfaceTextureForContext = surfaceTextureForContext(currentContext);
            if (textureForContext == null || shaderForContext == null || surfaceTextureForContext == null) {
                String valueOf = String.valueOf(Thread.currentThread());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 54);
                stringBuilder.append("Attempting to grab camera frame from unknown thread: ");
                stringBuilder.append(valueOf);
                stringBuilder.append("!");
                throw new RuntimeException(stringBuilder.toString());
            }
            surfaceTextureForContext.updateTexImage();
            int[] scale = scaler.scale(this.mOutWidth, this.mOutHeight);
            frameImage2D.resize(scale);
            shaderForContext.process(textureForContext, frameImage2D.lockRenderTarget(), scale[0], scale[1]);
            frameImage2D.setTimestamp(this.mPreviewSurfaceTexture.getTimestamp());
            frameImage2D.unlock();
        }

        protected void onCleanupContext(EGLContext eGLContext) {
            super.onCleanupContext(eGLContext);
            SurfaceTexture surfaceTexture = (SurfaceTexture) this.mTargetSurfaceTextures.get(eGLContext);
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.mTargetSurfaceTextures.remove(eGLContext);
            }
        }

        public synchronized void onRegisterClient(VideoFrameConsumer videoFrameConsumer, EGLContext eGLContext) {
            final Set clientsForContext = clientsForContext(eGLContext);
            textureForContext(eGLContext);
            shaderForContext(eGLContext);
            surfaceTextureForContext(eGLContext).setOnFrameAvailableListener(new OnFrameAvailableListener() {
                public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    long timestamp = CamFrameHandlerICS.this.mPreviewSurfaceTexture.getTimestamp();
                    for (VideoFrameConsumer onVideoFrameAvailable : clientsForContext) {
                        onVideoFrameAvailable.onVideoFrameAvailable(CameraStreamer.this, timestamp);
                    }
                }
            });
        }

        public void onUpdateCameraOrientation(int i) {
            super.onUpdateCameraOrientation(i);
            this.mRunner.mCamera.setDisplayOrientation(i);
            updateSurfaceTextureSizes();
        }

        public synchronized void release() {
            TextureSource textureSource = this.mPreviewTexture;
            if (textureSource != null) {
                textureSource.release();
                this.mPreviewTexture = null;
            }
            SurfaceTexture surfaceTexture = this.mPreviewSurfaceTexture;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.mPreviewSurfaceTexture = null;
            }
        }

        protected RenderTarget renderTargetFor(SurfaceTexture surfaceTexture) {
            RenderTarget renderTarget = (RenderTarget) this.mClientRenderTargets.get(surfaceTexture);
            if (renderTarget != null) {
                return renderTarget;
            }
            renderTarget = RenderTarget.currentTarget().forSurfaceTexture(surfaceTexture);
            this.mClientRenderTargets.put(surfaceTexture, renderTarget);
            return renderTarget;
        }

        protected void setupPreviewTexture(Camera camera) {
            if (this.mPreviewTexture == null) {
                this.mPreviewTexture = TextureSource.newExternalTexture();
            }
            if (this.mPreviewSurfaceTexture == null) {
                this.mPreviewSurfaceTexture = new SurfaceTexture(this.mPreviewTexture.getTextureId());
                try {
                    camera.setPreviewTexture(this.mPreviewSurfaceTexture);
                    this.mPreviewSurfaceTexture.setOnFrameAvailableListener(this.mOnCameraFrameListener);
                } catch (IOException e) {
                    String message = e.getMessage();
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(message).length() + 40);
                    stringBuilder.append("Could not bind camera surface texture: ");
                    stringBuilder.append(message);
                    stringBuilder.append("!");
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
        }

        public synchronized void setupServerFrame() {
            setupPreviewTexture(this.mRunner.mCamera);
        }

        protected SurfaceTexture surfaceTextureForContext(EGLContext eGLContext) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) this.mTargetSurfaceTextures.get(eGLContext);
            if (surfaceTexture != null) {
                return surfaceTexture;
            }
            TextureSource textureForContext = textureForContext(eGLContext);
            if (textureForContext == null) {
                return surfaceTexture;
            }
            surfaceTexture = new SurfaceTexture(textureForContext.getTextureId());
            surfaceTexture.setDefaultBufferSize(this.mOutWidth, this.mOutHeight);
            this.mTargetSurfaceTextures.put(eGLContext, surfaceTexture);
            return surfaceTexture;
        }

        public synchronized void updateServerFrame() {
            this.mPreviewSurfaceTexture.updateTexImage();
            distributeFrames();
        }

        protected void updateShaderTargetRect(ImageShader imageShader) {
            if (this.mRunner.mActualFacing == 1 && this.mRunner.mFlipFront) {
                imageShader.setTargetRect(1.0f, 0.0f, -1.0f, 1.0f);
            } else {
                imageShader.setTargetRect(0.0f, 0.0f, 1.0f, 1.0f);
            }
        }

        protected synchronized void updateSurfaceTextureSizes() {
            for (SurfaceTexture defaultBufferSize : this.mTargetSurfaceTextures.values()) {
                defaultBufferSize.setDefaultBufferSize(this.mOutWidth, this.mOutHeight);
            }
        }

        protected void updateTransform(ImageShader imageShader) {
            this.mPreviewSurfaceTexture.getTransformMatrix(this.mCameraTransform);
            imageShader.setSourceTransform(this.mCameraTransform);
        }
    }

    @TargetApi(16)
    /* compiled from: PG */
    class CamFrameHandlerJB extends CamFrameHandlerICS {
        private CamFrameHandlerJB() {
            super();
        }

        public synchronized void grabFrame(FrameImage2D frameImage2D, Scaler scaler) {
            TextureSource newExternalTexture = TextureSource.newExternalTexture();
            ImageShader shaderForContext = shaderForContext(RenderTarget.currentContext());
            if (newExternalTexture == null || shaderForContext == null) {
                String valueOf = String.valueOf(Thread.currentThread());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 54);
                stringBuilder.append("Attempting to grab camera frame from unknown thread: ");
                stringBuilder.append(valueOf);
                stringBuilder.append("!");
                throw new RuntimeException(stringBuilder.toString());
            }
            this.mPreviewSurfaceTexture.attachToGLContext(newExternalTexture.getTextureId());
            updateTransform(shaderForContext);
            updateShaderTargetRect(shaderForContext);
            int[] scale = scaler.scale(this.mOutWidth, this.mOutHeight);
            frameImage2D.resize(scale);
            shaderForContext.process(newExternalTexture, frameImage2D.lockRenderTarget(), scale[0], scale[1]);
            frameImage2D.setTimestamp(this.mPreviewSurfaceTexture.getTimestamp());
            frameImage2D.unlock();
            this.mPreviewSurfaceTexture.detachFromGLContext();
            newExternalTexture.release();
        }

        protected void informClients() {
            synchronized (this.mClients) {
                long timestamp = this.mPreviewSurfaceTexture.getTimestamp();
                Iterator it = this.mClients.iterator();
                while (it.hasNext()) {
                    ((VideoFrameConsumer) it.next()).onVideoFrameAvailable(CameraStreamer.this, timestamp);
                }
            }
        }

        public void onRegisterClient(VideoFrameConsumer videoFrameConsumer, EGLContext eGLContext) {
        }

        protected void setupPreviewTexture(Camera camera) {
            super.setupPreviewTexture(camera);
            this.mPreviewSurfaceTexture.detachFromGLContext();
        }

        public void setupServerFrame() {
            setupPreviewTexture(this.mRunner.mCamera);
        }

        public synchronized void updateServerFrame() {
            updateSurfaceTexture();
            informClients();
        }

        protected void updateShaderTargetRect(ImageShader imageShader) {
            if (this.mRunner.mActualFacing == 1 && this.mRunner.mFlipFront) {
                imageShader.setTargetRect(1.0f, 1.0f, -1.0f, -1.0f);
            } else {
                imageShader.setTargetRect(0.0f, 1.0f, 1.0f, -1.0f);
            }
        }

        protected void updateSurfaceTexture() {
            this.mPreviewSurfaceTexture.attachToGLContext(this.mPreviewTexture.getTextureId());
            this.mPreviewSurfaceTexture.updateTexImage();
            this.mPreviewSurfaceTexture.detachFromGLContext();
        }
    }

    CameraStreamer(MffContext mffContext) {
        this.mCameraRunner = new CameraRunnable(mffContext);
    }

    public void addListener(CameraListener cameraListener) {
        this.mCameraRunner.addListener(cameraListener);
    }

    public void addVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer) {
        this.mCameraRunner.getCamFrameHandler().registerClient(videoFrameConsumer);
    }

    public void bindToDisplay(Display display) {
        this.mCameraRunner.bindToDisplay(display);
    }

    public boolean canStart() {
        return this.mCameraRunner.canStart();
    }

    public void close() {
        if (this.mIsClosed.compareAndSet(false, true)) {
            stop();
            tearDown();
        }
    }

    public void createRecorder(String str, CamcorderProfile camcorderProfile) {
        this.mCameraRunner.createRecorder(str, camcorderProfile);
    }

    @Deprecated
    public Camera getCamera() {
        return this.mCameraRunner.getCamera();
    }

    public int getCameraFacing() {
        return this.mCameraRunner.getCameraFacing();
    }

    public int getCameraFrameRate() {
        return this.mCameraRunner.getCameraFrameRate();
    }

    public int getCameraHeight() {
        return this.mCameraRunner.getCameraHeight();
    }

    public int getCameraId() {
        return this.mCameraRunner.getCurrentCameraId();
    }

    public int getCameraRotation() {
        return this.mCameraRunner.getCameraRotation();
    }

    public int getCameraWidth() {
        return this.mCameraRunner.getCameraWidth();
    }

    public static int getDefaultFacing() {
        if (Camera.getNumberOfCameras() == 0) {
            return 0;
        }
        CameraInfo cameraInfo = new CameraInfo();
        Camera.getCameraInfo(0, cameraInfo);
        return cameraInfo.facing != 1 ? 2 : 1;
    }

    public long getDurationNs() {
        return Long.MAX_VALUE;
    }

    public String getFlashMode() {
        return this.mCameraRunner.getFlashMode();
    }

    public boolean getLatestFrame(FrameImage2D frameImage2D, Scaler scaler) {
        return this.mCameraRunner.grabFrame(frameImage2D, scaler);
    }

    public static int getNumberOfCameras() {
        return Camera.getNumberOfCameras();
    }

    public boolean grabVideoFrame(FrameImage2D frameImage2D, FrameValue frameValue, Scaler scaler) {
        if (!this.mCameraRunner.grabFrame(frameImage2D, scaler)) {
            return false;
        }
        if (frameValue != null) {
            frameValue.setValue(new VideoFrameInfo(false));
        }
        return true;
    }

    void halt() {
        this.mCameraRunner.pushEvent(4, true);
    }

    public boolean isRunning() {
        return this.mCameraRunner.isRunning();
    }

    public Camera lockCamera(Object obj) {
        return this.mCameraRunner.lockCamera(obj);
    }

    public void releaseRecorder() {
        this.mCameraRunner.releaseRecorder();
    }

    public void removeListener(CameraListener cameraListener) {
        this.mCameraRunner.removeListener(cameraListener);
    }

    public void removeVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer) {
        this.mCameraRunner.getCamFrameHandler().unregisterClient(videoFrameConsumer);
    }

    static boolean requireDummySurfaceView() {
        return false;
    }

    void restart() {
        this.mCameraRunner.pushEvent(5, true);
    }

    public void setDesiredFrameRate(int i) {
        this.mCameraRunner.setDesiredFrameRate(i);
    }

    public void setDesiredPictureSize(int i, int i2) {
        this.mCameraRunner.setDesiredPictureSize(i, i2);
    }

    public void setDesiredPreviewSize(int i, int i2) {
        this.mCameraRunner.setDesiredPreviewSize(i, i2);
    }

    public void setFacing(int i) {
        this.mCameraRunner.setFacing(i);
    }

    public void setFlashMode(String str) {
        this.mCameraRunner.setFlashMode(str);
    }

    public void setFlipFrontCamera(boolean z) {
        this.mCameraRunner.setFlipFrontCamera(z);
    }

    public void skipVideoFrame() {
    }

    public void start() {
        this.mCameraRunner.pushEvent(1, true);
    }

    public void startRecording() {
        this.mCameraRunner.startRecording();
    }

    public void stop() {
        this.mCameraRunner.pushEvent(3, true);
    }

    public void stopAndWait() {
        this.mCameraRunner.pushEvent(3, true);
        try {
            if (!mCameraLock.tryLock(5, TimeUnit.SECONDS)) {
                Log.w("CameraStreamer", "Time-out waiting for camera to close!");
            }
        } catch (InterruptedException e) {
            Log.w("CameraStreamer", "Interrupted while waiting for camera to close!");
        }
        mCameraLock.unlock();
    }

    public void stopRecording() {
        this.mCameraRunner.stopRecording();
    }

    public boolean supportsHardwareFaceDetection() {
        return this.mCameraRunner.supportsHardwareFaceDetection();
    }

    void tearDown() {
        this.mCameraRunner.pushEvent(7, true);
    }

    public void unlockCamera(Object obj) {
        this.mCameraRunner.unlockCamera(obj);
    }

    public void updateDisplayRotation(int i) {
        this.mCameraRunner.updateDisplayRotation(i);
    }
}
