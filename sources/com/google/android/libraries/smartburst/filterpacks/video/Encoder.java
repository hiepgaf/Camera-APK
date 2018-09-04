package com.google.android.libraries.smartburst.filterpacks.video;

import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.Closeable;

/* compiled from: PG */
public interface Encoder extends DecoderTarget, Closeable {
    void open(MediaMuxer mediaMuxer, MediaFormat mediaFormat);
}
