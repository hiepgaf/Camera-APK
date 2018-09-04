package com.google.googlex.gcam.androidutils;

/* compiled from: PG */
public class SmoothedTimingReporter {
    public final long[] bufferedTimesNanos;
    public long nSamples;

    public SmoothedTimingReporter(int i) {
        this.bufferedTimesNanos = new long[i];
        reset();
    }

    public synchronized void addSample(long j) {
        long j2 = this.nSamples;
        long[] jArr = this.bufferedTimesNanos;
        jArr[(int) (j2 % ((long) jArr.length))] = j;
        this.nSamples = j2 + 1;
    }

    public synchronized float averagePeriodNanos() {
        float f;
        long j = this.nSamples;
        if (j < 2) {
            f = 0.0f;
        } else {
            int i;
            int i2;
            long[] jArr = this.bufferedTimesNanos;
            int length = jArr.length;
            long j2 = (long) length;
            if (j <= j2) {
                length = (int) (-1 + j);
                i = 0;
                i2 = length;
            } else {
                i = (int) (j % j2);
                i2 = ((i - 1) + length) % length;
            }
            f = ((float) (jArr[i2] - jArr[i])) / ((float) (length - 1));
        }
        return f;
    }

    public synchronized void reset() {
        this.nSamples = 0;
    }
}
