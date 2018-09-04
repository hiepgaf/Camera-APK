package com.google.android.libraries.smartburst.filterfw;

/* compiled from: PG */
public interface AudioFrameProvider {
    void addAudioFrameConsumer(AudioFrameConsumer audioFrameConsumer);

    boolean grabAudioSamples(FrameValue frameValue);

    void removeAudioFrameConsumer(AudioFrameConsumer audioFrameConsumer);
}
