package com.google.android.libraries.smartburst.filterpacks.video;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.Closeable;

/* compiled from: PG */
public interface Decoder extends Closeable {
    long decodeUntil(long j);

    MediaFormat getFormat();

    void openTrack(MediaExtractor mediaExtractor, int i);

    long seekTo(long j);

    void setTarget(DecoderTarget decoderTarget);
}
