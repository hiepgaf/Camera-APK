package com.google.android.libraries.smartburst.filterfw;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.renderscript.RenderScript;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public class MffContext {
    public Context mApplicationContext = null;
    public CameraStreamer mCameraStreamer = null;
    public boolean mCameraStreamingSupport;
    public SurfaceView mDummySurfaceView = null;
    public boolean mGLSupport;
    public final Set mGraphs = new HashSet();
    public Handler mHandler = null;
    public boolean mPreserveFramesOnPause = false;
    public RenderScript mRenderScript;
    public final Set mRunners = new HashSet();
    public final State mState = new State();

    /* compiled from: PG */
    public class Config {
        public static final Config DEFAULT = new Builder().build();
        public final SurfaceView dummySurface;
        public final boolean forceNoGL;
        public final boolean requireCamera;
        public final boolean requireOpenGL;

        /* compiled from: PG */
        public class Builder {
            public SurfaceView mDummySurface = null;
            public boolean mForceNoGL = false;
            public boolean mRequireCamera = true;
            public boolean mRequireOpenGL = true;

            public Config build() {
                return new Config();
            }

            public Builder setDummySurface(SurfaceView surfaceView) {
                this.mDummySurface = surfaceView;
                return this;
            }

            public Builder setForceNoGL(boolean z) {
                this.mForceNoGL = z;
                return this;
            }

            public Builder setRequireCamera(boolean z) {
                this.mRequireCamera = z;
                return this;
            }

            public Builder setRequireOpenGL(boolean z) {
                this.mRequireOpenGL = z;
                return this;
            }
        }

        private Config(Builder builder) {
            this.requireCamera = builder.mRequireCamera;
            this.requireOpenGL = builder.mRequireOpenGL;
            this.dummySurface = builder.mDummySurface;
            this.forceNoGL = builder.mForceNoGL;
        }
    }

    /* compiled from: PG */
    class State {
        public static final int STATE_DESTROYED = 3;
        public static final int STATE_PAUSED = 2;
        public static final int STATE_RUNNING = 1;
        public int current;

        private State() {
            this.current = 1;
        }
    }

    public MffContext(Context context) {
        init(context, Config.DEFAULT);
    }

    public MffContext(Context context, Config config) {
        init(context, config);
    }

    void addGraph(FilterGraph filterGraph) {
        synchronized (this.mGraphs) {
            this.mGraphs.add(filterGraph);
        }
    }

    void addRunner(GraphRunner graphRunner) {
        synchronized (this.mRunners) {
            this.mRunners.add(graphRunner);
        }
    }

    final void assertOpenGLSupported() {
        if (!isOpenGLSupported()) {
            throw new RuntimeException("Attempting to use OpenGL ES 2 in a context that does not support it!");
        }
    }

    private SurfaceView createDummySurfaceView(Context context) {
        View surfaceView = new SurfaceView(context);
        surfaceView.getHolder().setType(3);
        Activity findActivityForContext = findActivityForContext(context);
        if (findActivityForContext != null) {
            findActivityForContext.addContentView(surfaceView, new LayoutParams(1, 1));
        } else {
            Log.w("MffContext", "Could not find activity for dummy surface! Consider specifying your own SurfaceView!");
        }
        return surfaceView;
    }

    private void createHandler() {
        if (Looper.myLooper() == null) {
            throw new RuntimeException("MffContext must be created in a thread with a Looper!");
        }
        this.mHandler = new Handler();
    }

    private void determineCameraSupport(Config config) {
        boolean z;
        if (CameraStreamer.getNumberOfCameras() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.mCameraStreamingSupport = z;
        if (config.requireCamera && !this.mCameraStreamingSupport) {
            throw new RuntimeException("Cannot create context that requires a camera on this platform!");
        }
    }

    private void determineGLSupport(Context context, Config config) {
        if (config.forceNoGL) {
            this.mGLSupport = false;
            return;
        }
        this.mGLSupport = getPlatformSupportsGLES2(context);
        if (config.requireOpenGL && !this.mGLSupport) {
            throw new RuntimeException("Cannot create context that requires GL support on this platform!");
        }
    }

    private void fetchDummySurfaceView(Context context, Config config) {
        if (config.requireCamera && CameraStreamer.requireDummySurfaceView()) {
            SurfaceView surfaceView = config.dummySurface;
            if (surfaceView == null) {
                surfaceView = createDummySurfaceView(context);
            }
            this.mDummySurfaceView = surfaceView;
        }
    }

    private Activity findActivityForContext(Context context) {
        return context instanceof Activity ? (Activity) context : null;
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public CameraStreamer getCameraStreamer() {
        if (this.mCameraStreamer == null) {
            this.mCameraStreamer = new CameraStreamer(this);
        }
        return this.mCameraStreamer;
    }

    SurfaceView getDummySurfaceView() {
        return this.mDummySurfaceView;
    }

    private static boolean getPlatformSupportsGLES2(Context context) {
        return ((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 131072;
    }

    public boolean getPreserveFramesOnPause() {
        return this.mPreserveFramesOnPause;
    }

    @TargetApi(11)
    public final RenderScript getRenderScript() {
        if (this.mRenderScript == null) {
            this.mRenderScript = RenderScript.create(this.mApplicationContext);
        }
        return this.mRenderScript;
    }

    private void init(Context context, Config config) {
        determineGLSupport(context, config);
        determineCameraSupport(config);
        createHandler();
        this.mApplicationContext = context.getApplicationContext();
        fetchDummySurfaceView(context, config);
    }

    public final boolean isCameraStreamingSupported() {
        return this.mCameraStreamingSupport;
    }

    public final boolean isOpenGLSupported() {
        return this.mGLSupport;
    }

    @TargetApi(11)
    private void maybeDestroyRenderScript() {
        RenderScript renderScript = this.mRenderScript;
        if (renderScript != null) {
            renderScript.destroy();
            this.mRenderScript = null;
        }
    }

    public void onPause() {
        synchronized (this.mState) {
            if (this.mState.current == 1) {
                CameraStreamer cameraStreamer = this.mCameraStreamer;
                if (cameraStreamer != null) {
                    cameraStreamer.halt();
                }
                stopRunners(true);
                this.mState.current = 2;
            }
        }
    }

    public void onResume() {
        synchronized (this.mState) {
            if (this.mState.current == 2) {
                resumeRunners();
                resumeCamera();
                this.mState.current = 1;
            }
        }
    }

    void postRunnable(Runnable runnable) {
        this.mHandler.post(runnable);
    }

    public void release() {
        synchronized (this.mState) {
            if (this.mState.current != 3) {
                CameraStreamer cameraStreamer = this.mCameraStreamer;
                if (cameraStreamer != null) {
                    cameraStreamer.stop();
                    this.mCameraStreamer.tearDown();
                }
                maybeDestroyRenderScript();
                stopRunners(false);
                waitUntilStopped();
                tearDown();
                this.mState.current = 3;
            }
        }
    }

    void removeGraph(FilterGraph filterGraph) {
        synchronized (this.mGraphs) {
            this.mGraphs.remove(filterGraph);
        }
    }

    private void resumeCamera() {
        CameraStreamer cameraStreamer = this.mCameraStreamer;
        if (cameraStreamer != null) {
            cameraStreamer.restart();
        }
    }

    private void resumeRunners() {
        synchronized (this.mRunners) {
            for (GraphRunner restart : this.mRunners) {
                restart.restart();
            }
        }
    }

    public static void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
        RenderTarget.setEGLConfigChooser(i, i2, i3, i4, i5, i6);
    }

    public void setPreserveFramesOnPause(boolean z) {
        this.mPreserveFramesOnPause = z;
    }

    private void stopRunners(boolean z) {
        synchronized (this.mRunners) {
            for (GraphRunner graphRunner : this.mRunners) {
                if (z) {
                    graphRunner.halt();
                } else {
                    graphRunner.stop();
                }
            }
            if (!this.mPreserveFramesOnPause) {
                for (GraphRunner graphRunner2 : this.mRunners) {
                    graphRunner2.flushFrames();
                }
            }
        }
    }

    private void tearDown() {
        Set<FilterGraph> hashSet = new HashSet();
        synchronized (this.mGraphs) {
            for (FilterGraph filterGraph : this.mGraphs) {
                if (!filterGraph.isSubGraph()) {
                    hashSet.add(filterGraph);
                }
            }
        }
        for (FilterGraph filterGraph2 : hashSet) {
            filterGraph2.tearDown();
        }
        for (GraphRunner tearDown : this.mRunners) {
            tearDown.tearDown();
        }
    }

    private void waitUntilStopped() {
        for (GraphRunner waitUntilStop : this.mRunners) {
            waitUntilStop.waitUntilStop();
        }
    }
}
