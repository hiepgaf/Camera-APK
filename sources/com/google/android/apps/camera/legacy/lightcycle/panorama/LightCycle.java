package com.google.android.apps.camera.legacy.lightcycle.panorama;

import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import com.google.android.apps.lightcycle.panorama.NewTarget;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public final class LightCycle {
    /* renamed from: a */
    public static Object f2376a = new Object();
    /* renamed from: b */
    public static Boolean f2377b = Boolean.valueOf(false);
    /* renamed from: c */
    public static Map f2378c = new HashMap();
    /* renamed from: d */
    public static LightCycleProgressCallback f2379d = new LightCycleProgressCallback();

    /* compiled from: PG */
    public class LightCycleProgressCallback {
        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void onProgress(int r6, int r7) {
            /*
            r0 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.f2378c;
            r1 = java.lang.Integer.valueOf(r6);
            r0 = r0.containsKey(r1);
            if (r0 == 0) goto L_0x0024;
        L_0x000c:
            r0 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.f2378c;
            r0 = r0.get(r1);
            r0 = (p000.ekq) r0;
            r1 = r0.f3821c;
            r1 = r1.f15250b;
            monitor-enter(r1);
            r2 = r0.f3821c;	 Catch:{ all -> 0x004d }
            r2 = r2.f15250b;	 Catch:{ all -> 0x004d }
            r2 = r2.get();	 Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x0025;
        L_0x0023:
            monitor-exit(r1);	 Catch:{ all -> 0x004d }
        L_0x0024:
            return;
        L_0x0025:
            r2 = r0.f3821c;	 Catch:{ all -> 0x004d }
            r2 = r2.f15249a;	 Catch:{ all -> 0x004d }
            r2 = r2.f3936b;	 Catch:{ all -> 0x004d }
            r2.mo2875b(r7);	 Catch:{ all -> 0x004d }
            r2 = r0.f3820b;	 Catch:{ all -> 0x004d }
            r2 = r2.length();	 Catch:{ all -> 0x004d }
            r4 = r0.f3819a;	 Catch:{ all -> 0x004d }
            r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r4 != 0) goto L_0x0041;
        L_0x003a:
            monitor-exit(r1);	 Catch:{ all -> 0x004d }
            r0 = r0.f3821c;
            r0.m9740a();
            goto L_0x0024;
        L_0x0041:
            r4 = r0.f3821c;	 Catch:{ all -> 0x004d }
            r4 = r4.f15249a;	 Catch:{ all -> 0x004d }
            r4 = r4.f3936b;	 Catch:{ all -> 0x004d }
            r4.mo2888p();	 Catch:{ all -> 0x004d }
            r0.f3819a = r2;	 Catch:{ all -> 0x004d }
            goto L_0x003a;
        L_0x004d:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x004d }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.LightCycleProgressCallback.onProgress(int, int):void");
        }
    }

    /* renamed from: a */
    public static String m1289a(float[] fArr) {
        String AddImage;
        synchronized (f2376a) {
            if (f2377b.booleanValue()) {
                AddImage = LightCycleNative.AddImage(fArr);
            } else {
                throw new IllegalStateException("State is not ready.");
            }
        }
        return AddImage;
    }

    /* renamed from: a */
    public static void m1290a() {
        LightCycleNative.AlignNextImage();
    }

    /* renamed from: a */
    public static float m1288a(String str) {
        return LightCycleNative.CalibrateFieldOfViewDeg(str);
    }

    /* renamed from: b */
    public static boolean m1299b() {
        return LightCycleNative.CanUndo();
    }

    /* renamed from: a */
    public static void m1292a(int i) {
        LightCycleNative.CreateFrameTexture(i);
    }

    /* renamed from: c */
    public static int m1302c() {
        return LightCycleNative.CreateNewStitchingSession();
    }

    /* renamed from: d */
    public static int m1305d() {
        int DeviceOrientationStatus;
        synchronized (f2376a) {
            if (f2377b.booleanValue()) {
                DeviceOrientationStatus = LightCycleNative.DeviceOrientationStatus();
            } else {
                throw new IllegalStateException("State is not ready.");
            }
        }
        return DeviceOrientationStatus;
    }

    /* renamed from: a */
    public static float[] m1297a(float[] fArr, int i, int i2) {
        return LightCycleNative.EndGyroCalibration(fArr, i, i2);
    }

    /* renamed from: e */
    public static float[] m1306e() {
        float[] GetFrameGeometry;
        synchronized (f2376a) {
            if (f2377b.booleanValue()) {
                GetFrameGeometry = LightCycleNative.GetFrameGeometry(2, 2);
            } else {
                throw new IllegalStateException("State is not ready.");
            }
        }
        return GetFrameGeometry;
    }

    /* renamed from: f */
    public static int m1307f() {
        return LightCycleNative.GetNumCapturedTargets();
    }

    /* renamed from: g */
    public static int m1308g() {
        return LightCycleNative.GetNumTotalTargets();
    }

    /* renamed from: h */
    public static int m1309h() {
        return LightCycleNative.GetTargetInRange();
    }

    /* renamed from: i */
    public static NewTarget[] m1310i() {
        NewTarget[] GetTargets;
        synchronized (f2376a) {
            if (f2377b.booleanValue()) {
                GetTargets = LightCycleNative.GetTargets();
            } else {
                throw new IllegalStateException("State is not ready.");
            }
        }
        return GetTargets;
    }

    /* renamed from: a */
    public static void m1293a(int i, int i2, int i3) {
        LightCycleNative.InitFrameTexture(i, i2, i3);
    }

    /* renamed from: b */
    public static NewTarget[] m1301b(float[] fArr) {
        NewTarget[] InitTargets;
        synchronized (f2376a) {
            if (f2377b.booleanValue()) {
                InitTargets = LightCycleNative.InitTargets(fArr);
            } else {
                throw new IllegalStateException("State is not ready.");
            }
        }
        return InitTargets;
    }

    /* renamed from: j */
    public static boolean m1311j() {
        boolean booleanValue;
        synchronized (f2376a) {
            booleanValue = f2377b.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: k */
    public static boolean m1312k() {
        return LightCycleNative.MovingTooFast();
    }

    /* renamed from: l */
    public static boolean m1313l() {
        return LightCycleNative.PhotoSkippedTooFast();
    }

    /* renamed from: a */
    public static float[] m1296a(byte[] bArr, int i, int i2, boolean z) {
        float[] ProcessFrame;
        synchronized (f2376a) {
            if (f2377b.booleanValue()) {
                ProcessFrame = LightCycleNative.ProcessFrame(bArr, i, i2, z);
            } else {
                throw new IllegalStateException("State is not ready.");
            }
        }
        return ProcessFrame;
    }

    /* renamed from: b */
    public static boolean m1300b(int i) {
        return LightCycleNative.RenderNextSession(i);
    }

    /* renamed from: a */
    public static void m1294a(String str, float f) {
        synchronized (f2376a) {
            LightCycleNative.ResetForPhotoSphereCapture(str, f);
            f2377b = Boolean.valueOf(true);
        }
    }

    /* renamed from: m */
    public static void m1314m() {
        LightCycleNative.ResetTargets();
    }

    /* renamed from: b */
    public static void m1298b(String str) {
        LightCycleNative.SetAppVersion(str);
    }

    /* renamed from: c */
    public static void m1304c(float[] fArr) {
        LightCycleNative.SetFilteredRotation(fArr);
    }

    /* renamed from: n */
    public static void m1315n() {
        LightCycleNative.SetOutputResolutionLarge();
    }

    /* renamed from: o */
    public static void m1316o() {
        LightCycleNative.SetOutputResolutionLarge();
    }

    /* renamed from: p */
    public static void m1317p() {
        LightCycleNative.SetOutputResolutionSmall();
    }

    /* renamed from: a */
    public static void m1295a(boolean z) {
        LightCycleNative.SetSensorMovementTooFast(z);
    }

    /* renamed from: a */
    public static void m1291a(float f) {
        LightCycleNative.StartGyroCalibration(f);
    }

    /* renamed from: q */
    public static boolean m1318q() {
        return LightCycleNative.TakeNewPhoto();
    }

    /* renamed from: r */
    public static boolean m1319r() {
        return LightCycleNative.TargetHit();
    }

    /* renamed from: s */
    public static boolean m1320s() {
        boolean UndoAddImage;
        synchronized (f2376a) {
            if (f2377b.booleanValue()) {
                UndoAddImage = LightCycleNative.UndoAddImage();
            } else {
                throw new IllegalStateException("State is not ready.");
            }
        }
        return UndoAddImage;
    }

    /* renamed from: c */
    public static void m1303c(int i) {
        LightCycleNative.UpdateFrameTexture(i);
    }
}
