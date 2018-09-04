package com.google.android.libraries.smartburst.filterpacks.motion;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* compiled from: PG */
public class MotionAnalysisFilter extends Filter {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String CAMERA_MOTION = "cameraMotion";
    public static final int CONSECUTIVE_FAILURE_THRESHOLD = 0;
    public static final String FRAME = "image";
    public static final String FRAME_RATE = "frameRate";
    public static final String INTERFRAME_TRANSFORM = "interframeTransform";
    public static final long NS_IN_S = 1000000000;
    public static final String SALIENCY = "saliency";
    public static final String SALIENCY_DOWNSAMPLING_RATIO = "saliencyDownsamplingRatio";
    public static final String SCORE = "score";
    public static final String TAG = "MotionAnalysisFilter";
    public int mConsecutiveFailureCounter = 0;
    public ByteBuffer mContextBuffer;
    public ByteBuffer mContextBufferSaliency;
    public float mFrameRate = 15.0f;
    public boolean mIsMotionAnalysisSetUp;
    public int[] mOriginalInputDimensions;
    public long mPreviousTimestamp = 0;
    public float mSaliencyDownsamplingRatio = 0.825f;
    public int mWorkingFrameHeight;
    public int mWorkingFrameWidth;

    static {
        System.loadLibrary("smartburst-jni");
    }

    private native float computeMotionSaliency(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, FloatBuffer floatBuffer, float f, int i, int i2, ByteBuffer byteBuffer3);

    private native int getContextLength();

    private native int getMotionSaliencyContextLength();

    private native boolean prepareMotionAnalyzer(ByteBuffer byteBuffer, int i, int i2, float f);

    private native void releaseMotionAnalyzer(ByteBuffer byteBuffer);

    private native void stabilizationMotionEstimationProcessFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, FloatBuffer floatBuffer, FloatBuffer floatBuffer2);

    private native void stabilizationMotionEstimationSetUp(ByteBuffer byteBuffer, int i, int i2);

    private native void stabilizationMotionEstimationTearDown(ByteBuffer byteBuffer);

    public MotionAnalysisFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(100, 1);
        FrameType array = FrameType.array(Float.TYPE);
        FrameType array2 = FrameType.array(Float.TYPE);
        return new Signature().addInputPort("image", 2, image2D).addInputPort(FRAME_RATE, 1, FrameType.single(Float.TYPE)).addInputPort(SALIENCY_DOWNSAMPLING_RATIO, 1, FrameType.single(Float.TYPE)).addOutputPort(INTERFRAME_TRANSFORM, 1, array).addOutputPort(CAMERA_MOTION, 1, array2).addOutputPort(SALIENCY, 1, FrameType.array(Float.TYPE)).addOutputPort(SCORE, 1, FrameType.single(Float.TYPE)).disallowOtherPorts();
    }

    protected void onClose() {
        this.mOriginalInputDimensions = null;
        if (this.mIsMotionAnalysisSetUp) {
            stabilizationMotionEstimationTearDown(this.mContextBuffer);
            releaseMotionAnalyzer(this.mContextBufferSaliency);
            this.mIsMotionAnalysisSetUp = false;
        }
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals(FRAME_RATE)) {
            inputPort.bindToFieldNamed("mFrameRate");
            inputPort.setAutoPullEnabled(true);
        }
        if (inputPort.getName().equals(SALIENCY_DOWNSAMPLING_RATIO)) {
            inputPort.bindToFieldNamed("mSaliencyDownsamplingRatio");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onPrepare() {
        this.mContextBuffer = ByteBuffer.allocateDirect(getContextLength());
        this.mContextBufferSaliency = ByteBuffer.allocateDirect(getMotionSaliencyContextLength());
    }

    protected void onProcess() {
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        int[] dimensions = asFrameImage2D.getDimensions();
        if (dimensions[0] <= 0 || dimensions[1] <= 0) {
            Log.e(TAG, String.format("Frame dimensions must be positive. Current dimensions are (%d, %d). Ignoring current frame.", new Object[]{Integer.valueOf(r3), Integer.valueOf(dimensions[1])}));
            return;
        }
        float f;
        int[] iArr = this.mOriginalInputDimensions;
        if (iArr == null) {
            this.mOriginalInputDimensions = Arrays.copyOf(dimensions, dimensions.length);
        } else if (!Arrays.equals(dimensions, iArr)) {
            r3 = new Object[4];
            int[] iArr2 = this.mOriginalInputDimensions;
            r3[0] = Integer.valueOf(iArr2[0]);
            r3[1] = Integer.valueOf(iArr2[1]);
            r3[2] = Integer.valueOf(dimensions[0]);
            r3[3] = Integer.valueOf(dimensions[1]);
            Log.e(TAG, String.format("Frame dimensions have changed during processing of a video, original dimensions were (%d, %d), current dimensions are (%d, %d). Ignoring current frame.", r3));
            return;
        }
        if (!this.mIsMotionAnalysisSetUp) {
            this.mWorkingFrameWidth = dimensions[0];
            this.mWorkingFrameHeight = dimensions[1];
            stabilizationMotionEstimationSetUp(this.mContextBuffer, this.mWorkingFrameWidth, this.mWorkingFrameHeight);
            if (prepareMotionAnalyzer(this.mContextBufferSaliency, this.mWorkingFrameWidth, this.mWorkingFrameHeight, this.mSaliencyDownsamplingRatio)) {
                this.mIsMotionAnalysisSetUp = true;
            } else {
                Log.e(TAG, "Failed to initialize motion saliency analyzer");
                stabilizationMotionEstimationTearDown(this.mContextBuffer);
                return;
            }
        }
        long timestamp = asFrameImage2D.getTimestamp();
        long j = this.mPreviousTimestamp;
        if (j != 0) {
            f = (((float) (timestamp - j)) * this.mFrameRate) / 1.0E9f;
        } else {
            f = 1.0f;
        }
        this.mPreviousTimestamp = timestamp;
        ByteBuffer lockBytes = asFrameImage2D.lockBytes(1);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(36);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        allocateDirect = ByteBuffer.allocateDirect(8);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect.asFloatBuffer();
        stabilizationMotionEstimationProcessFrame(this.mContextBuffer, lockBytes, this.mWorkingFrameWidth, this.mWorkingFrameHeight, asFloatBuffer, asFloatBuffer2);
        OutputPort connectedOutputPort = getConnectedOutputPort(INTERFRAME_TRANSFORM);
        Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        Object obj = new float[9];
        asFloatBuffer.get(obj);
        asFrameValue.setValue(obj);
        HomographyTransform createHomographyTransform = HomographyTransform.createHomographyTransform(obj);
        float computeMotionSaliency = computeMotionSaliency(this.mContextBufferSaliency, lockBytes, asFloatBuffer, f, 1, 1, null);
        asFrameImage2D.unlock();
        connectedOutputPort.pushFrame(asFrameValue);
        OutputPort connectedOutputPort2 = getConnectedOutputPort(CAMERA_MOTION);
        if (connectedOutputPort2 != null) {
            Object obj2;
            Frame asFrameValue2 = connectedOutputPort2.fetchAvailableFrame(null).asFrameValue();
            if (createHomographyTransform.isDegenerateHomography()) {
                this.mConsecutiveFailureCounter++;
                if (this.mConsecutiveFailureCounter <= 0) {
                    obj2 = null;
                } else {
                    asFrameValue2.setValue(new float[]{1065353216, 1065353216});
                    obj2 = 1;
                }
            } else {
                obj2 = new float[]{createHomographyTransform.getDisplacementX() / f, createHomographyTransform.getDisplacementY() / f};
                int i = this.mWorkingFrameWidth;
                int i2 = this.mWorkingFrameHeight;
                if (i > i2) {
                    obj2[1] = (((float) i2) / ((float) i)) * obj2[1];
                } else {
                    obj2[0] = (((float) i) / ((float) i2)) * obj2[0];
                }
                asFrameValue2.setValue(obj2);
                this.mConsecutiveFailureCounter = 0;
                obj2 = 1;
            }
            if (obj2 != null) {
                connectedOutputPort2.pushFrame(asFrameValue2);
            }
        }
        connectedOutputPort = getConnectedOutputPort(SALIENCY);
        if (connectedOutputPort != null) {
            asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
            obj = new float[2];
            asFloatBuffer2.get(obj);
            asFrameValue.setValue(obj);
            connectedOutputPort.pushFrame(asFrameValue);
        }
        connectedOutputPort = getConnectedOutputPort(SCORE);
        if (connectedOutputPort != null) {
            asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
            asFrameValue.setValue(Float.valueOf(computeMotionSaliency));
            connectedOutputPort.pushFrame(asFrameValue);
        }
    }
}
