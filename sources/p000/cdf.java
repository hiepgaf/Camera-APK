package p000;

import com.google.android.apps.camera.jni.gyro.GyroQueueNative;

/* compiled from: PG */
/* renamed from: cdf */
public final class cdf implements cde {
    /* renamed from: a */
    private static final String f11696a = bli.m862a("GyroQueue");
    /* renamed from: b */
    private static final float[] f11697b = cdf.m8031b();
    /* renamed from: f */
    private static final int[] f11698f = new int[]{1, 0, 2};
    /* renamed from: g */
    private static final int[] f11699g = new int[]{1, 1, 1};
    /* renamed from: c */
    private final long f11700c;
    /* renamed from: d */
    private boolean f11701d;
    /* renamed from: e */
    private long f11702e;

    public cdf() {
        cdh cdh = new cdh();
        this((byte) 0);
    }

    private cdf(byte b) {
        this.f11702e = 0;
        this.f11700c = GyroQueueNative.createHandle(f11698f, f11699g);
        this.f11701d = false;
    }

    public final synchronized void close() {
        if (!this.f11701d) {
            GyroQueueNative.releaseHandle(this.f11700c);
            this.f11701d = true;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo641a(float f, float f2, float f3, long j) {
        boolean z = false;
        synchronized (this) {
            if (!this.f11701d) {
                if (this.f11702e < j) {
                    this.f11702e = j;
                    z = GyroQueueNative.processAndEnqueueGyro(this.f11700c, f, f2, f3, j);
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized boolean mo642a(long j, float f, float f2, float f3, long j2, float[] fArr) {
        boolean z;
        System.arraycopy(f11697b, 0, fArr, 0, fArr.length);
        if (this.f11701d) {
            z = false;
        } else if (GyroQueueNative.getProjectionMatrix(this.f11700c, j, f, f2, f3, j2, fArr)) {
            z = true;
        } else {
            String str = f11696a;
            StringBuilder stringBuilder = new StringBuilder(76);
            stringBuilder.append("Projection matrix could not be computed for timestamp = ");
            stringBuilder.append(j);
            bli.m873e(str, stringBuilder.toString());
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized float[] mo643a(long j, float f, float f2, float f3, long j2, float f4, float f5, float f6, long j3) {
        float[] b;
        b = cdf.m8031b();
        if (!this.f11701d) {
            if (!GyroQueueNative.getTransformBetweenTime(this.f11700c, j, f, f2, f3, j2, f4, f5, f6, j3, b)) {
                String str = f11696a;
                StringBuilder stringBuilder = new StringBuilder(102);
                stringBuilder.append("Transformation matrix could not be computed for timestamps ");
                stringBuilder.append(j);
                stringBuilder.append(" - ");
                stringBuilder.append(j2);
                bli.m873e(str, stringBuilder.toString());
            }
        }
        return b;
    }

    /* renamed from: a */
    public final synchronized long mo640a() {
        return this.f11702e;
    }

    /* renamed from: b */
    private static final float[] m8031b() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }
}
