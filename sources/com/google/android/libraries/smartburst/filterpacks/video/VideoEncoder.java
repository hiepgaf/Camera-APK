package com.google.android.libraries.smartburst.filterpacks.video;

import com.google.android.libraries.smartburst.filterfw.FrameImage2D;

/* compiled from: PG */
public interface VideoEncoder extends AutoCloseable {
    void close();

    void encodeFrame(FrameImage2D frameImage2D, long j);

    long getDurationMs();

    void initialize(String str, int i, int i2);
}
