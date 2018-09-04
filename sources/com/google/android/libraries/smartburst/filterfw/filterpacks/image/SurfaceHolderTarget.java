package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.RenderTarget;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.ViewFilter;

/* compiled from: PG */
public class SurfaceHolderTarget extends ViewFilter {
    public boolean mHasSurface = false;
    public RenderTarget mRenderTarget = null;
    public ImageShader mShader = null;
    public SurfaceHolder mSurfaceHolder = null;
    public Callback mSurfaceHolderListener = new C00911();

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.filterpacks.image.SurfaceHolderTarget$1 */
    class C00911 implements Callback {
        C00911() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            SurfaceHolderTarget.this.onSurfaceCreated(surfaceHolder);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            SurfaceHolderTarget.this.onSurfaceCreated(surfaceHolder);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            SurfaceHolderTarget.this.onDestroySurface();
        }
    }

    public SurfaceHolderTarget(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return super.getSignature().addInputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2)).disallowOtherPorts();
    }

    public void onBindToView(View view) {
        if (view instanceof SurfaceView) {
            SurfaceHolder holder = ((SurfaceView) view).getHolder();
            if (holder == null) {
                String valueOf = String.valueOf(view);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 46);
                stringBuilder.append("Could not get SurfaceHolder from SurfaceView ");
                stringBuilder.append(valueOf);
                stringBuilder.append("!");
                throw new RuntimeException(stringBuilder.toString());
            }
            setSurfaceHolder(holder);
            return;
        }
        throw new IllegalArgumentException("View must be a SurfaceView!");
    }

    protected synchronized void onClose() {
        RenderTarget renderTarget = this.mRenderTarget;
        if (renderTarget != null) {
            renderTarget.unregisterAsDisplaySurface();
            this.mRenderTarget.release();
            this.mRenderTarget = null;
        }
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.mSurfaceHolderListener);
        }
    }

    public synchronized void onDestroySurface() {
        RenderTarget renderTarget = this.mRenderTarget;
        if (renderTarget != null) {
            renderTarget.release();
            this.mRenderTarget = null;
        }
        this.mHasSurface = false;
    }

    protected void onInputPortOpen(InputPort inputPort) {
        super.connectViewInputs(inputPort);
    }

    protected synchronized void onOpen() {
        boolean z = false;
        synchronized (this) {
            this.mSurfaceHolder.addCallback(this.mSurfaceHolderListener);
            Surface surface = this.mSurfaceHolder.getSurface();
            if (surface != null && surface.isValid()) {
                z = true;
            }
            this.mHasSurface = z;
        }
    }

    protected synchronized void onPrepare() {
        if (isOpenGLSupported()) {
            this.mShader = ImageShader.createIdentity();
        }
    }

    protected synchronized void onProcess() {
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        if (this.mHasSurface) {
            synchronized (this.mSurfaceHolder) {
                if (isOpenGLSupported()) {
                    renderGL(asFrameImage2D);
                } else {
                    renderCanvas(asFrameImage2D);
                }
            }
        }
    }

    private synchronized void onSurfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.mSurfaceHolder != surfaceHolder) {
            throw new RuntimeException("Unexpected Holder!");
        }
        this.mHasSurface = true;
    }

    private void renderCanvas(FrameImage2D frameImage2D) {
        Canvas lockCanvas = this.mSurfaceHolder.lockCanvas();
        Bitmap toBitmap = frameImage2D.toBitmap();
        Rect rect = new Rect(0, 0, toBitmap.getWidth(), toBitmap.getHeight());
        Rect surfaceFrame = this.mSurfaceHolder.getSurfaceFrame();
        RectF targetRect = getTargetRect(rect, surfaceFrame);
        lockCanvas.drawColor(-16777216);
        if (targetRect.width() > 0.0f && targetRect.height() > 0.0f) {
            lockCanvas.scale((float) surfaceFrame.width(), (float) surfaceFrame.height());
            lockCanvas.drawBitmap(toBitmap, rect, targetRect, new Paint());
        }
        this.mSurfaceHolder.unlockCanvasAndPost(lockCanvas);
    }

    private void renderGL(FrameImage2D frameImage2D) {
        if (this.mRenderTarget == null) {
            this.mRenderTarget = RenderTarget.currentTarget().forSurfaceHolder(this.mSurfaceHolder);
            this.mRenderTarget.registerAsDisplaySurface();
        }
        Rect rect = new Rect(0, 0, frameImage2D.getWidth(), frameImage2D.getHeight());
        Rect surfaceFrame = this.mSurfaceHolder.getSurfaceFrame();
        setupShader(this.mShader, rect, surfaceFrame);
        this.mShader.process(frameImage2D.lockTextureSource(), this.mRenderTarget, surfaceFrame.width(), surfaceFrame.height());
        frameImage2D.unlock();
        this.mRenderTarget.swapBuffers();
    }

    public synchronized void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        if (isRunning()) {
            throw new IllegalStateException("Cannot set SurfaceHolder while running!");
        }
        this.mSurfaceHolder = surfaceHolder;
    }
}
