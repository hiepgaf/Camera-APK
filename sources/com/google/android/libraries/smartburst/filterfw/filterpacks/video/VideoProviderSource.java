package com.google.android.libraries.smartburst.filterfw.filterpacks.video;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.RenderTarget;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.VideoFrameConsumer;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import com.google.android.libraries.smartburst.filterfw.geometry.MaxDimensionScaler;
import com.google.android.libraries.smartburst.filterfw.geometry.MinDimensionScaler;
import com.google.android.libraries.smartburst.filterfw.geometry.MultipleOfXScaler;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;
import com.google.android.libraries.smartburst.filterpacks.motion.MotionAnalysisFilter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public class VideoProviderSource extends Filter implements VideoFrameConsumer {
    public static final boolean DEBUG = false;
    public static final long NS_IN_S = 1000000000;
    public static final int STATE_END_OF_STREAM = 2;
    public static final int STATE_RUNNING = 0;
    public static final int STATE_STOPPING = 1;
    public static final int TIMESTAMP_FILTER_SIZE = 300;
    public boolean mCloseOnStop = true;
    public long mFrameIntervalNs = 0;
    public AtomicBoolean mHasNewFrame = new AtomicBoolean(false);
    public int mMaxDim = -1;
    public int mMinDim = -1;
    public int mMultipleOfX = 1;
    public final FrameType mOutputType = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16);
    public boolean mPushEOSFrame = false;
    public Scaler mScaler = null;
    public volatile int mState = 0;
    public float mTargetFrameRate = Float.MAX_VALUE;
    public final ArrayBlockingQueue mTimestampQueue = new ArrayBlockingQueue(TIMESTAMP_FILTER_SIZE);
    public VideoFrameProvider mVideoFrameProvider;

    public VideoProviderSource(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public void forceClose() {
        int i;
        if (this.mPushEOSFrame) {
            i = 2;
        } else {
            i = 1;
        }
        this.mState = i;
        wakeUp();
    }

    public Signature getSignature() {
        FrameType single = FrameType.single(VideoFrameProvider.class);
        FrameType single2 = FrameType.single(Boolean.TYPE);
        FrameType single3 = FrameType.single(Integer.TYPE);
        return new Signature().addInputPort("provider", 2, single).addInputPort("closeOnStop", 1, single2).addInputPort("pushEOSFrame", 1, single2).addInputPort("maxDimension", 1, single3).addInputPort("minDimension", 1, single3).addInputPort("multipleOfX", 1, single3).addInputPort(MotionAnalysisFilter.FRAME_RATE, 1, FrameType.single(Float.TYPE)).addOutputPort("video", 2, this.mOutputType).disallowOtherPorts();
    }

    private float measureAverageOutputFrameRate(long j) {
        if (this.mTimestampQueue.isEmpty()) {
            return 0.0f;
        }
        return 1.0E9f / (((float) (j - ((Long) this.mTimestampQueue.peek()).longValue())) / ((float) this.mTimestampQueue.size()));
    }

    private boolean nextFrame() {
        boolean compareAndSet = this.mHasNewFrame.compareAndSet(true, false);
        if (!compareAndSet) {
            enterSleepState();
        }
        return compareAndSet;
    }

    protected void onClose() {
        this.mVideoFrameProvider.removeVideoFrameConsumer(this);
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("provider")) {
            inputPort.bindToFieldNamed("mVideoFrameProvider");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("closeOnStop")) {
            inputPort.bindToFieldNamed("mCloseOnStop");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("pushEOSFrame")) {
            inputPort.bindToFieldNamed("mPushEOSFrame");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("maxDimension")) {
            inputPort.bindToFieldNamed("mMaxDim");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("minDimension")) {
            inputPort.bindToFieldNamed("mMinDim");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("multipleOfX")) {
            inputPort.bindToFieldNamed("mMultipleOfX");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals(MotionAnalysisFilter.FRAME_RATE)) {
            inputPort.bindToFieldNamed("mTargetFrameRate");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onOpen() {
        long j;
        setupCaptureThread();
        this.mHasNewFrame.set(false);
        this.mVideoFrameProvider.addVideoFrameConsumer(this);
        float f = this.mTargetFrameRate;
        if (f != Float.MAX_VALUE) {
            j = (long) (1.0E9f / f);
        } else {
            j = 0;
        }
        this.mFrameIntervalNs = j;
        this.mTimestampQueue.clear();
    }

    protected void onProcess() {
        int[] iArr = new int[]{1, 1};
        OutputPort connectedOutputPort = getConnectedOutputPort("video");
        Frame asFrameImage2D;
        switch (this.mState) {
            case 0:
                if (nextFrame()) {
                    asFrameImage2D = connectedOutputPort.fetchAvailableFrame(iArr).asFrameImage2D();
                    if (this.mScaler == null) {
                        int i = this.mMaxDim;
                        if (i > 0) {
                            this.mScaler = new MultipleOfXScaler(new MaxDimensionScaler(i), this.mMultipleOfX);
                        } else {
                            i = this.mMinDim;
                            if (i > 0) {
                                this.mScaler = new MultipleOfXScaler(new MinDimensionScaler(i), this.mMultipleOfX);
                            } else {
                                this.mScaler = new MultipleOfXScaler(this.mMultipleOfX);
                            }
                        }
                    }
                    if (this.mVideoFrameProvider.grabVideoFrame(asFrameImage2D, null, this.mScaler)) {
                        connectedOutputPort.pushFrame(asFrameImage2D);
                        updateTimestampQueue(asFrameImage2D.getTimestamp());
                        return;
                    }
                    return;
                }
                return;
            case 1:
                requestClose();
                return;
            case 2:
                asFrameImage2D = connectedOutputPort.fetchAvailableFrame(iArr).asFrameImage2D();
                asFrameImage2D.setTimestamp(-2);
                connectedOutputPort.pushFrame(asFrameImage2D);
                this.mState = 1;
                return;
            default:
                int i2 = this.mState;
                StringBuilder stringBuilder = new StringBuilder(26);
                stringBuilder.append("Illegal state: ");
                stringBuilder.append(i2);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void onVideoFrameAvailable(VideoFrameProvider videoFrameProvider, long j) {
        if (shouldKeepFrame(j)) {
            this.mHasNewFrame.set(true);
            wakeUp();
            return;
        }
        videoFrameProvider.skipVideoFrame();
    }

    public void onVideoStreamError(Exception exception) {
        throw new RuntimeException("VideoProvider encountered error!", exception);
    }

    public void onVideoStreamStarted() {
    }

    public void onVideoStreamStopped() {
        if (this.mCloseOnStop) {
            forceClose();
        }
    }

    private void setupCaptureThread() {
        RenderTarget.currentTarget().getExternalIdentityShader();
    }

    private boolean shouldKeepFrame(long j) {
        if (this.mFrameIntervalNs != 0 && measureAverageOutputFrameRate(j) >= this.mTargetFrameRate) {
            return false;
        }
        return true;
    }

    private void updateTimestampQueue(long j) {
        if (this.mTimestampQueue.size() == TIMESTAMP_FILTER_SIZE) {
            this.mTimestampQueue.remove();
        }
        this.mTimestampQueue.add(Long.valueOf(j));
    }
}
