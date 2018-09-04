package com.google.android.libraries.smartburst.filterfw;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.libraries.smartburst.filterfw.decoder.VideoFrameInfo;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(19)
/* compiled from: PG */
public class SurfaceTextureStreamer implements VideoFrameProvider, AutoCloseable {
    public final ConsumerFrameForwarder mConsumers;
    public final Handler mDistributionHandler;
    public final HandlerThread mDistributionThread;
    public final SurfaceFrameDistributor mFrameDistributor;
    public final int mInputHeight;
    public final int mInputWidth;
    public final AtomicBoolean mIsClosed = new AtomicBoolean(false);
    public final AtomicBoolean mShuttingDown = new AtomicBoolean(false);
    public volatile SurfaceTexTransform mTransform;

    public SurfaceTextureStreamer(SurfaceTexture surfaceTexture, int i, int i2, SurfaceTexTransform surfaceTexTransform) {
        this.mInputWidth = i;
        this.mInputHeight = i2;
        this.mTransform = SurfaceTexTransform.identity();
        this.mDistributionThread = new HandlerThread("TextureStreamer");
        this.mDistributionThread.start();
        this.mConsumers = new ConsumerFrameForwarder(this);
        this.mDistributionHandler = new Handler(this.mDistributionThread.getLooper());
        this.mFrameDistributor = new SurfaceFrameDistributor(this.mConsumers, surfaceTexture, this.mDistributionHandler);
        this.mFrameDistributor.setup();
    }

    public void addVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer) {
        this.mConsumers.addConsumer(videoFrameConsumer);
    }

    public void close() {
        stopConsumers();
        if (this.mIsClosed.compareAndSet(false, true)) {
            this.mFrameDistributor.release();
            this.mShuttingDown.set(true);
            this.mDistributionThread.quitSafely();
        }
    }

    public boolean grabVideoFrame(FrameImage2D frameImage2D, FrameValue frameValue, Scaler scaler) {
        if (!this.mFrameDistributor.grabFrame(frameImage2D, this.mInputWidth, this.mInputHeight, this.mTransform, scaler)) {
            return false;
        }
        if (frameValue != null) {
            frameValue.setValue(new VideoFrameInfo(false));
        }
        return true;
    }

    public void initialize() {
    }

    public void removeVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer) {
        this.mConsumers.removeConsumer(videoFrameConsumer);
    }

    public void setTransform(SurfaceTexTransform surfaceTexTransform) {
        this.mTransform = surfaceTexTransform;
    }

    public void skipVideoFrame() {
    }

    public void start() {
        this.mFrameDistributor.start();
        this.mConsumers.sendStartNotification();
    }

    public void stop() {
        stopConsumers();
    }

    private void stopConsumers() {
        this.mConsumers.sendStopNotification();
        this.mFrameDistributor.stop();
    }

    public void waitForCommand() {
        if (this.mShuttingDown.get()) {
            try {
                this.mDistributionThread.join();
                return;
            } catch (InterruptedException e) {
                return;
            }
        }
        this.mFrameDistributor.waitForCommand();
    }
}
