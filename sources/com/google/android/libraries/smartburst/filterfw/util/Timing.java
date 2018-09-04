package com.google.android.libraries.smartburst.filterfw.util;

import android.util.Log;
import java.util.HashMap;

/* compiled from: PG */
public class Timing {
    public static HashMap timings = new HashMap();
    public String mName;

    /* compiled from: PG */
    public class Stats {
        public int count = 0;
        public long latest = -1;
        public long max = -1;
        public long min = -1;
        public long start_time = -1;
        public long sum = 0;

        Stats() {
        }

        double getAverage() {
            int i = this.count;
            return i != 0 ? ((double) this.sum) / ((double) i) : 0.0d;
        }

        int getCount() {
            return this.count;
        }

        long getMax() {
            return this.max;
        }

        long getMin() {
            return this.min;
        }
    }

    public Timing(String str) {
        this.mName = str;
    }

    public void begin() {
        Stats stats = (Stats) timings.get(this.mName);
        if (stats == null) {
            stats = new Stats();
            timings.put(this.mName, stats);
        }
        stats.start_time = System.currentTimeMillis();
    }

    public void clear() {
        timings.put(this.mName, new Stats());
    }

    public void end() {
        Stats stats = (Stats) timings.get(this.mName);
        if (stats == null || stats.start_time < 0) {
            Log.e("Timing", "No begin called.");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - stats.start_time;
        int i = stats.count;
        if (i == 0) {
            stats.min = currentTimeMillis;
            stats.max = currentTimeMillis;
            stats.sum = currentTimeMillis;
            stats.latest = currentTimeMillis;
            stats.count = 1;
            return;
        }
        stats.count = i + 1;
        stats.sum += currentTimeMillis;
        stats.min = Math.min(stats.min, currentTimeMillis);
        stats.max = Math.max(stats.max, currentTimeMillis);
        stats.latest = currentTimeMillis;
    }

    public void log() {
        Stats stats = (Stats) timings.get(this.mName);
        if (stats != null) {
            String valueOf = String.valueOf(this.mName);
            String str = "Timing: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            str = String.format("%.2f", new Object[]{Double.valueOf(stats.getAverage())});
            long max = stats.getMax();
            long j = stats.latest;
            int count = stats.getCount();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 90);
            stringBuilder.append("Average: ");
            stringBuilder.append(str);
            stringBuilder.append(", Maximum: ");
            stringBuilder.append(max);
            stringBuilder.append(", Latest: ");
            stringBuilder.append(j);
            stringBuilder.append(", Count: ");
            stringBuilder.append(count);
            Log.i(valueOf, stringBuilder.toString());
        }
    }
}
