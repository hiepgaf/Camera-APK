package com.google.android.libraries.smartburst.filterfw;

/* compiled from: PG */
public interface VideoFrameConsumer {
    void onVideoFrameAvailable(VideoFrameProvider videoFrameProvider, long j);

    void onVideoStreamError(Exception exception);

    void onVideoStreamStarted();

    void onVideoStreamStopped();
}
