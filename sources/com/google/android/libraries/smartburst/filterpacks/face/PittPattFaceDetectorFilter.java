package com.google.android.libraries.smartburst.filterpacks.face;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.vision.face.Face;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class PittPattFaceDetectorFilter extends Filter {
    public static final boolean DEBUG = false;
    public static final String INPUT_PORT_CLASSIFY_EYES_OPEN = "classifyEyesOpen";
    public static final String INPUT_PORT_CLASSIFY_SMILING = "classifySmiling";
    public static final String INPUT_PORT_ENABLE_TRACKING = "trackFaces";
    public static final String INPUT_PORT_FAST_DETECTOR_AGGRESSIVENESS = "fastDetectorAggressiveness";
    public static final String INPUT_PORT_FRAME_SKIPPING_AFTER_NO_DETECTION = "frameSkippingAfterNoDetection";
    public static final String INPUT_PORT_IMAGE = "grayScaleImage";
    public static final String INPUT_PORT_MIN_EYE_DISTANCE = "minEyeDistance";
    public static final String OUTPUT_PORT_FACES = "faces";
    public static final String TAG = "PittPattFaceDetectorFilter";
    public boolean mClassifyEyesOpen = true;
    public boolean mClassifySmiling = true;
    public PittPattFaceDetector mDetector = null;
    public boolean mEnableTracking = false;
    public int mFastDetectorAggressiveness = 4;
    public int mInputFrameSkippingAfterNoDetection = 10;
    public int mMinEyeDistance = 10;
    public int mNumFacesPrev = 1;
    public int mNumFrameSkipped = 0;
    public long mPreviousTimestamp = Long.MIN_VALUE;

    public PittPattFaceDetectorFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort(INPUT_PORT_IMAGE, 2, FrameType.image2D(100, 1)).addInputPort(INPUT_PORT_ENABLE_TRACKING, 1, FrameType.single(Boolean.TYPE)).addInputPort(INPUT_PORT_CLASSIFY_SMILING, 1, FrameType.single(Boolean.TYPE)).addInputPort(INPUT_PORT_CLASSIFY_EYES_OPEN, 1, FrameType.single(Boolean.TYPE)).addInputPort(INPUT_PORT_MIN_EYE_DISTANCE, 1, FrameType.single(Integer.TYPE)).addInputPort(INPUT_PORT_FAST_DETECTOR_AGGRESSIVENESS, 1, FrameType.single(Integer.TYPE)).addInputPort(INPUT_PORT_FRAME_SKIPPING_AFTER_NO_DETECTION, 1, FrameType.single(Integer.TYPE)).addOutputPort("faces", 2, FrameType.array(Face.class)).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals(INPUT_PORT_ENABLE_TRACKING)) {
            inputPort.bindToFieldNamed("mEnableTracking");
            inputPort.setAutoPullEnabled(true);
        }
        if (inputPort.getName().equals(INPUT_PORT_CLASSIFY_SMILING)) {
            inputPort.bindToFieldNamed("mClassifySmiling");
            inputPort.setAutoPullEnabled(true);
        }
        if (inputPort.getName().equals(INPUT_PORT_CLASSIFY_EYES_OPEN)) {
            inputPort.bindToFieldNamed("mClassifyEyesOpen");
            inputPort.setAutoPullEnabled(true);
        }
        if (inputPort.getName().equals(INPUT_PORT_MIN_EYE_DISTANCE)) {
            inputPort.bindToFieldNamed("mMinEyeDistance");
            inputPort.setAutoPullEnabled(true);
        }
        if (inputPort.getName().equals(INPUT_PORT_FAST_DETECTOR_AGGRESSIVENESS)) {
            inputPort.bindToFieldNamed("mFastDetectorAggressiveness");
            inputPort.setAutoPullEnabled(true);
        }
        if (inputPort.getName().equals(INPUT_PORT_FRAME_SKIPPING_AFTER_NO_DETECTION)) {
            inputPort.bindToFieldNamed("mInputFrameSkippingAfterNoDetection");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onProcess() {
        if (this.mDetector == null) {
            this.mDetector = new PittPattFaceDetector(this.mEnableTracking, this.mClassifySmiling, this.mClassifyEyesOpen, this.mMinEyeDistance, this.mFastDetectorAggressiveness);
        }
        FrameImage2D asFrameImage2D = getConnectedInputPort(INPUT_PORT_IMAGE).pullFrame().asFrameImage2D();
        long timestamp = asFrameImage2D.getTimestamp();
        if (timestamp > this.mPreviousTimestamp) {
            List detectFaces;
            this.mPreviousTimestamp = timestamp;
            if (this.mNumFacesPrev != 0 || this.mNumFrameSkipped >= this.mInputFrameSkippingAfterNoDetection) {
                detectFaces = this.mDetector.detectFaces(getContext().getApplicationContext(), asFrameImage2D.lockBytes(1), asFrameImage2D.getWidth(), asFrameImage2D.getHeight());
                asFrameImage2D.unlock();
                this.mNumFrameSkipped = 0;
            } else {
                detectFaces = Collections.emptyList();
                this.mNumFrameSkipped++;
            }
            int size = detectFaces.size();
            OutputPort connectedOutputPort = getConnectedOutputPort("faces");
            Frame asFrameValues = connectedOutputPort.fetchAvailableFrame(new int[]{size}).asFrameValues();
            asFrameValues.setValues(detectFaces.toArray(new Face[detectFaces.size()]));
            connectedOutputPort.pushFrame(asFrameValues);
            this.mNumFacesPrev = size;
        }
    }

    protected void onTearDown() {
        PittPattFaceDetector pittPattFaceDetector = this.mDetector;
        if (pittPattFaceDetector != null) {
            pittPattFaceDetector.dispose();
            this.mDetector = null;
        }
    }
}
