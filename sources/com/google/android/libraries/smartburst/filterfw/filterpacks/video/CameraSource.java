package com.google.android.libraries.smartburst.filterfw.filterpacks.video;

import com.google.android.libraries.smartburst.filterfw.CameraStreamer;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.VideoFrameConsumer;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import com.google.android.libraries.smartburst.filterfw.geometry.MultipleOfXScaler;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;

/* compiled from: PG */
public class CameraSource extends Filter implements VideoFrameConsumer {
    public int mMultipleOfX = 1;
    public boolean mNewFrameAvailable = false;
    public FrameType mOutputType = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16);
    public Scaler mScaler = null;
    public boolean mUseWallClock = false;

    public CameraSource(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("useWallClock", 1, FrameType.single(Boolean.TYPE)).addInputPort("multipleOfX", 1, FrameType.single(Integer.TYPE)).addOutputPort("video", 2, this.mOutputType).disallowOtherPorts();
    }

    private synchronized boolean nextFrame() {
        boolean z;
        z = this.mNewFrameAvailable;
        if (z) {
            this.mNewFrameAvailable = false;
        } else {
            enterSleepState();
        }
        return z;
    }

    protected void onClose() {
        getContext().getCameraStreamer().removeVideoFrameConsumer(this);
        this.mNewFrameAvailable = false;
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("useWallClock")) {
            inputPort.bindToFieldNamed("mUseWallClock");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("multipleOfX")) {
            inputPort.bindToFieldNamed("mMultipleOfX");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onOpen() {
        getContext().getCameraStreamer().addVideoFrameConsumer(this);
    }

    protected void onProcess() {
        if (nextFrame()) {
            CameraStreamer cameraStreamer = getContext().getCameraStreamer();
            OutputPort connectedOutputPort = getConnectedOutputPort("video");
            Frame asFrameImage2D = Frame.create(this.mOutputType, new int[]{1, 1}).asFrameImage2D();
            if (this.mScaler == null) {
                this.mScaler = new MultipleOfXScaler(this.mMultipleOfX);
            }
            if (cameraStreamer.getLatestFrame(asFrameImage2D, this.mScaler)) {
                if (this.mUseWallClock) {
                    asFrameImage2D.setTimestamp(System.currentTimeMillis() * 1000000);
                }
                connectedOutputPort.pushFrame(asFrameImage2D);
            }
            asFrameImage2D.release();
        }
    }

    public void onVideoFrameAvailable(VideoFrameProvider videoFrameProvider, long j) {
        synchronized (this) {
            this.mNewFrameAvailable = true;
        }
        wakeUp();
    }

    public void onVideoStreamError(Exception exception) {
        throw new RuntimeException("Camera encountered an error. Aborting.", exception);
    }

    public void onVideoStreamStarted() {
    }

    public void onVideoStreamStopped() {
    }
}
