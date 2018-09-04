package com.google.android.libraries.smartburst.filterfw.filterpacks.decoder;

import android.annotation.TargetApi;
import android.net.Uri;
import com.google.android.libraries.smartburst.filterfw.AudioFrameConsumer;
import com.google.android.libraries.smartburst.filterfw.AudioFrameProvider;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.VideoFrameConsumer;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import com.google.android.libraries.smartburst.filterfw.decoder.AudioSample;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import com.google.android.libraries.smartburst.filterfw.decoder.VideoFrameInfo;
import com.google.android.libraries.smartburst.filterfw.geometry.MultipleOfXScaler;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;

@TargetApi(16)
/* compiled from: PG */
public class MediaDecoderSource extends Filter implements AudioFrameConsumer, VideoFrameConsumer {
    public static final FrameType INPUT_ROTATION_TYPE = FrameType.single(Integer.TYPE);
    public static final FrameType INPUT_START_TYPE = FrameType.single(Long.TYPE);
    public static final FrameType INPUT_URI_TYPE = FrameType.single(Uri.class);
    public static final FrameType OUTPUT_AUDIO_TYPE = FrameType.single(AudioSample.class);
    public static final FrameType OUTPUT_DURATION_TYPE = FrameType.single(Long.TYPE);
    public static final FrameType OUTPUT_INFO_TYPE = FrameType.single(VideoFrameInfo.class);
    public static final FrameType OUTPUT_VIDEO_TYPE = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16);
    public static final int STATUS_AUDIO_FRAME = 1;
    public static final int STATUS_NO_FRAME = 0;
    public static final int STATUS_VIDEO_FRAME = 2;
    public boolean mDurationAvailable;
    public boolean mHasVideoRotation;
    public final Object mLock = new Object();
    public MediaDecoder mMediaDecoder;
    public Exception mMediaDecoderException;
    public int mMultipleOfX = 1;
    public int mNewAudioFramesAvailable;
    public boolean mNewVideoFrameAvailable;
    public Scaler mScaler;
    public long mStartMicros = 0;
    public int mVideoRotation = 0;

    public MediaDecoderSource(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    private void checkForMediaDecoderError() {
        synchronized (this.mLock) {
            Throwable th = this.mMediaDecoderException;
            if (th != null) {
                throw new RuntimeException(th);
            }
        }
    }

    public int getSchedulePriority() {
        return 25;
    }

    public Signature getSignature() {
        return new Signature().addInputPort("uri", 2, INPUT_URI_TYPE).addInputPort("rotation", 1, INPUT_ROTATION_TYPE).addInputPort("start", 1, INPUT_START_TYPE).addInputPort("multipleOfX", 1, FrameType.single(Integer.TYPE)).addOutputPort("video", 1, OUTPUT_VIDEO_TYPE).addOutputPort("videoInfo", 1, OUTPUT_INFO_TYPE).addOutputPort("audio", 1, OUTPUT_AUDIO_TYPE).addOutputPort("duration", 1, OUTPUT_DURATION_TYPE).disallowOtherPorts();
    }

    private int nextFrame() {
        int i = 0;
        synchronized (this.mLock) {
            int i2 = this.mNewAudioFramesAvailable;
            if (i2 > 0) {
                this.mNewAudioFramesAvailable = i2 - 1;
                i = 1;
            }
            if (this.mNewVideoFrameAvailable && this.mNewAudioFramesAvailable == 0) {
                i |= 2;
                this.mNewVideoFrameAvailable = false;
            }
            if (i == 0) {
                enterSleepState();
            }
        }
        return i;
    }

    public void onAudioSamplesAvailable(AudioFrameProvider audioFrameProvider) {
        synchronized (this.mLock) {
            this.mNewAudioFramesAvailable++;
        }
        wakeUp();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("rotation")) {
            inputPort.bindToFieldNamed("mVideoRotation");
            inputPort.setAutoPullEnabled(true);
            this.mHasVideoRotation = true;
        } else if (inputPort.getName().equals("start")) {
            inputPort.bindToFieldNamed("mStartMicros");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("multipleOfX")) {
            inputPort.bindToFieldNamed("mMultipleOfX");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onPrepare() {
        super.onPrepare();
        this.mMediaDecoder = new MediaDecoder(getContext().getApplicationContext(), (Uri) getConnectedInputPort("uri").pullFrame().asFrameValue().getValue(), this.mStartMicros, isOpenGLSupported());
        this.mMediaDecoder.addAudioFrameConsumer(this);
        this.mMediaDecoder.addVideoFrameConsumer(this);
        this.mMediaDecoder.start();
    }

    protected void onProcess() {
        OutputPort connectedOutputPort;
        Frame frame = null;
        checkForMediaDecoderError();
        synchronized (this.mLock) {
            boolean z = this.mDurationAvailable;
            this.mDurationAvailable = false;
        }
        if (z) {
            connectedOutputPort = getConnectedOutputPort("duration");
            if (connectedOutputPort != null) {
                Frame asFrameValue = Frame.create(OUTPUT_DURATION_TYPE, new int[]{1}).asFrameValue();
                asFrameValue.setValue(Long.valueOf(this.mMediaDecoder.getDurationNs()));
                connectedOutputPort.pushFrame(asFrameValue);
                asFrameValue.release();
                connectedOutputPort.setWaitsUntilAvailable(false);
            }
        }
        int nextFrame = nextFrame();
        if ((nextFrame & 2) != 0) {
            Frame asFrameImage2D;
            OutputPort connectedOutputPort2 = getConnectedOutputPort("video");
            OutputPort connectedOutputPort3 = getConnectedOutputPort("videoInfo");
            if (connectedOutputPort2 != null) {
                asFrameImage2D = Frame.create(OUTPUT_VIDEO_TYPE, new int[]{1, 1}).asFrameImage2D();
            } else {
                asFrameImage2D = null;
            }
            if (connectedOutputPort3 != null) {
                frame = Frame.create(OUTPUT_INFO_TYPE, null).asFrameValue();
            }
            if (this.mScaler == null) {
                this.mScaler = new MultipleOfXScaler(this.mMultipleOfX);
            }
            if (this.mHasVideoRotation) {
                this.mMediaDecoder.grabVideoFrame(asFrameImage2D, frame, this.mScaler, this.mVideoRotation);
            } else {
                this.mMediaDecoder.grabVideoFrame(asFrameImage2D, frame, this.mScaler, LfuScheduler.MAX_PRIORITY);
            }
            if (asFrameImage2D != null) {
                connectedOutputPort2.pushFrame(asFrameImage2D);
                asFrameImage2D.release();
            }
            if (frame != null) {
                connectedOutputPort3.pushFrame(frame);
                frame.release();
            }
        }
        if ((nextFrame & 1) != 0) {
            int i;
            connectedOutputPort = getConnectedOutputPort("audio");
            boolean z2;
            if (connectedOutputPort == null) {
                z2 = false;
            } else if (connectedOutputPort.getTarget().getFilter().isActive()) {
                i = 1;
            } else {
                z2 = false;
            }
            if (i != 0) {
                frame = Frame.create(OUTPUT_AUDIO_TYPE, new int[]{1}).asFrameValue();
                this.mMediaDecoder.grabAudioSamples(frame);
                connectedOutputPort.pushFrame(frame);
                frame.release();
                return;
            }
            this.mMediaDecoder.clearAudioSamples();
        }
    }

    protected void onTearDown() {
        MediaDecoder mediaDecoder = this.mMediaDecoder;
        if (mediaDecoder != null) {
            mediaDecoder.stop();
            this.mMediaDecoder = null;
        }
        super.onTearDown();
    }

    public void onVideoFrameAvailable(VideoFrameProvider videoFrameProvider, long j) {
        synchronized (this.mLock) {
            this.mNewVideoFrameAvailable = true;
        }
        wakeUp();
    }

    public void onVideoStreamError(Exception exception) {
        synchronized (this.mLock) {
            this.mMediaDecoderException = exception;
        }
        wakeUp();
    }

    public void onVideoStreamStarted() {
        synchronized (this.mLock) {
            this.mDurationAvailable = true;
        }
        wakeUp();
    }

    public void onVideoStreamStopped() {
        requestClose();
        wakeUp();
    }
}
