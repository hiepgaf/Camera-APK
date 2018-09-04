package com.google.android.libraries.smartburst.filterpacks.motion;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import p000.jky;
import p000.jkz;
import p000.jri;
import p000.jza;

/* compiled from: PG */
public class MotionStatistics {
    public int mInvalidCount;
    public final float mMaxInvalidFramesRatio;
    public final float mMaxTotalMovement;
    public final float mMaxValidMovement;
    public int mTotalCount;
    public float mTotalMovementX;
    public float mTotalMovementY;

    public MotionStatistics(float f, float f2, float f3) {
        this(0.0f, 0.0f, 0, 0, f, f2, f3);
    }

    public MotionStatistics(float f, float f2, int i, int i2, float f3, float f4, float f5) {
        this.mTotalMovementX = f;
        this.mTotalMovementY = f2;
        this.mTotalCount = i;
        this.mInvalidCount = i2;
        this.mMaxValidMovement = f3;
        this.mMaxTotalMovement = f4;
        this.mMaxInvalidFramesRatio = f5;
    }

    public void addMotion(float f, float f2) {
        if (Math.abs(f) >= this.mMaxValidMovement || Math.abs(f2) >= this.mMaxValidMovement) {
            this.mInvalidCount++;
        } else {
            this.mTotalMovementX += f;
            this.mTotalMovementY += f2;
        }
        this.mTotalCount++;
    }

    public static MotionStatistics getCumulativeMotionStatistics(FeatureTable featureTable, long j, long j2, float f, float f2, float f3) {
        jri.m13152b((Object) featureTable);
        MotionStatistics motionStatistics = new MotionStatistics(f, f2, f3);
        jkz rowIterator = featureTable.getRowIterator(j);
        while (rowIterator.m4528a()) {
            jky jky = (jky) rowIterator.next();
            if (jky.m4527b() > j) {
                if (jky.m4527b() > j2) {
                    break;
                }
                float[] values = featureTable.getFeature(jky.m4527b(), jza.CAMERA_MOTION).getValues();
                motionStatistics.addMotion(values[0], values[1]);
            }
        }
        return motionStatistics;
    }

    public int getInvalidCount() {
        return this.mInvalidCount;
    }

    public int getTotalCount() {
        return this.mTotalCount;
    }

    public float getTotalMovementX() {
        return this.mTotalMovementX;
    }

    public float getTotalMovementY() {
        return this.mTotalMovementY;
    }

    public int getValidCount() {
        return getTotalCount() - getInvalidCount();
    }

    public boolean hasTooManyInvalidFrames() {
        if (getTotalCount() > 0 && ((float) getInvalidCount()) / ((float) getTotalCount()) > this.mMaxInvalidFramesRatio) {
            return true;
        }
        return false;
    }

    public boolean isMovementTooLarge() {
        if (Math.abs(getTotalMovementX()) <= this.mMaxTotalMovement && Math.abs(getTotalMovementY()) <= this.mMaxTotalMovement) {
            return false;
        }
        return true;
    }
}
