package com.google.android.libraries.smartburst.filterpacks.video;

import android.media.MediaCodec.BufferInfo;

/* compiled from: PG */
public interface DecoderTarget {
    Object get();

    void onEndOfStream();

    void onNewFrameAvailable(BufferInfo bufferInfo);
}
