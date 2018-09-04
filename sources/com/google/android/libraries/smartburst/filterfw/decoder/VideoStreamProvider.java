package com.google.android.libraries.smartburst.filterfw.decoder;

import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;

/* compiled from: PG */
public interface VideoStreamProvider extends VideoFrameProvider {
    long getDurationNs();

    void start();

    void stop();
}
