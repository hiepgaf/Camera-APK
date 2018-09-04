package com.google.android.vision.face;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.vision.face.processors.DetectionProcessor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.kvl;

/* compiled from: PG */
public final class Detector implements FrameReceiver {
    public static final String JNI_LIBRARY_NAME = "vision_face_jni";
    public static final String TAG = "Detector";
    public List mDetectionProcessors = new ArrayList();
    public ByteBuffer mHandle;
    public Settings mSettings;

    /* compiled from: PG */
    public class ClassificationSettings {
        public boolean mClassifyEyesOpen = false;
        public boolean mClassifySmiling = false;

        public boolean classifyingEyesOpen() {
            return this.mClassifyEyesOpen;
        }

        public boolean classifyingSmiling() {
            return this.mClassifySmiling;
        }

        public void setClassifyEyesOpen(boolean z) {
            this.mClassifyEyesOpen = z;
        }

        public void setClassifySmiling(boolean z) {
            this.mClassifySmiling = z;
        }
    }

    /* compiled from: PG */
    public class DetectionSettings {
        public static final int FRONTAL_DETECTOR = 0;
        public static final int FRONTAL_EYE_LANDMARKS = 2;
        public static final int FRONTAL_LANDMARKS = 1;
        public static final int MAX_FAST_DETECTOR_AGGRESSIVENESS_LEVEL = 4;
        public static final int MIN_FAST_DETECTOR_AGGRESSIVENESS_LEVEL = 0;
        public static final int MULTI_POSE_DETECTOR = 1;
        public static final int MULTI_POSE_LANDMARKS = 3;
        public static final int NO_LANDMARKS = 0;
        public float mConfidenceThreshold = 0.1f;
        public int mDetectorType = 0;
        public int mFastDetectorAggressiveness = 0;
        public int mLandmarkDetectorType = 0;
        public int mMaxEyeDistancePixels = LfuScheduler.MAX_PRIORITY;
        public int mMaxNumFaces = LfuScheduler.MAX_PRIORITY;
        public int mMinEyeDistancePixels = 24;
        public int mNumThreads = 1;
        public float mProportionalMaxFaceSize = 1.0f;
        public float mProportionalMinFaceSize = 0.0f;
        public Rect mSearchRegion = null;

        float getConfidenceThreshold() {
            return this.mConfidenceThreshold;
        }

        int getDetectorType() {
            return this.mDetectorType;
        }

        int getFastDetectorAggressiveness() {
            return this.mFastDetectorAggressiveness;
        }

        public int getLandmarkDetectorType() {
            return this.mLandmarkDetectorType;
        }

        int getMaxEyeDistancePixels() {
            return this.mMaxEyeDistancePixels;
        }

        int getMaxNumFaces() {
            return this.mMaxNumFaces;
        }

        int getMinEyeDistancePixels() {
            return this.mMinEyeDistancePixels;
        }

        int getNumThreads() {
            return this.mNumThreads;
        }

        float getProportionalMaxFaceSize() {
            return this.mProportionalMaxFaceSize;
        }

        float getProportionalMinFaceSize() {
            return this.mProportionalMinFaceSize;
        }

        Rect getSearchRegion() {
            return this.mSearchRegion;
        }

        void setConfidenceThreshold(float f) {
            this.mConfidenceThreshold = f;
        }

        public void setDetectorType(int i) {
            if (i == 0 || i == 1) {
                this.mDetectorType = i;
                return;
            }
            throw new IllegalArgumentException("Invalid detector type.");
        }

        public void setFastDetectorAggressiveness(int i) {
            if (i < 0 || i > 4) {
                throw new IllegalArgumentException("Invalid detector aggressiveness level.");
            }
            this.mFastDetectorAggressiveness = i;
        }

        public void setLandmarkDetectorType(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                    this.mLandmarkDetectorType = i;
                    return;
                default:
                    throw new IllegalArgumentException("Invalid landmark detector type.");
            }
        }

        void setMaxEyeDistancePixels(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Invalid maximum eye distance.");
            }
            this.mMaxEyeDistancePixels = i;
        }

        public void setMaxNumFaces(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("Invalid maximum number of faces.");
            }
            this.mMaxNumFaces = i;
        }

        public void setMinEyeDistancePixels(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Invalid minimum eye distance.");
            }
            this.mMinEyeDistancePixels = i;
        }

        void setNumThreads(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("Invalid number of threads.");
            }
            this.mNumThreads = i;
        }

        void setProportionalMaxFaceSize(float f) {
            if (f < 0.0f || f > 1.0f) {
                throw new IllegalArgumentException("Invalid proportional maximum face size.");
            }
            this.mProportionalMaxFaceSize = f;
        }

        public void setProportionalMinFaceSize(float f) {
            if (f < 0.0f || f > 1.0f) {
                throw new IllegalArgumentException("Invalid proportional minimum face size.");
            }
            this.mProportionalMinFaceSize = f;
        }

        void setSearchRegion(Rect rect) {
            if (rect.top < 0 || rect.left < 0 || rect.bottom < rect.top || rect.right < rect.left) {
                throw new IllegalArgumentException("Invalid search region.");
            }
            this.mSearchRegion = rect;
        }
    }

    /* compiled from: PG */
    public class Settings {
        public static final int APK_MODEL_FILES_LOCATION = 1;
        public static final int LOCAL_MODEL_FILES_LOCATION = 0;
        public ClassificationSettings mClassificationSettings = new ClassificationSettings();
        public DetectionSettings mDetectionSettings = new DetectionSettings();
        public int mModelFilesLocation = 0;
        public TrackingSettings mTrackingSettings = new TrackingSettings();

        Settings() {
        }

        public ClassificationSettings getClassificationSettings() {
            return this.mClassificationSettings;
        }

        public DetectionSettings getDetectionSettings() {
            return this.mDetectionSettings;
        }

        int getModelFilesLocation() {
            return this.mModelFilesLocation;
        }

        public TrackingSettings getTrackingSettings() {
            return this.mTrackingSettings;
        }

        public void setModelFilesLocation(int i) {
            this.mModelFilesLocation = i;
        }
    }

    /* compiled from: PG */
    public class TrackingSettings {
        public boolean mEnabled = false;

        boolean isEnabled() {
            return this.mEnabled;
        }

        public void setEnabled(boolean z) {
            this.mEnabled = z;
        }
    }

    static {
        try {
            System.loadLibrary(JNI_LIBRARY_NAME);
        } catch (UnsatisfiedLinkError e) {
            Log.e(TAG, "Could not load library: vision_face_jni");
        }
    }

    private static native Face[] detectFacesJni(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2);

    private static native Face[] detectFacesJni(ByteBuffer byteBuffer, byte[] bArr, int i, int i2);

    private static native void finalizeDetectorJni(ByteBuffer byteBuffer);

    private static native ByteBuffer initDetectorJni(Settings settings, String str, AssetManager assetManager);

    private static native boolean isTrackingSingleFaceJni(ByteBuffer byteBuffer);

    private static native void stopTrackingSingleFaceJni(ByteBuffer byteBuffer);

    private static native boolean trackSingleFaceJni(ByteBuffer byteBuffer, int i);

    public Detector(Context context, Settings settings) {
        this.mSettings = settings;
        this.mHandle = initDetectorJni(settings, ModelManager.getModelsDirectoryName(context), context.getAssets());
    }

    public final void addDetectionProcessor(DetectionProcessor detectionProcessor) {
        this.mDetectionProcessors.add(detectionProcessor);
    }

    public final List detectFaces(Bitmap bitmap) {
        int i = 0;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = width * height;
        int[] iArr = new int[i2];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i2];
        while (i < iArr.length) {
            bArr[i] = (byte) ((int) (((((float) Color.red(iArr[i])) * 0.299f) + (((float) Color.green(iArr[i])) * 0.587f)) + (((float) Color.blue(iArr[i])) * 0.114f)));
            i++;
        }
        return Arrays.asList(detectFacesJni(this.mHandle, bArr, width, height));
    }

    public final List detectFaces(ByteBuffer byteBuffer, int i, int i2) {
        return Arrays.asList(detectFacesJni(this.mHandle, byteBuffer, i, i2));
    }

    public final List detectFaces(byte[] bArr, int i, int i2) {
        return Arrays.asList(detectFacesJni(this.mHandle, bArr, i, i2));
    }

    private final DetectionResults detectFacesInFrame(int i, byte[] bArr, int i2, int i3) {
        Face[] detectFacesJni = detectFacesJni(this.mHandle, bArr, i2, i3);
        SparseArray sparseArray = new SparseArray();
        int i4 = kvl.UNSET_ENUM_VALUE;
        for (Face face : detectFacesJni) {
            int trackId = face.getTrackId();
            if (sparseArray.get(trackId) == null) {
                sparseArray.append(trackId, face);
                i4 = Math.max(i4, trackId);
            } else {
                i4++;
                sparseArray.append(i4, face);
            }
        }
        return new DetectionResults();
    }

    protected final void finalize() {
        ByteBuffer byteBuffer = this.mHandle;
        if (byteBuffer != null) {
            finalizeDetectorJni(byteBuffer);
        }
        super.finalize();
    }

    public final boolean isClassifyingEyesOpen() {
        return this.mSettings.getClassificationSettings().classifyingEyesOpen();
    }

    public final boolean isClassifyingSmiling() {
        return this.mSettings.getClassificationSettings().classifyingSmiling();
    }

    public final boolean isTrackingEnabled() {
        return this.mSettings.getTrackingSettings().isEnabled();
    }

    public final boolean isTrackingSingleFace() {
        return isTrackingSingleFaceJni(this.mHandle);
    }

    public final void receiveFrame(Frame frame) {
        if (this.mDetectionProcessors.isEmpty()) {
            Log.w(TAG, "No DetectionProcessor registered to handle Detector frame.  Call Detector.addDetectionProcessor to register a detection processor.");
            return;
        }
        detectFacesInFrame(0, null, 0, 0);
        for (DetectionProcessor a : this.mDetectionProcessors) {
            a.mo933a();
        }
    }

    public final void release() {
        finalizeDetectorJni(this.mHandle);
        this.mHandle = null;
    }

    public final void removeDetectionProcessor(DetectionProcessor detectionProcessor) {
        this.mDetectionProcessors.remove(detectionProcessor);
    }

    public final void stopTrackingSingleFace() {
        stopTrackingSingleFaceJni(this.mHandle);
    }

    public final boolean trackSingleFace(int i) {
        return trackSingleFaceJni(this.mHandle, i);
    }
}
