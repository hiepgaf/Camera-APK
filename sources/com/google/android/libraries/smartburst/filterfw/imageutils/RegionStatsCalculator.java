package com.google.android.libraries.smartburst.filterfw.imageutils;

import android.graphics.RectF;
import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.FrameBuffer2D;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class RegionStatsCalculator {
    public static final int MEAN_INDEX = 0;
    public static final int STDEV_INDEX = 1;
    public static final String TAG = "RegionStatsCalculator";
    public static final boolean mLogVerbose = Log.isLoggable(TAG, 2);
    public final float[] mStats = new float[2];

    /* compiled from: PG */
    public class Statistics {
        public final float mean;
        public final float stdDev;

        public Statistics(float f, float f2) {
            this.mean = f;
            this.stdDev = f2;
        }
    }

    static {
        System.loadLibrary("filterframework_jni");
    }

    private native void regionscore(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, float[] fArr, boolean z);

    public Statistics calcMeanAndStd(FrameBuffer2D frameBuffer2D, Quad quad, boolean z) {
        int width = frameBuffer2D.getWidth();
        int height = frameBuffer2D.getHeight();
        RectF enclosingRectF = quad.getEnclosingRectF();
        float f = (float) width;
        int i = width - 1;
        int clamp = clamp((int) (enclosingRectF.left * f), 0, i);
        float f2 = (float) height;
        height--;
        int clamp2 = clamp((int) (enclosingRectF.top * f2), 0, height);
        int clamp3 = clamp((int) (f * enclosingRectF.right), 0, i);
        i = clamp((int) (enclosingRectF.bottom * f2), 0, height);
        ByteBuffer lockBytes = frameBuffer2D.lockBytes(1);
        lockBytes.rewind();
        regionscore(lockBytes, width, clamp, clamp2, clamp3, i, this.mStats, z);
        frameBuffer2D.unlock();
        if (mLogVerbose) {
            float[] fArr = this.mStats;
            float f3 = fArr[0];
            float f4 = fArr[1];
            StringBuilder stringBuilder = new StringBuilder(66);
            stringBuilder.append("Native calc stats: Mean = ");
            stringBuilder.append(f3);
            stringBuilder.append(", Stdev = ");
            stringBuilder.append(f4);
            Log.v(TAG, stringBuilder.toString());
        }
        float[] fArr2 = this.mStats;
        return new Statistics(fArr2[0], fArr2[1]);
    }

    private static int clamp(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }
}
