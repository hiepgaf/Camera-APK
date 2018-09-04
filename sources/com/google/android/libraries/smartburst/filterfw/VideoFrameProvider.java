package com.google.android.libraries.smartburst.filterfw;

import android.annotation.TargetApi;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;

@TargetApi(19)
/* compiled from: PG */
public interface VideoFrameProvider extends AutoCloseable {
    void addVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer);

    void close();

    boolean grabVideoFrame(FrameImage2D frameImage2D, FrameValue frameValue, Scaler scaler);

    void removeVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer);

    void skipVideoFrame();
}
