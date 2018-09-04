package com.google.android.libraries.smartburst.filterpacks.motion;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.nio.ByteBuffer;
import java.util.List;
import p000.jky;
import p000.jkz;
import p000.jri;
import p000.jza;
import p000.khb;

/* compiled from: PG */
public class MotionStabilizer {
    public static final boolean DEBUG = false;
    public static final float DEFAULT_HOMOGRAPHY_ERROR_TOLERANCE = 1.0E-7f;
    public static final boolean GAUSSIAN_KERNEL = true;
    public static final float GAUSSIAN_STANDARD_DEVIATION = 30.0f;
    public static final int INVALID_FRAME = -1;
    public static final int SMOOTHING_FILTER_LENGTH = 91;
    public static final String TAG = "MotionStabilizer";
    public static final int TRANSFORM_DIMENSION = 9;
    public final ByteBuffer mContextBuffer = ByteBuffer.allocateDirect(getContextLength());
    public final List mStabilizedTransforms = khb.m4885b();

    /* compiled from: PG */
    class StabilizedTransform {
        public HomographyTransform mCompensationTransform;
        public final HomographyTransform mInterframeTransform;
        public HomographyTransform mJitterTransform;
        public final long mTimestamp;

        public StabilizedTransform(HomographyTransform homographyTransform, long j) {
            this.mInterframeTransform = homographyTransform;
            this.mTimestamp = j;
        }

        public StabilizedTransform(HomographyTransform homographyTransform, HomographyTransform homographyTransform2, HomographyTransform homographyTransform3, long j) {
            this.mInterframeTransform = homographyTransform;
            this.mJitterTransform = homographyTransform2;
            this.mCompensationTransform = homographyTransform3;
            this.mTimestamp = j;
        }

        HomographyTransform getCompensationTransform() {
            return this.mCompensationTransform;
        }

        HomographyTransform getInterframeTransform() {
            return this.mInterframeTransform;
        }

        HomographyTransform getJitterTransform() {
            return this.mJitterTransform;
        }

        long getTimestamp() {
            return this.mTimestamp;
        }

        void setCompensationTransform(HomographyTransform homographyTransform) {
            this.mCompensationTransform = homographyTransform;
        }

        void setJitterTransform(HomographyTransform homographyTransform) {
            this.mJitterTransform = homographyTransform;
        }
    }

    static {
        System.loadLibrary("smartburst-jni");
    }

    private native int getContextLength();

    private native void stabilizationMotionFilteringFilterMotion(ByteBuffer byteBuffer, float[] fArr, float[] fArr2, float[] fArr3);

    private native void stabilizationMotionFilteringSetUp(ByteBuffer byteBuffer, int i, boolean z, float f, int i2);

    private native void stabilizationMotionFilteringTearDown(ByteBuffer byteBuffer);

    public void addInterframeTransform(HomographyTransform homographyTransform, long j) {
        this.mStabilizedTransforms.add(new StabilizedTransform(homographyTransform, j));
    }

    public static MotionStabilizer createFrom(FeatureTable featureTable, long j, long j2) {
        boolean z;
        jri.m13152b((Object) featureTable);
        if (j2 >= j) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        MotionStabilizer motionStabilizer = new MotionStabilizer();
        HomographyTransform createIdentityHomographyTransform = HomographyTransform.createIdentityHomographyTransform();
        jkz rowIterator = featureTable.getRowIterator(featureTable.getEarliestTimestamp());
        HomographyTransform homographyTransform = createIdentityHomographyTransform;
        while (rowIterator.m4528a()) {
            jky jky = (jky) rowIterator.next();
            if (jky.m4527b() >= j) {
                if (jky.m4527b() > j2) {
                    break;
                }
                HomographyTransform createHomographyTransform = HomographyTransform.createHomographyTransform(featureTable.getFeature(jky.m4527b(), jza.INTERFRAME_HOMOGRAPHY).getValues());
                if (createHomographyTransform.closeTo(homographyTransform, 1.0E-7f)) {
                    homographyTransform = createHomographyTransform;
                } else if (createHomographyTransform.isDegenerateHomography()) {
                    homographyTransform = createHomographyTransform;
                } else {
                    motionStabilizer.addInterframeTransform(createHomographyTransform, jky.m4527b());
                    homographyTransform = createHomographyTransform;
                }
            }
        }
        motionStabilizer.stabilizeTransforms();
        return motionStabilizer;
    }

    public HomographyTransform getCompensationTransformForFrame(int i) {
        boolean z = false;
        if (i >= 0 && i < this.mStabilizedTransforms.size()) {
            z = true;
        }
        jri.m13153b(z);
        return ((StabilizedTransform) this.mStabilizedTransforms.get(i)).getCompensationTransform();
    }

    public HomographyTransform getCompensationTransformForTimestamp(long j) {
        return getStabilizedTransform(j).getCompensationTransform();
    }

    public int getFrameCount() {
        return this.mStabilizedTransforms.size();
    }

    public HomographyTransform getInterframeTransformForFrame(int i) {
        boolean z = false;
        if (i >= 0 && i < this.mStabilizedTransforms.size()) {
            z = true;
        }
        jri.m13153b(z);
        return ((StabilizedTransform) this.mStabilizedTransforms.get(i)).getInterframeTransform();
    }

    public HomographyTransform getInterframeTransformForTimestamp(long j) {
        return getStabilizedTransform(j).getInterframeTransform();
    }

    public HomographyTransform getJitterTransformForFrame(int i) {
        boolean z = false;
        if (i >= 0 && i < this.mStabilizedTransforms.size()) {
            z = true;
        }
        jri.m13153b(z);
        return ((StabilizedTransform) this.mStabilizedTransforms.get(i)).getJitterTransform();
    }

    public HomographyTransform getJitterTransformForTimestamp(long j) {
        return getStabilizedTransform(j).getJitterTransform();
    }

    private int getNearestFrameAfter(long j) {
        return getNearestFrameInTimeRange(j, j, Long.MAX_VALUE);
    }

    private int getNearestFrameBefore(long j) {
        return getNearestFrameInTimeRange(j, Long.MIN_VALUE, j);
    }

    private int getNearestFrameInTimeRange(long j, long j2, long j3) {
        int frameCount = getFrameCount();
        float f = Float.MAX_VALUE;
        int i = -1;
        int i2 = 0;
        while (i2 < frameCount) {
            float f2;
            int i3;
            long timestamp = ((StabilizedTransform) this.mStabilizedTransforms.get(i2)).getTimestamp();
            if (timestamp >= j2) {
                if (timestamp >= j3) {
                    break;
                }
                float abs = (float) Math.abs(j - timestamp);
                if (abs < f) {
                    f2 = abs;
                    i3 = i2;
                } else {
                    i3 = i;
                    f2 = f;
                }
            } else {
                i3 = i;
                f2 = f;
            }
            i2++;
            f = f2;
            i = i3;
        }
        return i;
    }

    private StabilizedTransform getStabilizedTransform(long j) {
        int nearestFrameBefore = getNearestFrameBefore(j);
        int nearestFrameAfter = getNearestFrameAfter(j);
        if (nearestFrameBefore != -1 && nearestFrameAfter != -1) {
            StabilizedTransform stabilizedTransform = (StabilizedTransform) this.mStabilizedTransforms.get(nearestFrameBefore);
            StabilizedTransform stabilizedTransform2 = (StabilizedTransform) this.mStabilizedTransforms.get(nearestFrameAfter);
            long timestamp = stabilizedTransform.getTimestamp();
            long timestamp2 = stabilizedTransform2.getTimestamp();
            float f = (float) (timestamp2 - timestamp);
            float f2 = ((float) (timestamp2 - j)) / f;
            float f3 = ((float) (j - timestamp)) / f;
            return new StabilizedTransform(HomographyTransform.createBlend(stabilizedTransform.getInterframeTransform(), f2, stabilizedTransform2.getInterframeTransform(), f3), HomographyTransform.createBlend(stabilizedTransform.getJitterTransform(), f2, stabilizedTransform2.getJitterTransform(), f3), HomographyTransform.createBlend(stabilizedTransform.getCompensationTransform(), f2, stabilizedTransform2.getCompensationTransform(), f3), j);
        } else if (nearestFrameBefore != -1) {
            return (StabilizedTransform) this.mStabilizedTransforms.get(nearestFrameBefore);
        } else {
            if (nearestFrameAfter != -1) {
                return (StabilizedTransform) this.mStabilizedTransforms.get(nearestFrameAfter);
            }
            HomographyTransform createIdentityHomographyTransform = HomographyTransform.createIdentityHomographyTransform();
            return new StabilizedTransform(createIdentityHomographyTransform, createIdentityHomographyTransform, createIdentityHomographyTransform, j);
        }
    }

    public void stabilizeTransforms() {
        int frameCount = getFrameCount();
        if (frameCount > 0) {
            int i;
            int i2 = frameCount * 9;
            float[] fArr = new float[i2];
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            for (i = 0; i < frameCount; i++) {
                HomographyTransform interframeTransform = ((StabilizedTransform) this.mStabilizedTransforms.get(i)).getInterframeTransform();
                for (i2 = 0; i2 < 9; i2++) {
                    fArr[(i * 9) + i2] = interframeTransform.getValue(i2);
                }
            }
            stabilizationMotionFilteringSetUp(this.mContextBuffer, frameCount, true, 30.0f, 91);
            stabilizationMotionFilteringFilterMotion(this.mContextBuffer, fArr, fArr2, fArr3);
            stabilizationMotionFilteringTearDown(this.mContextBuffer);
            for (i = 0; i < frameCount; i++) {
                float[] createIdentityArray = HomographyTransform.createIdentityArray();
                float[] createIdentityArray2 = HomographyTransform.createIdentityArray();
                for (i2 = 0; i2 < 9; i2++) {
                    int i3 = (i * 9) + i2;
                    createIdentityArray[i2] = fArr3[i3];
                    createIdentityArray2[i2] = fArr2[i3];
                }
                ((StabilizedTransform) this.mStabilizedTransforms.get(i)).setJitterTransform(HomographyTransform.createHomographyTransform(createIdentityArray2));
                ((StabilizedTransform) this.mStabilizedTransforms.get(i)).setCompensationTransform(HomographyTransform.createHomographyTransform(createIdentityArray));
            }
        }
    }
}
