package com.google.android.vision.face;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class Face {
    public static final float EYE_DISTANCE_DIVISOR = 2.69f;
    public static final float UNCOMPUTED_PROBABILITY = -1.0f;
    public static final int UNTRACKED = -1;
    public float mConfidence;
    public RectF mCoreFeaturesBoundingBox;
    public int mFrameNumber;
    public float mHeight;
    public float mIsLeftEyeOpenScore;
    public float mIsRightEyeOpenScore;
    public float mIsSmilingScore;
    public List mLandmarks;
    public PointF mPosition;
    public float mRollDegrees;
    public int mTrackId;
    public List mVisualizationPolygon;
    public float mWidth;
    public float mYawDegrees;

    public Face(PointF pointF, float f, float f2, PointF[] pointFArr, float f3, float f4, float f5, Landmark[] landmarkArr, int i, int i2, float f6, float f7, float f8) {
        this.mPosition = pointF;
        this.mWidth = f;
        this.mHeight = f2;
        this.mVisualizationPolygon = Arrays.asList(pointFArr);
        this.mYawDegrees = f3;
        this.mRollDegrees = f4;
        this.mConfidence = f5;
        this.mLandmarks = Arrays.asList(landmarkArr);
        if (i >= 0) {
            this.mTrackId = i;
        } else {
            this.mTrackId = -1;
        }
        if (i2 >= 0) {
            this.mFrameNumber = i2;
        } else {
            this.mFrameNumber = -1;
        }
        if (f6 >= 0.0f) {
            this.mIsLeftEyeOpenScore = f6;
        } else {
            this.mIsLeftEyeOpenScore = -1.0f;
        }
        if (f7 >= 0.0f) {
            this.mIsRightEyeOpenScore = f7;
        } else {
            this.mIsRightEyeOpenScore = -1.0f;
        }
        if (this.mIsSmilingScore >= 0.0f) {
            this.mIsSmilingScore = f8;
        } else {
            this.mIsSmilingScore = -1.0f;
        }
        this.mCoreFeaturesBoundingBox = computeLandmarksBoundingBox(landmarkArr);
        if (this.mCoreFeaturesBoundingBox == null) {
            this.mCoreFeaturesBoundingBox = computeApproximateBoundingBox(pointF, f, f2);
        }
    }

    private RectF computeApproximateBoundingBox(PointF pointF, float f, float f2) {
        RectF rectF = new RectF();
        float f3 = (f / 2.69f) / 2.0f;
        rectF.left = pointF.x - f3;
        rectF.top = pointF.y;
        rectF.right = f3 + pointF.x;
        rectF.bottom = pointF.y + (f2 / 3.0f);
        return rectF;
    }

    private RectF computeLandmarksBoundingBox(Landmark[] landmarkArr) {
        int i = 0;
        RectF rectF = new RectF();
        rectF.left = Float.MAX_VALUE;
        rectF.top = Float.MAX_VALUE;
        rectF.right = Float.MIN_VALUE;
        rectF.bottom = Float.MIN_VALUE;
        for (Landmark landmark : landmarkArr) {
            if (isBoundingBoxLandmark(landmark)) {
                float f = landmark.getPosition().x;
                float f2 = landmark.getPosition().y;
                rectF.left = Math.min(rectF.left, f);
                rectF.top = Math.min(rectF.top, f2);
                rectF.right = Math.max(rectF.right, f);
                rectF.bottom = Math.max(rectF.bottom, f2);
                i++;
            }
        }
        if (i >= 5) {
            return rectF;
        }
        return null;
    }

    public float getConfidence() {
        return this.mConfidence;
    }

    public RectF getCoreFeaturesBoundingBox() {
        return this.mCoreFeaturesBoundingBox;
    }

    public int getFrameNumber() {
        return this.mFrameNumber;
    }

    public float getHeight() {
        return this.mHeight;
    }

    public float getIsLeftEyeOpenScore() {
        return this.mIsLeftEyeOpenScore;
    }

    public float getIsRightEyeOpenScore() {
        return this.mIsRightEyeOpenScore;
    }

    public float getIsSmilingScore() {
        return this.mIsSmilingScore;
    }

    public List getLandmarks() {
        return this.mLandmarks;
    }

    public PointF getPosition() {
        return this.mPosition;
    }

    public float getRollDegrees() {
        return this.mRollDegrees;
    }

    public int getTrackId() {
        return this.mTrackId;
    }

    public List getVisualizationPolygon() {
        return this.mVisualizationPolygon;
    }

    public float getWidth() {
        return this.mWidth;
    }

    public float getYawDegrees() {
        return this.mYawDegrees;
    }

    private static boolean isBoundingBoxLandmark(Landmark landmark) {
        switch (landmark.getCategory()) {
            case 0:
            case 4:
            case 5:
            case 6:
            case 10:
            case 11:
                return true;
            default:
                return false;
        }
    }
}
