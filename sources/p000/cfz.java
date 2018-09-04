package p000;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cfz */
final class cfz implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ cfk f1929a;

    cfz(cfk cfk) {
        this.f1929a = cfk;
    }

    public final void run() {
        long totalPrivateDirty;
        long totalSharedDirty;
        long totalPss;
        long j;
        long j2;
        long j3;
        erh erh = this.f1929a.f20285k;
        int memoryClass = erh.f4112b.getMemoryClass();
        int largeMemoryClass = erh.f4112b.getLargeMemoryClass();
        MemoryInfo memoryInfo = new MemoryInfo();
        erh.f4112b.getMemoryInfo(memoryInfo);
        long j4 = memoryInfo.availMem / 1048576;
        long j5 = memoryInfo.totalMem / 1048576;
        long j6 = memoryInfo.threshold / 1048576;
        boolean z = memoryInfo.lowMemory;
        RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int myPid = Process.myPid();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (myPid != 0) {
            Debug.MemoryInfo[] processMemoryInfo = erh.f4112b.getProcessMemoryInfo(new int[]{myPid});
            totalPrivateDirty = ((long) processMemoryInfo[0].getTotalPrivateDirty()) / 1024;
            totalSharedDirty = ((long) processMemoryInfo[0].getTotalSharedDirty()) / 1024;
            totalPss = ((long) processMemoryInfo[0].getTotalPss()) / 1024;
            Debug.MemoryInfo memoryInfo2 = processMemoryInfo[0];
            j = ((long) memoryInfo2.nativePss) / 1024;
            j2 = ((long) memoryInfo2.dalvikPss) / 1024;
            j3 = ((long) memoryInfo2.otherPss) / 1024;
        } else {
            totalPrivateDirty = 0;
            totalSharedDirty = 0;
            totalPss = 0;
            j = 0;
            j2 = 0;
            j3 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", Long.valueOf(elapsedRealtime));
        hashMap.put("availMem", Long.valueOf(j4));
        hashMap.put("totalMem", Long.valueOf(j5));
        HashMap hashMap2 = hashMap;
        hashMap2.put("totalPSS", Long.valueOf(totalPss));
        hashMap.put("lastTrimLevel", Integer.valueOf(runningAppProcessInfo.lastTrimLevel));
        hashMap.put("totalPrivateDirty", Long.valueOf(totalPrivateDirty));
        hashMap.put("totalSharedDirty", Long.valueOf(totalSharedDirty));
        hashMap.put("memoryClass", Integer.valueOf(memoryClass));
        hashMap2 = hashMap;
        hashMap2.put("largeMemoryClass", Integer.valueOf(largeMemoryClass));
        hashMap2 = hashMap;
        hashMap2.put("nativePSS", Long.valueOf(j));
        hashMap2 = hashMap;
        hashMap2.put("dalvikPSS", Long.valueOf(j2));
        hashMap2 = hashMap;
        hashMap2.put("otherPSS", Long.valueOf(j3));
        hashMap2 = hashMap;
        hashMap2.put("threshold", Long.valueOf(j6));
        hashMap2 = hashMap;
        hashMap2.put("lowMemory", Boolean.valueOf(z));
        bli.m863a(erh.f4111a, String.format(Locale.US, "timestamp=%d, availMem=%d, totalMem=%d, totalPSS=%d, lastTrimLevel=%d, largeMemoryClass=%d, nativePSS=%d, dalvikPSS=%d, otherPSS=%d,threshold=%d, lowMemory=%s", new Object[]{r26, r18, r19, r10, Integer.valueOf(runningAppProcessInfo.lastTrimLevel), r11, r8, r6, r4, r5, r7}));
        this.f1929a.f20266Q.mo1591a(hashMap, "launch");
    }
}
