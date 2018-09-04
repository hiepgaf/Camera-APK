package com.google.android.libraries.smartburst.filterfw;

import com.google.android.libraries.smartburst.filterfw.SurfaceFrameDistributor.Listener;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public class ConsumerFrameForwarder implements Listener {
    public final Set mConsumers = new HashSet();
    public final VideoFrameProvider mVideoFrameProvider;

    public ConsumerFrameForwarder(VideoFrameProvider videoFrameProvider) {
        this.mVideoFrameProvider = videoFrameProvider;
    }

    public synchronized void addConsumer(VideoFrameConsumer videoFrameConsumer) {
        this.mConsumers.add(videoFrameConsumer);
    }

    public synchronized void onFrameAvailable(long j) {
        for (VideoFrameConsumer onVideoFrameAvailable : this.mConsumers) {
            onVideoFrameAvailable.onVideoFrameAvailable(this.mVideoFrameProvider, j);
        }
    }

    public synchronized void removeConsumer(VideoFrameConsumer videoFrameConsumer) {
        this.mConsumers.remove(videoFrameConsumer);
    }

    public synchronized void sendStartNotification() {
        for (VideoFrameConsumer onVideoStreamStarted : this.mConsumers) {
            onVideoStreamStarted.onVideoStreamStarted();
        }
    }

    public synchronized void sendStopNotification() {
        for (VideoFrameConsumer onVideoStreamStopped : this.mConsumers) {
            onVideoStreamStopped.onVideoStreamStopped();
        }
    }
}
