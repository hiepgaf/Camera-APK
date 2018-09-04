package com.google.android.libraries.smartburst.filterfw.filterpacks.audio;

import android.media.AudioTrack;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.decoder.AudioSample;

/* compiled from: PG */
public class Speaker extends Filter {
    public static final FrameType AUDIO_INPUT_TYPE = FrameType.single(AudioSample.class);
    public AudioTrack mAudioTrack;
    public int mChannelCount;
    public int mSampleRate;

    public Speaker(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("audio", 2, AUDIO_INPUT_TYPE).disallowOtherPorts();
    }

    protected void onProcess() {
        AudioSample audioSample = (AudioSample) getConnectedInputPort("audio").pullFrame().asFrameValue().getValue();
        if (audioSample != null) {
            AudioTrack audioTrack;
            int i = audioSample.sampleRate;
            if (!(i == this.mSampleRate && audioSample.channelCount == this.mChannelCount)) {
                int i2;
                this.mSampleRate = i;
                this.mChannelCount = audioSample.channelCount;
                audioTrack = this.mAudioTrack;
                if (audioTrack != null) {
                    audioTrack.release();
                }
                switch (this.mChannelCount) {
                    case 1:
                        i2 = 4;
                        break;
                    case 2:
                        i2 = 12;
                        break;
                    default:
                        throw new IllegalArgumentException("Only mono and stereo channel configurations are supported");
                }
                this.mAudioTrack = new AudioTrack(3, this.mSampleRate, i2, 2, AudioTrack.getMinBufferSize(this.mSampleRate, i2, 2), 1);
                if (this.mAudioTrack.getState() == 1) {
                    this.mAudioTrack.play();
                }
            }
            audioTrack = this.mAudioTrack;
            byte[] bArr = audioSample.bytes;
            audioTrack.write(bArr, 0, bArr.length);
        }
    }
}
