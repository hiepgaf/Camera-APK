package com.google.android.libraries.smartburst.filterfw.filterpacks.performance;

/* compiled from: PG */
public class Throughput {
    public final int mPeriodFrames;
    public final long mPeriodTime;
    public final int mTotalFrames;

    public Throughput(int i, int i2, long j, int i3) {
        this.mTotalFrames = i;
        this.mPeriodFrames = i2;
        this.mPeriodTime = j;
    }

    public float getFramesPerSecond() {
        return ((float) this.mPeriodFrames) / (((float) this.mPeriodTime) / 1000.0f);
    }

    public int getPeriodFrameCount() {
        return this.mPeriodFrames;
    }

    public long getPeriodTime() {
        return this.mPeriodTime;
    }

    public int getTotalFrameCount() {
        return this.mTotalFrames;
    }

    public String toString() {
        int round = Math.round(getFramesPerSecond());
        StringBuilder stringBuilder = new StringBuilder(15);
        stringBuilder.append(round);
        stringBuilder.append(" FPS");
        return stringBuilder.toString();
    }
}
