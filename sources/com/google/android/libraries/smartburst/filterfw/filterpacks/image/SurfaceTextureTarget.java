package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.ConditionVariable;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.RenderTarget;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.ViewFilter;

@TargetApi(14)
/* compiled from: PG */
public class SurfaceTextureTarget extends ViewFilter {
    public static final int MAX_WAIT_FOR_VIEW_TIME = 1000;
    public RenderTarget mRenderTarget = null;
    public ImageShader mShader = null;
    public SurfaceTexture mSurfaceTexture = null;
    public Rect mSurfaceTextureRect;
    public TextureView mView = null;
    public ConditionVariable mWaitForST = new ConditionVariable(true);

    /* compiled from: PG */
    class TextureListener implements SurfaceTextureListener {
        private TextureListener() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            SurfaceTextureTarget.this.setSurfaceTexture(surfaceTexture, i, i2);
            SurfaceTextureTarget.this.mWaitForST.open();
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            SurfaceTextureTarget.this.killSurfaceTexture();
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            SurfaceTextureTarget.this.updateSurfaceTexture(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public SurfaceTextureTarget(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    private void closeView() {
        this.mView.setSurfaceTextureListener(null);
    }

    public Signature getSignature() {
        return super.getSignature().addInputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2)).disallowOtherPorts();
    }

    private void killSurfaceTexture() {
        this.mSurfaceTexture = null;
        if (this.mView != null) {
            closeView();
            this.mView = null;
        }
    }

    public synchronized void onBindToView(View view) {
        if (view instanceof TextureView) {
            this.mView = (TextureView) view;
        } else {
            throw new IllegalArgumentException("View must be a TextureView!");
        }
    }

    protected void onClose() {
        RenderTarget renderTarget = this.mRenderTarget;
        if (renderTarget != null) {
            renderTarget.release();
            this.mRenderTarget = null;
        }
        if (this.mView != null) {
            closeView();
            this.mView = null;
        }
    }

    protected void onInputPortOpen(InputPort inputPort) {
        super.connectViewInputs(inputPort);
    }

    protected void onOpen() {
        if (this.mView != null) {
            openView();
        }
        if (this.mSurfaceTexture == null) {
            throw new NullPointerException("SurfaceTextureTarget has no SurfaceTexture!");
        }
        this.mRenderTarget = RenderTarget.currentTarget().forSurfaceTexture(this.mSurfaceTexture);
        this.mShader = ImageShader.createIdentity();
    }

    protected synchronized void onProcess() {
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            synchronized (surfaceTexture) {
                setupShader(this.mShader, new Rect(0, 0, asFrameImage2D.getWidth(), asFrameImage2D.getHeight()), this.mSurfaceTextureRect);
                this.mShader.process(asFrameImage2D.lockTextureSource(), this.mRenderTarget, this.mSurfaceTextureRect.width(), this.mSurfaceTextureRect.height());
                asFrameImage2D.unlock();
                this.mRenderTarget.swapBuffers();
            }
        }
    }

    private void openView() {
        if (this.mView.getSurfaceTextureListener() != null) {
            throw new RuntimeException("TextureView is already hooked up to another listener!");
        }
        this.mWaitForST.close();
        this.mView.setSurfaceTextureListener(new TextureListener());
        if (this.mView.isAvailable()) {
            setSurfaceTexture(this.mView.getSurfaceTexture(), this.mView.getWidth(), this.mView.getHeight());
            this.mWaitForST.open();
        }
        if (!this.mWaitForST.block(1000)) {
            throw new RuntimeException("Timed out waiting for TextureView to become available!");
        }
    }

    public synchronized void setSurfaceTexture(SurfaceTexture surfaceTexture, int i, int i2) {
        if (isRunning()) {
            throw new IllegalStateException("Cannot set SurfaceTexture while running!");
        }
        this.mSurfaceTexture = surfaceTexture;
        updateSurfaceTexture(i, i2);
    }

    public synchronized void updateSurfaceTexture(int i, int i2) {
        this.mSurfaceTextureRect = new Rect(0, 0, i, i2);
    }
}
